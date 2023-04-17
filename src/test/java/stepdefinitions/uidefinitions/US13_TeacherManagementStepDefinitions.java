package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TeacherManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import static utilities.ReusableMethods.JSEClickToElement;
import static utilities.ReusableMethods.waitFor;

public class US13_TeacherManagementStepDefinitions {

    Faker faker;
    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();


    @When("Menu butonuna tiklar")
    public void menuButonunaTiklar() {
        Driver.clickWithJS(teacherManagementPage.menu);
    }

    @When("Teacher Management butonuna tiklar")
    public void teacherManagementButonunaTiklar() {
        Driver.clickWithJS(teacherManagementPage.teacherManagement);
    }


    @When("Surname alanina valid bir deger {string} girer")
    public void surnameAlaninaValidBirDegerGirer(String string) {
        teacherManagementPage.surname.sendKeys(string);
    }

    @When("Birth Place alanina valid bir deger {string} girer")
    public void birthPlaceAlaninaValidBirDegerGirer(String string) {
        teacherManagementPage.birthPlace.sendKeys(string);
    }

    @When("Email alanina valid bir deger girer")
    public void emailAlaninaValidBirDegerGirer() {
        faker = new Faker();
        teacherManagementPage.email.sendKeys(faker.internet().emailAddress());
    }

    @When("SSN alanina valid bir deger girer")
    public void ssnAlaninaValidBirDegerGirer() {

        faker = new Faker();
        String ssn = faker.idNumber().ssnValid().replaceAll("[^0-9]", "");
        String formattedSSN = ssn.substring(0, 3) + "-" + ssn.substring(3, 5) + "-" + ssn.substring(5, 9);
        teacherManagementPage.ssn.sendKeys(formattedSSN);

    }

    @When("Username alanina valid bir deger girer")
    public void usernameAlaninaValidBirDegerGirer() {
        faker = new Faker();
        teacherManagementPage.username.sendKeys(faker.name().username());
    }

    @When("Password alanina valid bir deger {string} girer")
    public void passwordAlaninaValidBirDegerGirer(String string) {
        teacherManagementPage.password.sendKeys(string);
    }

    @When("Is Advisor Teacher alanindaki checkbox a tiklar")
    public void ısAdvisorTeacherAlanindakiCheckboxATiklar() {
        ReusableMethods.JSEClickToElement(teacherManagementPage.isAdvisorTeacher);

    }

    @When("Gender alanindan cinsiyet {string} secer")
    public void genderAlanindanCinsiyetSecer(String string) {
        if (string.equals("male")) {
            teacherManagementPage.genderMale.click();
        } else if (string.equals("female")) {
            teacherManagementPage.genderFemale.click();
        } else {
            Assert.assertTrue(teacherManagementPage.popUp.isDisplayed());
        }
    }

    @When("Date of birth alanina bir tarih {string} girer")
    public void dateOfBirthAlaninaBirTarihGirer(String string) {
        teacherManagementPage.dateOfBirth.sendKeys("01.19.1998");
    }

    @When("Submit butonuna tiklar")
    public void submitButonunaTiklar() {
        Driver.clickWithJS(teacherManagementPage.submit);
        waitFor(2);
    }

    @Then("Submit butonunun aktif olmadigini gorur")
    public void submitButonununAktifOlmadiginiGorur() {
        Assert.assertTrue(teacherManagementPage.submit.isEnabled());
    }

    @When("Teacher saved successfully yazisini gorur")
    public void teacherSavedSuccessfullyYazisiniGorur() {
        Assert.assertTrue(teacherManagementPage.popUpBasarili.getText().contains("Teacher saved successfully"));
    }

    @When("Name alanina valid bir deger {string} girer")
    public void nameAlaninaValidBirDegerGirer(String string) {

        teacherManagementPage.name.sendKeys(string);
    }

    @When("Choose Lessons alanindan bir ders secer")
    public void chooseLessonsAlanindanBirDersSecer() throws InterruptedException {
        teacherManagementPage.chooseLessons.click();
        waitFor(3);
        Actions action = new Actions(Driver.getDriver());
        waitFor(1);
        action.keyDown(Keys.ARROW_DOWN).sendKeys("Math", Keys.ENTER).perform();
        waitFor(1);
    }


    @When("Email alanina invalid bir deger girer")
    public void emailAlaninainvalidBirDegerGirer() {

        faker = new Faker();
        String invalidEmail = faker.name().username() + "." + faker.lorem().word();
        teacherManagementPage.email.sendKeys(invalidEmail);
    }

    @When("SSN alanina valid bir deger {string} girer")
    public void ssnAlaninaValidBirDegerGirer(String string) {
        teacherManagementPage.ssn.sendKeys(string);
    }

