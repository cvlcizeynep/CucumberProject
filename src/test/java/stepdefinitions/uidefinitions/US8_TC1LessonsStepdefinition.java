package stepdefinitions.uidefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LessonsManagementPage;
import utilities.ReusableMethods;

public class US8_TC1LessonsStepdefinition {
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
}
