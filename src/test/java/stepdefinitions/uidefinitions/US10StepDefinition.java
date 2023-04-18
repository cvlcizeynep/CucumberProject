package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import pages.LessonsManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.waitFor;

public class US10StepDefinition {
    LessonsManagementPage lessonsManagementPage = new LessonsManagementPage();
    LoginStepDefinitions loginStepDefinitions= new LoginStepDefinitions();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Given("lesson Programi tiklar")
    public void lesson_programi_tiklar() {
        lessonsManagementPage.lessonProgram_asl.click();
        waitFor(1);
    }

    @And("lesson Programi tiklar")
    public void lessonsaGirer(String ders) {
        waitFor(1);
    }
        @Given("select lessoni tıklar")
        public void select_lessoni_tiklar() {
            ReusableMethods.waitFor(5);
            lessonsManagementPage.selectLesson_asl.click();
            lessonsManagementPage.lessonName.sendKeys("fiziks");
            waitFor(1);

        }
    @Given("acılan ders listesinden ders secer")
    public void acılan_ders_listesinden_ders_acılan_ders_listesinden_ders_secersecer() {

                lessonsManagementPage.selectLesson_asl.sendKeys("fiziks");
        waitFor(1);
    }
    @Given("Education Term i secer")
    public void education_term_secer() {

        lessonsManagementPage.educationTerm_asl.click();
        waitFor(1);
    }

            @Given("acilan menuden SPRİNG_SEMESTERi secer")
            public void acilan_menuden_spring_semeste_ri_secer() {
                lessonsManagementPage.educationTerm_asl.sendKeys("SPRING_SEMESTER");
                waitFor(1);
            }

            @Given("CHOOSE DAYii tiklar")
            public void choose_da_yii_tıklar() {
                lessonsManagementPage.chooseDay_asl.click();
                waitFor(1);
            }

            @Given("acilan menuden Mondayi tiklar")
            public void acilan_menuden_mondayi_tıklar() {
                lessonsManagementPage.chooseDay_asl.sendKeys("MONDAY");
                waitFor(1);
            }

            @Given("Start Time i tiklar")
            public void start_time_i_tıklar() {
                lessonsManagementPage.startTime_asl.click();
                waitFor(1);
            }

            @Given("gecerli bir saat degeri girer")
            public void gecerli_bir_saat_degeri_girer() {
                lessonsManagementPage.startTime_asl.sendKeys("8.00");
                waitFor(1);
            }

            @Given("Stop Time i tiklar")
            public void stop_time_i_tiklar() {
                lessonsManagementPage.stopTime_asl.click();
                waitFor(1);
            }

            @Given("gecerli bir stop time girer")
            public void gecerli_bir_stop_time_girer() {
                lessonsManagementPage.stopTime_asl.sendKeys("08.30");
                waitFor(1);
            }


        }