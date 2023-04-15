package stepdefinitions.uidefinitions.US08;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.LessonsManagementPage;
import utilities.Driver;

import utilities.ReusableMethods;

public class US8NegativeTestStepdefinition {
    LessonsManagementPage lessonsManagementPage=new LessonsManagementPage();
    @And("And Lesson Name {string} girer")
    public void andLessonNameGirer(String string) {
        lessonsManagementPage.lessonName.sendKeys(string);
    }

    @Then("Hata mesajini gorur")
    public void hataMesajiniGorur() {
        Assert.assertTrue(lessonsManagementPage.lessonhataMesaji.isDisplayed());
    }

    /*@And("Credit Score {string}  gırer")
    public void creditScoreGırer(String string) {

        lessonsManagementPage.creditScore.sendKeys("?:",Keys.TAB,Keys.ENTER);

    }*/
    @And("Submit  e tiklarr")
    public void submitETiklar() {
        ReusableMethods.waitFor(5);

    }
}










