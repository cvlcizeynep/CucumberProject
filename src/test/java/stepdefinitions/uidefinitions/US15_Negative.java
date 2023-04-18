package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.ViceDeanManagement;
import utilities.Driver;

public class US15_Negative {
    ViceDeanManagement viceDeamanagemet = new ViceDeanManagement();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    @Then("Vice Dean {string}Name alanini space girilir")
    public void viceDeanNameAlaniniSpaceGirilir(String string) {

        viceDeamanagemet.name.sendKeys(" ");
    }

    @Then("Vice Dean {string} surname alanini space girilir")
    public void viceDeanSurnameAlaniniSpaceGirilir(String string) {
viceDeamanagemet.surName.sendKeys("    ");//4
    }

    @Then("Vice Dean {string} User Name alanini space girilir")
    public void viceDeanUserNameAlaniniSpaceGirilir(String string) {
viceDeamanagemet.userName.sendKeys("                                 ");// 33 space den sonra
    }

    @Then("Vice {string} Father alanini space girilir")
    public void viceFatherAlaniniSpaceGirilir(String string) {
viceDeamanagemet.fatherName.sendKeys("                   ");
    }

    @Then("Vice {string} Mother alanini space girilir")
    public void viceMotherAlaniniSpaceGirilir(String string) {
viceDeamanagemet.motherName.sendKeys("                    ");
    }

    @Then("Vice {string} Password alanini space girilir")
    public void vicePasswordAlaniniSpaceGirilir(String string) {
        viceDeamanagemet.password.sendKeys("                ");
    }

    @Then("Vice Dean Student Numarası otomatik gelir")
    public void viceDeanStudentNumarasıOtomatikGelir() {
        Assert.assertFalse(viceDeamanagemet.succesfully.isDisplayed());

    }
}
