package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.ViceDeanManagement;
import utilities.Driver;

import static utilities.ReusableMethods.waitFor;

public class US25 {
    ViceDeanManagement viceDeamanagemet = new ViceDeanManagement();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    @Then("Admin Choose {string} Advisor_Teacher alani secilir")
    public void adminChooseAdvisor_TeacherAlaniSecilir(String String) {
        viceDeamanagemet.name.sendKeys(faker.name().name());

    }

    @Then("Admin {string}Name alanina vaild bir deger girer")
    public void adminNameAlaninaVaildBirDegerGirer(String string) {
        Select select = new Select(viceDeamanagemet.ChooseadvisorTeacher);
        select.selectByVisibleText(string);
    }

    @Then("Admin {string} surname alanina valid bir deger girer")
    public void adminSurnameAlaninaValidBirDegerGirer(String String) {
        viceDeamanagemet.surName.sendKeys(faker.name().lastName());
    }

    @Then("Admin {string} Birth Place alanina valid bir deger girer")
    public void adminBirthPlaceAlaninaValidBirDegerGirer(String string) {
        viceDeamanagemet.birthPlace.sendKeys(faker.address().city());
    }

    @Then("Admin {string} Email alanina valid bir deger girer")
    public void adminEmailAlaninaValidBirDegerGirer(String string) {
        viceDeamanagemet.email.sendKeys(faker.internet().emailAddress());
    }

    @Then("Admin {string} Phone alanina valid bir deger girer")
    public void adminPhoneAlaninaValidBirDegerGirer(String arg0) {
        String phoneNumber = faker.phoneNumber().phoneNumber().replaceAll("[^0-9]", "");
        phoneNumber = String.format("%s-%s-%s",
                phoneNumber.substring(0, 3),
                phoneNumber.substring(3, 6),
                phoneNumber.substring(6, 10));
        viceDeamanagemet.phone.sendKeys(phoneNumber);
    }


    @Then("Admin Gender secer")
    public void adminGenderSecer() {
        viceDeamanagemet.male.click();
    }

    @Then("Admin {string} Date Of Birth alanina valid bir deger girer")
    public void adminDateOfBirthAlaninaValidBirDegerGirer(String string) {
        viceDeamanagemet.birtDate.sendKeys(string);
    }

    @Then("Admin {string} Ssn alanina valid bir deger girer")
    public void adminSsnAlaninaValidBirDegerGirer(String string) {
        String ssn = faker.idNumber().ssnValid().replaceAll("[^0-9]", "");
        String SSN = ssn.substring(0, 3) + "-" + ssn.substring(3, 5) + "-" + ssn.substring(5, 9);
        viceDeamanagemet.SSN.sendKeys(SSN);
    }

    @Then("Admin {string} User Name alanina valid bir deger girer")
    public void adminUserNameAlaninaValidBirDegerGirer(String string) {
        viceDeamanagemet.userName.sendKeys(faker.name().username());
    }

    @Then("Admin{string} Father alanina valid bir deger girer")
    public void adminFatherAlaninaValidBirDegerGirer(String string) {
        viceDeamanagemet.fatherName.sendKeys(faker.name().firstName());
    }


    @Then("Admin{string} Mother alanina valid bir deger girer")
    public void adminMotherAlaninaValidBirDegerGirer(String string) {
        viceDeamanagemet.motherName.sendKeys(faker.name().firstName());
    }

    @Then("Admin{string} Password alanina valid bir deger girer")
    public void adminPasswordAlaninaValidBirDegerGirer(String string) {
        viceDeamanagemet.password.sendKeys(string);

    }

    @Then("Admin Submit Butonuna tiklar")
    public void adminSubmitButonunaTiklar() {
        viceDeamanagemet.submit.click();

    }

    @And("Admin succesfully ibaresini gorur dogrulamasini yapar")
    public void adminSuccesfullyIbaresiniGorurDogrulamasiniYapar() {
        waitFor(2);
        Assert.assertTrue(viceDeamanagemet.succesfully.isDisplayed());
    }
}