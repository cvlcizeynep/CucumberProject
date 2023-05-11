package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ChooseLessonPage;
import pages.GradesAnnouncementPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US21_StudentChooseLessonGradesUi {

    ChooseLessonPage chooseLessonPage = new ChooseLessonPage();
    GradesAnnouncementPage gradesAnnouncementPage = new GradesAnnouncementPage();

    @When("Kullanici ogrenci olarak login olur")
    public void kullanici_ogrenci_olarak_login_olur() {
        ReusableMethods.login("Lev Nikolayeviç","Lev12345");

    }
    @Given("kullanici Choose Lesson Management sayfasini goruntuler")
    public void kullanici_choose_lesson_management_sayfasini_goruntuler() {
        ReusableMethods.waitFor(5);
        Assert.assertTrue(chooseLessonPage.chooseLessonManagement.isDisplayed());


    }
    @Then("kullanici Choose Lesson listesinde Teacher goruntuler")
    public void kullanici_choose_lesson_listesinde_teacher_goruntuler() {
        Assert.assertTrue(chooseLessonPage.teacher.isDisplayed());


    }
    @Then("kullanici Choose Lesson listesinde Day goruntuler")
    public void kullanici_choose_lesson_listesinde_day_goruntuler() {
        Assert.assertTrue(chooseLessonPage.day.isDisplayed());

    }
    @Then("kullanici Choose Lesson listesinde Start Time goruntuler")
    public void kullanici_choose_lesson_listesinde_start_time_goruntuler() {
        Assert.assertTrue(chooseLessonPage.startTime.isDisplayed());

    }
    @Then("kullanici Choose Lesson listesinde Stop Time goruntuler")
    public void kullanici_choose_lesson_listesinde_stop_time_goruntuler() {
        Assert.assertTrue(chooseLessonPage.stopTime.isDisplayed());

    }

    @And("sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.quitDriver();
    }

    @When("kullanici Choose lesson sutunundan ders secimi yapar")
    public void kullaniciChooseLessonSutunundanDersSecimiYapar() {
        chooseLessonPage.ilkDers.click();

    }

    @Then("kullanici ders secimi yaptigini dogrular")
    public void kullaniciDersSecimiYaptiginiDogrular() {

    }

    @Then("kullanici Lesson Program List altinda sectigi dersleri goruntuler")
    public void kullaniciLessonProgramListAltindaSectigiDersleriGoruntuler()  {
        ReusableMethods.waitFor(3);
        ReusableMethods.scrollToElement(chooseLessonPage.LessonProgramList);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(chooseLessonPage.LessonProgramList.isDisplayed());
    }


    @Given("kullanici menu butonuna tiklar")
    public void kullanici_menu_butonuna_tiklar() {
        ReusableMethods.JSEClickToElement(chooseLessonPage.menuButton);

    }
    @When("kullanici Grades and Announcements kismina tiklar")
    public void kullanici_grades_and_announcements_kismina_tiklar() {
        ReusableMethods.JSEClickToElement(chooseLessonPage.gradesAnnouncement);

    }
    @Then("kullanici Student Info List altinda Lesson Name goruntuler")
    public void kullanici_student_ınfo_list_altinda_lesson_name_goruntuler() {
        Assert.assertTrue(gradesAnnouncementPage.lessonName.isDisplayed());
    }
    @Then("kullanici Student Info List altinda Absentee goruntuler")
    public void kullanici_student_ınfo_list_altinda_absentee_goruntuler() {
        Assert.assertTrue(gradesAnnouncementPage.absentee.isDisplayed());

    }
    @Then("kullanici Student Info List altinda Midterm Exam goruntuler")
    public void kullanici_student_ınfo_list_altinda_midterm_exam_goruntuler() {
        Assert.assertTrue(gradesAnnouncementPage.midtermExam.isDisplayed());

    }
    @Then("kullanici Student Info List altinda Final Exam goruntuler")
    public void kullanici_student_ınfo_list_altinda_final_exam_goruntuler() {
        Assert.assertTrue(gradesAnnouncementPage.finalExam.isDisplayed());

    }
    @Then("kullanici Student Info List altinda Note goruntuler")
    public void kullanici_student_ınfo_list_altinda_note_goruntuler() {
        Assert.assertTrue(gradesAnnouncementPage.note.isDisplayed());

    }
    @Then("kullanici Student Info List altinda Info Note goruntuler")
    public void kullanici_student_ınfo_list_altinda_ınfo_note_goruntuler() {
        Assert.assertTrue(gradesAnnouncementPage.infoNote.isDisplayed());

    }
    @Then("kullanici Student Info List altinda Average goruntuler")
    public void kullanici_student_ınfo_list_altinda_average_goruntuler() {
        Assert.assertTrue(gradesAnnouncementPage.average.isDisplayed());

    }

    @Then("kullanici Meet List altinda Date goruntuler")
    public void kullanici_meet_list_altinda_date_goruntuler() {
        Assert.assertTrue(gradesAnnouncementPage.date.isDisplayed());

    }
    @Then("kullanici Meet List altinda Start Time goruntuler")
    public void kullanici_meet_list_altinda_start_time_goruntuler() {
        Assert.assertTrue(gradesAnnouncementPage.startTime.isDisplayed());

    }
    @Then("kullanici Meet List altinda Stop Time goruntuler")
    public void kullanici_meet_list_altinda_stop_time_goruntuler() {
        Assert.assertTrue(gradesAnnouncementPage.stopTime.isDisplayed());

    }
    @Then("kullanici Meet List  altinda Description goruntuler")
    public void kullanici_meet_list_altinda_description_goruntuler() {
        Assert.assertTrue(gradesAnnouncementPage.description.isDisplayed());

    }

    @When("kullanici Choose lesson sutununda daha once sectigi ayni gun aynı saat ders secer")
    public void kullaniciChooseLessonSutunundaDahaOnceSectigiAyniGunAynıSaatDersSecer() {
        chooseLessonPage.ayniSaatGunDersi.click();
    }

    @When("kullanici submit butonuna tiklar")
    public void kullaniciSubmitButonunaTiklar() {
        ReusableMethods.scrollToElement(chooseLessonPage.submitButton);
        ReusableMethods.JSEClickToElement(chooseLessonPage.submitButton);
    }

    @Then("kullanici ders secimi yapilamadigi uyarisini alir")
    public void kullaniciDersSecimiYapilamadigiUyarisiniAlir() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(ReusableMethods.waitForVisibility(chooseLessonPage.sameHour_DayPopup,5).isDisplayed());

    }
}
