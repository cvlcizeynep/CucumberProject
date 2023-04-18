


    package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import pages.LessonsManagementPage;
import pages.StudentInfoManagement;
import utilities.Driver;

import static utilities.ReusableMethods.waitFor;

    public class US17StepDefinition {
        LessonsManagementPage lessonsManagementPage = new LessonsManagementPage();
        LoginStepDefinitions loginStepDefinitions= new LoginStepDefinitions();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        StudentInfoManagement studentInfoManagement=new StudentInfoManagement();
        Faker faker = new Faker();
        @Given("choose lesson tiklar")
        public void choose_lesson_tiklar() {
            studentInfoManagement.chooseLesson_asl.click();

            waitFor(1);
        }



        @Given("acilan Student Info Management sayfasindan Choose Education Term ı tiklar")
        public void acılan_student_ınfo_management_sayfasından_choose_education_term_ı_tıklar() {
            studentInfoManagement.chooseEducationTerm_asl.click();
            waitFor(1);
        }
        @Given("acilan menuden bir ogretim donemi secer")
        public void acılan_menuden_bir_ogretim_donemi_secer() {
            studentInfoManagement.chooseEducationTerm_asl.sendKeys("SPRİNG_SEMESTER");
            waitFor(1);
        }
        @Given("acilan Student Info Management sayfasından Absentee ye tiklar")
        public void acılan_student_ınfo_management_sayfasından_absentee_ye_tıklar() {
            studentInfoManagement.absentee_asl.click();
            waitFor(1);
        }
        @Given("ogrencinin kac gun  devamsizlik yaptigini girer")
        public void ogrencinin_kac_gun_devamsızlık_yaptıgını_girer() {
            studentInfoManagement.absentee_asl.sendKeys("3");

            waitFor(1);
        }
        @Given("acilan Student Info Management sayfasından Midterm Exam a tiklar")
        public void acılan_student_ınfo_management_sayfasından_midterm_exam_a_tıklar() {
            studentInfoManagement.midtermExam_asl.click();

            waitFor(1);
        }
        @Given("Midterm exam kısmına bir ara sınav Notu girer")
        public void midterm_exam_kısmına_bir_ara_sınav_notu_girer() {
            studentInfoManagement.midtermExam_asl.sendKeys("75");
            waitFor(1);
        }
        @Given("acilan Student Info Management sayfasindan Final Exam a tiklar")
        public void acılan_student_ınfo_management_sayfasından_final_exam_a_tıklar() {
            studentInfoManagement.finalExam_asl.click();
            waitFor(1);
        }
        @Given("Final exam kismina bir final Notu girer")
        public void final_exam_kısmına_bir_final_notu_girer() {
            studentInfoManagement.finalExam_asl.sendKeys("80");
            waitFor(1);
        }
        @Given("acilan Student Info Management sayfasından Info Note a tiklar")
        public void acılan_student_ınfo_management_sayfasından_ınfo_note_a_tıklar() {
            studentInfoManagement.infoNote_asl.click();
            waitFor(1);
        }
        @Given("Info Note kısmına bir bilgi notu girer")
        public void ınfo_note_kısmına_bir_bilgi_notu_girer() {
            studentInfoManagement.infoNote_asl.sendKeys("BASARILI");
            waitFor(1);
        }


    }

