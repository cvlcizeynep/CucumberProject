package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LessonsManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US8_TC3Score3 {
    LessonsManagementPage lessonsManagementPage=new LessonsManagementPage();
    @Given("Credit Score {string}  girer")
    public void credit_score_girer(String string) {
        ReusableMethods.waitFor(5);
        lessonsManagementPage.creditScore.sendKeys(string);
    }

    @And("Credit Score degeri girdigini dogrular")
    public void creditScoreDegeriGirdiginiDogrular() {
        ReusableMethods.waitFor(5);
        Assert.assertTrue(lessonsManagementPage.creditScore.isDisplayed());

    }
    @Then("close the application")
    public void closeTheApplication() {
        Driver.quitDriver();
    }
}


