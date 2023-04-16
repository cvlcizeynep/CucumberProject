package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.ViceDeanManagement;

public class US06_2NameSteps {
    Faker faker=new Faker();
    ViceDeanManagement viceDeanManagement;

    @Given("Kullanici Name kismina deger girmez")
    public void kullanici_name_kismina_deger_girmez() {

    }
    @When("Kullanici Dogum tarihine {string} girer")
    public void kullanici_dogum_tarihine_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.birtDate.sendKeys(string);


    }
    @Then("Kullanici name kismi bos birakildiginda required uyarisi alarak kayit olunamdigini dogrular")
    public void kullanici_name_kismi_bos_birakildiginda_required_uyarisi_alarak_kayit_olunamdigini_dogrular() {
        viceDeanManagement=new ViceDeanManagement();
        assert viceDeanManagement.requiredName.isDisplayed();

    }



    @When("Kullanici Surname kismina valid deger girer")
    public void kullanici_surname_kismina_valid_deger_girer() {
        viceDeanManagement=new ViceDeanManagement();
        faker=new Faker();
        viceDeanManagement.surName.sendKeys(faker.name().lastName());
    }
    @When("Birth Place kismina valid deger girer")
    public void birth_place_kismina_valid_deger_girer() {
        viceDeanManagement=new ViceDeanManagement();
        faker=new Faker();
        viceDeanManagement.birthPlace.sendKeys(faker.address().city());
    }
    @When("Kullanici Cinsiyet kismini secer")
    public void kullanici_cinsiyet_kismini_secer() {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.female.click();


    }

    @When("Kullanici  telefon numarasina valid deger girer")
    public void kullanici_telefon_numarasina_valid_deger_girer() {
        viceDeanManagement=new ViceDeanManagement();
        faker=new Faker();
        viceDeanManagement.phone.sendKeys(faker.phoneNumber().phoneNumber());
    }
    @When("Kullanici SSN kismina valid deger girer")
    public void kullanici_ssn_kismina_valid_deger_girer() {
        viceDeanManagement=new ViceDeanManagement();
        faker=new Faker();
        viceDeanManagement.SSN.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(10,99)+"-"+faker.number().numberBetween(1000,9999));
    }
    @When("Kullanici User Name alanina valid deger girer")
    public void kullanici_user_name_alanina_valid_deger_girer() {
        viceDeanManagement=new ViceDeanManagement();
        faker=new Faker();
        viceDeanManagement.userName.sendKeys(faker.name().username());
    }
    @When("Kullanici en az sekiz karakterden oluşan password  girer")
    public void kullanici_en_az_sekiz_karakterden_oluşan_password_girer() {
        viceDeanManagement=new ViceDeanManagement();
        faker=new Faker();
        viceDeanManagement.password.sendKeys(faker.internet().password(8,17));
    }
    @When("Kullanici submit tusuna tiklarr.")
    public void kullanici_submit_tusuna_tiklarr() {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.submit.click();
    }
    @Given("Kullanici Name kismina valid olmayan {string} girer.")
    public void kullanici_name_kismina_valid_olmayan_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.name.sendKeys(string);

    }
    @Then("Kullanici name kismina valid deger girilmediginde kayit olunmadigini dogrular.")
    public void kullanici_name_kismina_valid_deger_girilmediginde_kayit_olunmadigini_dogrular() {
        viceDeanManagement=new ViceDeanManagement();
        Assert.assertTrue(!viceDeanManagement.saveSuccesfullyMessage.isDisplayed());

    }
    @Given("Kullanici Name kismina valid olmayan tubtusu girer.")
    public void kullanici_name_kismina_valid_olmayan_tubtusu_girer() {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.name.sendKeys(Keys.SPACE);
    }
    @When("Kullanici Surname kismina deger girmez")
    public void kullanici_surname_kismina_deger_girmez() {

    }
    @Then("Kullanici surname kismi bos birakildiginda kayit olunmadigi mesajini gorur")
    public void kullanici_surname_kismi_bos_birakildiginda_kayit_olunmadigi_mesajini_gorur() {
        viceDeanManagement=new ViceDeanManagement();
        assert viceDeanManagement.requiredSurNme.isDisplayed();

    }
    @Given("Kullanici surname kismina valid olmayan  deger {string} girer.")
    public void kullanici_surname_kismina_valid_olmayan_deger_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.surName.sendKeys(string);

    }
    @Then("Kullanici surname kismina valid deger girilmediginde kayit olunmadigini dogrular.")
    public void kullanici_surname_kismina_valid_deger_girilmediginde_kayit_olunmadigini_dogrular() {
        viceDeanManagement=new ViceDeanManagement();
        assert !viceDeanManagement.saveSuccesfullyMessage.isDisplayed();

    }
    @When("Kullanici surname kismina valid olmayan tubtusu girer.")
    public void kullanici_surname_kismina_valid_olmayan_tubtusu_girer() {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.surName.sendKeys(Keys.SPACE);
    }













}
