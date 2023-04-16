package stepdefinitions.uidefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ViceDeanManagement;

public class US06_2NameSteps {
    ViceDeanManagement viceDeanManagement;
    @Given("Kullanici Name kismina deger girmez")
    public void kullanici_name_kismina_deger_girmez() {
        viceDeanManagement=new ViceDeanManagement();

    }
    @When("Kullanici Surname kismina valid {string} girer")
    public void kullanici_surname_kismina_valid_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.surName.sendKeys(string);

    }
    @When("Birth Place kismina valid {string} girer")
    public void birth_place_kismina_valid_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.birthPlace.sendKeys(string);
    }
    @When("Kullanici Dogum tarihine {string} girer")
    public void kullanici_dogum_tarihine_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.birtDate.sendKeys(string);
    }
    @When("Kullanici  telefon numarasina {string} girer")
    public void kullanici_telefon_numarasina_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.phone.sendKeys(string);
    }
    @When("Kullanici SSN kismina valid {string} girer")
    public void kullanici_ssn_kismina_valid_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.SSN.sendKeys(string);
    }
    @When("Kullanici user name {string} girer")
    public void kullanici_user_name_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.userName.sendKeys(string);
    }

    @Then("Kullanici name kismi bos birakildiginda required uyarisi alarak kayit olunamdigini dogrular")
    public void kullanici_name_kismi_bos_birakildiginda_required_uyarisi_alarak_kayit_olunamdigini_dogrular() {
        viceDeanManagement=new ViceDeanManagement();
        assert viceDeanManagement.requiredName.isDisplayed();
    }
/*
    @Given("Kullanici Name kismina valid olmayan {string} girer.")
    public void kullanici_name_kismina_valid_olmayan_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.name.sendKeys(string);
    }

    @Then("Kullanici name kismina valid deger girilmediginde kayit olunmadigi mesajini gorur")
    public void kullanici_name_kismina_valid_deger_girilmediginde_kayit_olunmadigi_mesajini_gorur() {

    }
*/
@Given("Kullanici {string} kismina valid deger girer")
public void kullanici_kismina_valid_deger_girer(String string) {
    viceDeanManagement=new ViceDeanManagement();
    viceDeanManagement.name.sendKeys(string);

}
    @When("Kullanici Surname kismina deger girmez")
    public void kullanici_surname_kismina_deger_girmez() {


    }
    @Then("Kullanici surname kismi bos birakildiginda kayit olunmadigi mesajini gorur")
    public void kullanici_surname_kismi_bos_birakildiginda_kayit_olunmadigi_mesajini_gorur() {
    viceDeanManagement=new ViceDeanManagement();
        assert viceDeanManagement.requiredSurNme.isDisplayed();

    }








}
