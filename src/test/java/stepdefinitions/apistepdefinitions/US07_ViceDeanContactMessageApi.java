package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.ContactGellAllPage;
import pojos.MessageObjectPojo;
import pojos.MessagePojo;

import utilities.*;

import java.util.*;

import static base_url.StudentManagementBaseUrl.*;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US07_ViceDeanContactMessageApi {
    ContactGellAllPage contactGellAllPage;
    Response response;
    MessageObjectPojo messageObjectPojo;
    MessagePojo expectedData;
    Response response1;
    public static Map<String, Object> apilist = new HashMap<>();
    public static List<WebElement> messageList = new ArrayList<>();
    public static String name = FakerUtils.nameFaker();
    public static String email = FakerUtils.emailFaker();

    String subject = "mesaj listinin kontrolu var mi";
    String message = "mesajlar apide gorunuyor mu";


    @Given("Kullanici mesaj gondermek icin post yapar")
    public void kullanici_mesaj_gondermek_icin_post_yapar() {
        studentSetUp();
        spec.pathParams("first", "contactMessages", "second", "save");
        messageObjectPojo = new MessageObjectPojo(email, message, name, subject);
        response = given(spec).when().body(messageObjectPojo).post("{first}/{second}");
        response.prettyPrint();
        ReusableMethods.waitFor(3);

    }

    @Then("Kullanici gonderdigi mesajin ve ona ait bilgilerin goruldugunu dogrular")
    public void kullanici_gonderdigi_mesajin_ve_ona_ait_bilgilerin_goruldugunu_dogrular() {
        expectedData = new MessagePojo(messageObjectPojo, "Contact Message Created Successfully", "CREATED");
        MessagePojo actualData = JsonUtil.convertJsonToJavaObject(response.asString(), MessagePojo.class);
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getObject().getName(), actualData.getObject().getName());
        assertEquals(expectedData.getObject().getMessage(), actualData.getObject().getMessage());
        assertEquals(expectedData.getObject().getSubject(), actualData.getObject().getSubject());
        assertEquals(expectedData.getObject().getEmail(), actualData.getObject().getEmail());
    }
    @Given("UI da gorulen mesajlar bir liste atilir")
    public void ui_da_gorulen_mesajlar_bir_liste_atilir() {
        ReusableMethods.login(ConfigReader.getProperty("viceDeanUserName"), ConfigReader.getProperty("viceDeanPassword"));
        ReusableMethods.waitFor(2);
        contactGellAllPage = new ContactGellAllPage();
        contactGellAllPage.menu_button.click();
        ReusableMethods.waitFor(2);
        contactGellAllPage = new ContactGellAllPage();
        ReusableMethods.doubleClick(contactGellAllPage.contact_getAll_button);
        ReusableMethods.waitFor(2);
        List<WebElement> messageList = Driver.getDriver().findElements(By.xpath("//table[@class='table table-striped table-bordered table-hover']"));
        System.out.println(messageList.toString());

    }

    @When("Apiden butun mesajlar bir liste atilir")
    public void apiden_butun_mesajlar_bir_liste_atilir() {
        deanSetUp();
        spec.pathParams("first", "contactMessages", "second", "getAll").queryParams("page","0","size","1000");
        response1 = given(spec).when().get("/{first}/{second}");
        response1.prettyPrint();
        Map<String, Object> apilist = JsonUtil.convertJsonToJavaObject(response1.asString(), HashMap.class);
        System.out.println(apilist);

    }


    @Then("Api ve Ui daki mesajlar karsilastirilarak dogrulama yapilir")
    public void api_ve_ui_daki_mesajlar_karsilastirilarak_dogrulama_yapilir() {
        for (WebElement element : messageList) {
            assert element.toString().contains((CharSequence) apilist);
        }

     //   assert messageList.containsAll((Collection<?>) apilist);


    }


}
