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

import static base_url.StudentManagementBaseUrl.spec;
import static base_url.StudentManagementBaseUrl.teacherSetUp;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US20_TeacherCanSeeMeetListApi {
    Response response;
    MeetRootPojo expectedData;
    MeetRootPojo actualData;
    MeetObjectPojo meetObjectPojo;
    StudentMeetPojo studentMeetPojos;
    MeetResponsePojo expecteddataput;

    @Given("teacher sends the add_meetList_GET")
    public void teacher_sends_the_add_meet_list_get() {
        teacherSetUp();
        spec.pathParams("first", "meet", "second", "getMeetById", "third", 128);
        studentMeetPojos = new StudentMeetPojo(179, "arda",
                "222-44-3333", "Arda", "Güler", "2005-01-01",
                "Kahramanmaraş", "222-444-3333", "MALE",
                "Aynur", "Mustafa", 176, "arda@gmail.com", true);

        ArrayList<StudentMeetPojo> studentMeetPojo = new ArrayList<>();
        studentMeetPojo.add(studentMeetPojos);


        meetObjectPojo = new MeetObjectPojo(128, "hm", "2023-05-14",
                "07:00:00", "08:00:00", 352, "Volkan",
                "222-33-1111", studentMeetPojo);


        expectedData = new MeetRootPojo(meetObjectPojo, "Meet successfully found", "CREATED");
        System.out.println(expectedData);


        response = given(spec).
                when().
                get("{first}/{second}/{third}");
        response.prettyPrint();


        actualData = JsonUtil.convertJsonToJavaObject(response.asString(), MeetRootPojo.class);
        System.out.println(actualData);

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
        spec.pathParams("first", "meet", "second", "update", "third", 99);

        ArrayList<Integer> studentId = new ArrayList<>();
        studentId.add(0);
        expecteddataput = new MeetResponsePojo("2026-09-09", "muammer", "18:14", "19:15", studentId);


        meetObjectPojo = new MeetObjectPojo(99, "muammer", "2026-09-09",
                "18:14:00", "19:15:00", 20, "fvdesfgt",
                "123-45-7896", null);
        expectedData = new MeetRootPojo(meetObjectPojo, "Meet successfully found", "CREATED");

        response = given(spec).when().body(expecteddataput).get("{first}/{second}/{third}");
        response.prettyPrint();

        MeetRootPojo actualData = JsonUtil.convertJsonToJavaObject(response.asString(), MeetRootPojo.class);
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
        spec.pathParams("first", "meet", "second", "delete", "third", 99);


        Response response = given(spec).delete("{first}/{second}/{third}");
        response.prettyPrint();

    }

    @Then("teacher gets the add_meetList and assert_DELETE")
    public void teacher_gets_the_add_meet_list_and_assert_delete() {


        HashMap actualData = JsonUtil.convertJsonToJavaObject(response.asString(), HashMap.class);
        assertEquals(200, response.statusCode());

        assertEquals(0, actualData.size());

    }


}




