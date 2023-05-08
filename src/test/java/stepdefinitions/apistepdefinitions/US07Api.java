package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import pojos.MessageObjectPojo;
import pojos.MessagePojo;

import utilities.FakerUtils;
import utilities.JsonUtil;
import utilities.ReusableMethods;

import static base_url.StudentManagementBaseUrl.spec;
import static base_url.StudentManagementBaseUrl.studentSetUp;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US07Api {
    Response response;
    MessageObjectPojo messageObjectPojo;
    MessagePojo expectedData;

    public static String name = FakerUtils.nameFaker();
    public static String email = FakerUtils.emailFaker();

    String subject = "mesaj listinin kontrolu var mi";
    String message = "mesajlar apide gorunuyor mu";


    @Given("Kullanici mesaj gondermek icin post yapar")
    public void kullanici_mesaj_gondermek_icin_post_yapar(){
        studentSetUp();
        spec.pathParams("first","contactMessages","second","save");
        messageObjectPojo=new MessageObjectPojo(email,message,name,subject);
        response=given(spec).when().body(messageObjectPojo).post("{first}/{second}");
        response.prettyPrint();
        ReusableMethods.waitFor(3);

    }
    @Then("Kullanici gonderdigi mesajin ve ona ait bilgilerin goruldugunu dogrular")
    public void kullanici_gonderdigi_mesajin_ve_ona_ait_bilgilerin_goruldugunu_dogrular() {
        expectedData=new MessagePojo(messageObjectPojo,"Contact Message Created Successfully","CREATED");
        MessagePojo actualData = JsonUtil.convertJsonToJavaObject(response.asString(), MessagePojo.class);
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getObject().getName(), actualData.getObject().getName());
        assertEquals(expectedData.getObject().getMessage(), actualData.getObject().getMessage());
        assertEquals(expectedData.getObject().getSubject(), actualData.getObject().getSubject());
        assertEquals(expectedData.getObject().getEmail(), actualData.getObject().getEmail());

    }
    @Given("UI da gorulen mesajlar bir liste atilir")
    public void ui_da_gorulen_mesajlar_bir_liste_atilir(){




    }

    @When("Apiden butun mesajlar bir liste atilir")
    public void apiden_butun_mesajlar_bir_liste_atilir() {
    }


    @Then("Api ve Ui daki mesajlar karsilastirilarak dogrulama yapilir")
    public void api_ve_ui_daki_mesajlar_karsilastirilarak_dogrulama_yapilir() {

    }






}
