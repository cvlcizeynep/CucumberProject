package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
import static base_url.StudentManagementBaseUrl.specVicedean;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US20 {
    Response response;

    @Given("teacher sends the add_meetList_GET")
    public void teacher_sends_the_add_meet_list_get() {
//        teacherSetUp();
//        spec.pathParams("first", "meet", "second", "save");
//
//        ArrayList<Integer> studentId = new ArrayList<>();
//        studentId.add(63);
//
//        MeetResponsePojo body = new MeetResponsePojo("2025-01-01", "toplanti", "22:00", "22:01", studentId);
//
//        Response response = given(spec).body(body).when().post("{first}/{second}");
//        response.prettyPrint();
//--------------------------------------------------


    }

    @Then("teacher gets the add_meetList and assert_GET")
    public void teacher_gets_the_add_meet_list_and_assert_get() {

        StudentMeetPojo studentMeetPojos = new StudentMeetPojo(41, "mehmetcan",
                "333-22-9999", "mehmet", "can", "2010-02-01",
                "almanya", "111-222-9999", "MALE",
                "ayse", "ali", 1039, "team08@gmail.com", true);

        ArrayList<StudentMeetPojo> studentMeetPojo = new ArrayList<>();
        studentMeetPojo.add(studentMeetPojos);


        MeetObjectPojo meetObjectPojo = new MeetObjectPojo(63, "vgf", "2025-08-12",
                "17:30:00", "18:00:00", 8, "Nihal",
                "123-54-3478", studentMeetPojo);

        MeetRootPojo expectedData = new MeetRootPojo(meetObjectPojo, "Meet successfully found", "CREATED");
        specVicedean.pathParams("first", "meet", "second", "getMeetById", "third", 63);

        response = given(spec).when().get("{first}/{second}/{third}");
        response.prettyPrint();

        MeetRootPojo actualData = JsonUtil.convertJsonToJavaObject(response.asString(), MeetRootPojo.class);

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
        MeetResponsePojo expecteddata = new MeetResponsePojo("2023-08-22", "ggggggggtytttttttttt", "12:14", "13:18", null);
        System.out.println("expecteddata = " + expecteddata);

        Response response = given().spec(spec).when().body(expecteddata).get("{first}/{second}/{third}");
        response.prettyPrint();

//        DummyRestApiDataPojo expecteddata = new DummyRestApiDataPojo("Ali Can", 111111, 23, "Perfect image");
//        System.out.println("expecteddata = " + expecteddata);
//        DummyRestApiResponseBodyPojo expectedBodyPojo = new DummyRestApiResponseBodyPojo("success", expecteddata, "Successfully! Record has been updated.");
//
//        Response response = given().spec(spec).when().body(expectedBodyPojo).get("/{first}/{second}");
//        response.prettyPrint();
//
//        //Do assertion
//        DummyRestApiResponseBodyPojo actualdata = ObjectMapperUtils.convertJsonTojava(response.asString(), DummyRestApiResponseBodyPojo.class);
//        System.out.println("actualdata = " + actualdata);
//
//        assertEquals(200, response.statusCode());
//        assertEquals(expectedBodyPojo.getStatus(), actualdata.getStatus());
//        assertEquals(expectedBodyPojo.getMessage(), actualdata.getMessage());
//
//        assertEquals(expecteddata.getEmployee_name(), actualdata.getData().getEmployee_name());
//        assertEquals(expecteddata.getEmployee_age(), actualdata.getData().getEmployee_age());
//        assertEquals(expecteddata.getEmployee_salary(), actualdata.getData().getEmployee_salary());


//    }
//
//    @Then("teacher gets the add_meetList and assert_PUT")
//    public void teacher_gets_the_add_meet_list_and_assert_put() {
//
//
//    }
//
//    @Given("teacher sends the add_meetList_DELETE")
//    public void teacher_sends_the_add_meet_list_delete() {
//        //Set the url
//        specVicedean.pathParams("first", "todos", "second", 198);
//
//        //Set the expected data
//        Map<String, String> expectedData = new HashMap<>();
//
//        //Send the request and get the response
//        Response response = given(spec).delete("{first}/{second}");
//        response.prettyPrint();
//
//    }
//
//    @Then("teacher gets the add_meetList and assert_DELETE")
//    public void teacher_gets_the_add_meet_list_and_assert_delete() {
//
//
//        //Do assertion
//
//        Map<String, String> actualData = JsonUtil.convertJsonToJavaObject(response.asString(), HashMap.class);
//        assertEquals(200, response.statusCode());
//
//        assertEquals(0, actualData.size());
//
//    }


    }
}
