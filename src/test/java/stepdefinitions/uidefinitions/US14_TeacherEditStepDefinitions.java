package stepdefinitions.uidefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.TeacherManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static utilities.Driver.clickWithJS;
import static utilities.ReusableMethods.waitFor;

public class US14_TeacherEditStepDefinitions {
    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();
    Actions actions;


    @When("Butun alanlari siler")
    public void butunAlanlariSiler() {
        teacherManagementPage.editNameTextBox.clear();
        waitFor(2);
        teacherManagementPage.editSurnameTextBox.clear();
        waitFor(2);
        teacherManagementPage.editBirthPlace.clear();
        waitFor(2);
        teacherManagementPage.editEmailTextbox.clear();
        waitFor(2);
        teacherManagementPage.editPhoneTextbox.clear();
        waitFor(2);
        teacherManagementPage.editSsnTextbox.clear();
        waitFor(2);
        teacherManagementPage.editUsernameTextbox.clear();
        waitFor(2);
        teacherManagementPage.editPasswordTextbox.clear();
    }

    @When("Teacher List alaninda ogretmenin name bilgilerini gorur")
    public void teacherListAlanindaOgretmeninNameBilgileriniGorur() {
        Assert.assertFalse(teacherManagementPage.nameSurnameInfo.isDisplayed());

        //Assert.assertTrue(Driver.getDriver().getPageSource().contains(teacherManagementPage.name.getAttribute("Name")));
    }

    @When("Teacher List alaninda ogretmenin phone number bilgilerini gorur")
    public void teacherListAlanindaOgretmeninPhoneNumberBilgileriniGorur() {
        Assert.assertTrue(teacherManagementPage.phoneNumberInfo.isDisplayed());
        //Assert.assertTrue(Driver.getDriver().getPageSource().contains(teacherManagementPage.name.getAttribute("Phone")));

    }

    @When("Teacher List alaninda ogretmenin SSN bilgilerini gorur")
    public void teacherListAlanindaOgretmeninSSNBilgileriniGorur() {
        Assert.assertTrue(teacherManagementPage.ssnInfo.isDisplayed());
       // Assert.assertTrue(Driver.getDriver().getPageSource().contains(teacherManagementPage.name.getAttribute("Ssn")));
    }

    @Then("Teacher List alaninda ogretmenin username bilgilerini gorur")
    public void teacherListAlanindaOgretmeninUsernameBilgileriniGorur() {
        Assert.assertTrue(teacherManagementPage.userNameInfo.isDisplayed());
       // Assert.assertTrue(Driver.getDriver().getPageSource().contains(teacherManagementPage.name.getAttribute("User")));
    }

    @When("Teacher list alanindaki bir ogretmenin edit butonuna tiklar")
    public void teacherListAlanindakiBirOgretmeninEditButonunaTiklar() {
        for (int i = 1; i < 7; i++) {
            clickWithJS(teacherManagementPage.sagOkButton);
            waitFor(2);
        }clickWithJS(teacherManagementPage.editButton);
    }

    @When("Edit teacher sayfasini goruntuler")
    public void editTeacherSayfasiniGoruntuler() {
        Assert.assertTrue(teacherManagementPage.editTeacherYazisi.isDisplayed());
    }

    @When("Alanlara bilgileri girer {string}, {string}, {string}, {string},{string}")
    public void butunAlanlaraBilgileriGirer(String name, String surname, String birthPlace, String password, String dateOfBirth) {
        Driver.waitAndSendText(teacherManagementPage.name,name);
        Driver.waitAndSendText(teacherManagementPage.surname,surname);
        Driver.waitAndSendText(teacherManagementPage.birthPlace,birthPlace);
        Driver.waitAndSendText(teacherManagementPage.password,password);
        Driver.waitAndSendText(teacherManagementPage.dateOfBirth,dateOfBirth);

    }

    @When("Edit alanlarina bilgileri girer {string}, {string}, {string}, {string},{string}")
    public void editAlanlarinaBilgileriGirer(String name, String surname, String birthPlace, String password, String dateOfBirth) {

        Driver.waitAndSendText(teacherManagementPage.editNameTextBox,name);
        Driver.waitAndSendText(teacherManagementPage.editSurnameTextBox,surname);
        Driver.waitAndSendText(teacherManagementPage.editBirthPlace,birthPlace);
        Driver.waitAndSendText(teacherManagementPage.editPasswordTextbox,password);
        Driver.waitAndSendText(teacherManagementPage.editdateOfBirth,dateOfBirth);
    }

    @When("Edit sayfasindaki Choose Lessons alanindan bir ders secer")
    public void editSayfasindakiChooseLessonsAlanindanBirDersSecer() {
        teacherManagementPage.editTeacherYazisi.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("MathT6"+ Keys.ENTER).perform();
    }

    @Then("Alanlardaki bilgileri {string}, {string}, {string}, {string},{string} olarak gunceller")
    public void alanlardakiBilgileriOlarakGunceller(String name, String surname, String birthPlace, String password, String dateOfBirth) {

        actions.doubleClick(teacherManagementPage.editNameTextBox).sendKeys(Keys.BACK_SPACE+name).perform();
        waitFor(1);
        actions.doubleClick(teacherManagementPage.editSurnameTextBox).sendKeys(Keys.BACK_SPACE+surname).perform();
        waitFor(1);
        actions.doubleClick(teacherManagementPage.editBirthPlace).sendKeys(Keys.BACK_SPACE+birthPlace).perform();
        waitFor(1);
        actions.doubleClick(teacherManagementPage.editPasswordTextbox).sendKeys(Keys.BACK_SPACE+password).perform();
        waitFor(1);
        actions.doubleClick(teacherManagementPage.editdateOfBirth).sendKeys(Keys.BACK_SPACE+dateOfBirth).perform();
        waitFor(1);
    }
}
