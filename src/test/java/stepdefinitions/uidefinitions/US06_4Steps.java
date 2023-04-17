package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.ViceDeanManagement;

public class US06_4Steps {
    ViceDeanManagement viceDeanManagement;
    Faker faker=new Faker();


    @When("Kullanici  SSN girmez bos birakir")
    public void kullanici_ssn_girmez_bos_birakir() {

    }
    @Then("Ssn girilmediginde kayit yapilmadigini dogrular")
    public void ssn_girilmediginde_kayit_yapilmadigini_dogrular() {
        viceDeanManagement=new ViceDeanManagement();
        assert viceDeanManagement.requiredSsn.isDisplayed();


    }
    @When("Kullanici format disi bir SSN {string} girer")
    public void kullanici_format_disi_bir_ssn_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.SSN.sendKeys(string);

    }
    @Then("Kullanici valid olmayan ssn ile giris yapilamadigini uyari alarak dogrular")
    public void kullanici_valid_olmayan_ssn_ile_giris_yapilamadigini_uyari_alarak_dogrular() {
        viceDeanManagement=new ViceDeanManagement();
        assert viceDeanManagement.invalidSSNalertMessage.isDisplayed();

    }

    @When("Kullanici kayitli uniq olmayan bir SSN {string} ile deger girer")
    public void kullanici_kayitli_uniq_olmayan_bir_ssn_ile_deger_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.SSN.sendKeys(string);


    }
    @Then("Kullanici uniq olmayan   ssn girdiginde  uyari alarak dogrulama yapar.")
    public void kullanici_uniq_olmayan_ssn_girdiginde_uyari_alarak_dogrulama_yapar() {
        viceDeanManagement=new ViceDeanManagement();
        assert viceDeanManagement.alreadySsnAlertMessage.isDisplayed();


    }


    @When("Kullanici User Name kismina tub tusuyla basar karakter girmez")
    public void kullanici_user_name_kismina_tub_tusuyla_basar_karakter_girmez() {
        viceDeanManagement=new ViceDeanManagement();
         viceDeanManagement.userName.sendKeys(Keys.SPACE);

    }
    @Then("Kullanici username kismina tub tusuyla basilip bos birakildiginda kayit olunmadigini uyari alarak dogrular")
    public void kullanici_username_kismina_tub_tusuyla_basilip_bos_birakildiginda_kayit_olunmadigini_uyari_alarak_dogrular() {

        assert !viceDeanManagement.saveSuccesfullyMessage.isDisplayed();
        viceDeanManagement=new ViceDeanManagement();

    }
    @When("Kullanici   password kismini bos birakir")
    public void kullanici_password_kismini_bos_birakir() {


    }
    @Then("Kullanici password kisminin  doldurulmadigi uyarisini alir")
    public void kullanici_password_kisminin_doldurulmadigi_uyarisini_alir() {
        viceDeanManagement=new ViceDeanManagement();
        assert viceDeanManagement.requiredPassword.isDisplayed();

    }
    @When("Kullanici User Name girmez bos birakir")
    public void kullanici_user_name_girmez_bos_birakir() {

    }
    @Then("Kullanici username kismi bos birakildiginda kayit olunmadigi mesajini gorur")
    public void kullanici_username_kismi_bos_birakildiginda_kayit_olunmadigi_mesajini_gorur() {
        viceDeanManagement=new ViceDeanManagement();
        assert viceDeanManagement.requiredUsername.isDisplayed();


    }

    @When("Kullanici  yedi karakterden oluşan password girer")
    public void kullanici_yedi_karakterden_oluşan_password_girer() {
        faker=new Faker();
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.password.sendKeys(faker.internet().password(2,7));

    }
    @Then("Kullanici sekizden az karakterli password ile  kayit olunmadigini uyari alarak dogrular")
    public void kullanici_sekizden_az_karakterli_password_ile_kayit_olunmadigini_uyari_alarak_dogrular() {
        viceDeanManagement=new ViceDeanManagement();
        assert viceDeanManagement.passwordMinumummessage.isDisplayed();


    }


}
