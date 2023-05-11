package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.RegisterPage;
import utilities.DBUtils;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US02_AddAdminGuestUserbilgileriSilebilmeliDb {
    RegisterPage registerPage =new RegisterPage();
    List<Object> namelist = new ArrayList<>();
    List<Object> phonenumberlist = new ArrayList<>();
    List<Object> ssnlist = new ArrayList<>();
    List<Object> usernamelist = new ArrayList<>();

    //***************************name*********************

    @When("Admin Guest User name bilgilerini databasede sorgular")
    public void admin_guest_user_name_bilgilerini_databasede_sorgular() {
        namelist = Collections.singletonList(DBUtils.getQueryResultList("select name from guest_user"));
        System.out.println("guest_user_name = " + namelist);
    }
    @Then("Admin Guest User name bilgilerini gorebildigini dogrular")
    public void admin_guest_user_name_bilgilerini_gorebildigini_dogrular() {
        Assert.assertTrue(namelist.toString().contains("[hayriye]"));

        //**************phone number********************

    }
    @When("Admin Guest User phone number bilgilerini databasede sorgular")
    public void admin_guest_user_phone_number_bilgilerini_databasede_sorgular() {
        phonenumberlist = Collections.singletonList(DBUtils.getQueryResultList("select phone_number from guest_user"));
        System.out.println("guest_userphone_number = " + phonenumberlist);
    }
    @Then("Admin Guest User phone number bilgilerini gorebildigini dogrular")
    public void admin_guest_user_phone_number_bilgilerini_gorebildigini_dogrular() {
        Assert.assertTrue(phonenumberlist.toString().contains("[598-256-6589]"));

    //**************************ssn************************

    }
    @When("Admin Guest User ssn bilgilerini databasede sorgular")
    public void admin_guest_user_ssn_bilgilerini_databasede_sorgular() {
        ssnlist= Collections.singletonList(DBUtils.getQueryResultList("select ssn from guest_user"));
        System.out.println("guest_userssn = " + ssnlist);
    }
    @Then("Admin Guest User ssn bilgilerini gorebildigini dogrular")
    public void admin_guest_user_ssn_bilgilerini_gorebildigini_dogrular() {
        Assert.assertTrue(ssnlist.toString().contains("[235-56-5896]"));

     //***********************username*******************

    }
    @When("Admin Guest User username bilgilerini databasede sorgular")
    public void admin_guest_user_username_bilgilerini_databasede_sorgular() {
        usernamelist= Collections.singletonList(DBUtils.getQueryResultList("select username from guest_user"));
        System.out.println("guest_user_username = " + usernamelist);

    }
    @Then("Admin Guest User username bilgilerini gorebildigini dogrular")
    public void admin_guest_user_username_bilgilerini_gorebildigini_dogrular() {
        Assert.assertTrue(usernamelist.toString().contains("[hayriyekilic]"));

    }


    @Then("Admin Guest User username bilgilerini goremedigini dogrular")
    public void adminGuestUserUsernameBilgileriniGoremediginiDogrular() {

        Assert.assertFalse(usernamelist.toString().contains("asdf12"));

    }

    @Given("Guest user {string} {string} {string} {string}  {string} {string} {string} {string} girerek kayit olur")
    public void guestUserGirerekKayitOlur(String name, String surname, String birthplace, String phone, String data, String ssn, String username, String password) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        Driver.getDriver().get("http://139.59.159.36:3000/register");
        ReusableMethods.waitFor(1);
        registerPage.name.sendKeys(name);
        ReusableMethods.waitFor(1);
        registerPage.surname.sendKeys(surname);
        ReusableMethods.waitFor(1);
        registerPage.birthplace.sendKeys(birthplace);
        registerPage.phonenumber.sendKeys(phone);
        Driver.clickWithJS(registerPage.gendermale);
        registerPage.dateofbhirt.sendKeys(data);
        registerPage.ssn.sendKeys(ssn);
        registerPage.username.sendKeys(username);
        registerPage.password.sendKeys(password);
        js.executeScript("arguments[0].click()", registerPage.registerSubmitButton);
        ReusableMethods.waitFor(1);
        Driver.closeDriver();





    }

    @Then("Close Database")
    public void closeDatabase() {
        DBUtils.closeConnection();
    }
}
