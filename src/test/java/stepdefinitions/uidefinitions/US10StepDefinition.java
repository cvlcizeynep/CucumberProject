/*//package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import pages.LessonsManagementPage;
import utilities.ReusableMethods;

public class US10StepDefinition {
    LessonsManagementPage lessonsManagementPage = new LessonsManagementPage();
    LoginStepDefinitions loginStepDefinitions= new LoginStepDefinitions();
    @And("lesson Programi tiklar")
    public void lesson_Programi_tiklar() {
        lessonsManagementPage.lessonsSecenek.click();}


    @And("lesson Programi tiklar")
    public void lessonsaGirer(String ders) {
        ReusableMethods.waitFor(5);
        lessonsManagementPage.lessonName.sendKeys(ders);
    }

    @And("dersin credit Score unun {string}  olarak girer")
    public void dersinCreditScoreUnunOlarakGirer(String arg0) {

    }





    @And("Dersin Compulsory oldugunu işaretler")
    public void dersinCompulsoryOlupOlmadığınıIşaretler() {
        ReusableMethods.waitFor(5);
        lessonsManagementPage.compulsory.click();
}*/
