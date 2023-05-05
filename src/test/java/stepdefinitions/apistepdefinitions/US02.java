package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import pojos.DeanPojo;
import pojos.GuestUserObjectPojo;
import pojos.GuestUserOutherPojo;
import utilities.JsonUtil;

import java.util.HashMap;
import java.util.Map;

import static base_url.StudentManagementBaseUrl.adminSetUp;
import static base_url.StudentManagementBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.FakerUtils.*;


public class US02 {
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
        object = new GuestUserObjectPojo(1,"2012-12-12","izmir","MALE","hayriye","12345678",phoneNumberFaker(),ssnFaker(),"kilic",usernameFaker());
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







//        GuestUserOutherPojo actualData =  response.as( GuestUserOutherPojo.class);
//        System.out.println(actualData);
//        assertEquals(expectedData.getObject().getUsername(),actualData.getObject().getUsername());
//        assertEquals(expectedData.getObject().getPhoneNumber(),actualData.getObject().getPhoneNumber());
//        assertEquals(expectedData.getObject().getName(),actualData.getObject().getName());
//        assertEquals(expectedData.getMessage(),actualData.getMessage().contains("Guest User registered."));
//        assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());




    }
    @Then("Guest user datayi delete request ile siler")
    public void guest_user_datayi_delete_request_ile_siler() {
        adminSetUp();
        spec.pathParams("first","guestUser","second","delete","third",173);
        Map<String,String> expecteddata=new HashMap<>();
        expecteddata.put("message","Guest User Deleted");
        expecteddata.put("httpStatus","OK");
        System.out.println(expecteddata);

        Response response=given(spec).delete("{first}/{second}/{third}");
        response.prettyPrint();
        response.then().statusCode(200).body("message",equalTo(" Guest User deleted Successful"));



    }

}
