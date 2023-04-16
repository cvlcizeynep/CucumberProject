package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.DeanManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US_05 {
    DeanManagementPage deanManagementPage = new DeanManagementPage();

    @And("Main menu sayfasindan Dean Management tiklar")
    public void mainMenuSayfasindanDeanManagementTiklar() {
        deanManagementPage.DeanManagementButton.click();
        ReusableMethods.waitFor(5);

    }

    @Then("Admin Deanlerin, Name bilgisinin goruldugunu dogrular")
    public void adminDeanlerinNameBilgisininGoruldugunuDogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Name Surname"));
        ReusableMethods.waitFor(5);
    }

    @Then("Admin Deanlerin, Gender bilgisinin goruldugunu dogrular")
    public void adminDeanlerinGenderBilgisininGoruldugunuDogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Gender"));
        ReusableMethods.waitFor(3);

    }

    @Then("Admin Deanlerin, Phone Number bilgisinin goruldugunu dogrular")
    public void adminDeanlerinPhoneNumberBilgisininGoruldugunuDogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Phone Number"));
        ReusableMethods.waitFor(3);
    }

    @Then("Admin Deanlerin, SSN bilgisinin goruldugunu dogrular")
    public void adminDeanlerinSSNBilgisininGoruldugunuDogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Ssn"));
        ReusableMethods.waitFor(3);
    }

    @Then("Admin Deanlerin, User Name bilgisinin goruldugunu dogrular")
    public void adminDeanlerinUserNameBilgisininGoruldugunuDogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("User Name"));
        ReusableMethods.waitFor(3);
    }

//***************EDİT ALANI*******************

    @When("Olusturulan daen'in edit butonuna tiklar")
    public void olusturulanDaenInEditButonunaTiklar() {

        ReusableMethods.scrollIntoViewJS(Driver.getDriver().findElement(By.xpath("//table/tbody/tr[10]")));
        ReusableMethods.clickWithTimeOut(deanManagementPage.viceDeanListSonSayfa, 2);
        ReusableMethods.waitFor(1);
        ReusableMethods.scrollIntoViewJS(deanManagementPage.viceDeanListText);
        ReusableMethods.waitFor(2);
        //Assert.assertTrue(deanManagementPage.viceDeanList.getText().contains("hayriye"));
        for (int i = 0; i < deanManagementPage.isimlertext.size(); i++) {
            if (deanManagementPage.isimlertext.get(i).getText().contains("hayriye")) {
                ReusableMethods.waitFor(3);
                int index = i + 1;
                WebElement hayriyeicinedit = Driver.getDriver().findElement(By.xpath("(//button[@class='text-dark btn btn-outline-info'])" + "[" + index + "]"));

                ReusableMethods.clickWithTimeOut(hayriyeicinedit, 5);


                // Driver.clickWithJS(deanManagementPage.deanListEditButonu);

            }}}
            @Given("name {string} kismina valid  girer")
            public void nameKisminaValidGirer (String String){
                Driver.waitAndSendText(deanManagementPage.NameButton, String, 10);
            }
            @When("surname {string} kismina valid  girer")
            public void surnameKisminaValidGirer (String String){
                deanManagementPage.SurnameButton.sendKeys(String);
            }
            @And("birt place {string} kismina valid deger girer")
            public void birtPlaceKisminaValidDegerGirer (String String){
                deanManagementPage.BirthplaceButton.sendKeys(String);
            }
            @And("Cinsiyet kismini secer")
            public void cinsiyetKisminiSecer () {
                deanManagementPage.FemaleButton.click();
            }
            @And("dogum tarihine  {string} girer")
            public void dogumTarihineGirer (String String){
                deanManagementPage.DateOfBirthButton.sendKeys(String);
            }
            @And("telefon numarasi {string} girer")
            public void telefonNumarasiGirer (String String){
                deanManagementPage.PhoneNumberButton.sendKeys(String);
            }
            @And("ssn kismina valid {string} girer")
            public void ssnKisminaValidGirer (String String){
                deanManagementPage.SsnButton.sendKeys(String);
            }
            @And("username {string} girer")
            public void usernameGirer (String String){
                deanManagementPage.UserNameButton.sendKeys(String);
            }
            @And("password {string} girer")
            public void PasswordGirer (String String){
                deanManagementPage.PasswordButton.sendKeys(String);
            }
            @And("submit tusuna tiklar.")
            public void submitTusunaTiklar () {
                deanManagementPage.SubmitButton.click();
            }
            @Then("Dean updated Successful mesaji goruntulenmeli dogrular.")
            public void deanUpdatedSuccessfulMesajiGoruntulenmeliDogrular () {
                Assert.assertTrue(deanManagementPage.deanListeditpopupmesaji.isDisplayed());
            }


        }


