package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.MeetManagementPage;
import utilities.ReusableMethods;

public class US20PozitiveStepdefinition {
    MeetManagementPage meetManagementPage=new MeetManagementPage();


    @And("Date nin gorundugunu dogrular")
    public void dateNinGorundugunuDogrular() {
        Assert.assertTrue(meetManagementPage.date.isDisplayed());
    }
    @Given("Menuye tiklar")
    public void menuye_tiklar() {
        meetManagementPage.menu.click();

    }
    @Given("Meet Manegamente tiklar")
    public void meet_manegamente_tiklar() {
        ReusableMethods.waitFor(2);
      meetManagementPage.meet_Management.click();
    }

    @And("Star Time nin gorundugunu dogrular")
    public void starTimeNinGorundugunuDogrular() {
        Assert.assertTrue(meetManagementPage.startTime.isDisplayed());
    }

    @And("Stop Time nin gorundugunu dogrular")
    public void stopTimeNinGorundugunuDogrular() {
        Assert.assertTrue(meetManagementPage.stopTime.isDisplayed());
    }

    @And("Description nun gorundugunu dogrular")
    public void descriptionNunGorundugunuDogrular() {
        Assert.assertTrue(meetManagementPage.description.isDisplayed());
    }

    @And("Toplanti guncellendi yazisini gorur")
    public void toplantiGuncellendiYazisiniGorur() {
        Assert.assertTrue(meetManagementPage.editMeetBasarili.isDisplayed());
    }
}
