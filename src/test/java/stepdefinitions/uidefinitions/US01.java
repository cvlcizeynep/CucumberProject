
package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.RegisterPage;
import utilities.DBUtils;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US01 {
RegisterPage registerPage=new RegisterPage();
Faker faker =new Faker();
String username = faker.name().username();
String ssn =faker.number().numberBetween(100,999)+"-"+
        faker.number().numberBetween(10,99)+"-"+faker.number().numberBetween(1000,9999);

    @Given("Kullanıcı register sayfasına gider.")
    public void kullanıcı_register_sayfasına_gider() {
        Driver.getDriver().get("http://139.59.159.36:3000/register");
        ReusableMethods.waitFor(1);

    }
    @When("Kullanici register Name {string} kismina değer  girer")
    public void kullanici_register_name_kismina_değer_girer(String string) {
        registerPage.name.sendKeys(string);
        ReusableMethods.waitFor(1);
    }
    @When("Kullanici register Surname {string} kismina değer  girer")
    public void kullanici_register_surname_kismina_değer_girer(String string) {

        registerPage.surname.sendKeys(string);
        ReusableMethods.waitFor(1);
    }
    @When("Kullanici register Birth place {string} kismina  deger girer")
    public void kullanici_register_birth_place_kismina_deger_girer(String string) {
        registerPage.birthplace.sendKeys(string);
    }
    @When("Kullanici register Gender kismini secer")
    public void kullanici_register_gender_kismini_secer() {

        registerPage.genderfemale.click();
    }
    @When("Kullanici register Birth of Date {string}  girer")
    public void kullanici_register_birth_of_date_girer(String string) {

        registerPage.dateofbhirt.sendKeys(string);
        ReusableMethods.waitFor(1);
    }
    @When("Kullanici register Phone Number {string} girer")
    public void kullanici_register_phone_number_girer(String string) {


        registerPage.phonenumber.sendKeys(faker.number().numberBetween(100,999)+"-"+
                faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(1000,9999));

    }
    @When("Kullanici register SSN  {string} girer")
    public void kullanici_register_ssn_girer(String string) {

        registerPage.ssn.sendKeys(ssn);

    }
    @When("Kullanici register User Name {string} girer")
    public void kullanici_register_user_name_girer(String string) {

        registerPage.username.sendKeys(username);
        ReusableMethods.waitFor(1);
    }
    @When("Kullanici register Password {string} girer")
    public void kullanici_register_password_girer(String string) throws InterruptedException {
        registerPage.password.sendKeys(string);
        ReusableMethods.waitFor(1);

    }
    @When("Kullanici register submit tusuna tiklar.")
    public void kullanici_register_submit_tusuna_tiklar() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", registerPage.registerSubmitButton);
        ReusableMethods.waitFor(1);
    }
    @When("Kullanici Guest User Registered yazısı görmez.")
    public void kullanici_guest_user_registered_yazısı_görmez() {
        String errorMessageXPath = "//span[contains(@class, 'error-message') and text()='Lütfen doğum tarihinizi giriniz.']";
        Boolean isErrorMessageDisplayed = Driver.getDriver().findElements(By.xpath(errorMessageXPath)).size() > 0;
        Assert.assertFalse("isErrorMessageDisplayed", isErrorMessageDisplayed);
        ReusableMethods.waitFor(1);


    }@When("Kullanici Guest User Registered yazısı görür.")
    public void kullanici_guest_user_registered_yazısı_görür() {
        Assert.assertTrue(registerPage.succesfullyRegistered.isDisplayed());
        ReusableMethods.waitFor(1);
    }
    @When("Kullanici Please enter valid ssn yazısı görür.")
    public void Kullanici_Please_enter_valid_ssn_yazısı_görür() {
        Assert.assertTrue(registerPage.pleaseentervalidssn.isDisplayed());
        ReusableMethods.waitFor(1);
    }
   @When("Kullanici Please enter valid phone number yazısı görür.")
    public void Kullanici_Please_enter_valid_phone_number_yazısı_görür() {
       Assert.assertTrue(registerPage.pleaseentervalidphone.isDisplayed());
       ReusableMethods.waitFor(1);
    }

}
