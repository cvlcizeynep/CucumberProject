package stepdefinitions.uidefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GuestUserPage;
import utilities.Driver;
import utilities.ReusableMethods;


public class US02 {
    GuestUserPage guestUserPage = new GuestUserPage();


    @And("Menu botonuna tiklar")
    public void menuBotonunaTiklar() {
        guestUserPage.menuButton.click();

    }

    @And("Main menu sayfasindan Guest User List tiklar")
    public void mainMenuSayfasindanGuestUserListTiklar() {
        guestUserPage.guestUser.click();
    }
    @Then("Guest User List, Name bilgisinin goruldugunu dogrular")
    public void guestUserListNameBilgisininGoruldugunuDogrular() {

        Assert.assertTrue(guestUserPage.namebaslık.isDisplayed());
        ReusableMethods.waitFor(1);
    }
    @Then("Guest User List, Phone Number bilgisinin goruldugunu dogrular")
    public void guestUserListPhoneNumberBilgisininGoruldugunuDogrular() {
        Assert.assertTrue(guestUserPage.phonenumberbaslık.isDisplayed());
        ReusableMethods.waitFor(1);
    }
    @Then("Guest User List, SSN bilgisinin goruldugunu dogrular")
    public void guestUserListSsnBilgisininGoruldugunuDogrular() {
        Assert.assertTrue(guestUserPage.ssnbaslık.isDisplayed());
        ReusableMethods.waitFor(1);
    }
    @Then("Guest User List, User Name bilgisinin goruldugunu dogrular")
    public void guestUserListUserNameGoruldugunuDogrular() {
        Assert.assertTrue(guestUserPage.usernamebaslık.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @Then("Guest User List bilgilerini siler")
    public void guestUserListBilgileriniSiler() {
        guestUserPage.silmeButonu.click();


    }


    @Then("Guest User deleted Successful mesaji goruldugunu dogrular")
    public void guestUserDeletedSuccessfulMesajiGoruldugunuDogrular() {
        guestUserPage.mesaj.isDisplayed();

    }


}