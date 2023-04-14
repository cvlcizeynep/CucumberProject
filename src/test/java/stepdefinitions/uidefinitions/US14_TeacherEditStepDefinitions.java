package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.TeacherManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static utilities.Driver.clickWithJS;
import static utilities.ReusableMethods.JSEClickToElement;
import static utilities.ReusableMethods.waitFor;

public class US14_TeacherEditStepDefinitions {
    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();
    Actions actions;
    Faker faker = new Faker();


    @When("Butun alanlari siler")
    public void butunAlanlariSiler() {
        teacherManagementPage.editNameTextBox.clear();
        teacherManagementPage.editSurnameTextBox.clear();
        teacherManagementPage.editBirthPlace.clear();
        teacherManagementPage.editEmailTextbox.clear();
        teacherManagementPage.editPhoneTextbox.clear();
        teacherManagementPage.editSsnTextbox.clear();
        teacherManagementPage.editUsernameTextbox.clear();
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

    @When("Olusturulan ogretmenin edit butonuna tiklar")
    public void teacherListAlanindakiBirOgretmeninEditButonunaTiklar() {

        List<String> teacherListString = new ArrayList<>();
        List<WebElement> teacherList = Driver.getDriver().findElements(By.xpath("(//table)[1]//tr//td[1]"));
        teacherList.forEach(t -> teacherListString.add(t.getText()));

        while (!teacherListString.contains("Team20 Team20")) {
            Driver.clickWithJS(teacherManagementPage.sagOkButton);
            teacherList = Driver.getDriver().findElements(By.xpath("(//table)[1]//tr//td[1]"));
            teacherListString.clear();
            teacherList.forEach(t -> teacherListString.add(t.getText()));
            ReusableMethods.waitFor(2);
        }
        Driver.clickWithJS(teacherManagementPage.editButton);

    }


    @When("Edit teacher sayfasini goruntuler")
    public void editTeacherSayfasiniGoruntuler() {
        Assert.assertTrue(teacherManagementPage.editTeacherYazisi.isDisplayed());
    }

    @When("Alanlara bilgileri girer {string}, {string}, {string}, {string},{string}")
    public void butunAlanlaraBilgileriGirer(String name, String surname, String birthPlace, String password, String dateOfBirth) {
        Driver.waitAndSendText(teacherManagementPage.name, name);
        Driver.waitAndSendText(teacherManagementPage.surname, surname);
        Driver.waitAndSendText(teacherManagementPage.birthPlace, birthPlace);
        Driver.waitAndSendText(teacherManagementPage.password, password);
        Driver.waitAndSendText(teacherManagementPage.dateOfBirth, dateOfBirth);

    }

    @When("Edit alanlarina bilgileri girer {string}, {string}, {string}, {string},{string}")
    public void editAlanlarinaBilgileriGirer(String name, String surname, String birthPlace, String password, String dateOfBirth) {

        Driver.waitAndSendText(teacherManagementPage.editNameTextBox, name);
        Driver.waitAndSendText(teacherManagementPage.editSurnameTextBox, surname);
        Driver.waitAndSendText(teacherManagementPage.editBirthPlace, birthPlace);
        Driver.waitAndSendText(teacherManagementPage.editPasswordTextbox, password);
        Driver.waitAndSendText(teacherManagementPage.editdateOfBirth, dateOfBirth);
    }

    @When("Edit sayfasindaki Choose Lessons alanindan bir ders secer")
    public void editSayfasindakiChooseLessonsAlanindanBirDersSecer() {
        teacherManagementPage.editTeacherYazisi.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("MathT6" + Keys.ENTER).perform();
    }

    @Then("Alanlardaki bilgileri {string}, {string}, {string}, {string},{string} olarak gunceller")
    public void alanlardakiBilgileriOlarakGunceller(String name, String surname, String birthPlace, String password, String dateOfBirth) {

        ReusableMethods.cleanByJs(teacherManagementPage.editNameTextBox);
        waitFor(2);
        teacherManagementPage.editNameTextBox.sendKeys(name);
        waitFor(2);
        ReusableMethods.cleanByJs(teacherManagementPage.editSurnameTextBox);
        waitFor(2);
        teacherManagementPage.editSurnameTextBox.sendKeys(surname);
        waitFor(2);
        ReusableMethods.cleanByJs(teacherManagementPage.editBirthPlace);
        waitFor(2);
        teacherManagementPage.editBirthPlace.sendKeys(birthPlace);
        waitFor(2);
        ReusableMethods.cleanByJs(teacherManagementPage.editPasswordTextbox);
        waitFor(2);
        teacherManagementPage.editPasswordTextbox.sendKeys(password);
        waitFor(2);
        ReusableMethods.cleanByJs(teacherManagementPage.editdateOfBirth);
        waitFor(2);
        teacherManagementPage.editdateOfBirth.sendKeys(dateOfBirth);
        waitFor(2);
        ReusableMethods.cleanByJs(teacherManagementPage.editUsernameTextbox);
        waitFor(2);
        teacherManagementPage.editUsernameTextbox.sendKeys("Ali");
//        ReusableMethods.cleanByJs(teacherManagementPage.editEmailTextbox);
//        ReusableMethods.cleanByJs(teacherManagementPage.editPhoneTextbox);


//        actions.doubleClick(teacherManagementPage.editNameTextBox).sendKeys(Keys.BACK_SPACE + name).perform();
//        waitFor(1);
        //    actions.doubleClick(teacherManagementPage.editSurnameTextBox).sendKeys(Keys.BACK_SPACE + surname).perform();
//        waitFor(1);
//        actions.doubleClick(teacherManagementPage.editBirthPlace).sendKeys(Keys.BACK_SPACE + birthPlace).perform();
////        waitFor(1);
//        actions.doubleClick(teacherManagementPage.editPasswordTextbox).sendKeys(Keys.BACK_SPACE + password).perform();
//        waitFor(1);
//        actions.doubleClick(teacherManagementPage.editdateOfBirth).sendKeys(Keys.BACK_SPACE + dateOfBirth).perform();
//        waitFor(1);


    }

    @When("Edit alanindaki Is Advisor Teacher alanindaki checkbox a tiklar")
    public void editAlanindakiIsAdvisorTeacherAlanindakiCheckboxATiklar() {
        JSEClickToElement(teacherManagementPage.editIsAdvisorTeacher);
    }

    @When("Edit alanindaki Gender alanindan male secer")
    public void editAlanindakiGenderAlanindanMaleSecer() {
        JSEClickToElement(teacherManagementPage.editGenderMale);
    }

    @When("Edit alanindaki Submit butonuna tiklar")
    public void editAlanindakiSubmitButonunaTiklar() {
        JSEClickToElement(teacherManagementPage.editSubmitButton);
    }


    @When("Username alanina space deger girer")
    public void usernameAlaninaSpaceDegerGirer(String string) {
        teacherManagementPage.username.sendKeys(string, Keys.SPACE, Keys.SPACE, Keys.SPACE, Keys.SPACE, Keys.SPACE, Keys.SPACE, Keys.SPACE, Keys.SPACE, Keys.SPACE, Keys.SPACE, Keys.SPACE, Keys.SPACE, Keys.SPACE);

    }

    @When("Teacher updated successful yazisini gorur")
    public void teacherUpdatedSuccessfulYazisiniGorur() {
        Assert.assertTrue(teacherManagementPage.popUp.getText().contains("Teacher updated Successful"));
    }
}
