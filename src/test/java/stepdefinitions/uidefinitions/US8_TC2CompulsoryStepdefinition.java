package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.LessonsManagementPage;
import pages.LoginPage;
import utilities.ReusableMethods;

public class US8_TC2CompulsoryStepdefinition {
    LessonsManagementPage lessonsManagementPage = new LessonsManagementPage();


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
}
