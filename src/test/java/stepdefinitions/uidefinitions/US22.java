package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.AdminManagementPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static utilities.ReusableMethods.waitFor;

public class US22 {
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

    @Given("Admin Name kismina bos birakir")
    public void adminNameKisminaBosBirakir() {
        adminManagementPage.AdminName.sendKeys("");

    }

    @When("Admin Surname kismina bos birakir")
    public void adminSurnameKisminaBosBirakir() {
        adminManagementPage.AdminSurname.sendKeys("");
    }

    @And("Admin Birth place kismina bos birakir")
    public void adminBirthPlaceKisminaBosBirakir() {
        adminManagementPage.AdminBirthPlace.sendKeys("");

    }

    @And("Admin Phone Number alanini bos birakir")
    public void adminPhoneNumberAlaniniBosBirakir() {
        adminManagementPage.AdminPhone.sendKeys("");

    }

    @And("Admin SSN  alanina alanini bos birakir")
    public void adminSSNAlaninaAlaniniBosBirakir() {
        adminManagementPage.AdminSsn.sendKeys("");
    }

    @And("Admin User Name alanini bos birakir")
    public void adminUserNameAlaniniBosBirakir() {
        adminManagementPage.AdminUsername.sendKeys("");

    }

    @And("Admin Required dogrular.")
    public void adminRequiredDogrular() {
        List<WebElement> liste = new ArrayList<>();
        for (int i = 1; i <8 ; i++) {
            liste.add(Driver.getDriver().findElement(By.xpath("(//div[text()='Required'])["+i+"]")));
            assertTrue(liste.get(i-1).isDisplayed());
        }
    }

    @And("Admin Date of birth alanini bos birakir")
    public void adminDateOfBirthAlaniniBosBirakir() {
        adminManagementPage.AdminDateOfBird.sendKeys("");
    }

    @And("Admin yedi karakterden oluşan Password {string} girer")
    public void adminYediKarakterdenOluşanPasswordGirer(String string) {
        adminManagementPage.AdminPassword.sendKeys(string);
    }



    @And("Admin Minimum sekiz character yazisini dogrular.")
    public void adminMinimumSekizCharacterYazisiniDogrular() {
        Assert.assertTrue(adminManagementPage.minimum8.isDisplayed());
    }


    @And("Admin SSN  alanina - koymadan  bir {string} girer")
    public void adminSSNAlaninaKoymadanBirGirer(String String) {
        adminManagementPage.AdminSsn.sendKeys(String);

    }


    @And("Admin Minimum onbir character XXX-XX-XXXX yazisini dogrular.")
    public void adminMinimumOnbirCharacterXXXXXXXXXYazisiniDogrular() {
        Assert.assertTrue(adminManagementPage.minimin11ssn.isDisplayed());

    }

    @And("Admin Please enter valid SSN number yazisini dogrular.")
    public void adminPleaseEnterValidSSNNumberYazisiniDogrular() {
        Assert.assertTrue(adminManagementPage.ssnMesaj.isDisplayed());
    }

    @And("Admin SSN  alanina bir {string} girer")
    public void adminSSNAlaninaBirGirer(String String) {
        adminManagementPage.AdminSsn.sendKeys(String);

    }

    @Given("Admin Name kismina space  girer")
    public void adminNameKisminaSpaceGirer() {
        adminManagementPage.AdminName.sendKeys("           ");
    }

    @When("Admin Surname kismina space  girer")
    public void adminSurnameKisminaSpaceGirer() {
        adminManagementPage.AdminSurname.sendKeys("           ");

    }

    @And("Admin Birth place kismina space deger girer")
    public void adminBirthPlaceKisminaSpaceDegerGirer() {
        adminManagementPage.AdminBirthPlace.sendKeys("            ");

    }


    @And("Admin kayit olunmadigi dogrular.")
    public void adminKayitOlunmadigiDogrular() {
        Assert.assertFalse(adminManagementPage.adminSaved.isDisplayed());
    }

    @Given("Admin Name kismina ozel karakter  girer")
    public void adminNameKisminaOzelKarakterGirer() {
        adminManagementPage.AdminName.sendKeys("xcv-?zxc");
    }

    @When("Admin Surname kismina ozel karakter  girer")
    public void adminSurnameKisminaOzelKarakterGirer() {
        adminManagementPage.AdminSurname.sendKeys("xcv-?zxc*****");

    }

    @And("Admin Birth place kismina ozel karakter deger girer")
    public void adminBirthPlaceKisminaOzelKarakterDegerGirer() {
        adminManagementPage.AdminBirthPlace.sendKeys("xcv-?zxc****");

    }

    @And("Admin Phone Number alanina ozel karakter bir deger girer")
    public void adminPhoneNumberAlaninaOzelKarakterBirDegerGirer() {
        adminManagementPage.AdminPhone.sendKeys("xcv-?zxc14**********");
    }

    @And("Admin SSN  alanina ozel karakter girer")
    public void adminSSNAlaninaOzelKarakterGirer() {
        adminManagementPage.AdminSsn.sendKeys("as*_0*-64***-");
    }


    @And("Admin Phone Number alanina ozel karakter girer")
    public void adminPhoneNumberAlaninaOzelKarakterGirer() {
        adminManagementPage.AdminPhone.sendKeys("asdfgh_?***++//");
    }

    @And("Admin Please enter valid phone number yazisini dogrular.")
    public void adminPleaseEnterValidPhoneNumberYazisiniDogrular() {
        Assert.assertTrue(adminManagementPage.phoneNumberMesaj.isDisplayed());
    }

    @And("Admin Phone Number alanina space girer")
    public void adminPhoneNumberAlaninaSpaceGirer() {
        adminManagementPage.AdminPhone.sendKeys("              ");

    }

    @And("Admin SSN  alanina space girer")
    public void adminSSNAlaninaSpaceGirer() {
        adminManagementPage.AdminSsn.sendKeys("               ");
    }
}
