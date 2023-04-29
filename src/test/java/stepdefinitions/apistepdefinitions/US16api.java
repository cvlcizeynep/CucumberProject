package stepdefinitions.apistepdefinitions;

import base_url.StudentManagementBaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import pojos.MessagePojo;
import utilities.JsonUtil;

import static base_url.StudentManagementBaseUrl.*;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class US16api {
    Response response;
    Faker faker = new Faker();
    String mail = faker.name()+faker.name().lastName()+"@gmail.com";

    //burasi test amacli degil
    @Given("Teacher API ile login olarak bir mesaj olusturur")
    public void teacher_api_ile_login_olarak_bir_mesaj_olusturur() {
    teacherSetUp();

        MessagePojo mesaj = new MessagePojo("fff@maeil", "Drsler guzel gidiyor", "Erkam  ", "Ders hakkinda");

        spec.pathParams("first", "contactMessages", "second", "save");
        response = given(spec).body(mesaj).when().post("/{first}/{second}");
        response.prettyPrint();

        assertEquals(200,response.statusCode());

    }

    @Given("Vice Dean olusturulan tum mesajlari API ile goruntuler")
    public void vice_dean_olusturulan_tum_mesajlari_api_ile_goruntuler() {
        viceDeanSetUp();
       spec.pathParams("first", "contactMessages", "second", "getAll","ds",4);
        Response response = given(spec).get("/{first}/{second}");
        //   response.prettyPrint();

        MessagePojo expectedData = new MessagePojo(mail, "Drsler guzel gidiyor", "Erkam  ", "Ders hakkinda");


        MessagePojo actualData = JsonUtil.convertJsonToJavaObject(response.asString(), MessagePojo.class);

        response.then().assertThat().statusCode(200);

//-------------------Hard Assertion---------------------------

        assertTrue(actualData.getEmail().contains(expectedData.getEmail()));
        assertTrue(actualData.getName().contains(expectedData.getName()));
        assertTrue(actualData.getSubject().contains(expectedData.getSubject()));
        assertTrue(actualData.getMessage().contains(expectedData.getMessage()));

    }

    @Then("Vice Dean bir mesaji API ile siler")
    public void vice_dean_bir_mesaji_api_ile_siler() {
        viceDeanSetUp();

    }


}
