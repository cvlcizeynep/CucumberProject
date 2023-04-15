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

    }
    @When("Birth Place kismina valid {string} girer")
    public void birth_place_kismina_valid_girer(String string) {

    }
    @When("Kullanici Dogum tarihine {string} girer")
    public void kullanici_dogum_tarihine_girer(String string) {

    }
    @When("Kullanici  telefon numarasina {string} girer")
    public void kullanici_telefon_numarasina_girer(String string) {

    }
    @When("Kullanici SSN kismina valid {string} girer")
    public void kullanici_ssn_kismina_valid_girer(String string) {

    }
    @When("Kullanici user name {string} girer")
    public void kullanici_user_name_girer(String string) {

    }
    @When("Kullanici en az {int} karakterden oluşan password {string} girer")
    public void kullanici_en_az_karakterden_oluşan_password_girer(Integer int1, String string) {

    }
    @Then("Kullanici name kismi bos birakildiginda required uyarisi alarak kayit olunamdigini dogrular")
    public void kullanici_name_kismi_bos_birakildiginda_required_uyarisi_alarak_kayit_olunamdigini_dogrular() {

    }




}
