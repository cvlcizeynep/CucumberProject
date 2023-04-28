package stepdefinitions.dbstepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ContactPage;
import utilities.DBUtils;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US07Steps {
    List<Object> messageNamelist= new ArrayList<>();
    ContactPage contactPage = new ContactPage();
    Faker faker = new Faker();
    String message=faker.lorem().paragraph();
    String author=faker.name().fullName();
    String email=faker.name().username()+"@"+"gmail.com";
    String subject=faker.name().firstName();
    static LocalDate localDate=LocalDate.now();
    static String bugun=localDate.toString();


    @Given("Ogrenci mesaj gonderir.")
    public void ogrenci_mesaj_gonderir() {
        Driver.getDriver().get("http://139.59.159.36:3000/");
        ReusableMethods.JSEClickToElement(contactPage.contact);
        ReusableMethods.waitFor(2);
      //  ReusableMethods.scrollToElement(contactPage.yourNameBox);
        ReusableMethods.JSEClickToElement(contactPage.yourNameBox);
        contactPage.yourNameBox.sendKeys(author);
        contactPage.yourEmailBox.sendKeys("mnllkiojhg@gmail.com");
        contactPage.subjectBox.sendKeys("ASERTKLMNBJKIHDNLI");
        contactPage.messageBox.sendKeys(message);
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollToElement(contactPage.sendMessajButton);
        ReusableMethods.JSEClickToElement(contactPage.sendMessajButton);
        System.out.println(subject+"   "+email);
        Driver.closeDriver();
    }
    @Given("Database icin connect saglanir")
    public void database_icin_connect_saglanir() {
        DBUtils.createConnection();

    }
    @When("Databaseden olusturulan mesajlar sorgulanir")
    public void databaseden_olusturulan_mesajlar_sorgulanir() {
      messageNamelist= Collections.singletonList(DBUtils.getQueryResultList("select * from contact_message"));
        System.out.println(messageNamelist);

          }

    @Then("Gonderilen mesajlarin goruldugu dogrulanir")
    public void gonderilen_mesajlarin_goruldugu_dogrulanir() {

        assert messageNamelist.toString().contains(message);


    }


    @When("Databaseden olusturulan yazarlar sorgulanir")
    public void databaseden_olusturulan_yazarlar_sorgulanir() {

    }
    @Then("Gonderilen mesajlarin yazarlarinin goruldugu dogrulanir")
    public void gonderilen_mesajlarin_yazarlarinin_goruldugu_dogrulanir() {

    }


    @When("Databaseden mesajlari gonderenlerin emailleri  sorgulanir")
    public void databaseden_mesajlari_gonderenlerin_emailleri_sorgulanir() {

    }
    @Then("Gonderilen mesajlari gonderenlerin emaillerinin goruldugu dogrulanir")
    public void gonderilen_mesajlari_gonderenlerin_emaillerinin_goruldugu_dogrulanir() {

    }

    @When("Databaseden mesajlarin subjecti  sorgulanir")
    public void databaseden_mesajlarin_subjecti_sorgulanir() {

    }
    @Then("Gonderilen mesaajlarin subjectinin goruldugu dogrulanir")
    public void gonderilen_mesaajlarin_subjectinin_goruldugu_dogrulanir() {

    }


    @When("Databaseden mesajlarin gonderildigi tarih  sorgulanir")
    public void databaseden_mesajlarin_gonderildigi_tarih_sorgulanir() {

    }
    @Then("Gonderilen mesajlarin gonderildigi tarihin goruldugu dogrulanir")
    public void gonderilen_mesajlarin_gonderildigi_tarihin_goruldugu_dogrulanir() {

    }


}