    @When("Ekran goruntusu alinir")
    public void ekranGoruntusuAlinir() {
        try {
            ReusableMethods.getScreenshot("ScreenShot");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @When("Phone alanina valid bir deger {string} girer")
    public void phoneAlaninaValidBirDegerGirer(String string) {
        teacherManagementPage.phone.sendKeys(string);

    }

    @When("Phone alanina valid bir deger girer")
    public void phoneAlaninaValidBirDegerGirer() {
        faker = new Faker();
        String phoneNumber = faker.phoneNumber().phoneNumber().replaceAll("[^0-9]", "");
        phoneNumber = String.format("%s-%s-%s",
                phoneNumber.substring(0, 3),
                phoneNumber.substring(3, 6),
                phoneNumber.substring(6, 10)
        );
        teacherManagementPage.phone.sendKeys(phoneNumber);
    }


    @When("Email alanina valid bir deger {string} girer")
    public void emailAlaninaValidBirDegerGirer(String string) {
        teacherManagementPage.email.sendKeys(string);
    }

    @When("Phone alanina invalid bir deger {string} girer")
    public void phoneAlaninaInvalidBirDegerGirer(String string) {
        teacherManagementPage.phone.sendKeys(string);

    }

    @When("Phone alanina space {string} girer")
    public void phoneAlaninaSpaceGirer(String string) {
        teacherManagementPage.phone.sendKeys(string);
    }

    @When("Gender alanindan male secer")
    public void genderAlanindanMaleSecer() {
        JSEClickToElement(teacherManagementPage.genderMale);
    }


    @When("Alanlara bilgileri girer {string}, {string}, {string}, {string},{string},{string},{string},{string},{string}")
    public void alanlaraBilgileriGirer(String Name, String Surname, String BirthPlace, String Password, String DateOfBirth, String Email, String Phone, String Ssn, String username) {
        faker = new Faker();
        Driver.waitAndSendText(teacherManagementPage.name, Name);
        waitFor(2);
        Driver.waitAndSendText(teacherManagementPage.surname, Surname);
        waitFor(2);
        Driver.waitAndSendText(teacherManagementPage.birthPlace, BirthPlace);
        waitFor(2);
        Driver.waitAndSendText(teacherManagementPage.password, Password);
        waitFor(2);
        Driver.waitAndSendText(teacherManagementPage.dateOfBirth, DateOfBirth);
        waitFor(2);
        Driver.waitAndSendText(teacherManagementPage.email, Email);
        waitFor(2);
        Driver.waitAndSendText(teacherManagementPage.phone, Phone);
        waitFor(2);
        Driver.waitAndSendText(teacherManagementPage.ssn, Ssn);
        waitFor(3);
        teacherManagementPage.username.sendKeys(faker.name().username());


    }

    @When("Alanlara space karakteri girer {string}, {string}, {string}, {string},{string},{string},{string},{string},{string}")
    public void alanlaraSpaceKarakteriGirer(String name, String surname, String birthPlace, String email, String SSN, String password, String phone, String dateOfBirth, String arg8) {
        faker = new Faker();
        teacherManagementPage.name.sendKeys(name, Keys.SPACE);
        waitFor(1);
        teacherManagementPage.surname.sendKeys(surname, Keys.SPACE);
        waitFor(1);
        teacherManagementPage.birthPlace.sendKeys(birthPlace, Keys.SPACE);
        waitFor(1);
        teacherManagementPage.email.sendKeys(email, Keys.SPACE);
        waitFor(1);

        teacherManagementPage.phone.sendKeys(phone);
        teacherManagementPage.ssn.sendKeys(SSN);
        waitFor(2);
        teacherManagementPage.dateOfBirth.sendKeys(dateOfBirth, Keys.SPACE);
        teacherManagementPage.password.sendKeys(password, Keys.SPACE, Keys.SPACE, Keys.SPACE, Keys.SPACE, Keys.SPACE,
                Keys.SPACE, Keys.SPACE, Keys.SPACE);

        teacherManagementPage.username.sendKeys(faker.name().username());
    }


    @When("Hata mesaji alir")
    public void hataMesajiAlir() {
        Assert.assertTrue(teacherManagementPage.errorMessage.isDisplayed());
    }

    @When("Alanlara bilgileri girer {string}, {string}, {string}, {string},{string},{string},{string}")
    public void alanlaraBilgileriGirer(String Name, String Surname, String BirthPlace, String Password, String DateOfBirth, String Phone, String Ssn) {
        faker = new Faker();
        Driver.waitAndSendText(teacherManagementPage.name, Name);
        waitFor(2);
        Driver.waitAndSendText(teacherManagementPage.surname, Surname);
        waitFor(2);
        Driver.waitAndSendText(teacherManagementPage.birthPlace, BirthPlace);
        waitFor(2);
        Driver.waitAndSendText(teacherManagementPage.password, Password);
        waitFor(2);
        Driver.waitAndSendText(teacherManagementPage.dateOfBirth, DateOfBirth);
        waitFor(2);
        Driver.waitAndSendText(teacherManagementPage.phone, Phone);
        waitFor(2);
        Driver.waitAndSendText(teacherManagementPage.ssn, Ssn);
    }

    @When("{string} alani gorunur")
    public void alaniGorunur(String arg0) {
        waitFor(2);
    }
}
