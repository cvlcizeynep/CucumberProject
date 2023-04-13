/*
package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.ContactPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US_16 {
    ContactPage contactPage = new ContactPage();
    Faker faker = new Faker();
    String name = faker.name().name();
    String lastName = faker.internet().emailAddress();
    Actions action = new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();

    @Given("Kullanici viceDean olarak login olur")
    public void kullanici_vice_dean_olarak_login_olur() {
        ReusableMethods.login(ConfigReader.getProperty("viceDeanUserName"), ConfigReader.getProperty("viceDeanPassword"));
    }

    @Given("Kullanici Contact butonuna tiklar")
    public void kullanici_contact_butonuna_tiklar() {
        ReusableMethods.waitFor(5);
        ReusableMethods.doubleClick(contactPage.contactButton);
    }

    @And("Kullanici Your Name textboxini  gecerli yourname bilgisini girer")
    public void kullaniciYourNameTextboxiniGecerliYournameBilgisiniGirer() {

        contactPage.yourNameTextbox.click();
        contactPage.yourNameTextbox.sendKeys(name);
    }

    @And("Kullanici Your Mail textboxini  gecerli mailini girer")
    public void kullaniciYourMailTextboxiniGecerliMailiniGirer() {
        contactPage.yourNameTextbox.click();
        contactPage.yourEmailTextbox.sendKeys(lastName);
    }

    @Given("Kullanici Subject textboxini doldurur")
    public void kullanici_subject_textboxini_doldurur() {
        contactPage.subjectTextbox.click();
        contactPage.subjectTextbox.sendKeys("konumuz bu");
    }

    @Given("Kullanici Message textboxini doldurur")
    public void kullanici_message_textboxini_doldurur() {
        ReusableMethods.JSEClickToElement(contactPage.messageTextbox);
        contactPage.messageTextbox.sendKeys("mesaj olarak bisey bulamadim");
    }

    @Given("Kullanici Send Message butonuna tiklar")
    public void kullanici_send_message_butonuna_tiklar() throws InterruptedException {
        ReusableMethods.JSEClickToElement(contactPage.sendMessageButton);
    }

    @Given("Kullanici basarili giris yapildigini dogrular")
    public void kullanici_basarili_giris_yapildigini_dogrular() {

        Assert.assertTrue("Successfully mesaji goruldu", contactPage.successfullyToastify.isDisplayed());
    }

    @Given("Kullanici Menu butonuna tiklar")
    public void kullanici_menu_butonuna_tiklar() {
        ReusableMethods.JSEClickToElement(contactPage.menuButton);
    }

    @Given("Kullanici Contact Get All butonuna tiklar.")
    public void kullanici_contact_get_all_butonuna_tiklar() {
        ReusableMethods.JSEClickToElement(contactPage.contactGetAllButton);
    }

    @Given("Kullanici gonderen kisi isminin Name sutununda goruntulendigini dogrular")
    public void kullanici_gonderen_kisi_isminin_name_sutununda_goruntulendigini_dogrular() {
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("document.body.style.zoom = '70%'");
        // ReusableMethods.JSEClickToElement(contactPage.goToLastPage);
        System.out.println(name);


        for (int l = 1; l <= 20; l++) {
            List<WebElement> nameList = Driver.getDriver().findElements(By.xpath("//table//tbody//tr//td[1]"));


            for (int i = 0; i < nameList.size(); i++) {
                softAssert.assertTrue(nameList.get(i).getText().equals(name), "This name is on the list!");

                ReusableMethods.JSEClickToElement(contactPage.oneTimeForward);
            }
        }
        softAssert.assertAll();
    }

    @Given("Kullanici gonderen kisinin mailinin Email sutununda goruntulendigini dogrular")
    public void kullanici_gonderen_kisinin_mailinin_email_sutununda_goruntulendigini_dogrular() {

    }

    @Given("Kullanici mesajin gonderilme tarinini Date sutununda goruntulendigini dogrular")
    public void kullanici_mesajin_gonderilme_tarinini_date_sutununda_goruntulendigini_dogrular() {

    }

    @Given("Kullanici mesajin konusunun Subject sutununda goruntulendigini dogrular")
    public void kullanici_mesajin_konusunun_subject_sutununda_goruntulendigini_dogrular() {

    }

    @Given("Kullanici mesajin Message sutununda goruntulendigini dogrular")
    public void kullanici_mesajin_message_sutununda_goruntulendigini_dogrular() {

    }


}
*/
