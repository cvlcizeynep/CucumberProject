package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import utilities.JsonUtil;

import java.util.HashMap;
import java.util.Map;

import static base_url.StudentManagementBaseUrl.spec;
import static base_url.StudentManagementBaseUrl.viceDeanSetUp;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US11_ViceDeanLessonProgramApi {
    Response response;

    @Given("kullanici Lesson program goruntulemek icin get request gonderir ve dogrulama yapar")
    public void kullanici_lesson_program_goruntulemek_icin_get_request_gonderir_ve_dogrulama_yapar() {
        viceDeanSetUp();
        spec.pathParams("first","lessonPrograms","second","getAll");
        String url="http://164.92.252.42:8080/lessonPrograms/getAll";
        response=given(spec).when().get("{first}/{second}");
        response.prettyPrint();

        response.then().statusCode(200);
    }
    @Given("kullanici silmek istedigi ders icin delete request gonderir ve dogrulamayapar.")
    public void kullanici_silmek_istedigi_ders_icin_delete_request_gonderir_ve_dogrulamayapar() {
        viceDeanSetUp();
        spec.pathParams("first","lessonPrograms","second","delete","third",478);
        Map<String,String> expecteddata=new HashMap<>();
        expecteddata.put("message","Lesson Program Deleted");
        expecteddata.put("httpStatus","OK");
        System.out.println(expecteddata);

        Response response=given(spec).delete("{first}/{second}/{third}");
        response.prettyPrint();
        Map<String,String> actualData= JsonUtil.convertJsonToJavaObject(response.asString(),HashMap.class);
        assertEquals(200,response.getStatusCode());
        assertEquals(expecteddata,actualData);

    }

}
