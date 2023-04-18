package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.LessonsManagementPage;
import utilities.ReusableMethods;

public class US10StepDefinition {
    LessonsManagementPage lessonsManagementPage = new LessonsManagementPage();
    LoginStepDefinitions loginStepDefinitions= new LoginStepDefinitions();

    @Given("lesson Programi tiklar")
    public void lesson_programi_tiklar() {
        lessonsManagementPage.lessonProgram_asl.click();
    }

    @Given("select lessoni tiklar")
    public void select_lessoni_tiklar() {
        ReusableMethods.waitFor(5);
        lessonsManagementPage.selectLesson_asl.click();

    }

    @Given("acılan ders listesindeki ilk dersi secer")
    public void acılan_ders_listesindeki_ilk_dersi_secer() {

        lessonsManagementPage.selectLesson_asl.sendKeys("fiziks");
    }

    @Given("Education Term i secer")
    public void education_term_i_secer() {
        lessonsManagementPage.educationTerm_asl.click();
    }

    @Given("acilan menuden SPRİNG_SEMESTERi secer")
    public void acilan_menuden_spring_semeste_ri_secer() {
        lessonsManagementPage.educationTerm_asl.sendKeys("SPRING_SEMESTER");
    }

    @Given("CHOOSE DAYii tıklar")
    public void choose_da_yii_tıklar() {
        lessonsManagementPage.chooseDay_asl.click();
    }

    @Given("acilan menuden Mondayi tıklar")
    public void acilan_menuden_mondayi_tıklar() {
        lessonsManagementPage.chooseDay_asl.sendKeys("MONDAY");
    }

    @Given("Start Time i tıklar")
    public void start_time_i_tıklar() {
        lessonsManagementPage.startTime_asl.click();
    }

    @Given("gecerli bir saat degeri girer")
    public void gecerli_bir_saat_degeri_girer() {
        lessonsManagementPage.startTime_asl.sendKeys("8.00");
    }

    @Given("Stop Time i tiklar")
    public void stop_time_i_tiklar() {
        lessonsManagementPage.stopTime_asl.click();
    }

    @Given("gecerli bir stop time girer")
    public void gecerli_bir_stop_time_girer() {
        lessonsManagementPage.stopTime_asl.sendKeys("08.30");
    }


}











