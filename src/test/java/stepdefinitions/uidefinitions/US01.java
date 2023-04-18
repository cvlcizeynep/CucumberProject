
package stepdefinitions.uidefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.RegisterPage;
import utilities.Driver;

public class US01 {
RegisterPage registerPage=new RegisterPage();
    @Given("Kullanıcı register sayfasına gider.")
    public void kullanıcı_register_sayfasına_gider() {
        Driver.getDriver().get("https://www.managementonschools.com/register");
    }
    @When("Kullanici register Name {string} kismina değer  girer")
    public void kullanici_register_name_kismina_değer_girer(String string) {
        registerPage.name.sendKeys(string);
    }
    @When("Kullanici register Surname {string} kismina değer  girer")
    public void kullanici_register_surname_kismina_değer_girer(String string) {
        registerPage.surname.sendKeys(string);
    }
    @When("Kullanici register Birth place {string} kismina  deger girer")
    public void kullanici_register_birth_place_kismina_deger_girer(String string) {
        registerPage.birthplace.sendKeys(string);
    }
    @When("Kullanici register Gender kismini secer")
    public void kullanici_register_gender_kismini_secer() {
        registerPage.gendermale.click();
    }
    @When("Kullanici register Birth of Date {string}  girer")
    public void kullanici_register_birth_of_date_girer(String string) {
        registerPage.dateofbhirt.sendKeys(string);
    }
    @When("Kullanici register Phone Number {string} girer")
    public void kullanici_register_phone_number_girer(String string) {
        registerPage.phonenumber.sendKeys(string);
    }
    @When("Kullanici register SSN  {string} girer")
    public void kullanici_register_ssn_girer(String string) {
        registerPage.ssn.sendKeys(string);
    }
    @When("Kullanici register User Name {string} girer")
    public void kullanici_register_user_name_girer(String string) {
        registerPage.username.sendKeys(string);
    }
    @When("Kullanici register Password {string} girer")
    public void kullanici_register_password_girer(String string) throws InterruptedException {
        registerPage.password.sendKeys(string);
        wait(3000);
    }
    @When("Kullanici register submit tusuna tiklar.")
    public void kullanici_register_submit_tusuna_tiklar() throws InterruptedException {
        wait(5000);
        registerPage.registerSubmitButton.click();
    }
    @When("Kullanici Guest User Registered yazısı görmez.")
    public void kullanici_guest_user_registered_yazısı_görmez() {
      Assert.assertTrue(!registerPage.popUpmesaji.getText().contains("registered"));
    }@When("Kullanici Guest User Registered yazısı görür.")
    public void kullanici_guest_user_registered_yazısı_görür() {
      Assert.assertTrue(registerPage.popUpmesaji.getText().contains("registered"));
    }
    @When("Kullanici Please enter valid ssn yazısı görür.")
    public void Kullanici_Please_enter_valid_ssn_yazısı_görür() {
      Assert.assertTrue(registerPage.popUpmesaji.getText().contains("enter valid ssn"));
    }
   @When("Kullanici Please enter valid phone number yazısı görür.")
    public void Kullanici_Please_enter_valid_phone_number_yazısı_görür() {
      Assert.assertTrue(registerPage.popUpmesaji.getText().contains("enter valid phone"));
    }


}
