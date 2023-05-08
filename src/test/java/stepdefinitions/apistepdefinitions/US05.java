package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.DeanObjectPojo;
import pojos.DeanPojo;
import utilities.DBUtils;
import utilities.ReusableMethods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static base_url.StudentManagementBaseUrl.adminSetUp;
import static base_url.StudentManagementBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;

public class US05 {
    Response response;
    Faker faker;
    DeanObjectPojo object;
    DeanPojo expectedData;
    @Given("Kullanici Dean eklemek icin post request gonderir")
    public void kullanici_dean_eklemek_icin_post_request_gonderir() {
        faker=new Faker();
        adminSetUp();
        spec.pathParams("first","dean","second","save");

        String name=faker.name().name();
        String phoneNumber=faker.phoneNumber().phoneNumber().replaceAll("[^0-9]", "");
        phoneNumber = String.format("%s-%s-%s",
                phoneNumber.substring(0, 3),
                phoneNumber.substring(3, 6),
                phoneNumber.substring(6, 10));
        String usernames=faker.name().username();
        String ssn=faker.idNumber().ssnValid().replaceAll("[^0-9]","");
        String SSN=ssn.substring(0,3)+"-"+ssn.substring(3,5)+"-"+ssn.substring(5,9);

        object=new DeanObjectPojo("2000-01-02","London", "MALE","hayat","12345678",phoneNumber,SSN,"abcdef","hayriyekilic");
        expectedData=new DeanPojo(object,"Dean Saved","CREATED");
        System.out.println(expectedData);

        response=given().spec(spec).body(object).post("{first}/{second}");
        response.prettyPrint();
        //DOGRULAMA

        DeanPojo actualData =  response.as( DeanPojo.class);
        System.out.println(actualData);
        assertEquals(expectedData.getObject().getUsername(),actualData.getObject().getUsername());
        assertEquals(expectedData.getObject().getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getObject().getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getObject().getName(),actualData.getObject().getName());
        assertEquals(expectedData.getObject().getGender(),actualData.getObject().getGender());
        assertEquals(expectedData.getObject().getSsn(),actualData.getObject().getSsn());
        assertEquals(expectedData.getObject().getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(expectedData.getObject().getSurname(),actualData.getObject().getSurname());
        assertEquals(expectedData.getMessage(),actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());


    }

        @When("Dean datayi put reguest ile gunceller")
    public void deanDatayiPutReguestIleGunceller() {
        faker =new Faker();
            String name=faker.name().name();
            String phoneNumber=faker.phoneNumber().phoneNumber().replaceAll("[^0-9]", "");
            phoneNumber = String.format("%s-%s-%s",
                    phoneNumber.substring(0, 3),
                    phoneNumber.substring(3, 6),
                    phoneNumber.substring(6, 10));
            String usernames=faker.name().username();
            String ssn=faker.idNumber().ssnValid().replaceAll("[^0-9]","");
            String SSN=ssn.substring(0,3)+"-"+ssn.substring(3,5)+"-"+ssn.substring(5,9);

            adminSetUp();
            spec.pathParams("first","dean","second","update","third",739);
            object=new DeanObjectPojo("2000-01-02","London", "MALE","hayat","12345678",phoneNumber,SSN,"abcdef","hayat_guzel");
            expectedData=new DeanPojo(object,"Dean updated Successful","OK");
            System.out.println(expectedData);

            response=given().spec(spec).body(object).put("{first}/{second}/{third}");
            response.prettyPrint();


        }

    @Then("Dean datayi delete request ile siler")
    public void deanDatayiDeleteRequestIleSiler() throws SQLException {

        //**********************id 'yi dinamik almak için*************
        DBUtils.createConnection();
        Statement st = DBUtils.createStatement();
        String query = ("SELECT * FROM dean WHERE username = 'hayriyekilic'");
        ResultSet rs = st.executeQuery(query);
        List<Object> id = new ArrayList<>();
        while(rs.next()){
            id.add(rs.getString(1));
        }
        System.out.println("id " + id);
        int yeniid = Integer.parseInt((String) id.get(0));
        System.out.println("yeniid " + yeniid);
        ReusableMethods.waitFor(3);





        adminSetUp();
        spec.pathParams("first","dean","second","delete","third",yeniid);
        Map<String,String> expecteddata=new HashMap<>();
        expecteddata.put("message","Dean Deleted");
        expecteddata.put("httpStatus","OK");
        System.out.println(expecteddata);

        Response response=given(spec).delete("{first}/{second}/{third}");
        response.prettyPrint();
        response.then().statusCode(200).body("message",equalTo("Dean Deleted"));


    }
}
