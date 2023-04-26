package stepdefinitions.apistepdefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.ObjectPojo;
import pojos.TeacherPojo;
import pojos.TeacherPutPojo;


import static base_url.StudentManagementBaseUrl.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.AuthenticationSchoolManagement.generateTokenAdmin;

public class TeacherStepDefinitions {

    Response response;
    Faker faker;
    TeacherPojo expectedData;
    ObjectPojo objectPojo;

    @Given("send get request to get teacher")
    public void send_get_request_to_get_teacher() {
        adminSetUp();
        //Set the url
        spec.pathParams("first", "teachers", "second", "getSavedTeacherById", "third", 35);

        //Set the expected data
        objectPojo = new ObjectPojo(35, "umitg", "umit", "gelir", "2000-04-22", "894-25-8974", "adana", "475-857-8874", "FEMALE", "harka@gmail");
        expectedData = new TeacherPojo(objectPojo, "Teacher successfully found", "OK");
        System.out.println("expectedData = " + expectedData);

        response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();

    }

    @Then("validate body1")
    public void validate_body() throws JsonProcessingException {

        TeacherPojo actualDataPojoMapper = new ObjectMapper().readValue(response.asString(), TeacherPojo.class);

        assertEquals(objectPojo.getUsername(), actualDataPojoMapper.getObject().getUsername());
        assertEquals(objectPojo.getName(), actualDataPojoMapper.getObject().getName());
        assertEquals(objectPojo.getSurname(), actualDataPojoMapper.getObject().getSurname());//Gerisi Ödev

        assertEquals(expectedData.getMessage(), actualDataPojoMapper.getMessage());
        assertEquals(expectedData.getHttpStatus(), actualDataPojoMapper.getHttpStatus());


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
}



