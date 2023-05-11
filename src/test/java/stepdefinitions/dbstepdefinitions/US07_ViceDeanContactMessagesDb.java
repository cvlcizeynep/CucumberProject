package stepdefinitions.dbstepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.MessageObjectPojo;
import utilities.DBUtils;
import utilities.FakerUtils;
import utilities.ReusableMethods;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static base_url.StudentManagementBaseUrl.spec;
import static base_url.StudentManagementBaseUrl.studentSetUp;
import static io.restassured.RestAssured.given;

public class US07_ViceDeanContactMessagesDb {
    List<Object> messagelist= new ArrayList<>();
    List<Object> messageaouthorlist= new ArrayList<>();
    List<Object> messagesubjectlist= new ArrayList<>();
    List<Object> messagemaillist= new ArrayList<>();
    List<Object> messageDatelist= new ArrayList<>();
Faker faker=new Faker();
     String author = FakerUtils.nameFaker();
     String email = FakerUtils.emailFaker();
     String subject = "konumuz bu";
    String message = "ne yazayim ki mesaj iste";


    static LocalDate localDate=LocalDate.now();
    static String bugun=localDate.toString();
Response response;
MessageObjectPojo messageObjectPojo;



    @Given("Ogrenci mesaj gonderir.")
    public void ogrenci_mesaj_gonderir() {
        studentSetUp();
        spec.pathParams("first","contactMessages","second","save");
        //messageObjectPojo=new MessageObjectPojo(email,message,author,subject);
        response=given(spec).when().body(messageObjectPojo).post("{first}/{second}");
        response.prettyPrint();
        ReusableMethods.waitFor(3);
    }
    @Given("Database icin connect saglanir")
    public void database_icin_connect_saglanir() {
        DBUtils.createConnection();

    }
    @When("Databaseden olusturulan mesajlar sorgulanir")
    public void databaseden_olusturulan_mesajlar_sorgulanir() {
      messagelist= Collections.singletonList(DBUtils.getQueryResultList("select message from contact_message"));


          }

    @Then("Gonderilen mesajlarin goruldugu dogrulanir")
    public void gonderilen_mesajlarin_goruldugu_dogrulanir() {
        assert messagelist.toString().contains(message);


    }
    @When("Databaseden olusturulan yazarlar sorgulanir")
    public void databaseden_olusturulan_yazarlar_sorgulanir() {
    messageaouthorlist= Collections.singletonList(DBUtils.getQueryResultList("select name from contact_message"));


    }
    @Then("Gonderilen mesajlarin yazarlarinin goruldugu dogrulanir")
    public void gonderilen_mesajlarin_yazarlarinin_goruldugu_dogrulanir() {
        System.out.println(author);
        System.out.println(messageaouthorlist);
        assert messageaouthorlist.toString().contains(author);


    }


    @When("Databaseden mesajlari gonderenlerin emailleri  sorgulanir")
    public void databaseden_mesajlari_gonderenlerin_emailleri_sorgulanir() {
      messagemaillist= Collections.singletonList(DBUtils.getQueryResultList("select email from contact_message"));

    }
    @Then("Gonderilen mesajlari gonderenlerin emaillerinin goruldugu dogrulanir")
    public void gonderilen_mesajlari_gonderenlerin_emaillerinin_goruldugu_dogrulanir() {
        System.out.println(email);
        System.out.println(messagemaillist);
        assert messagemaillist.toString().contains(email);


    }

    @When("Databaseden mesajlarin subjecti  sorgulanir")
    public void databaseden_mesajlarin_subjecti_sorgulanir() {
      messagesubjectlist= Collections.singletonList(DBUtils.getQueryResultList("select subject from contact_message"));

    }
    @Then("Gonderilen mesaajlarin subjectinin goruldugu dogrulanir")
    public void gonderilen_mesaajlarin_subjectinin_goruldugu_dogrulanir() {
        assert messagesubjectlist.toString().contains(subject);

    }


    @When("Databaseden mesajlarin gonderildigi tarih  sorgulanir")
    public void databaseden_mesajlarin_gonderildigi_tarih_sorgulanir() {
     messageDatelist= Collections.singletonList(DBUtils.getQueryResultList("select date from contact_message"));

    }
    @Then("Gonderilen mesajlarin gonderildigi tarihin goruldugu dogrulanir")
    public void gonderilen_mesajlarin_gonderildigi_tarihin_goruldugu_dogrulanir() {
        assert messageDatelist.toString().contains(bugun);

    }


}
