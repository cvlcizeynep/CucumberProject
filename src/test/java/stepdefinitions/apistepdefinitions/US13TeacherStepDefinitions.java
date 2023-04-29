package stepdefinitions.apistepdefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.*;
import java.util.Collections;
import static base_url.StudentManagementBaseUrl.*;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.FakerUtils.*;

public class US13TeacherStepDefinitions {
    Response response;
    TeacherRequestPojo expectedData;
    ResponseOutherPojo expectedDataOuther;
    ResponseTeacherObjectPojo object;

    @Given("vice dean sends put request")
    public void sendPutRequestToGetTeacher() throws JsonProcessingException {
        viceDeanSetUp();
        //Set the url
        spec.pathParams("pp1", "teachers", "pp2", "update", "pp3", 5);
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

        //Set the expected data
        expectedDataOuther = new ResponseOutherPojo(object, "Teacher updated Successful", "OK");

        //Send the request and get the response
        response = given(spec)
                .body(expectedData)
                .put("{pp1}/{pp2}/{pp3}");
        response.prettyPrint();

    }

    @Then("assertion")
    public void assertion() {
        ResponseOutherPojo actualData = response.as(ResponseOutherPojo.class);
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
        //Set the url
        spec.pathParams("pp1", "teachers", "pp2", "save");
        expectedData = new TeacherRequestPojo("1998-01-09",
                "izmir",
                "asdfg1234@gmail.com",
                "FEMALE",
                true,
                Collections.singletonList(1),
                nameFaker(),
                passwordFaker(),
                phoneNumberFaker(),
                ssnFaker(),
                surnameFaker(),
                usernameFaker());

        //Set the expected data
        expectedDataOuther = new ResponseOutherPojo(object, "Teacher saved successfully", "CREATED");

        //Send the request and get the response
        response = given(spec)
                .body(expectedData)
                .post("{pp1}/{pp2}");
        response.prettyPrint();

    }

    @Then("do assertion for post")
    public void assertionPost() {
        ResponseOutherPojo actualData = response.as(ResponseOutherPojo.class);
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


//    @Given("kullanici get request ve dogrulama yapar")
//    public void kullanici_get_request_ve_dogrulama_yapar() {
//        // Set the url
//        // {{baseUrl}}/teachers/getAll
//        spec.pathParams("first", "teachers", "second", "getAll");
//
//        // Set the expected data
//        TeacherGetPojo expectedData = new TeacherGetPojo("john.crona", "Willie", "Boyer", "1990-04-05", "039-20-6455", "West Buddymouth", "721-489-1339", "FEMALE", "lyndon.vonrueden@yahoo.com");
//
//        //Send the request and get the response
//        Response response = given(spec).get("{first}/{second}");
//        response.prettyPrint();
//
//        //Do assertion
//        assertEquals(200, response.statusCode());
//
//        JsonPath jsonPath = response.jsonPath();
//
//      //  assertTrue(jsonPath.getList("username").contains(expectedData.getUsername()));
//        assertTrue(jsonPath.getList("name").contains(expectedData.getName()));
//        assertTrue(jsonPath.getList("surname").contains(expectedData.getSurname()));
//        assertTrue(jsonPath.getList("birthDay").contains(expectedData.getBirthDay()));
//        assertTrue(jsonPath.getList("ssn").contains(expectedData.getSsn()));
//        assertTrue(jsonPath.getList("birthPlace").contains(expectedData.getBirthPlace()));
//        assertTrue(jsonPath.getList("phoneNumber").contains(expectedData.getPhoneNumber()));
//        assertTrue(jsonPath.getList("gender").contains(expectedData.getGender()));
//        assertTrue(jsonPath.getList("email").contains(expectedData.getEmail()));
//
//    }
//
//    @Given("kullanici put request ve dogrulama yapar")
//    public void kullaniciPutRequestVeDogrulamaYapar() {
//        // Set the url
//        http://localhost/teachers/update/5
//        spec.pathParams("first", "teachers", "second", "update","third",5);
//
//        // Set the expected data
//        TeacherPutPojo expectedData = new TeacherPutPojo("john.crona", "Willie", "Boyer", "1990-04-05", "039-20-6455", "West Buddymouth", "721-489-1339", "FEMALE", "123456789","abc@gmail.com");
//
//        //Send the request and get the response
//        Response response = given(spec).contentType(ContentType.JSON).body(expectedData).put("{first}/{second}/{third}");
//        response.prettyPrint();
//
//        //Do assertion
//        assertEquals(200, response.statusCode());
//
//        JsonPath jsonPath = response.jsonPath();
//
//
//    }
//
//    @When("user sends the PUT request")
//    public void userSendsThePUTRequest() {
//        Response response = given()
//                .spec(spec)
//                .when()
//                .body(expectedData.toString())
//                .contentType(ContentType.JSON)
//                .put("{first}/{second}");
//        response.prettyPrint();
//    }
//
//    @Then("status code should be {int} for rooms")
//    public void statusCodeShouldBeForRooms(int arg0) {
//        response.then().statusCode(arg0);
//    }
//
//    @Then("verify that the response body should be as an expected")
//    public void verifyThatTheResponseBodyShouldBeAsAnExpected() {
//        assertEquals(200, response.statusCode());
//
////        JsonPath actualData = response.jsonPath();
////
////        assertEquals(expectedData.getBirthDay(),actualData.);
////        assertTrue(jsonPath.getList("name").contains(expectedData.getName()));
////        assertTrue(jsonPath.getList("surname").contains(expectedData.getSurname()));
////        assertTrue(jsonPath.getList("birthDay").contains(expectedData.getBirthDay()));
////        assertTrue(jsonPath.getList("ssn").contains(expectedData.getSsn()));
////        assertTrue(jsonPath.getList("birthPlace").contains(expectedData.getBirthPlace()));
////        assertTrue(jsonPath.getList("phoneNumber").contains(expectedData.getPhoneNumber()));
////        assertTrue(jsonPath.getList("gender").contains(expectedData.getGender()));
////        assertTrue(jsonPath.getList("email").contains(expectedData.getEmail()));
//    }
//
//
//    @Given("set the expected data {string},<Surname>,<Username>,{string},{string},{string},{string},{string},{string}")
//    public void setTheExpectedDataSurnameUsername(String name, String surname, String username, String birthPlace, String password, String phoneNumber, String ssn, String birthDay, String gender,String email, Integer lessonsIdList) {
//        expectedData = new TeacherPutPojo(username, name, surname, birthDay, ssn, birthPlace, phoneNumber, gender, password, email,lessonsIdList);
//
//    }


}







