package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import pojos.MessageObjectPojo;
import pojos.MessagePojo;
import utilities.JsonUtil;

import static base_url.StudentManagementBaseUrl.*;
import static io.restassured.RestAssured.given;
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

        MessageObjectPojo object = new MessageObjectPojo("aslfdas@sadad", "Drsler guzel gidiyor", "Erkam  ", "Ders hakkinda");
        MessagePojo expected =new MessagePojo(object ,"Contact Message Created Successfully","CREATED");


        spec.pathParams("first", "contactMessages", "second", "save");
        response = given(spec).body(expected).when().post("/{first}/{second}");
        response.prettyPrint();

        MessageObjectPojo actualData = JsonUtil.convertJsonToJavaObject(response.asString(), MessageObjectPojo.class);
        System.out.println(actualData);

//        assertEquals(200, response.statusCode());
//        assertEquals(expected.getObject().getEmail(), actualData.getO);
//        assertEquals(expected.getObject().getName(), actualData.getName());
//        assertEquals(expected.getObject().getMessage(), actualData.get());
//        assertEquals(expected.getObject().getSubject(), actualData.getSubject());
//        assertEquals(expected.getMessage(),actualData.getMessage());
//        assertEquals(expected.getHttpStatus(),actualData.get
    }

    @Given("Vice Dean olusturulan tum mesajlari API ile goruntuler")
    public void vice_dean_olusturulan_tum_mesajlari_api_ile_goruntuler() {
        viceDeanSetUp();
        spec.pathParams("first", "contactMessages", "second", "getAll", "ds", 4);
        Response response = given(spec).get("/{first}/{second}");
        //   response.prettyPrint();

        MessageObjectPojo actualData = JsonUtil.convertJsonToJavaObject(response.asString(), MessageObjectPojo.class);
        MessageObjectPojo object= new MessageObjectPojo(mail, "Drsler guzel gidiyor", "Erkam  ", "Ders hakkinda");
        MessagePojo expected= new MessagePojo(object ,"Contact Message Created Successfully","CREATED");

        response.then().assertThat().statusCode(200);
        assertEquals(expected.getObject().getEmail(), actualData.getEmail());
        assertEquals(expected.getObject().getName(), actualData.getName());
        assertEquals(expected.getMessage(), actualData.getMessage());
        assertEquals(expected.getObject().getSubject(), actualData.getSubject());




    }

    @Then("Vice Dean bir mesaji API ile siler")
    public void vice_dean_bir_mesaji_api_ile_siler() {
        viceDeanSetUp();

    }


}
