package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
//import org.apache.xmlbeans.impl.regex.REUtil;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.MeetManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

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
        meetManagementPage.edescription.sendKeys(string);
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
        ReusableMethods.waitFor(1);
    }

    @And("start_time_error mesajini gorur")
    public void start_time_errorMesajiniGorur() {
        Assert.assertTrue(meetManagementPage.start_time_error.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @And("forward_date_error mesajini gorur")
    public void forward_date_errorMesajiniGorur() {
        Assert.assertTrue(meetManagementPage.forward_date_error.isDisplayed());
       // Assert.assertTrue(Driver.getDriver().getPageSource().contains("     "));
        ReusableMethods.waitFor(1);
    }


    @And("Select student e bir ogrenci secer")
    public void selectStudentEBirOgrenciSecer() throws InterruptedException {
        meetManagementPage.selectStudents2.click();
        Thread.sleep(2000);
        Actions action=new Actions(Driver.getDriver());
        action.keyDown(Keys.ARROW_DOWN).sendKeys("Yagiz Ates",Keys.ENTER).perform();
        ReusableMethods.waitFor(2);
//        Select select = new Select(meetManagementPage.selectStudents2);
//        ReusableMethods.selectRandomTextFromDropdown(select);
//        Assert.assertTrue(select.getFirstSelectedOption().isDisplayed());
//        ReusableMethods.waitFor(1);





    }
}
