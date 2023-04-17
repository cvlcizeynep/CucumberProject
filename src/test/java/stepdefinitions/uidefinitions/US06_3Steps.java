package stepdefinitions.uidefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ContactGellAllPage;
import pages.ViceDeanManagement;
import utilities.ReusableMethods;

public class US06_3Steps {
    ViceDeanManagement viceDeanManagement;
    ContactGellAllPage contactGellAllPage;

    @When("Kullanici birtplace alanini bos birakir")
    public void kullanici_birtplace_alanini_bos_birakir() {


    }
    @Then("Kullanici birtplace kismi bos birakildiginda required uyarisi alarak kayit olunamdigini dogrular")
    public void kullanici_birtplace_kismi_bos_birakildiginda_required_uyarisi_alarak_kayit_olunamdigini_dogrular() {
        viceDeanManagement=new ViceDeanManagement();
        assert viceDeanManagement.requiredBirthPlace.isDisplayed();
    }
    @When("Kullanici Cinsiyet kismini secmez")
    public void kullanici_cinsiyet_kismini_secmez() {
        viceDeanManagement=new ViceDeanManagement();


    }
    @Then("Kullanici cinsiyet kismi bos birakildiginda  kayit olunamdigini dogrular")
    public void kullanici_cinsiyet_kismi_bos_birakildiginda_kayit_olunamdigini_dogrular() {
        viceDeanManagement=new ViceDeanManagement();
      Assert.assertTrue(!viceDeanManagement.saveSuccesfullyMessage.isDisplayed());
    }

    @When("Kullanici Dogum tarihini bos birakir")
    public void kullanici_dogum_tarihini_bos_birakir() {
        viceDeanManagement=new ViceDeanManagement();


    }
    @Then("Kullanici telefon no bos birakildiginda  kayit olunamdigini dogrular")
    public void kullanici_telefon_no_bos_birakildiginda_kayit_olunamdigini_dogrular() {
        viceDeanManagement=new ViceDeanManagement();
        assert viceDeanManagement.requiredDateofBirth.isDisplayed();

    }

    @When("Kullanici Dogum tarihine gelecek tarih girer.")
    public void kullanici_dogum_tarihine_gelecek_tarih_girer() {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.birtDate.sendKeys("03032025");

    }
    @Then("Kullanici gecmis tarih olmali uyarisi alir.")
    public void kullanici_gecmis_tarih_olmali_uyarisi_alir() {
        viceDeanManagement=new ViceDeanManagement();
        ReusableMethods.waitFor(1);
        assert viceDeanManagement.invalidBirtDateMessage.isDisplayed();
    }
    @When("Kullanici  telefon numarasini bos birakir")
    public void kullanici_telefon_numarasini_bos_birakir() {


    }
    @Then("Kullanici telefon no bos birakildiginda required uyarisi alarak kayit olunamadigini dogrular")
    public void kullanici_telefon_no_bos_birakildiginda_required_uyarisi_alarak_kayit_olunamadigini_dogrular() {
        viceDeanManagement=new ViceDeanManagement();
        assert viceDeanManagement.requiredPhone.isDisplayed();

    }

    @When("Kullanici  telefon numarasini format disi {string} girer")
    public void kullanici_telefon_numarasini_format_disi_girer(String string) {
        viceDeanManagement=new ViceDeanManagement();
        viceDeanManagement.phone.sendKeys(string);

    }
    @Then("Kullanici telefon no format disi girildiginde invalid number uyarisi alarak kayit olunamadigini dogrular")
    public void kullanici_telefon_no_format_disi_girildiginde_invalid_number_uyarisi_alarak_kayit_olunamadigini_dogrular() {
        viceDeanManagement=new ViceDeanManagement();
        ReusableMethods.waitFor(1);
        assert viceDeanManagement.invalidPhoneMessage.isDisplayed();

    }
    @Then("logout olur")
    public void logout_olur() {
        viceDeanManagement=new ViceDeanManagement();
        contactGellAllPage=new ContactGellAllPage();
        contactGellAllPage.menu_button.click();
        viceDeanManagement.logout.click();
        viceDeanManagement.yes.click();

    }

    @Then("Kullanici dogum tarihi bos birakildiginda  kayit olunamdigini dogrular")
    public void kullanici_dogum_tarihi_bos_birakildiginda_kayit_olunamdigini_dogrular() {
        ReusableMethods.waitFor(2);
        viceDeanManagement= new ViceDeanManagement();
        assert viceDeanManagement.requiredDateofBirth.isDisplayed();


    }
    @When("Kullanici birtplace alanina valid olmayan {string} dger girer")
    public void kullanici_birtplace_alanina_valid_olmayan_dger_girer(String string) {
        viceDeanManagement= new ViceDeanManagement();
        viceDeanManagement.birthPlace.sendKeys(string);

    }
    @Then("Kullanici birtplace kismina valid deger girilmediginde kayit olunamadigini dogrular")
    public void kullanici_birtplace_kismina_valid_deger_girilmediginde_kayit_olunamadigini_dogrular() {
        viceDeanManagement= new ViceDeanManagement();
       try {
           assert !viceDeanManagement.viceDeanSaved.isDisplayed();
       }catch (Exception e){
           throw new RuntimeException("gecersiz birt place ile kayit yapildi");
       }

    }


    @Then("Kullanici invalid tarih uyarisi alir")
    public void kullanici_invalid_tarih_uyarisi_alir() {
        viceDeanManagement= new ViceDeanManagement();
      ReusableMethods.waitFor(2);
        try {
            assert !viceDeanManagement.viceDeanSaved.isDisplayed();
        }catch (Exception e){
            throw new RuntimeException("invalid tarih ile kayit yapildi");
        }
    }

    @When("Kullanici  telefon numarasini daha once kayit olan tlf girer girer")
    public void kullanici_telefon_numarasini_daha_once_kayit_olan_tlf_girer_girer() {
        viceDeanManagement= new ViceDeanManagement();
        viceDeanManagement.phone.sendKeys("147-258-0123");

    }
    @Then("Kullanici telefon noyu onceden kayitli olan bir no ile girerse already uyrisi alarak kayit olunamadigini dogrular")
    public void kullanici_telefon_noyu_onceden_kayitli_olan_bir_no_ile_girerse_already_uyrisi_alarak_kayit_olunamadigini_dogrular() {
      viceDeanManagement=new ViceDeanManagement();
      ReusableMethods.waitFor(1);
        assert viceDeanManagement.alreadyPhoneAlertMessage.isDisplayed();

    }



}
