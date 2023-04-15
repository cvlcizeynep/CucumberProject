package stepdefinitions.uidefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ViceDeanManagement;

public class US06_1AddViceDeanSteps {
    ViceDeanManagement viceDeanManagement;
    @Given("Kullanici name {string} kismina valid  girer")
    public void kullanici_name_kismina_valid_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.name.sendKeys(string);


    }
    @When("Kullanici  surname {string} kismina valid  girer")
    public void kullanici_surname_kismina_valid_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.surName.sendKeys(string);

    }
    @When("Kullanici birt place {string} kismina valid deger girer")
    public void kullanici_birt_place_kismina_valid_deger_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.birthPlace.sendKeys(string);

    }
    @When("Kullanici Cinsiyet kismini secer")
    public void kullanici_cinsiyet_kismini_secer() {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.female.click();

    }
    @When("Kullanici dogum tarihine  {string} girer")
    public void kullanici_dogum_tarihine_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.birtDate.sendKeys(string);

    }
    @When("Kullanici telefon numarasi {string} girer")
    public void kullanici_telefon_numarasi_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.phone.sendKeys(string);

    }
    @When("Kullanici ssn kismina valid {string} girer")
    public void kullanici_ssn_kismina_valid_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.SSN.sendKeys(string);

    }
    @When("Kullanici username {string} girer")
    public void kullanici_username_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.userName.sendKeys(string);

    }
    @When("Kullanici en az sekiz karakterden oluşan password {string} girer")
    public void kullanici_en_az_sekiz_karakterden_oluşan_password_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.password.sendKeys(string);

    }
    @Then("Kullanici basariyla Vice Dean ekleyebildigini dogrular.")
    public void kullanici_basariyla_vice_dean_ekleyebildigini_dogrular() {
        viceDeanManagement=new ViceDeanManagement();
        assert viceDeanManagement.saveSuccesfullyMessage.isDisplayed();

    }



























}
