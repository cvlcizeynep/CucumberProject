package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import static base_url.StudentManagementBaseUrl.spec;
import static base_url.StudentManagementBaseUrl.studentSetUp;
import static io.restassured.RestAssured.given;

public class US21 {

    Response response;

    @Given("ogrenci dersleri goruntuler")
    public void ogrenci_dersleri_goruntuler() {
        studentSetUp();
        //{{baseUrl}}/lessonPrograms/getAll
        spec.pathParams("first","lessonPrograms","second","getAll");
        response=given(spec).when().get("{first}/{second}");
        response.prettyPrint();

    }

    @Then("ders listesinin goruntulendigini dogrular")
    public void ders_listesinin_goruntulendigini_dogrular() {
        response.then().statusCode(200);

    }



    @Given("ogrenci sectigi dersleri goruntuler")
    public void ogrenci_sectigi_dersleri_goruntuler() {
        studentSetUp();
        //{{baseUrl}}/lessonPrograms/getAllLessonProgramByStudent
        spec.pathParams("first","lessonPrograms","second","getAllLessonProgramByStudent");
        response=given(spec).when().get("{first}/{second}");
        response.prettyPrint();
    }

    @Then("sectigi derslerin listesinin goruntulendigini dogrular")
    public void sectigi_derslerin_listesinin_goruntulendigini_dogrular() {
        response.then().statusCode(200);
    }



    @Given("ogrenci ders notlarini goruntuler")
    public void ogrenci_ders_notlarini_goruntuler() {
        studentSetUp();
        //{{baseUrl}}/studentInfo/getAllByStudent?page=0&size=20
        spec.pathParams("first","studentInfo","second","getAllByStudent").
                queryParams("page",0,"size",20);
        response=given(spec).when().get("{first}/{second}");
        response.prettyPrint();
    }

    @Then("ders notlarinin listesinin goruntulendigini dogrular")
    public void ders_notlarinin_listesinin_goruntulendigini_dogrular() {
        response.then().statusCode(200);

    }

    @Given("ogrenci ogretmeninin olusturdugu toplantilari goruntuler")
    public void ogrenci_ogretmeninin_olusturdugu_toplantilari_goruntuler() {
        studentSetUp();
        //{{baseUrl}}/meet/getAllMeetByStudent
        spec.pathParams("first","meet","second","getAllMeetByStudent");
        response=given(spec).when().get("{first}/{second}");
        response.prettyPrint();
    }

    @Then("ders olusturulan toplantilarin listesinin goruntulendigini dogrular")
    public void ders_olusturulan_toplantilarin_listesinin_goruntulendigini_dogrular() {
        response.then().statusCode(200);
    }

}
