package stepdefinitions.uidefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactGellAllPage;

public class US07_2Steps {
    ContactGellAllPage contactGellAllPage;

    @Then("Acilan sayfada delete tusunu goruldugunu dogrular")
    public void acilan_sayfada_delete_tusunu_goruldugunu_dogrular() {
        contactGellAllPage=new ContactGellAllPage();
        assert contactGellAllPage.deleteButton.isDisplayed();

    }

    @When("Acilan sayfada bir mesaji siler")
    public void acilan_sayfada_bir_mesaji_siler() {


    }
    @Then("Kullanici dean hesabiyla mesajlarin silinebildigini dogrular.")
    public void kullanici_dean_hesabiyla_mesajlarin_silinebildigini_dogrular() {
        contactGellAllPage=new ContactGellAllPage();
        assert contactGellAllPage.succesfullyDelete.isDisplayed();

    }





}
