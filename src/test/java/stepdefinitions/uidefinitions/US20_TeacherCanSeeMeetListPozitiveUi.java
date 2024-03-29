package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.MeetManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US20_TeacherCanSeeMeetListPozitiveUi {
    MeetManagementPage meetManagementPage = new MeetManagementPage();


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

    @And("deleteye tiklar")
    public void deleteyeTiklar() {
//        Actions actions = new Actions(Driver.getDriver());
//        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.clickWithJS(meetManagementPage.meetDelete);

    }

    @And("delete basarili yazisini gorur")
    public void deleteBasariliYazisiniGorur() {
        Assert.assertTrue(meetManagementPage.deleteBasarili.isDisplayed());
    }

    @And("Bir tarih {string} girer")
    public void birTarihGirer(String string) {
        meetManagementPage.date.sendKeys(string);
    }

    @And("Toplantı guncellendı mesajini gorur")
    public void toplantıGuncellendıMesajiniGorur() {
        Assert.assertTrue(meetManagementPage.editBasarili.isDisplayed());

    }
}
