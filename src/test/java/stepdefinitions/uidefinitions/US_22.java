package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.AdminManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.waitFor;

public class US_22 {
    AdminManagementPage adminManagementPage = new AdminManagementPage();
    Faker faker = new Faker();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Given("Admin Name kismina valid  girer")
    public void adminNameKisminaValidGirer() {
        adminManagementPage.AdminName.sendKeys(faker.name().name());
        waitFor(1);
    }

    @When("Admin Surname kismina valid  girer")
    public void adminSurnameKisminaValidGirer() {
        adminManagementPage.AdminSurname.sendKeys(faker.name().lastName());
        waitFor(1);
    }

    @And("Admin Birth place kismina valid deger girer")
    public void adminbirthPlaceKisminaValidDegerGirer() {
        adminManagementPage.AdminBirthPlace.sendKeys(faker.address().city());
        waitFor(1);
    }

    @And("Admin Gender kismini secer")
    public void adminGenderKisminiSecer() {
        adminManagementPage.AdminFemale.click();
        waitFor(1);
    }

    @And("Admin Date of birth alanina {string} bir tarih girer")
    public void adminDateOfBirthAlaninaBirTarihGirer(String String) {
        adminManagementPage.AdminDateOfBird.sendKeys(String);
        waitFor(1);


    }

    @And("Admin Phone Number alanina valid bir deger girer")
    public void adminPhoneNumberAlaninaValidBirDegerGirer() {
        String phoneNumber=faker.phoneNumber().phoneNumber().replaceAll("[^0-9]", "");
        phoneNumber = String.format("%s-%s-%s",
                phoneNumber.substring(0, 3),
                phoneNumber.substring(3, 6),
                phoneNumber.substring(6, 10));
        adminManagementPage.AdminPhone.sendKeys(phoneNumber);
        waitFor(1);
    }

    @And("Admin SSN  alanina valid bir deger girer")
    public void adminSSNAlaninaValidBirDegerGirer() {
        String ssn=faker.idNumber().ssnValid().replaceAll("[^0-9]","");
        String SSN=ssn.substring(0,3)+"-"+ssn.substring(3,5)+"-"+ssn.substring(5,9);
        adminManagementPage.AdminSsn.sendKeys(SSN);
        waitFor(1);
    }

    @And("Admin User Name alanina valid bir deger girer")
    public void adminUserNameAlaninaValidBirDegerGirer() {
        adminManagementPage.AdminUsername.sendKeys(faker.name().username());
        waitFor(1);
    }

    @And("Admin en az sekiz karakterden oluşan Password {string} girer")
    public void adminEnAzSekizKarakterdenOluşanPasswordGirer(String String) {
        adminManagementPage.AdminPassword.sendKeys(String);
        waitFor(1);

    }

    @And("Admin submit tusuna tiklar.")
    public void adminSubmitTusunaTiklar() {
        adminManagementPage.AdminSubmit.click();
       waitFor(1);
    }

    @And("Admin basariyla kayit ekleyebildigini dogrular.")
    public void adminBasariylaKayitEkleyebildiginiDogrular() {
       // Assert.assertTrue(adminManagementPage.AdminSaved.getText().contains("Admin Saved"));
       Assert.assertTrue(adminManagementPage.adminSaved.isDisplayed());

    }
}
