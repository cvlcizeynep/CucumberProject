package stepdefinitions.uidefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.LessonsManagementPage;
import utilities.ReusableMethods;

public class US09StepDefinition {
    LessonsManagementPage lessonsManagementPage = new LessonsManagementPage();
    Actions actions;
    ReusableMethods reusableMethods;

    @Given("Lessons a tiklar")
    public void lessons_a_tiklar() {

       ReusableMethods.scrollToElement(lessonsManagementPage.sagOkTusu);
        lessonsManagementPage.lessonsSecenek.click();
    }


    @When("histoloji dersinin oldugu son page e gecmek için >> tiklar")

    public void histolojidersininoldugupagesegecmekicin() {
        lessonsManagementPage.sagOkTusu.click();
    }

    @When("Daha once olusturulan histoloji dersinin listede goruldugunu dogrular")
    public void dahaonceolusturulanfiziksdersininlistedegoruldugunudogrular() {
        Assert.assertTrue(lessonsManagementPage.histoloji.isDisplayed());
    }

    @When("histoloji dersinin satiri, compulsory sutununun altinda No yazdigini dogrular")
    public void fiziksdersininsatiricompulsorysutunununaltindaNoyazdiginidogrular() {
        Assert.assertTrue(lessonsManagementPage.compulsoryYes.isDisplayed());
    }

    @When("histoloji dersinin credit Score unun 25 olarak girildigini dogrular")
    public void fiziksdersinincreditScoreunun25olarakgirildiginidogrular() {
        Assert.assertTrue(lessonsManagementPage.creditScore3.isDisplayed());
    }
    @When("Istenen dersin yanindaki cop kutusuna tiklayarak dersi siler")
    public void Istenen_dersin_yanindaki_cop_kutusuna_tiklayarak_dersi_siler(){
        lessonsManagementPage.silmeButonu.click();

    }
}




