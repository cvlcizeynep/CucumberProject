package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.LessonsManagementPage;
import utilities.Driver;

import utilities.ReusableMethods;

public class US8_ViceDeanAddLessonNegativeUi {
    LessonsManagementPage lessonsManagementPage=new LessonsManagementPage();
    @And("And Lesson Name {string} girer")
    public void andLessonNameGirer(String string) {
        lessonsManagementPage.lessonName.sendKeys(string);
    }

    @Then("Hata mesajini gorur")
    public void hataMesajiniGorur() {
        Assert.assertTrue(lessonsManagementPage.lessonhataMesaji.isDisplayed());
    }


    @And("Submit  e tiklarr")
    public void submitETiklar() {
        ReusableMethods.waitFor(5);

    }


    @And("Credit  Score  {string}  gırer")
    public void creditScoreGirer(String arg0) {
        lessonsManagementPage.creditScore.sendKeys("?:",Keys.TAB,Keys.ENTER);
    }


    @And("Lessons a tiklar")
    public void lessonsATiklar() {
       Driver.clickWithJS(lessonsManagementPage.lessons);
    }
}










