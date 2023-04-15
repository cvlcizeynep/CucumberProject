package stepdefinitions.uidefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class LoginStepDefinitions {
    LoginPage loginPage=new LoginPage();

    @Given("Kullanici admin olarak login olur.")
    public void kullanici_admin_olarak_login_olur() {
   ReusableMethods.login(ConfigReader.getProperty("adminUserName"),ConfigReader.getProperty("adminPassword"));
    }

    @Then("Basariyla admin girisi yaptigini dogrular.")
    public void basariyla_admin_girisi_yaptigini_dogrular() {
        ReusableMethods.waitFor(3);
     String actualUrl =Driver.getDriver().getCurrentUrl();
     String expectedUrl="https://www.managementonschools.com/admin-management";
        assertEquals(expectedUrl,actualUrl);

    }


    @Given("Kullanici Dean olarak login olur.")
    public void kullanici_dean_olarak_login_olur() {
        ReusableMethods.login(ConfigReader.getProperty("deanUserName"),ConfigReader.getProperty("deanPassword"));
    }

    @Then("Basariyla Dean girisi yaptigini  dogrular.")
    public void basariyla_dean_girisi_yaptigini_dogrular() {

    }
    @Then("close driver")
    public void close_driver() {
       Driver.closeDriver();
    }



    @Given("Kullanici viceDean olarak login olur.")
    public void kullanici_vice_dean_olarak_login_olur() {
        ReusableMethods.login(ConfigReader.getProperty("viceDeanUserName"),ConfigReader.getProperty("viceDeanPassword"));
    }

    @Then("Basariyla viceDean girisi yaptigini dogrular.")
    public void basariyla_vice_dean_girisi_yaptigini_dogrular() {

    }

    @Given("Kullanici Teacher olarak login olur.")
    public void kullanici_teacher_olarak_login_olur() {
        ReusableMethods.login(ConfigReader.getProperty("teacherUserName"),ConfigReader.getProperty("teacherPassword"));
    }
    @Then("Basariyla teacher girisi yaptigini dogrular.")
    public void basariyla_teacher_girisi_yaptigini_dogrular() {
        ReusableMethods.waitFor(3);
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://www.managementonschools.com/studentInfo";
        assertEquals(expectedUrl,actualUrl);
    }

    @Given("Kullanici Student olarak login olur.")
    public void kullanici_student_olarak_login_olur() {

    }
    @Then("Basariyla student girisi yaptigini dogrular.")
    public void basariyla_student_girisi_yaptigini_dogrular() {


    }


}
