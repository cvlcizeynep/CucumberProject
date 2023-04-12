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

public class US13_TeacherManagementStepDefinitions {

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
        teacherManagementPage.surname.sendKeys(string,Keys.SPACE);
        ReusableMethods.waitFor(2);
    }


    @When("Birth Place alanina valid bir deger {string} girer")
    public void birthPlaceAlaninaValidBirDegerGirer(String string) {
        teacherManagementPage.birthPlace.sendKeys(string,Keys.SPACE);
        ReusableMethods.waitFor(2);
    }

    @When("Email alanina valid bir deger girer")
    public void emailAlaninaValidBirDegerGirer() {
        Faker faker = new Faker();
        teacherManagementPage.email.sendKeys(faker.internet().emailAddress());
        ReusableMethods.waitFor(2);
    }

    @When("Phone alanina valid bir deger girer")
    public void phoneAlaninaValidBirDegerGirer() {

        Faker faker = new Faker();
        String phoneNumber = faker.phoneNumber().phoneNumber().replaceAll("[^0-9]", "");
        phoneNumber = String.format("%s-%s-%s",
                phoneNumber.substring(0, 3),
                phoneNumber.substring(3, 6),
                phoneNumber.substring(6, 10)
        );
        teacherManagementPage.phone.sendKeys(phoneNumber);

    }

    @When("SSN alanina valid bir deger girer")
    public void ssnAlaninaValidBirDegerGirer() {

        Faker faker = new Faker();
        String ssn = faker.idNumber().ssnValid().replaceAll("[^0-9]","");
        String formattedSSN = ssn.substring(0, 3) + "-" + ssn.substring(3, 5) + "-" + ssn.substring(5, 9);
        teacherManagementPage.ssn.sendKeys(formattedSSN);
    }

    @When("Username alanina valid bir deger girer")
    public void usernameAlaninaValidBirDegerGirer() {

        Faker faker = new Faker();
        teacherManagementPage.username.sendKeys(faker.name().username());
        ReusableMethods.waitFor(2);


    }

    @When("Password alanina valid bir deger {string} girer")
    public void passwordAlaninaValidBirDegerGirer(String string) {
        teacherManagementPage.password.sendKeys(string);
        ReusableMethods.waitFor(2);
    }

    @When("Is Advisor Teacher alanindaki checkbox a tiklar")
    public void ısAdvisorTeacherAlanindakiCheckboxATiklar() {
        teacherManagementPage.isAdvisorTeacher.click();
        ReusableMethods.waitFor(2);
    }

    @When("Gender alanindan cinsiyet {string} secer")
    public void genderAlanindanCinsiyetSecer(String string) {
        if (string.equals("male")) {
            teacherManagementPage.genderMale.click();
        }else if(string.equals("female")) {
            teacherManagementPage.genderFemale.click();
        }else {
            ReusableMethods.waitFor(2);
        }

    }

    @When("Date of birth alanina bir tarih {string} girer")
    public void dateOfBirthAlaninaBirTarihGirer(String string) {
        teacherManagementPage.dateOfBirth.sendKeys(string);
        ReusableMethods.waitFor(2);
    }

    @When("Submit butonuna tiklar")
    public void submitButonunaTiklar() {
        Driver.clickWithJS(teacherManagementPage.submit);
        ReusableMethods.waitFor(2);
    }

    @Then("Submit butonunun aktif olmadigini gorur")
    public void submitButonununAktifOlmadiginiGorur() {


    }

    @When("Name alanina valid bir deger {string} girer")
    public void nameAlaninaValidBirDegerGirer(String string) {

        teacherManagementPage.name.sendKeys(string,Keys.SPACE);

        if (teacherManagementPage.name == null) {
            Assert.assertFalse(teacherManagementPage.required.get(0).isDisplayed());
        }


    }

    @When("Teacher saved successfully yazisini gorur")
    public void teacherSavedSuccessfullyYazisiniGorur() {
        Assert.assertTrue(teacherManagementPage.popUp.isDisplayed());
        Assert.assertTrue(teacherManagementPage.popUp.getText().contains("Teacher saved successfully"));
        //Please enter valid SSN number
    }

    @When("Choose Lessons alanindan bir ders secer")
    public void chooseLessonsAlanindanBirDersSecer() throws InterruptedException {
        teacherManagementPage.chooseLessons.click();
        Thread.sleep(2000);
        Actions action=new Actions(Driver.getDriver());
        action.keyDown(Keys.ARROW_DOWN).sendKeys("Math",Keys.ENTER).perform();
    }



    @When("Email alanina valid bir deger {string} girer")
    public void emailAlaninaValidBirDegerGirer(String arg0) {
    }



    @When("SSN alanina valid bir deger {string} girer")
    public void ssnAlaninaValidBirDegerGirer(String arg0) {
    }
}



