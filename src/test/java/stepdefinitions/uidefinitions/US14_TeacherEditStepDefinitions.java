package stepdefinitions.uidefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TeacherManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US14_TeacherEditStepDefinitions {


    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();
    Actions actions;

    @When("Teacher List alaninda ogretmenin name bilgilerini gorur")
    public void teacherListAlanindaOgretmeninNameBilgileriniGorur() {

        Assert.assertTrue(teacherManagementPage.nameSurnameInfo.isDisplayed());
    }

    @When("Teacher List alaninda ogretmenin phone number bilgilerini gorur")
    public void teacherListAlanindaOgretmeninPhoneNumberBilgileriniGorur() {
        Assert.assertTrue(teacherManagementPage.phoneNumberInfo.isDisplayed());
    }

    @When("Teacher List alaninda ogretmenin SSN bilgilerini gorur")
    public void teacherListAlanindaOgretmeninSSNBilgileriniGorur() {
        Assert.assertTrue(teacherManagementPage.ssnInfo.isDisplayed());
    }

    @Then("Teacher List alaninda ogretmenin username bilgilerini gorur")
    public void teacherListAlanindaOgretmeninUsernameBilgileriniGorur() {
        Assert.assertTrue(teacherManagementPage.userNameInfo.isDisplayed());
    }


    @When("Teacher list alanindaki bir ogretmenin edit butonuna tiklar")
    public void teacherListAlanindakiBirOgretmeninEditButonunaTiklar() {


        actions = new Actions(Driver.getDriver());
        //actions.sendKeys(Keys.PAGE_DOWN);
        actions.scrollToElement(teacherManagementPage.sagOkButton);
        Driver.clickWithJS(teacherManagementPage.sagOkButton);
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(teacherManagementPage.name.getAttribute("name")));


    }

    @When("Edit teacher sayfasini goruntuler")
    public void editTeacherSayfasiniGoruntuler() {
        ////div[text()='Edit Teacher']
    }


    @When("Name alanini siler")
    public void nameAlaniniSiler() {
        teacherManagementPage.name.clear();
    }

    @When("Surname alanini siler")
    public void surnameAlaniniSiler() {
        teacherManagementPage.surname.clear();
    }

    @When("Birth Place alanini siler")
    public void birthPlaceAlaniniSiler() {
        teacherManagementPage.birthPlace.clear();
    }

    @When("Email alanini siler")
    public void emailAlaniniSiler() {
        teacherManagementPage.email.clear();
    }

    @When("Phone alanini siler")
    public void phoneAlaniniSiler() {
        teacherManagementPage.phone.clear();
    }

    @When("SSN alanini siler")
    public void ssnAlaniniSiler() {
        teacherManagementPage.ssn.clear();
    }

    @When("Username alanini siler")
    public void usernameAlaniniSiler() {
        teacherManagementPage.username.clear();
    }

    @When("Password alanini siler")
    public void passwordAlaniniSiler() {
        teacherManagementPage.password.clear();
    }

    @When("Date of birth alanini siler")
    public void dateOfBirthAlaniniSiler() {
        teacherManagementPage.dateOfBirth.clear();
    }


}
