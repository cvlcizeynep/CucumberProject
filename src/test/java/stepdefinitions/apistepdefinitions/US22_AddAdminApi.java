package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.AdminObjectPojo;
import pojos.AdminOutherPojo;

import static base_url.StudentManagementBaseUrl.adminSetUp;
import static base_url.StudentManagementBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static utilities.FakerUtils.*;

public class US22_AddAdminApi {
    Response response;
    AdminObjectPojo expectedData=null;
    AdminOutherPojo actualData;

    @Given("Kullanici request gonderir")
    public void kullaniciRequestGonderir() {
        //Set the Url
        adminSetUp();
        spec.pathParams("first", "admin", "second", "save");
        nameFaker();
        ssnFaker();
        usernameFaker();
        phoneNumberFaker();
        //Send the expected Data
        expectedData = new AdminObjectPojo("2000-12-12", "izmir", true, "MALE", "hayriye", "12345678", phoneNumberFaker(),
                ssnFaker(), "kilic", usernameFaker());
        System.out.println("expectedData = " + expectedData);
    }
    @Then("Gelen respons asssert edilir")
    public void gelenResponsAsssertEdilir() {
        response = given(spec).when().body(expectedData).post("/{first}/{second}");
        response.prettyPrint();
        actualData = response.as(AdminOutherPojo.class);
        assertEquals(200, response.getStatusCode());
//        assertEquals(expectedData.getSurname(), actualData.getObject().surname);
//        assertEquals(expectedData.getBirthDay(), actualData.getObject().birthDay);
//        assertEquals(expectedData.getGender(), actualData.getObject().gender);
//        assertEquals(expectedData.getBirthPlace(), actualData.getObject().birthPlace);
//        assertEquals(expectedData.getSsn(), actualData.getObject().ssn);
        assertEquals("Admin Saved", actualData.message);
        assertEquals("CREATED", actualData.httpStatus);


    }
}

