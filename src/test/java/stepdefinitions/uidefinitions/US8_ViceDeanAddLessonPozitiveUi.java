package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.LessonsManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US8_ViceDeanAddLessonPozitiveUi {
    LessonsManagementPage lessonsManagementPage = new LessonsManagementPage();


    public void lessons_a_tiklar() {
        Driver.clickWithJS(lessonsManagementPage.lessons);
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

    @Given("Lessons a tiklarr")
    public void lessons_a_tiklarr() {
     Driver.clickWithJS(lessonsManagementPage.lessons);
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



    @And("dersin olustugunu dogrular")
    public void dersinOlustugunuDogrular() {
        Assert.assertTrue(lessonsManagementPage.lessonDersOluşturulduMesaji.getText().contains("Lesson Created"));

        ReusableMethods.waitFor(2);
    }


    @And("Lessonsa {string}  girerr")
    public void lessonsaGirerr(String string) {
        lessonsManagementPage.lessonName.sendKeys(string);
    }

    @And("Credit Score {string}  gırerr")
    public void creditScoreGırerr(String string) {
        lessonsManagementPage.creditScore.sendKeys(string, Keys.TAB,Keys.ENTER);
        ReusableMethods.waitFor(2);
    }

    @And("Credit Score degerini {string}  gırer")
    public void creditScoreDegeriniGırer(String string) {
        lessonsManagementPage.creditScore.sendKeys(string);
    }
}
