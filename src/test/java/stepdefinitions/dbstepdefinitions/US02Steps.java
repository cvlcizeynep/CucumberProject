package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US02Steps {
    List<Object> namelist = new ArrayList<>();
    List<Object> phonenumberlist = new ArrayList<>();
    List<Object> ssnlist = new ArrayList<>();
    List<Object> usernamelist = new ArrayList<>();
    List<Object> GuestUserList = new ArrayList<>();

//***************************name*********************
    @When("Admin Guest User name bilgilerini databasede sorgular")
    public void admin_guest_user_name_bilgilerini_databasede_sorgular() {
        namelist = Collections.singletonList(DBUtils.getQueryResultList("select name from guest_user"));
        System.out.println("guest_userlist = " + namelist);
    }
    @Then("Admin Guest User name bilgilerini gorebildigini dogrular")
    public void admin_guest_user_name_bilgilerini_gorebildigini_dogrular() {
        Assert.assertTrue(namelist.toString().contains("Yvonne"));

        //**************phone number********************

    }
    @When("Admin Guest User phone number bilgilerini databasede sorgular")
    public void admin_guest_user_phone_number_bilgilerini_databasede_sorgular() {
        phonenumberlist = Collections.singletonList(DBUtils.getQueryResultList("select phone_number from guest_user"));
        System.out.println("guest_userlist = " + phonenumberlist);
    }
    @Then("Admin Guest User phone number bilgilerini gorebildigini dogrular")
    public void admin_guest_user_phone_number_bilgilerini_gorebildigini_dogrular() {
        Assert.assertTrue(phonenumberlist.toString().contains("[708-637-2047]"));

    //**************************ssn************************

    }
    @When("Admin Guest User ssn bilgilerini databasede sorgular")
    public void admin_guest_user_ssn_bilgilerini_databasede_sorgular() {
        ssnlist= Collections.singletonList(DBUtils.getQueryResultList("select ssn from guest_user"));
        System.out.println("guest_userlist = " + ssnlist);
    }
    @Then("Admin Guest User ssn bilgilerini gorebildigini dogrular")
    public void admin_guest_user_ssn_bilgilerini_gorebildigini_dogrular() {
        Assert.assertTrue(ssnlist.toString().contains("745-88-2045"));

     //***********************username*******************

    }
    @When("Admin Guest User username bilgilerini databasede sorgular")
    public void admin_guest_user_username_bilgilerini_databasede_sorgular() {
        usernamelist= Collections.singletonList(DBUtils.getQueryResultList("select username from guest_user"));
        System.out.println("guest_userlist = " + usernamelist);

    }
    @Then("Admin Guest User username bilgilerini gorebildigini dogrular")
    public void admin_guest_user_username_bilgilerini_gorebildigini_dogrular() {
        Assert.assertTrue(usernamelist.toString().contains("Canayse"));

    }


    @Then("Admin Guest User username bilgilerini goremedigini dogrular")
    public void adminGuestUserUsernameBilgileriniGoremediginiDogrular() {
        Assert.assertFalse(usernamelist.toString().contains("abcd"));

    }
}
