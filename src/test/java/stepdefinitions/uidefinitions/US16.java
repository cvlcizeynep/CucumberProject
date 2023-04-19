
package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.ContactPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US16 {
    ContactPage contactPage = new ContactPage();
    Faker faker = new Faker();
    String name = faker.name().name();
    String email = faker.internet().emailAddress();
    Actions action = new Actions(Driver.getDriver());
    String subject = "konumuz bu";
    String message = "ne yazayim ki mesaj iste";

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
        contactPage.yourEmailBox.click();
        contactPage.yourEmailTextbox.sendKeys(email);
    }

    @Given("Kullanici Subject textboxini doldurur")
    public void kullanici_subject_textboxini_doldurur() {
        contactPage.subjectTextbox.click();
        contactPage.subjectTextbox.sendKeys(subject);
    }

    @Given("Kullanici Message textboxini doldurur")
    public void kullanici_message_textboxini_doldurur() {
        ReusableMethods.JSEClickToElement(contactPage.messageTextbox);
        contactPage.messageTextbox.sendKeys(message);
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
        ReusableMethods.waitForClickablility(contactPage.menuButton, 6);
        ReusableMethods.JSEClickToElement(contactPage.menuButton);
    }

    @Given("Kullanici Contact Get All butonuna tiklar")
    public void kullanici_contact_get_all_butonuna_tiklar() {
        ReusableMethods.JSEClickToElement(contactPage.contactGetAllButton);
    }

    @And("Kullanici gonderen kisi  Name-mail-subject-message bilgilerinin listede goruntulendigini dogrular")
    public void kullaniciGonderenKisiNameMailSubjectMessageBilgilerininListedeGoruntulendiginiDogrular() {
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("document.body.style.zoom = '70%'");

        List<String> nameListString = new ArrayList<>();
        List<WebElement> nameList = Driver.getDriver().findElements(By.xpath("(//table)[1]//tr//td[1]"));
        nameList.forEach(t -> nameListString.add(t.getText()));

        while (!nameListString.contains(name)) {
            Driver.clickWithJS(contactPage.oneTimeForward);
            nameList = Driver.getDriver().findElements(By.xpath("(//table)[1]//tr//td[1]"));
            nameListString.clear();
            nameList.forEach(t -> nameListString.add(t.getText()));
            ReusableMethods.waitFor(2);
        }
        int indexName = nameListString.indexOf(name);
        //System.out.println(indexName);
        WebElement subjectSutun = Driver.getDriver().findElement(By.xpath("(//table)[1]//tr["+(indexName+1)+"]//td[4]"));
        //System.out.println(subjectSutun.getText());
        WebElement emailSutun = Driver.getDriver().findElement(By.xpath("(//table)[1]//tr["+(indexName+1)+"]//td[2]"));
        //System.out.println(emailSutun.getText());
        WebElement messageSutun = Driver.getDriver().findElement(By.xpath("(//table)[1]//tr["+(indexName+1)+"]//td[5]"));
        //System.out.println(messageSutun.getText());

        SoftAssert softAssert=new SoftAssert();
        Assert.assertTrue(nameListString.contains(name));
        Assert.assertEquals(subjectSutun.getText(), subject);
        Assert.assertEquals(emailSutun.getText(), email);
        Assert.assertEquals(messageSutun.getText(), message);
        softAssert.assertAll();
    }

    @Then("Kullanici Delete butonuna tiklar")
    public void kullaniciDeleteButonunaTiklar() {
        Assert.assertTrue(contactPage.successfullyToastify.isDisplayed());
    }

}

