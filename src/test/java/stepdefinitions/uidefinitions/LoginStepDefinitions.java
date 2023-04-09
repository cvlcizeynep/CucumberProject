package stepdefinitions.uidefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class LoginStepDefinitions {
    LoginPage loginPage=new LoginPage();


    @When("Kullanici StudentManagement sayfasina gider.")
    public void kullanici_student_management_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }@When("Kullanici admin olarak login olur.")
    public void kullanici_admin_olarak_login_olur() {
   ReusableMethods.login(ConfigReader.getProperty("adminUserName"),ConfigReader.getProperty("adminPassword"));
    }
    @Then("Basariyla Login oldugunu dogrular.")
    public void basariyla_login_oldugunu_dogrular() {

    }


}
