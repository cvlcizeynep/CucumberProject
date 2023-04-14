package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.LessonsManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US8PozitiveStepdefinition {
    LessonsManagementPage lessonsManagementPage = new LessonsManagementPage();


    @Given("Lessons a tiklar")
    public void lessons_a_tiklar() {
        lessonsManagementPage.lessons.click();
    }
    @Given("Lessonsa {string}  girer")
    public void lessonsa_girer(String string) {
        ReusableMethods.waitFor(5);
        lessonsManagementPage.lessonName.sendKeys(string);
    }
    @Then("Lesson in {string} oldugunu dogrular")
    public void lesson_in_oldugunu_dogrular(String string) {
        ReusableMethods.waitFor(5);
        Assert.assertTrue(lessonsManagementPage.lessonName.isDisplayed());
    }
    @And("Dersin Compulsory olup olmadığını işaretler")
    public void dersinCompulsoryOlupOlmadığınıIşaretler() {
        ReusableMethods.waitFor(5);
        lessonsManagementPage.compulsory.click();
    }

    @And("Dersin Compulsory olup olmadığını işaretlendigini dogrular")
    public void dersinCompulsoryOlupOlmadığınıIşaretlendiginiDogrular() {
        ReusableMethods.waitFor(5);
        Assert.assertTrue(lessonsManagementPage.compulsory.isSelected());
    }



    @And("Credit Score degeri girdigini dogrular")
    public void creditScoreDegeriGirdiginiDogrular() {
        ReusableMethods.waitFor(5);
        Assert.assertTrue(lessonsManagementPage.creditScore.isDisplayed());

    }

    @Then("close the application")
    public void closeTheApplication() {
        Driver.quitDriver();
    }


    @And("Credit Score {string}  gırer")
    public void creditScoreGırer(String string) {
        lessonsManagementPage.creditScore.sendKeys(string);
    }
}
