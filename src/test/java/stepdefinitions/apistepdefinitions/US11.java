package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;

import static base_url.StudentManagementBaseUrl.spec;
import static base_url.StudentManagementBaseUrl.viceDeanSetUp;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class US11 {
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


}
