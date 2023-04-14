package stepdefinitions.uidefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import pages.ContactGellAllPage;
import utilities.ReusableMethods;

public class US07_1Steps {
    ContactGellAllPage contactGellAllPage;

    @When("Kullanici acilan sayfada menu kismina tiklar")
    public void kullanici_acilan_sayfada_menu_kismina_tiklar() {
        ReusableMethods.waitFor(2);
       contactGellAllPage=new ContactGellAllPage();
        contactGellAllPage.menu_button.click();
        ReusableMethods.waitFor(2);
    }
    @When("Menuden contact get all u tiklar")
    public void menuden_contact_get_all_u_tiklar() {
        contactGellAllPage=new ContactGellAllPage();
        ReusableMethods.doubleClick(contactGellAllPage.contact_getAll_button);
        ReusableMethods.waitFor(2);
    }
    @Then("Dean hesabiyla mesajlarin gorulebildigini dogrular")
    public void dean_hesabiyla_mesajlarin_gorulebildigini_dogrular() {
        contactGellAllPage=new ContactGellAllPage();
        assert contactGellAllPage.message_column.isDisplayed();
    }

    @Then("Kullanici dean hesabiyla mesaj gonderen kisilerin goruldugunu dogrular")
    public void kullanici_dean_hesabiyla_mesaj_gonderen_kisilerin_goruldugunu_dogrular() {
        contactGellAllPage=new ContactGellAllPage();
        assert contactGellAllPage.name_column.isDisplayed();
    }
    @Then("Kullanici dean hesabiyla mesaj gonderen kisilerin maillerinin goruldugunu dogrular")
    public void kullanici_dean_hesabiyla_mesaj_gonderen_kisilerin_maillerinin_goruldugunu_dogrular() {
        contactGellAllPage=new ContactGellAllPage();
        assert contactGellAllPage.email_column.isDisplayed();
    }

    @Then("Kullanici dean hesabiyla gonderilen mesajlarin tarihlerinin  goruldugunu dogrular")
    public void kullanici_dean_hesabiyla_gonderilen_mesajlarin_tarihlerinin_goruldugunu_dogrular() {
        contactGellAllPage=new ContactGellAllPage();
        assert contactGellAllPage.date_column.isDisplayed();
    }

    @Then("Kullanici dean hesabiyla gonderilen mesajlarin subjectlerinin goruldugunu dogrular")
    public void kullanici_dean_hesabiyla_gonderilen_mesajlarin_subjectlerinin_goruldugunu_dogrular() {
        contactGellAllPage=new ContactGellAllPage();
        contactGellAllPage.subject_column.isDisplayed();
    }
}
