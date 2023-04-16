package stepdefinitions.uidefinitions;

import io.cucumber.java.en.Given;
import pages.ContactGellAllPage;
import pages.DeanManagementPage;
import pages.ViceDeanManagement;
import utilities.ReusableMethods;

public class US23_1Steps {
    ViceDeanManagement viceDeanManagement;
    ContactGellAllPage contactGellAllPage;
    DeanManagementPage deanManagementPage;
    @Given("Admin vice dean management sayfasina gelir")
    public void admin_vice_dean_management_sayfasina_gelir() {
        contactGellAllPage=new ContactGellAllPage();
        deanManagementPage=new DeanManagementPage();
        deanManagementPage.MenuButton.click();
        ReusableMethods.waitFor(1);
        contactGellAllPage.viceDeanManagement.click();

        //if (contactGellAllPage.xButton.isDisplayed()){
       // contactGellAllPage.xButton.click();}



    }

    }





