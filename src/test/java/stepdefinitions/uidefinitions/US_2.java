package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GuestUserPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_2 {
    GuestUserPage guestUserPage = new GuestUserPage();
    @And("Menu botonuna tiklar")
    public void menuBotonunaTiklar() {
        guestUserPage.menuButton.click();

    }

    @And("Main menu sayfasindan Guest User List tiklar")
    public void mainMenuSayfasindanGuestUserListTiklar() {
        //ReusableMethods.waitFor(3);
       // ReusableMethods.doubleClick(guestUserPage.menuButton);
        guestUserPage.guestUser.click();
    }

    @Then("Guest User List, Name, Phone Number,SSN, User Name bilgilerinin goruldugunu dogrular")
    public void guestUserListNamePhoneNumberSSNUserNameBilgilerininGoruldugunuDogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Name"));


    }
}
