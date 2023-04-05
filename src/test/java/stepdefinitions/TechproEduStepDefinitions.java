package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Driver;

public class TechproEduStepDefinitions {


    @Given("Techpro sayfasina gidilir")
    public void techpro_sayfasina_gidilir() {
        Driver.getDriver().get("https://www.techproeducation.com");

    }
    @When("Sayfa basligi yazdirilir")
    public void sayfa_basligi_yazdirilir() {
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

    }
    @Then("Sayfa basligi bootcamp yazisi test edilir")
    public void sayfa_basligi_bootcamp_yazisi_test_edilir() {
        assert Driver.getDriver().getTitle().contains("bootcamp");


    }
    @Then("Sayfa kapatilir")
    public void sayfa_kapatilir() {
        Driver.getDriver().close();

    }


}
