package stepdefinitions.apistepdefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import pojos.MessageObjectPojo;
import pojos.MessagePojo;
import utilities.JsonUtil;

import static base_url.StudentManagementBaseUrl.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class US16api {
    Response response;
    Faker faker = new Faker();
    String mail = faker.name() + faker.name().lastName() + "@gmail.com";

    //burasi test amacli degil
    @Given("Teacher API ile login olarak bir mesaj olusturur")
    public void teacher_api_ile_login_olarak_bir_mesaj_olusturur() {
        teacherSetUp();

        //dogrusu bu ama faker calismiyor
        //  MessageObjectPojo object = new MessageObjectPojo(mail, "Dersler guzel gidiyor", "Erkam", "Ders hakkinda");
        MessageObjectPojo object = new MessageObjectPojo("dsfsfs@ddsf", "Dersler guzel gidiyor", "Erkam", "Ders hakkinda");
        MessagePojo expected = new MessagePojo(object, "Contact Message Created Successfully", "CREATED");

        spec.pathParams("first", "contactMessages", "second", "save");
        response = given(spec).body(object).when().post("/{first}/{second}");


        MessagePojo actualData = JsonUtil.convertJsonToJavaObject(response.asString(), MessagePojo.class);


        assertEquals(200, response.statusCode());
        assertEquals(expected.getObject().getEmail(), actualData.getObject().getEmail());
        assertEquals(expected.getObject().getName(), actualData.getObject().getName());
        assertEquals(expected.getObject().getMessage(), actualData.getObject().getMessage());
        assertEquals(expected.getObject().getSubject(), actualData.getObject().getSubject());
        assertEquals(expected.getMessage(), actualData.getMessage());
        assertEquals(expected.getHttpStatus(), actualData.getHttpStatus());
    }

    @Given("Vice Dean olusturulan tum mesajlari API ile goruntuler")
    public void vice_dean_olusturulan_tum_mesajlari_api_ile_goruntuler() {
        viceDeanSetUp();


    }

    @Then("Vice Dean bir mesaji API ile siler")
    public void vice_dean_bir_mesaji_api_ile_siler() {
//Swagger da delete yok
    }
}
