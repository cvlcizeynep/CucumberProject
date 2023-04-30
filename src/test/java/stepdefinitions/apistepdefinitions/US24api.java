package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import pojos.TeacherRequestPojo;
import pojos.TeacherResponseObjectPojo;
import pojos.TeacherResponseOutherPojo;

import java.util.Collections;

import static base_url.StudentManagementBaseUrl.adminSetUp;
import static base_url.StudentManagementBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.FakerUtils.*;
import static utilities.FakerUtils.usernameFaker;

public class US24api {
    Response response;
    TeacherRequestPojo expectedData;

    TeacherResponseOutherPojo expectedDataOuther;
    TeacherResponseObjectPojo object;

    @Given("admin sends post request")
    public void admin_sends_post_request() {
        adminSetUp();
        spec.pathParams("pp1", "teachers", "pp2", "save");
        expectedData = new TeacherRequestPojo("1998-01-09",
                "izmir",
                emailFaker(),
                "FEMALE",
                true,
                Collections.singletonList(1),
                nameFaker(),
                passwordFaker(),
                phoneNumberFaker(),
                ssnFaker(),
                surnameFaker(),
                usernameFaker());

        expectedDataOuther = new TeacherResponseOutherPojo(object, "Teacher saved successfully", "CREATED");

        //Send the request and get the response

        response = given(spec)
                .body(expectedData)
                .post("{pp1}/{pp2}");
        response.prettyPrint();

    }
}