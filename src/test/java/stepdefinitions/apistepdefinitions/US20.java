package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.MeetObjectPojo;
import pojos.MeetResponsePojo;
import pojos.MeetRootPojo;
import pojos.StudentMeetPojo;
import utilities.JsonUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static base_url.StudentManagementBaseUrl.spec;
import static base_url.StudentManagementBaseUrl.teacherSetUp;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US20 {
    Response response;
    MeetRootPojo expectedData;
    MeetRootPojo actualData;
    MeetObjectPojo meetObjectPojo;
    StudentMeetPojo studentMeetPojos;
    MeetResponsePojo expecteddataput;
    @Given("teacher sends the add_meetList_GET")
    public void teacher_sends_the_add_meet_list_get() {
        teacherSetUp();
        spec.pathParams("first", "meet", "second", "getMeetById", "third", 63);
        studentMeetPojos = new StudentMeetPojo(41, "mehmetcan",
                "333-22-9999", "mehmet", "can", "2010-02-01",
                "almanya", "111-222-9999", "MALE",
                "ayse", "ali", 1039, "team08@gmail.com", true);

        ArrayList<StudentMeetPojo> studentMeetPojo = new ArrayList<>();
        studentMeetPojo.add(studentMeetPojos);


        meetObjectPojo = new MeetObjectPojo(63, "vgf", "2025-08-12",
                "17:30:00", "18:00:00", 8, "Nihal",
                "123-54-3478", studentMeetPojo);


        expectedData = new MeetRootPojo(meetObjectPojo, "Meet successfully found", "CREATED");



        response = given(spec).
                when().
                get("{first}/{second}/{third}");
        response.prettyPrint();


        actualData = JsonUtil.convertJsonToJavaObject(response.asString(), MeetRootPojo.class);


    }

    @Then("teacher gets the add_meetList and assert_GET")
    public void teacher_gets_the_add_meet_list_and_assert_get() {


        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getMessage(), actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(), actualData.getHttpStatus());
        assertEquals(expectedData.meetObjectPojo.getId(), actualData.meetObjectPojo.getId());
        assertEquals(meetObjectPojo.getDescription(), actualData.meetObjectPojo.getDescription());
        assertEquals(meetObjectPojo.getDate(), actualData.meetObjectPojo.getDate());
        assertEquals(meetObjectPojo.getStartTime(), actualData.meetObjectPojo.getStartTime());
        assertEquals(meetObjectPojo.getStopTime(), actualData.meetObjectPojo.getStopTime());
        assertEquals(meetObjectPojo.getAdvisorTeacherId(), actualData.meetObjectPojo.getAdvisorTeacherId());
        assertEquals(meetObjectPojo.getTeacherName(), actualData.meetObjectPojo.getTeacherName());
        assertEquals(meetObjectPojo.getTeacherSsn(), actualData.meetObjectPojo.getTeacherSsn());
        assertEquals(studentMeetPojos.getId(), actualData.meetObjectPojo.getStudentMeetPojo().get(0).getId());
        assertEquals(studentMeetPojos.getUsername(), actualData.meetObjectPojo.getStudentMeetPojo().get(0).getUsername());
        assertEquals(studentMeetPojos.getSsn(), actualData.meetObjectPojo.getStudentMeetPojo().get(0).getSsn());
        assertEquals(studentMeetPojos.getName(), actualData.meetObjectPojo.getStudentMeetPojo().get(0).getName());
        assertEquals(studentMeetPojos.getSurname(), actualData.meetObjectPojo.getStudentMeetPojo().get(0).getSurname());
        assertEquals(studentMeetPojos.getBirthDay(), actualData.meetObjectPojo.getStudentMeetPojo().get(0).getBirthDay());
        assertEquals(studentMeetPojos.getPhoneNumber(), actualData.meetObjectPojo.getStudentMeetPojo().get(0).getPhoneNumber());
        assertEquals(studentMeetPojos.getGender(), actualData.meetObjectPojo.getStudentMeetPojo().get(0).getGender());
        assertEquals(studentMeetPojos.getMotherName(), actualData.meetObjectPojo.getStudentMeetPojo().get(0).getMotherName());
        assertEquals(studentMeetPojos.getFatherName(), actualData.meetObjectPojo.getStudentMeetPojo().get(0).getFatherName());
        assertEquals(studentMeetPojos.getStudentNumber(), actualData.meetObjectPojo.getStudentMeetPojo().get(0).getStudentNumber());
        assertEquals(studentMeetPojos.getEmail(), actualData.meetObjectPojo.getStudentMeetPojo().get(0).getEmail());
        assertTrue(actualData.meetObjectPojo.getStudentMeetPojo().get(0).isActive());


    }

    @Given("teacher sends the add_meetList_PUT")
    public void teacher_sends_the_add_meet_list_put() {

        teacherSetUp();
        spec.pathParams("first", "meet", "second", "update", "third", 63);

        ArrayList<Integer> studentId=new ArrayList<>();
        studentId.add(63);

        expecteddataput = new MeetResponsePojo("2023-08-22", "ggggggggtytttttttttt", "12:14", "13:18", studentId);
        System.out.println("expecteddata = " + expecteddataput);


        Response response = given().spec(spec).when().body(expecteddataput).get("{first}/{second}/{third}");
        response.prettyPrint();

        MeetResponsePojo actualData = JsonUtil.convertJsonToJavaObject(response.asString(), MeetResponsePojo.class);


    }

    @Then("teacher gets the add_meetList and assert_PUT")
    public void teacher_gets_the_add_meet_list_and_assert_put() {

            JsonPath jsonPath = response.jsonPath();
            assertEquals(200, response.statusCode());
            assertEquals(expecteddataput.date, jsonPath.getString("object.date"));
            assertEquals(expecteddataput.startTime, jsonPath.getString("object.startTime"));
            assertEquals(expecteddataput.stopTime, jsonPath.getString("object.stopTime"));
            assertEquals(expecteddataput.description, jsonPath.getString("object.description"));
            assertEquals(expecteddataput.studentIds, jsonPath.getString("object.students[0]"));
            assertEquals(expecteddataput.studentIds, jsonPath.getString("object.students[1]"));
   }
