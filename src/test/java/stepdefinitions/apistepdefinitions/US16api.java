package stepdefinitions.apistepdefinitions;

import base_url.StudentManagementBaseUrl;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import pojos.MessagePojo;

import static base_url.StudentManagementBaseUrl.*;
import static io.restassured.RestAssured.given;


public class US16api {


        @Given("Teacher API ile login olarak bir mesaj olusturur")
        public void teacher_api_ile_login_olarak_bir_mesaj_olusturur() {
            teacherSetUp();
            spec.pathParams("first", "contactMessages","second","save");
            MessagePojo mesaj= new MessagePojo( 67, "Ali", "Urlu", "konumuz ne", "mesaj atma yeri");
            Response response = given(spec).body(mesaj).when().post("/{first}/{second}");
            response.prettyPrint();
        }
        @Given("Vice Dean olusturulan tum mesajlari API ile goruntuler")
        public void vice_dean_olusturulan_tum_mesajlari_api_ile_goruntuler() {

        }
        @Then("Vice Dean bir mesaji API ile siler")
        public void vice_dean_bir_mesaji_api_ile_siler() {

        }


    }
