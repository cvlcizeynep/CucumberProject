package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import pojos.LessonName;
import pojos.LessonProgramRequest;
import pojos.Object;
import pojos.Root;

import java.util.ArrayList;

import static base_url.StudentManagementBaseUrl.spec;
import static base_url.StudentManagementBaseUrl.viceDeanSetUp;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US10_AddLessonProgramApi {
    @Given("kullanici ders programı olusturmak icin post request gonderir ve dogrular")
    public void kullanici_ders_programı_olusturmak_icin_post_request_gonderir_ve_dogrular() {
        viceDeanSetUp();
spec.pathParams("first","lessonPrograms","second","save");
        ArrayList<Integer> lessonId=new ArrayList<>();
        lessonId.add(7);
        LessonProgramRequest lessonProgramRequest=new LessonProgramRequest("MONDAY","1",lessonId,"14:50","14:55");
        LessonName lessonName=new LessonName(7,"SQL",6,true);
        ArrayList<LessonName> lessonNames=new ArrayList<>();
        lessonNames.add(lessonName);
        Object object=new Object(2048,"14:50:00","14:55:00",lessonNames,"MONDAY");
        Root expectedData=new Root(object,"Created Lesson Program","CREATED");
        Response response= given(spec).body(lessonProgramRequest).when().post("{first}/{second}");
        response.prettyPrint();
        Root actualData= response.as(Root.class);
        assertEquals(expectedData.getMessage(),actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());

        assertEquals(expectedData.getObject().getStartTime(),actualData.getObject().getStartTime());
        assertEquals(expectedData.getObject().getStopTime(),actualData.getObject().getStopTime());
       assertEquals(expectedData.getObject().getDay(),actualData.getObject().getDay());


    }
}