//
    @Given("teacher sends the add_meetList_DELETE")
    public void teacher_sends_the_add_meet_list_delete() {

        teacherSetUp();
        spec.pathParams("first", "todos", "second", 1928);


        Response response = given(spec).delete("{first}/{second}");
        response.prettyPrint();

    }

    @Then("teacher gets the add_meetList and assert_DELETE")
    public void teacher_gets_the_add_meet_list_and_assert_delete() {


        Map<String, String> actualData = JsonUtil.convertJsonToJavaObject(response.asString(), HashMap.class);
        assertEquals(200, response.statusCode());

        assertEquals(0, actualData.size());

    }


    }

    //{
//  "httpStatus": "100 CONTINUE",
//  "message": "string",
//  "object": {
//    "advisorTeacherId": 0,
//    "date": "string",
//    "description": "string",
//    "id": 0,
//    "startTime": {
//      "hour": 0,
//      "minute": 0,
//      "nano": 0,
//      "second": 0
//    },
//    "stopTime": {
//      "hour": 0,
//      "minute": 0,
//      "nano": 0,
//      "second": 0
//    },
//    "students": [
//      {
//        "active": true,
//        "birthDay": "yyyy-MM-dd",
//        "birthPlace": "string",
//        "email": "string",
//        "fatherName": "string",
//        "gender": "MALE",
//        "id": 0,
//        "motherName": "string",
//        "name": "string",
//        "phoneNumber": "string",
//        "ssn": "string",
//        "studentNumber": 0,
//        "surname": "string",
//        "username": "string"
//      }
//    ],
//    "teacherName": "string",
//    "teacherSsn": "string",
//    "username": "string"
//  }
//}


