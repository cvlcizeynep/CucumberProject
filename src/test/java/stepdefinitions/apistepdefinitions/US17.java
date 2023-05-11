package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.internal.RealSystem;
import pojos.StudentInfoObject;
import pojos.StudentInfoRequest;
import pojos.StudentInfoRoot;
import pojos.StudentResponsePojo;
import utilities.JsonUtil;

import java.util.HashMap;
import java.util.Map;

import static base_url.StudentManagementBaseUrl.spec;
import static base_url.StudentManagementBaseUrl.teacherSetUp;
import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class US17 {
    StudentInfoObject id = new StudentInfoObject();
    @Given("kullanici not vermek icin post request gonderir ve validation yapar")
    public void kullanici_not_vermek_icin_post_request_gonderir_ve_validation_yapar() {
        teacherSetUp();
        spec.pathParams("first", "studentInfo", "second", "save");
        StudentInfoRequest studentInfoRequest = new StudentInfoRequest("1", "1", "75", "Cok cok basarili", "7", "65", "63");
        StudentResponsePojo studentResponsePojo = new StudentResponsePojo(63, "studentsdeneme", "namesiz", "surname", "1999-01-01", "Washington", "789-963-7456", "MALE", 1061, "mother", "father", "aabbcc@gmai.com", true);
        StudentInfoObject studentInfoObject = new StudentInfoObject(1461, 65.0, 75.0, 1, "Cok cok basarili", "SQL", 6, "SPRING_SEMESTER", 79.0, studentResponsePojo, false, "BA");
        StudentInfoRoot expectedData = new StudentInfoRoot(studentInfoObject, "Student Info saved Successfully", "CREATED");
        Response response = given(spec).body(studentInfoRequest).post("{first}/{second}");
        response.prettyPrint();
        StudentInfoRoot actualData = response.as(StudentInfoRoot.class);//json formatında gelen response ı expected datanın formu javaya cevirdik
        assertEquals(200, response.getStatusCode());
        assertEquals(expectedData.getObject().getAbsentee(), actualData.getObject().getAbsentee());
        assertEquals(expectedData.getObject().getEducationTerm(), actualData.getObject().getEducationTerm());
        assertEquals(expectedData.getObject().getStudentResponse().getUserId(), actualData.getObject().getStudentResponse().getUserId());
        assertEquals(expectedData.getObject().getMidtermExam(), actualData.getObject().getMidtermExam());
        assertEquals(expectedData.getObject().getFinalExam(), actualData.getObject().getFinalExam());
        assertEquals(expectedData.getObject().getInfoNote(), actualData.getObject().getInfoNote());

    }



//    @Then("olusturulmus notu siler")
//    public void olusturulmus_notu_siler() {
//
//            //------------SİLME İŞLEMİ----------------------------------
//        teacherSetUp();
//            spec.pathParams("first","studentInfo","second","delete","third",id);
//            Map<String,String> expecteddata=new HashMap<>();
//            expecteddata.put("message","Student Info deleted Successfully");
//            expecteddata.put("httpStatus","OK");
//            System.out.println(expecteddata);
//
//
//
//            Response response2=given(spec).delete("{first}/{second}/{third}");
//            response2.prettyPrint();
//            Map<String,String> actualData2= JsonUtil.convertJsonToJavaObject(response2.asString(),HashMap.class);
//            Assert.assertEquals(200,response2.getStatusCode());
//            Assert.assertEquals(expecteddata,actualData2);
//        }
    }

