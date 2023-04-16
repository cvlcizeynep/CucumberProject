package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.LessonsManagementPage;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class US_11 {
    LessonsManagementPage lessonsManagementPage=new LessonsManagementPage();
    @Given("Kullanici Lesson Management butonuna tiklar")
    public void kullanici_lesson_management_butonuna_tiklar() {
        lessonsManagementPage.LessonManagement.click();
    }
    @Given("Kullanici Lesson Program Bolumune tiklar")
    public void kullanici_lesson_program_bolumune_tiklar() {
        lessonsManagementPage.LessonProgramButton.click();
    }
    @Given("Kullanici Lesson program List sayfasinin goruntulendigini dogrular.")
    public void kullanici_lesson_program_list_sayfasinin_goruntulendigini_dogrular() {
        assertTrue(lessonsManagementPage.LessonProgramListBaslik.isDisplayed());
    }
    @Given("Kullanici olusturulan dersin goruntulendigini dogrular")
    public void kullanici_olusturulan_dersin_goruntulendigini_dogrular() {
        assertTrue(Driver.getDriver().getPageSource().contains("Nutrition"));

    }
    @Given("Kullanici dersin gununu {string} goruntuledigini dogrular")
    public void kullanici_dersin_goruntuledigini_dogrular(String day) {
        assertTrue(lessonsManagementPage.LessonProgramListDayYazisi.isDisplayed());

    }
    @Given("Kullanici Lesson'in baslama saatini {string} ini goruntuledigini dogrular")
    public void kullanici_lesson_in_ini_goruntuledigini_dogrular(String startTime) {
        assertTrue(lessonsManagementPage.LessonProgramListStartTimeYazisi.isDisplayed());
    }

    @And("Kullanici Lesson'in bitis saatini {string} ini goruntuledigini dogrular")
    public void kullaniciLessonInBitisSaatiniIniGoruntulediginiDogrular(String StopTime) {
        assertTrue(lessonsManagementPage.LessonProgramListStopTimeYazisi.isDisplayed());
    }
}
