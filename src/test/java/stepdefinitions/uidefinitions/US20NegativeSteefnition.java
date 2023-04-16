package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MeetManagementPage;
import utilities.Driver;

import static utilities.ReusableMethods.waitFor;

public class US20NegativeSteefnition {
    MeetManagementPage meetManagementPage=new MeetManagementPage();
    @And("Meet Manegamente tiklarız")
    public void meetManegamenteTiklarız() {
        Driver.clickWithJS(meetManagementPage.meet_Management);
    }

    @And("Edite tiklar")
    public void editeTiklar() {
        Driver.clickWithJS(meetManagementPage.edit);
    }

    @And("Choose Students e tiklar")
    public void chooseStudentsETiklar() {
        Driver.clickWithJS(meetManagementPage.ChoseStuentds);

    }

    @When("Alanlara  bilgileri girer {string}, {string}, {string}, {string},{string}")
    public void alanlaraBilgileriGirer(String ogrenci, String tarih, String StartTime, String StopTime, String Description) {
        Driver.waitAndSendText(meetManagementPage.editChoseStuentds,ogrenci );
        Driver.waitAndSendText(meetManagementPage.date,tarih);
        Driver.waitAndSendText(meetManagementPage.StartTime,StartTime);
        Driver.waitAndSendText(meetManagementPage.StopTime,StopTime);
        Driver.waitAndSendText(meetManagementPage.Description,Description);
        waitFor(2);
    }

    @And("Submit e tiklar")
    public void submitETiklar() {
        Driver.clickWithJS(meetManagementPage.Submit);
    }

    @And("Toplanti guncellenmedi yazisini gorur")
    public void toplantiGuncellenmediYazisiniGorur() {
        Assert.assertTrue(meetManagementPage.editMeetUyariMesaji.isDisplayed());
    }
}
