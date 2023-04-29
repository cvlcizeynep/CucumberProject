package stepdefinitions.apistepdefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.ObjectPojo;
import pojos.TeacherGetPojo;
import pojos.TeacherPutPojo;


import static base_url.StudentManagementBaseUrl.adminSetUp;
import static base_url.StudentManagementBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class TeacherStepDefinitions {

    Response response;
    TeacherGetPojo expectedData;
    ObjectPojo objectPojo;

    Faker faker = new Faker();
    String name = faker.name().firstName();
    String surname = faker.name().lastName();
    String username = faker.name().username();
    String email = faker.internet().emailAddress();
    String password = faker.internet().password();


    String phoneNumber = faker.phoneNumber().phoneNumber().replaceAll("[^0-9]", "");
    String formattedPhoneNumber = String.format("%s-%s-%s",
            phoneNumber.substring(0, 3),
            phoneNumber.substring(3, 6),
            phoneNumber.substring(6, 10)
            );
    String ssn = faker.idNumber().ssnValid().replaceAll("[^0-9]", "");
    String formattedSSN = ssn.substring(0, 3) + "-" + ssn.substring(3, 5) + "-" + ssn.substring(5, 9);



    @Given("send get request and validate body")
    public void send_get_request_to_get_teacher() throws JsonProcessingException {
        adminSetUp();
        //Set the url
        spec.pathParams("first", "teachers", "second", "getSavedTeacherById", "third", 35);

        //Set the expected data
      //  objectPojo = new ObjectPojo(35, "alican", "Ali", "Can", "2000-01-05", "222-55-9977", "Ankara", "333-333-9955", "MALE", "ali.can@gmail.com");
        expectedData = new TeacherGetPojo(objectPojo, "Teacher successfully found", "OK");
        System.out.println("expectedData = " + expectedData);

        //Send the request and get the response
        response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();


        //Do Assertion
        TeacherGetPojo actualDataPojoMapper = new ObjectMapper().readValue(response.asString(), TeacherGetPojo.class);

        assertEquals(objectPojo.getUsername(), actualDataPojoMapper.getObject().getUsername());
        assertEquals(objectPojo.getName(), actualDataPojoMapper.getObject().getName());
        assertEquals(objectPojo.getSurname(), actualDataPojoMapper.getObject().getSurname());//Gerisi Ödev

        assertEquals(expectedData.getMessage(), actualDataPojoMapper.getMessage());
        assertEquals(expectedData.getHttpStatus(), actualDataPojoMapper.getHttpStatus());

    }


    @Given("send put request and validate body")
    public void sendPutRequestToGetTeacher() throws JsonProcessingException {
        adminSetUp();
        //Set the url
        spec.pathParams("pp1","teachers","pp2","update","pp3",5);

        //Set the expected data

        objectPojo = new ObjectPojo("team20","Team20","Team20","2000-01-01","123-45-6543","izmir","123-321-6541","MALE","team20@gmail.com");
        TeacherPutPojo expectedData =
        new TeacherPutPojo(objectPojo,"Teacher updated Successful","OK",1,true);



        //Send the request and get the response
        Response response1 = given().spec(spec)
                .when().body(expectedData)
                .put("{pp1}/{pp2}/{pp3}");
        response1.prettyPrint();


        //Do Assertion
        JsonPath jsonPath = response1.jsonPath();
        assertEquals(200, response1.statusCode());

        assertEquals(expectedData.getMessage(),jsonPath.getString("message"));
        assertEquals(expectedData.getHttpStatus(),jsonPath.getString("httpStatus"));
        assertEquals(expectedData.getObject().getBirthDay(),jsonPath.getString("object.birthDay"));
        assertEquals(expectedData.getObject().getBirthPlace(),jsonPath.getString("object.birthPlace"));
        assertEquals(expectedData.getObject().getEmail(),jsonPath.getString("object.email"));
        assertEquals(expectedData.getObject().getGender(),jsonPath.getString("object.gender"));
        assertEquals(expectedData.getObject().getName(),jsonPath.getString("object.name"));
        assertEquals(expectedData.getObject().getPhoneNumber(),jsonPath.getString("object.phoneNumber"));
        assertEquals(expectedData.getObject().getSsn(),jsonPath.getString("object.ssn"));
        assertEquals(expectedData.getObject().getSurname(),jsonPath.getString("object.surname"));
        assertEquals(expectedData.getObject().getUserId(),jsonPath.getInt("object.userId"));
        assertEquals(expectedData.getObject().getUsername(),jsonPath.getString("object.username"));







      //  TeacherPutPojo actualData = new ObjectMapper().readValue(response.asString(), TeacherPutPojo.class);
//        assertEquals(expectedData.getMessage(),actualData.getMessage());
//        assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());
//        assertEquals(expectedData.getObject().getBirthDay(),actualData.getObject().getBirthDay());
//        assertEquals(expectedData.getObject().getBirthPlace(),actualData.getObject().getBirthPlace());
//        assertEquals(expectedData.getObject().getEmail(),actualData.getObject().getEmail());
//        assertEquals(expectedData.getObject().getGender(),actualData.getObject().getGender());
//        assertEquals(expectedData.getObject().getName(),actualData.getObject().getName());
//        assertEquals(expectedData.getObject().getPhoneNumber(),actualData.getObject().getPhoneNumber());
//        assertEquals(expectedData.getObject().getSsn(),actualData.getObject().getSsn());
//        assertEquals(expectedData.getObject().getSurname(),actualData.getObject().getSurname());
//        assertEquals(expectedData.getObject().getUserId(),actualData.getObject().getUserId());
//        assertEquals(expectedData.getObject().getUsername(),actualData.getObject().getUsername());



    }


    @Then("validate body1")
    public void validate_body() throws JsonProcessingException {




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



