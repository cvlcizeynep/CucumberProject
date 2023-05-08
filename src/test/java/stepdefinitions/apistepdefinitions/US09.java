package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.DeanObjectPojo;
import pojos.LessonPojo;
import utilities.JsonUtil;

import java.util.HashMap;
import java.util.Map;

import static base_url.StudentManagementBaseUrl.spec;
import static base_url.StudentManagementBaseUrl.viceDeanSetUp;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class US09 {
Response response;
    @Given("kullanici Lesson name goruntulemek icin get request gonderir ve dogrulama yapar")
    public void kullanici_lesson_name_goruntulemek_icin_get_request_gonderir_ve_dogrulama_yapar() {
        viceDeanSetUp();
        spec.pathParams("first", "lessons", "second", "getAll");

        response = given(spec).when().get("{first}/{second}");
        response.prettyPrint();

        response.then().statusCode(200);

        JsonPath jsonPath = response.jsonPath();

        assertTrue(jsonPath.getList("lessonName").contains("CYPRESS"));
        // assertTrue(jsonPath.getBoolean("compulsory").(true);
        // assertTrue(jsonPath.getInt("creditScore"),4);
    }
        @Given("kullanici silmek istedigi dersListesi icin delete request gonderir ve dogrulama yapar_asli.")
        public void kullanici_silmek_istedigi_ders_listesi_icin_delete_request_gonderir_ve_dogrulama_yapar_asli() {
           viceDeanSetUp();
            spec.pathParams("first", "lessons", "second", "delete","third",1354);//!!Tekrar diamik yap

            Map<String,String> expecteddata=new HashMap<>();
            expecteddata.put("message","Lesson Deleted");
            expecteddata.put("httpStatus","OK");
            System.out.println(expecteddata);
            Response response = given(spec).delete("{first}/{second}/{third}");
            response.prettyPrint();
            Map<String,String> actualdata= JsonUtil.convertJsonToJavaObject(response.asString(),HashMap.class);
assertEquals(200,response.getStatusCode());
assertEquals(expecteddata,actualdata);
        }

        }


