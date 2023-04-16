package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MeetManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US19 {
    MeetManagementPage meetManagementPage=new MeetManagementPage();
    JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
    Faker faker=new Faker();
    @Given("Kullanici Menu butonuna tiklar ve Meet Management secenegini tiklar")
    public void kullaniciKullaniciMenuButonunaTiklarVeMeetManagementSeceneginiTiklar() {
        meetManagementPage.menu.click();
        meetManagementPage.meet_Management.click();
    }

    @And("Kullanici Meet Management sayfasinin acildigini dogrular")
    public void kullaniciMeetManagementSayfasininAcildiginiDogrular() {
        assertTrue(meetManagementPage.MeetManagementBaslik.isDisplayed());

    }

    @And("Kullanici Choose Students sekmesine tiklayip ogrenci secebildigini dogrular.")
    public void kullaniciChooseStudentsSekmesineTiklayipOgrenciSecebildiginiDogrular() {

        meetManagementPage.ChooseStedentsButton.click();
        ReusableMethods.waitFor(2);
        Actions action = new Actions(Driver.getDriver());
        action.keyDown(Keys.ARROW_DOWN).sendKeys("Ogrenci 23", Keys.ENTER).perform();

    }

    @And("Kullanici Date of Meet {string} alanini doldurur.")
    public void kullaniciDateOfMeetAlaniniDoldurur(String date) {
        js.executeScript("arguments[0].scrollIntoView(true);",meetManagementPage.dateButton);
        meetManagementPage.dateButton.sendKeys(date);
    }

    @And("Kullanici Start time {string} alanini doldurur")
    public void kullaniciStartUpAlaniniDoldurur(String starttime) {
        meetManagementPage.startTime.sendKeys(starttime);
    }

    @And("Kullanici Stop Time {string} alanini doldur")
    public void kullaniciStopTimeAlaniniDoldur(String stoptime) {


        meetManagementPage.stopTime.sendKeys(stoptime);
    }

    @And("Kullanici Description {string} alanini doldur")
    public void kullaniciDescriptionAlaniniDoldur(String description) {
        meetManagementPage.description.sendKeys(description);
    }

    @Then("Kullanici toplanti olustugunu dogrular")
    public void kullaniciToplantiOlustugunuDogrular() {
        assertTrue(meetManagementPage.MeetpopUpMesaji.isDisplayed());
    }

    @And("Kullanici hata mesaji gordugunu dogrular.")
    public void kullaniciHataMesajiGordugunuDogrular() {
        assertTrue(meetManagementPage.hataMesaji.isDisplayed());
        ReusableMethods.waitFor(2);
    }
}
