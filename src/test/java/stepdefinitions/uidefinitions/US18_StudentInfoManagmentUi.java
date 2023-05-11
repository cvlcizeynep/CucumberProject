package stepdefinitions.uidefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.StudentInfoManagement;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US18_StudentInfoManagmentUi {
    StudentInfoManagement studentInfoManagement =new StudentInfoManagement();


    @Given("İstenilen öğrencinin yanındaki delete butonuna basar")
    public void i̇stenilen_ogrencinin_yanindaki_delete_butonuna_basar() {
        ReusableMethods.doubleClick(studentInfoManagement.ilkDeleteStudentInfo);
    }
    @When("StudenT delete Succesfully yazısı ekranda çıkar")
    public void student_delete_succesfully_yazisi_ekranda_cikar() {
       Assert.assertTrue(studentInfoManagement.deleteyazisi.isDisplayed());
    }
    @Given("İlk sıradaki öğrencinin yanındaki edit butonuna tıklar")
    public void i̇lk_siradaki_ogrencinin_yanindaki_edit_butonuna_tiklar() {
ReusableMethods.scroolDownToVisibleElement(studentInfoManagement.ilkEditStudentInfo);
ReusableMethods.waitFor(3);
studentInfoManagement.ilkEditStudentInfo.click();
    }

    @Given("Kullanıcı Choose Education Term kısmına tıklar ve dönemi seçer")
    public void kullanici_choose_education_term_kismina_tiklar_ve_donemi_secer() {

    }
    @Given("Kullanıcı Absentee kısmına {string} girer")
    public void kullanici_absentee_kismina_girer(String string) {
        studentInfoManagement.absenteeStudentInfo.sendKeys(string);
    }
    @Given("Kullanıcı Midterm Exam kısmına {string} girer")
    public void kullanici_midterm_exam_kismina_girer(String string) {
       studentInfoManagement.midtermStudentInfo.sendKeys(string);
    }
    @Given("Kullanıcı Final Exam kısmına {string} girer")
    public void kullanici_final_exam_kismina_girer(String string) {
       studentInfoManagement.finalStudentInfo.sendKeys(string);
    }
    @Given("Kullanıcı Info Note kısmına {string} girer")
    public void kullanici_info_note_kismina_girer(String string) {
       studentInfoManagement.infoNoteStudentInfo.sendKeys(string);
    }
    @Given("Kullanıcı submit butonuna tıklar")
    public void kullanici_submit_butonuna_tiklar() {
        studentInfoManagement.submitStudentInfo.click();
    }
    @Given("Kullanıcı Student Info Updated Succesfully yazısı görür")
    public void kullanici_student_info_updated_succesfully_yazisi_gorur() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Kullanıcı Info Note kısmına {string} a harfi girer")
    public void kullanici_info_note_kismina_a_harfi_girer(String string) {
        studentInfoManagement.infoNoteStudentInfo.sendKeys(string);
    }
    @Given("Kullanıcı Student Info Updated Succesfully yazısı görmez")
    public void kullanici_student_info_updated_succesfully_yazisi_gormez() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Kullanıcı Please enter Info Note yazısı görür")
    public void kullanici_please_enter_info_note_yazisi_gorur() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Kullanıcı Midterm Exam kısmına not girer")
    public void kullanici_midterm_exam_kismina_not_girer() {

        studentInfoManagement.midtermStudentInfo.sendKeys("50");
    }
    @Given("Kullanıcı Please enter final exam yazısı görür")
    public void kullanici_please_enter_final_exam_yazisi_gorur() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("ilk sıradaki ogrencinin yanındaki edit butonuna tıklar")
    public void ilk_siradaki_ogrencinin_yanindaki_edit_butonuna_tiklar() {
      studentInfoManagement.ilkEditStudentInfo.click();
    }
    @Given("Kullanıcı Please enter midterm exam yazısı görür")
    public void kullanici_please_enter_midterm_exam_yazisi_gorur() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Kullanıcı choose lessons butonuna tiklar ve dersi seçer")
    public void kullanici_choose_lessons_butonuna_tiklar_ve_dersi_secer() {

    }



    @Given("Kullanıcı Please enter absentee yazisi görür")
    public void kullanici_please_enter_absentee_yazisi_gorur() {
        Assert.assertTrue(studentInfoManagement.pleaseenterabsentee.isDisplayed());
    }

    @Given("Student Info List'te Name görülebilmeli")
    public void student_info_listte_name_gorulebilmeli() {
        List<WebElement> rows = studentInfoManagement.table.findElements(By.tagName("tr"));
        List<String> data = new ArrayList<String>();
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                data.add(cell.getText());
            }
            String searchWord = "Name";
            boolean isFound = false;
            for (String item : data) {
                if (item.contains(searchWord)) {
                    isFound = true;
                    break;
        }

    }Assert.assertTrue(isFound=true);
        }


    }
    @Given("Student Info List'te Lesson name görülebilmeli")
    public void student_info_listte_lesson_name_gorulebilmeli() {
        List<WebElement> rows = studentInfoManagement.table.findElements(By.tagName("tr"));
        List<String> data = new ArrayList<String>();
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                data.add(cell.getText());
            }
            String searchWord = "Lesson Name";
            boolean isFound = false;
            for (String item : data) {
                if (item.contains(searchWord)) {
                    isFound = true;
                    break;
                }

            }Assert.assertTrue(isFound=true);
        }


    }
    @Given("Student Info List'te Ansentee görülebilmeli")
    public void student_info_listte_ansentee_gorulebilmeli() {
        List<WebElement> rows = studentInfoManagement.table.findElements(By.tagName("tr"));
        List<String> data = new ArrayList<String>();
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                data.add(cell.getText());
            }
            String searchWord = "Absentee";
            boolean isFound = false;
            for (String item : data) {
                if (item.contains(searchWord)) {
                    isFound = true;
                    break;
                }

            }Assert.assertTrue(isFound=true);
        }


    }
    @Given("Student Info List'te Midterm Exam görülebilmeli")
    public void student_info_listte_midterm_exam_gorulebilmeli() {
        List<WebElement> rows = studentInfoManagement.table.findElements(By.tagName("tr"));
        List<String> data = new ArrayList<String>();
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                data.add(cell.getText());
            }
            String searchWord = "Midterm Exam";
            boolean isFound = false;
            for (String item : data) {
                if (item.contains(searchWord)) {
                    isFound = true;
                    break;
                }

            }Assert.assertTrue(isFound=true);
        }


    }
    @Given("Student Info List'te Final Exam görülebilmeli")
    public void student_info_listte_final_exam_gorulebilmeli() {
        List<WebElement> rows = studentInfoManagement.table.findElements(By.tagName("tr"));
        List<String> data = new ArrayList<String>();
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                data.add(cell.getText());
            }
            String searchWord = "Final Exam";
            boolean isFound = false;
            for (String item : data) {
                if (item.contains(searchWord)) {
                    isFound = true;
                    break;
                }

            }Assert.assertTrue(isFound=true);
        }


    }
    @Given("Student Info List'te Info Note görülebilmeli")
    public void student_info_listte_info_note_gorulebilmeli() {
        List<WebElement> rows = studentInfoManagement.table.findElements(By.tagName("tr"));
        List<String> data = new ArrayList<String>();
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                data.add(cell.getText());
            }
            String searchWord = "Info Note";
            boolean isFound = false;
            for (String item : data) {
                if (item.contains(searchWord)) {
                    isFound = true;
                    break;
                }

            }Assert.assertTrue(isFound=true);
        }


    }
    @Given("Student Info List'te Average görülebilmeli")
    public void student_info_listte_average_gorulebilmeli() {
        List<WebElement> rows = studentInfoManagement.table.findElements(By.tagName("tr"));
        List<String> data = new ArrayList<String>();
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                data.add(cell.getText());
            }
            String searchWord = "Average";
            boolean isFound = false;
            for (String item : data) {
                if (item.contains(searchWord)) {
                    isFound = true;
                    break;
                }

            }Assert.assertTrue(isFound=true);
        }


    }
    @Given("Kullanıcı Menu seceneğine tıklar")
    public void kullanıcı_menu_seceneğine_tıklar() {
        studentInfoManagement.menuStudentInfo.click();
    }
    @Given("Student Info Managment seceneğine tıklar")
    public void student_info_managment_seceneğine_tıklar() {
        studentInfoManagement.studentInfoManagmentButtonStudentInfo.click();
    }

}