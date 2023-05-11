package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.GuestUserObjectPojo;
import pojos.GuestUserOutherPojo;
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
import static utilities.FakerUtils.*;


public class US02_AddAdminGuestUserbilgileriSilebilmeliApi {
    Response response;
    GuestUserObjectPojo object;
    GuestUserOutherPojo expectedData;
    @Given("Admin Guest User List olusturmak icin post request gonderir")
    public void admin_guest_user_list_olusturmak_icin_post_request_gonderir() {
        adminSetUp();
        spec.pathParams("first","guestUser","second","register");
        nameFaker();
        surnameFaker();
        birthPlaceFaker();
        phoneNumberFaker();
        ssnFaker();
        usernameFaker();
        phoneNumberFaker();
        object = new GuestUserObjectPojo(1,"2012-12-12","izmir","MALE","hayriye","12345678",phoneNumberFaker(),ssnFaker(),"kilic","hayriyeklc");
        expectedData = new GuestUserOutherPojo(object,"Guest User Save","CREATED");
        System.out.println(expectedData);
        response=given().spec(spec).body(object).post("{first}/{second}");
        response.prettyPrint();
       // System.out.println("userId : " + expectedData.getObject().getUserId());
    }
    @When("Guest User datayi get request ile dogrular")
    public void guest_user_datayi_get_request_ile_dogrular() {

        response.then().statusCode(200).body("object.name",equalTo(expectedData.getObject().getName()),
                "object.phoneNumber",equalTo(expectedData.getObject().getPhoneNumber()),
                "object.ssn",equalTo(expectedData.getObject().getSsn()),
                "object.username",equalTo(expectedData.getObject().getUsername()));
    }
    @Then("Guest user datayi delete request ile siler")
    public void guest_user_datayi_delete_request_ile_siler() throws SQLException {

        //**********************id 'yi dinamik almak için*************
        DBUtils.createConnection();
        Statement st = DBUtils.createStatement();
        String query = ("SELECT * FROM guest_user WHERE username = 'hayriyeklc'");
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
        spec.pathParams("first","guestUser","second","delete","third",yeniid);
        Map<String,String> expecteddata=new HashMap<>();
        expecteddata.put("message","Guest User Deleted");
        expecteddata.put("httpStatus","OK");
        System.out.println(expecteddata);

        Response response=given(spec).delete("{first}/{second}/{third}");
        response.prettyPrint();
        response.then().statusCode(200).body("message",equalTo(" Guest User deleted Successful"));



    }

}
