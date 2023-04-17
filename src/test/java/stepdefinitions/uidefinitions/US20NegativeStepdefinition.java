package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.MeetManagementPage;
import utilities.Driver;

public class US20NegativeStepdefinition {
    MeetManagementPage meetManagementPage = new MeetManagementPage();

    @And("Meet Manegamente tiklarız")
    public void meetManegamenteTiklarız() {
        Driver.clickWithJS(meetManagementPage.meet_Management);
    }

    @And("Edite tiklar")
    public void editeTiklar() {
        Driver.clickWithJS(meetManagementPage.edit);
    }

    @And("Eski bir tarih {string} girer")
    public void eskiBirTarihGirer(String string) {
        meetManagementPage.edate.sendKeys(string);
    }

    @And("Star time  {string} girer")
    public void starTimeGirer(String string) {
        meetManagementPage.estartTime.sendKeys(string);
    }

    @And("Stop time  {string} girer")
    public void stopTimeGirer(String string) {
        meetManagementPage.estopTime.sendKeys(string);

    }

    @And("Deskription  {string} girer")
    public void deskriptionGirer(String string) {
        meetManagementPage.description.sendKeys(string);
    }

    @And("Submit e tiklar")
    public void submitETiklar() {
        Driver.clickWithJS(meetManagementPage.esubmit);
    }


    @And("Ileri bir Star time  {string} girer")
    public void ıleriBirStarTimeGirer(String string) {
        meetManagementPage.estartTime.sendKeys(string);
    }

    @And("Cok ileride bir tarih {string} girer")
    public void cokIlerideBirTarihGirer(String string) {
        meetManagementPage.edate.sendKeys(string);
    }




    @And("old_date_error  mesajini gorur")
    public void old_date_errorMesajiniGorur() {
        Assert.assertTrue(meetManagementPage.old_date_error.isDisplayed());
    }

    @And("start_time_error mesajini gorur")
    public void start_time_errorMesajiniGorur() {
        Assert.assertTrue(meetManagementPage.start_time_error.isDisplayed());

    }

    @And("forward_date_error mesajini gorur")
    public void forward_date_errorMesajiniGorur() {
        Assert.assertTrue(meetManagementPage.forward_date_error.isDisplayed());
    }


    @And("Select student e {string} girerr")
    public void selectStudentEGirerr(String string) {
        meetManagementPage.ChooseStedentsButton.sendKeys(string);
    }
}
