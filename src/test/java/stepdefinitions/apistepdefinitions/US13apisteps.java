package stepdefinitions.apistepdefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.*;
import java.util.Collections;

import static base_url.StudentManagementBaseUrl.spec;
import static base_url.StudentManagementBaseUrl.viceDeanSetUp;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.FakerUtils.*;

public class US13apisteps {
    Response response;
    TeacherRequestPojo expectedData;
    TeacherResponseOutherPojo expectedDataOuther;
    TeacherResponseObjectPojo object;

    @Given("vice dean sends put request")
    public void sendPutRequestToGetTeacher() throws JsonProcessingException {
        viceDeanSetUp();
        spec.pathParams("pp1", "teachers", "pp2", "update", "pp3", 6);
        expectedData = new TeacherRequestPojo("1998-01-09",
                "izmir",
                "team20@gmail.com",
                "FEMALE",
                true,
                Collections.singletonList(1),
                nameFaker(),
                passwordFaker(),
                phoneNumberFaker(),
                ssnFaker(),
                surnameFaker(),
                usernameFaker());

        expectedDataOuther = new TeacherResponseOutherPojo(object, "Teacher updated Successful", "OK");
        response = given(spec)
                .body(expectedData)
                .put("{pp1}/{pp2}/{pp3}");
        response.prettyPrint();

    }

    @Then("assertion")
    public void assertion() {
        TeacherResponseOutherPojo actualData = response.as(TeacherResponseOutherPojo.class);
        System.out.println("actualData = " + actualData);
        JsonPath jsonPath = response.jsonPath();

        assertEquals(200, response.statusCode());
        assertEquals(expectedDataOuther.getHttpStatus(), jsonPath.getString("httpStatus"));
        assertEquals(expectedDataOuther.getMessage(), actualData.getMessage());

        assertEquals(expectedData.getUsername(), jsonPath.getString("object.username"));
        assertEquals(expectedData.getName(), jsonPath.getString("object.name"));
        assertEquals(expectedData.getSurname(), jsonPath.getString("object.surname"));
        assertEquals(expectedData.getBirthDay(), jsonPath.getString("object.birthDay"));
        assertEquals(expectedData.getSsn(), jsonPath.getString("object.ssn"));
        assertEquals(expectedData.getBirthPlace(), jsonPath.getString("object.birthPlace"));
        assertEquals(expectedData.getPhoneNumber(), jsonPath.getString("object.phoneNumber"));
        assertEquals(expectedData.getGender(), jsonPath.getString("object.gender"));
        assertEquals(expectedData.getEmail(), jsonPath.getString("object.email"));

    }


    @Given("vice dean sends post request")
    public void sendPostRequestAndValidateBody() throws JsonProcessingException {
        viceDeanSetUp();
        spec.pathParams("pp1", "teachers", "pp2", "save");
        expectedData = new TeacherRequestPojo("1998-01-09",
                "izmir",
                "asdf@gmail.com",
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
        response = given(spec)
                .body(expectedData)
                .post("{pp1}/{pp2}");
        response.prettyPrint();

    }

    @Then("verify that the response body should be as an expected")
    public void assertionPost() {
        TeacherResponseOutherPojo actualData = response.as(TeacherResponseOutherPojo.class);
        System.out.println("actualData = " + actualData);
        JsonPath jsonPath = response.jsonPath();

        assertEquals(200, response.statusCode());
        assertEquals(expectedDataOuther.getHttpStatus(), jsonPath.getString("httpStatus"));
        assertEquals(expectedDataOuther.getMessage(), actualData.getMessage());

        assertEquals(expectedData.getUsername(), jsonPath.getString("object.username"));
        assertEquals(expectedData.getName(), jsonPath.getString("object.name"));
        assertEquals(expectedData.getSurname(), jsonPath.getString("object.surname"));
        assertEquals(expectedData.getBirthDay(), jsonPath.getString("object.birthDay"));
        assertEquals(expectedData.getSsn(), jsonPath.getString("object.ssn"));
        assertEquals(expectedData.getBirthPlace(), jsonPath.getString("object.birthPlace"));
        assertEquals(expectedData.getPhoneNumber(), jsonPath.getString("object.phoneNumber"));
        assertEquals(expectedData.getGender(), jsonPath.getString("object.gender"));
        assertEquals(expectedData.getEmail(), jsonPath.getString("object.email"));

    }


    @Given("verify that the response body contains all expected data")
    public void kullanici_get_request_ve_dogrulama_yapar() {
        // Set the url
        // {{baseUrl}}/teachers/getAll
        spec.pathParams("first", "teachers", "second", "getAll");

        // Set the expected data
       // TeacherResponseOutherPojo expectedData = new TeacherResponseOutherPojo("john.crona", "Willie", "Boyer", "1990-04-05", "039-20-6455", "West Buddymouth", "721-489-1339", "FEMALE", "lyndon.vonrueden@yahoo.com");

        //Send the request and get the response
        Response response = given(spec).get("{first}/{second}");
        response.prettyPrint();

        //Do assertion
        assertEquals(200, response.statusCode());

        JsonPath jsonPath = response.jsonPath();

        assertTrue(jsonPath.getList("username").contains(expectedData.getUsername()));
        assertTrue(jsonPath.getList("name").contains(expectedData.getName()));
        assertTrue(jsonPath.getList("surname").contains(expectedData.getSurname()));
        assertTrue(jsonPath.getList("birthDay").contains(expectedData.getBirthDay()));
        assertTrue(jsonPath.getList("ssn").contains(expectedData.getSsn()));
        assertTrue(jsonPath.getList("birthPlace").contains(expectedData.getBirthPlace()));
        assertTrue(jsonPath.getList("phoneNumber").contains(expectedData.getPhoneNumber()));
        assertTrue(jsonPath.getList("gender").contains(expectedData.getGender()));
        assertTrue(jsonPath.getList("email").contains(expectedData.getEmail()));

    }



}







