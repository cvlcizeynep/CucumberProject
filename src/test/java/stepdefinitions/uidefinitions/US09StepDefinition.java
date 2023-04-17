package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.LessonsManagementPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US09StepDefinition {
    LessonsManagementPage lessonsManagementPage = new LessonsManagementPage();
    Actions actions;
    ReusableMethods reusableMethods;
    LoginStepDefinitions loginStepDefinitions;

    @Given("Kullanici viceDean olarak login olur.")
    public void kullanici_vice_dean_olarak_login_olur() {
        ReusableMethods.login("dekan555", "12345678");
    }

    @And("Lessons a tiklar_asl")
    public void lessons_a_tiklar() {
       lessonsManagementPage.lessonsSecenek.click();}


    @And("Lessonsa {string} girer")
    public void lessonsaGirer(String ders) {
        ReusableMethods.waitFor(5);
        lessonsManagementPage.lessonName.sendKeys(ders);
    }

        @And("dersin credit Score unun {string}  olarak girer")
        public void dersinCreditScoreUnunOlarakGirer(String arg0) {

        }





    @And("Dersin Compulsory oldugunu işaretler")
    public void dersinCompulsoryOlupOlmadığınıIşaretler() {
        ReusableMethods.waitFor(5);
        lessonsManagementPage.compulsory.click();
    }
    @When("Daha once olusturulan dersin listede goruldugunu dogrular")
    public void daha_once_olusturulan_histoloji_dersinin_listede_goruldugunu_dogrular() {

        List<String> lessonsListString = new ArrayList<>();
        List<WebElement> lessonList = Driver.getDriver().findElements(By.xpath("(//table)[1]//tr//td[1]"));
        lessonList.forEach(t -> lessonsListString.add(t.getText()));
        while (!lessonsListString.contains("fiziks")) {
            Driver.clickWithJS(lessonsManagementPage.sagTus_asli);
            lessonList = Driver.getDriver().findElements(By.xpath("(//table)[1]//tr//td[1]"));
            lessonsListString.clear();
            lessonList.forEach(t ->lessonsListString.add(t.getText()));
            ReusableMethods.waitFor(2);

        }
        Assert.assertTrue(lessonsListString.contains("fiziks"));
    }
    @When("dersin satiri, compulsory sutununun altinda Yes yazdigini dogrular")
    public void istenen_dersinin_satiri_compulsory_sutununun_altinda_yes_yazdigini_dogrular() {
        Assert.assertTrue(lessonsManagementPage.compulsoryYes.isDisplayed());
    }
    @And("Credit Score degeri girdigini dogrular")
    public void creditScoreDegeriGirdiginiDogrular() {
        ReusableMethods.waitFor(5);
        Assert.assertTrue(lessonsManagementPage.creditScore3.isDisplayed());

    }






   /* @When("dersin credit Score unun 3 olarak girildigini dogrular")
    public void istenen_dersin_credit_score_unun_olarak_girildigini_dogrular(Integer int1) {
        Assert.assertTrue(lessonsManagementPage.creditScore3.isDisplayed());}*/

    @When("Istenen dersin yanindaki cop kutusuna tiklayarak dersi siler")
    public void istenen_dersin_yanindaki_cop_kutusuna_tiklayarak_dersi_siler() {
        lessonsManagementPage.silmeButonu.click();
    }



}







