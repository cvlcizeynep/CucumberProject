package stepdefinitions.uidefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.StudentInfoManagement;
import utilities.Driver;

public class US18 {
    StudentInfoManagement studentInfoManagement =new StudentInfoManagement();
    @Given("İstenilen öğrencinin yanındaki delete butonuna basar")
    public void i̇stenilen_öğrencinin_yanındaki_delete_butonuna_basar() {
    studentInfoManagement.ilkDeleteStudentInfo.click();
    }

    @When("StudenT delete Succesfully yazısı ekranda çıkar")
    public void studen_t_delete_succesfully_yazısı_ekranda_çıkar() {
      Assert.assertTrue(studentInfoManagement.alertStudentInfo.getText().toLowerCase().contains("student info deleted succesfully"));
        System.out.println(studentInfoManagement.alertStudentInfo.getText());
    }

    @Given("Kullanıcı Menu seceneğine tıklar")
    public void kullanıcı_menu_seceneğine_tıklar() {
        studentInfoManagement.menuStudentInfo.click();
    }
    @Given("Student Info Managment seceneğine tıklar")
    public void student_info_managment_seceneğine_tıklar() {
        studentInfoManagement.studentInfoManagmentButtonStudentInfo.click();
    }

    @Given("İlk sıradaki öğrencinin yanındaki edit butonuna tıklar")
    public void i̇lk_sıradaki_öğrencinin_yanındaki_edit_butonuna_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Kullanıcı choose lessons butonuna tıklar ve dersi seçer")
    public void kullanıcı_choose_lessons_butonuna_tıklar_ve_dersi_seçer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Kullanıcı Choose Education Term kısmına tıklar ve dönemi seçer")
    public void kullanıcı_choose_education_term_kısmına_tıklar_ve_dönemi_seçer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Kullanıcı Absentee kısmına {string} girer")
    public void kullanıcı_absentee_kısmına_girer(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Kullanıcı Midterm Exam kısmına {string} girer")
    public void kullanıcı_midterm_exam_kısmına_girer(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Kullanıcı Final Exam kısmına {string} girer")
    public void kullanıcı_final_exam_kısmına_girer(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Kullanıcı Info Note kısmına {string} girer")
    public void kullanıcı_info_note_kısmına_girer(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Kullanıcı submit butonuna tıklar")
    public void kullanıcı_submit_butonuna_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Kullanıcı Student Info Updated Succesfully yazısı görür")
    public void kullanıcı_student_info_updated_succesfully_yazısı_görür() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




    @Given("Kullanıcı Info Note kısmına {string} a harfi girer")
    public void kullanıcı_info_note_kısmına_a_harfi_girer(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Kullanıcı Student Info Updated Succesfully yazısı görmez")
    public void kullanıcı_student_info_updated_succesfully_yazısı_görmez() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Given("Kullanıcı Please enter absentee yazısı görür")
    public void kullanıcı_please_enter_absentee_yazısı_görür() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Given("Student Info List'te Name görülebilmeli")
    public void student_info_list_te_name_görülebilmeli() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Student Info List'te Lesson name görülebilmeli")
    public void student_info_list_te_lesson_name_görülebilmeli() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("1Student Info List'te Ansentee görülebilmeli")
    public void student_info_list_te_ansentee_görülebilmeli() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Student Info List'te Midterm Exam görülebilmeli")
    public void student_info_list_te_midterm_exam_görülebilmeli() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Student Info List'te Final Exam görülebilmeli")
    public void student_info_list_te_final_exam_görülebilmeli() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Student Info List'te Info Note görülebilmeli")
    public void student_info_list_te_info_note_görülebilmeli() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Student Info List'te Average görülebilmeli")
    public void student_info_list_te_average_görülebilmeli() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Kullanıcı Please enter Info Note yazısı görür")
    public void kullanıcı_please_enter_info_note_yazısı_görür() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Kullanıcı Midterm Exam kısmına not girer")
    public void kullanıcı_midterm_exam_kısmına_not_girer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Kullanıcı Please enter final exam yazısı görür")
    public void kullanıcı_please_enter_final_exam_yazısı_görür() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("ilk sıradaki öğrencinin yanındaki edit butonuna tıklar")
    public void ilk_sıradaki_öğrencinin_yanındaki_edit_butonuna_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Kullanıcı Please enter midterm exam yazısı görür")
    public void kullanıcı_please_enter_midterm_exam_yazısı_görür() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }








}