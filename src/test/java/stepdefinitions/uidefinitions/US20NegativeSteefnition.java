package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
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
        Driver.clickWithJS(meetManagementPage.editChoseStuentds1);

    }

    @When("Alanlara  bilgileri girer {string}, {string}, {string}, {string},{string}")
    public void alanlaraBilgileriGirer(String ogrenci, String tarih, String StartTime, String StopTime, String Description) {
        Driver.waitAndSendText(meetManagementPage.editChoseStuentds2,ogrenci );
        waitFor(2);
        Driver.waitAndSendText(meetManagementPage.date,tarih);
        waitFor(2);

        Driver.waitAndSendText(meetManagementPage.editMeetStartTime,StartTime);
        waitFor(2);
        Driver.waitAndSendText(meetManagementPage.editMeetStartTime,StopTime);
        waitFor(2);

        Driver.waitAndSendText(meetManagementPage.editMeetDescription,Description);
        waitFor(2);
    }

    @And("Submit e tiklar")
    public void submitETiklar() {
    }

    @And("Toplanti guncellenmedi yazisini gorur")
    public void toplantiGuncellenmediYazisiniGorur() {
    }
}
