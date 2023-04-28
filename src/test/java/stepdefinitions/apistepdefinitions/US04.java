package stepdefinitions.apistepdefinitions;
import com.github.javafaker.Faker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import pojos.DeanObjectPojo;
import pojos.DeanPojo;

import static base_url.StudentManagementBaseUrl.adminSetUp;
import static base_url.StudentManagementBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


public class US04 {
    Response response;
    Faker faker=new Faker();
    DeanObjectPojo object;
    DeanPojo expectedData;
    @Given("kullanici dean eklemek icin post request gonderir")
    public void kullanici_dean_eklemek_icin_post_request_gonderir() {
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

        object=new DeanObjectPojo();
        expectedData=new DeanPojo(object,"Dean Saved","CREATED");
        System.out.println(expectedData);

        response=given().spec(spec).body(expectedData).post("{first}/{second}");
        response.prettyPrint();


    }
    @Then("kullanici dean olustugunu dogrular")
    public void kullanici_dean_olustugunu_dogrular()  {
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
}
