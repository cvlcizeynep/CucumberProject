package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import static base_url.StudentManagementBaseUrl.spec;

import static io.restassured.RestAssured.given;

public class apisteps {

    @Given("Send getrequest to get teacher")
    public void send_getrequest_to_get_teacher() {
        //Set the url
        spec.pathParams("first","teachers","second","getSavedTeacherById","third",35);
        Response response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Then("validate body")
    public void validate_body() {



    }

}