package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.ViceDeanManagement;
import utilities.Driver;

import static utilities.ReusableMethods.waitFor;

public class US_15_Positive {
    ViceDeanManagement viceDeamanagemet = new ViceDeanManagement();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();


    @When("Student Management butonuna tiklar")
    public void studentManagementButonunaTiklar() {

        viceDeamanagemet.StudentManagement.click();
    }

    @Then("Vice Dean Choose {string} Advisor_Teacher alani secilir")
    public void viceDeanChooseAdvisor_TeacherAlaniSecilir(String string) {
        Select select = new Select(viceDeamanagemet.ChooseadvisorTeacher);
        select.selectByVisibleText(string);
        // Driver.clickWithJS(viceDeamanagemet.ChooseadvisorTeacher);
        //waitFor(2);
        //viceDeamanagemet.ChooseadvisorTeacher.sendKeys(string);
    }//*[@value='107']

    @Then("Vice Dean {string}Name alanina vaild bir deger girer")
    public void viceDeanNameAlaninaVaildBirDegerGirer(String string) {

        viceDeamanagemet.name.sendKeys(faker.name().firstName());
    }

    @Then("Vice Dean {string} surname alanina valid bir deger girer")
    public void viceDeanSurnameAlaninaValidBirDegerGirer(String string) {
        viceDeamanagemet.surName.sendKeys(faker.name().lastName());
    }

    @Then("Vice Dean {string} Birth Place alanina valid bir deger girer")
    public void viceDeanBirthPlaceAlaninaValidBirDegerGirer(String string) {
        viceDeamanagemet.birthPlace.sendKeys(faker.address().city());
    }


    @Then("Vice Dean {string} Email alanina valid bir deger girer")
    public void viceDeanEmailAlaninaValidBirDegerGirer(String string) {
        viceDeamanagemet.email.sendKeys(faker.internet().emailAddress());
    }

    @Then("Vice Dean {string} Phone alanina valid bir deger girer")
    public void viceDeanPhoneAlaninaValidBirDegerGirer(String string) {
        String phoneNumber = faker.phoneNumber().phoneNumber().replaceAll("[^0-9]", "");
        phoneNumber = String.format("%s-%s-%s",
                phoneNumber.substring(0, 3),
                phoneNumber.substring(3, 6),
                phoneNumber.substring(6, 10));
        viceDeamanagemet.phone.sendKeys(phoneNumber);
    }

    @Then("Vice Dean Gender secer")
    public void viceDeanGenderSecer() {
        viceDeamanagemet.male.click();
    }

    @Then("Vice Dean {string} Date Of Birth alanina valid bir deger girer")
    public void viceDeanDateOfBirthAlaninaValidBirDegerGirer(String string) {
        viceDeamanagemet.birtDate.sendKeys(string);
    }

    @Then("Vice Dean {string} Ssn alanina valid bir deger girer")
    public void viceDeanSsnAlaninaValidBirDegerGirer(String string) {

        String ssn = faker.idNumber().ssnValid().replaceAll("[^0-9]", "");
        String SSN = ssn.substring(0, 3) + "-" + ssn.substring(3, 5) + "-" + ssn.substring(5, 9);
        viceDeamanagemet.SSN.sendKeys(SSN);
    }

    @Then("Vice Dean {string} User Name alanina valid bir deger girer")
    public void viceDeanUserNameAlaninaValidBirDegerGirer(String string) {
        viceDeamanagemet.userName.sendKeys(faker.name().username());

    }

    @Then("Vice {string} Father alanina valid bir deger girer")
    public void viceFatherAlaninaValidBirDegerGirer(String string) {
        viceDeamanagemet.fatherName.sendKeys(faker.name().firstName());
    }

    @Then("Vice {string} Mother alanina valid bir deger girer")
    public void viceMotherAlaninaValidBirDegerGirer(String string) {
        viceDeamanagemet.motherName.sendKeys(faker.name().firstName());
    }

    @Then("Vice {string} Password alanina valid bir deger girer")
    public void vicePasswordAlaninaValidBirDegerGirer(String string) {

        viceDeamanagemet.password.sendKeys(string);
    }

    @Then("Vice Dean Submit Butonuna tiklar")
    public void viceDeanSubmitButonunaTiklar() {
        viceDeamanagemet.submit.click();
    }

    @And("Vice  Dean succesfully  ibaresini gorur dogrulamasini yapar")
    public void viceDeanSuccesfullyIbaresiniGorurDogrulamasiniYapar() {
        waitFor(2);
        Assert.assertTrue(viceDeamanagemet.succesfully.isDisplayed());
    }


//////////tc02

   /* @And("Vice  Required  ibaresini gorur dogrulamasini yapar")
    public void viceRequiredIbaresiniGorurDogrulamasiniYapar() {
        Assert.assertTrue(viceDeamanagemet.nameRequired.isDisplayed());
       }
    */


    @Then("Vice Dean Choose {string} Advisor_Teacher alani bos birakilir")
    public void viceDeanChooseAdvisor_TeacherAlaniBosBirakilir(String string) {

        viceDeamanagemet.ChooseadvisorTeacher.sendKeys("");
    }

    @And("Vice Dean kayit yapilamadigini dogrular")
    public void viceDeanKayitYapilamadiginiDogrular() {
        waitFor(1);
        Assert.assertTrue(viceDeamanagemet.teacherPopup.getText().contains("Please select advisor teacher"));
    }


    ////////////////////tc3
    @Then("Vice Dean {string}Name alanini bos birakilir")
    public void viceDeanNameAlaniniBosBirakilir(String string) {
        viceDeamanagemet.name.sendKeys("");

    }


    @And("Vice  Required  ibaresini gorur dogrulamasini yapar")
    public void viceRequiredIbaresiniGorurDogrulamasiniYapar() {
        Assert.assertTrue(viceDeamanagemet.nameRequired.isDisplayed());
    }

    ////////////////////tc4



}

