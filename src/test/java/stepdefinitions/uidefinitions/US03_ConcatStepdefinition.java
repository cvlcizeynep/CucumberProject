package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ContactPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US03_ConcatStepdefinition {
    ContactPage contactPage = new ContactPage();
    Faker faker = new Faker();
    String email = faker.internet().emailAddress();


    @When("kullanici sayfaya gider")
    public void kullanici_sayfaya_gider() {
        Driver.getDriver().get("https://www.managementonschools.com/login");
    }
    @When("kullanici Contact butonuna tiklar")
    public void kullanici_contact_butonuna_tiklar() {

        ReusableMethods.JSEClickToElement(contactPage.contact);
    }
    @Then("kullanici Concatct sayfasina yonlendirilir")
    public void kullanici_concatct_sayfasina_yonlendirilir() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(contactPage.contactUsSayfasi.isDisplayed());

    }
    @When("kullanici Your Name alanina  valid bir deger {string} girer")
    public void kullanici_your_name_alanina_valid_bir_deger_girer(String string) {
        ReusableMethods.JSEClickToElement(contactPage.yourNameBox);
        contactPage.yourNameBox.sendKeys(string);

    }

    @When("kullanici subject  alanina valid bir deger {string} girer")
    public void kullanici_subject_alanina_valid_bir_deger_girer(String string) {
        contactPage.subjectBox.sendKeys(string);
    }
    @When("kullanici  mesaj alanina valid bir deger {string} girer")
    public void kullanici_mesaj_alanina_valid_bir_deger_girer(String string) {
        contactPage.messageBox.sendKeys(string);
    }
    @When("kullanici Send Message alanina tiklar")
    public void kullanici_send_message_alanina_tiklar() {
        ReusableMethods.waitFor(4);
        ReusableMethods.scrollToElement(contactPage.sendMessajButton);
        ReusableMethods.JSEClickToElement(contactPage.sendMessajButton);

    }
    @Then("kullanici Contact Message Created Created Successfully mesajini gorur")
    public void kullanici_contact_message_created_created_successfully_mesajini_gorur() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(contactPage.successfullyPopUp,5).isDisplayed());

    }



    @When("kullanici email {string} alanina valid deger girer")
    public void kullaniciEmailAlaninaValidDegerGirer(String string) {
        contactPage.yourEmailBox.sendKeys(string);
    }


    @When("kullanici subject {string} alanina valid deger  girer")
    public void kullaniciSubjectAlaninaValidDegerGirer(String string) {
        contactPage.subjectBox.sendKeys(string);

    }

    @When("kullanici Message {string} alanina valid deger  girer")
    public void kullaniciMessageAlaninaValidDegerGirer(String string) {
        contactPage.messageBox.sendKeys(string);

    }

    @Then("kullanici Contact Message Created Created Successfully mesajini goruntulemez")
    public void kullaniciContactMessageCreatedCreatedSuccessfullyMesajiniGoruntulemez() {
        Assert.assertFalse(ReusableMethods.waitForVisibility(contactPage.successfullyPopUp,5).isDisplayed());


    }


    @Then("kullanici uyari ayni maili kullanamayacgi mesaji alir")
    public void kullaniciUyariAyniMailiKullanamayacgiMesajiAlir() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(contactPage.ayniMailPopUp,5).isDisplayed());
    }


    @When("kullanici Your Email  alanina  valid bir deger girer")
    public void kullaniciYourEmailAlaninaValidBirDegerGirer() {
        contactPage.yourEmailBox.sendKeys(email);

    }


    @When("kullanici Your Email  alanina  ayni maili girer")
    public void kullaniciYourEmailAlaninaAyniMailiGirer() {
        contactPage.yourEmailBox.sendKeys(email);
    }

    @When("kullanici yourname {string} alanini doldurur")
    public void kullaniciYournameAlaniniDoldurur(String string) {
        ReusableMethods.JSEClickToElement(contactPage.yourNameBox);
        contactPage.yourNameBox.sendKeys(string);
    }

    @When("kullanici Your Email  alanina  valid bir deger {string} girer")
    public void kullaniciYourEmailAlaninaValidBirDegerGirer(String string) {
        String email2 = faker.internet().emailAddress();
        contactPage.yourEmailBox.sendKeys(email2);
    }


    @Then("kullanici Contact Message Created Created Successfully mesajini goruntuler")
    public void kullaniciContactMessageCreatedCreatedSuccessfullyMesajiniGoruntuler() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(contactPage.successfullyPopUp,5).isDisplayed());
    }

    @When("kullanici yourname {string} alanini bos birakir")
    public void kullaniciYournameAlaniniBosBirakir(String string) {
        contactPage.yourNameBox.sendKeys(string);
    }

    @When("kullanici email {string} alanini bos birakir")
    public void kullaniciEmailAlaniniBosBirakir(String string) {
        contactPage.yourEmailBox.sendKeys(string);
    }

    @When("kullanici subject {string} alanini bos birakir")
    public void kullaniciSubjectAlaniniBosBirakir(String string) {
        contactPage.subjectBox.sendKeys(string);
    }

    @When("kullanici Message {string} alanini bos birakir")
    public void kullaniciMessageAlaniniBosBirakir(String string) {
        contactPage.messageBox.sendKeys(string);
    }
}
