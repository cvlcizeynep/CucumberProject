package stepdefinitions.uidefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ContactGellAllPage;
import pages.ViceDeanManagement;

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



}
