package stepdefinitions.uidefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US06_4Steps {

    @When("Kullanici  SSN girmez bos birakir")
    public void kullanici_ssn_girmez_bos_birakir() {

    }
    @Then("Ssn girilmediginde kayit yapilmadigini dogrular")
    public void ssn_girilmediginde_kayit_yapilmadigini_dogrular() {

    }
    @When("Kullanici format disi bir SSN {string} girer")
    public void kullanici_format_disi_bir_ssn_girer(String string) {

    }
    @Then("Kullanici valid olmayan ssn ile giris yapilamadigini uyari alarak dogrular")
    public void kullanici_valid_olmayan_ssn_ile_giris_yapilamadigini_uyari_alarak_dogrular() {

    }

    @When("Kullanici kayitli uniq olmayan bir SSN {string} ile deger girer")
    public void kullanici_kayitli_uniq_olmayan_bir_ssn_ile_deger_girer(String string) {

    }
    @Then("Kullanici uniq olmayan   ssn girdiginde  uyari alarak dogrulama yapar.")
    public void kullanici_uniq_olmayan_ssn_girdiginde_uyari_alarak_dogrulama_yapar() {}


    @When("Kullanici User Name kismina tub tusuyla basar karakter girmez")
    public void kullanici_user_name_kismina_tub_tusuyla_basar_karakter_girmez() {

    }
    @Then("Kullanici username kismina tub tusuyla basilip bos birakildiginda kayit olunmadigini uyari alarak dogrular")
    public void kullanici_username_kismina_tub_tusuyla_basilip_bos_birakildiginda_kayit_olunmadigini_uyari_alarak_dogrular() {

    }
    @When("Kullanici   password kismini bos birakir")
    public void kullanici_password_kismini_bos_birakir() {

    }
    @Then("Kullanici password kisminin  doldurulmadigi uyarisini alir")
    public void kullanici_password_kisminin_doldurulmadigi_uyarisini_alir() {

    }
    @When("Kullanici User Name girmez bos birakir")
    public void kullanici_user_name_girmez_bos_birakir() {

    }
    @Then("Kullanici username kismi bos birakildiginda kayit olunmadigi mesajini gorur")
    public void kullanici_username_kismi_bos_birakildiginda_kayit_olunmadigi_mesajini_gorur() {

    }

    @When("Kullanici  yedi karakterden oluşan password girer")
    public void kullanici_yedi_karakterden_oluşan_password_girer() {

    }
    @Then("Kullanici sekizden az karakterli password ile  kayit olunmadigini uyari alarak dogrular")
    public void kullanici_sekizden_az_karakterli_password_ile_kayit_olunmadigini_uyari_alarak_dogrular() {

    }


}
