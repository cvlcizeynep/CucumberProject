package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static utilities.DBUtils.getResultset;

public class US05Steps {


    List<Object> namelist = new ArrayList<>();
    List<Object> genderlist = new ArrayList<>();
    List<Object> phonenumberlist = new ArrayList<>();
    List<Object> ssnlist = new ArrayList<>();
    List<Object> usernamelist = new ArrayList<>();

    //*************NAME***********************
    @When("Deanlerin name bilgilerini databasede sorgular")
    public void deanlerin_name_bilgilerini_databasede_sorgular() {

        namelist = Collections.singletonList(DBUtils.getQueryResultList("select name from dean"));
        System.out.println("deanlist = " + namelist);
    }
    @Then("Admin deanin  name bilgilerini gorebildigini dogrular")
    public void admin_deanin_name_bilgilerini_gorebildigini_dogrular() {
        Assert.assertTrue(namelist.toString().contains("IntelijDeneme12"));
    }
    @Then("Close Database")
    public void close_database() {
        DBUtils.closeConnectionAndStatement();
    }


    //**********GENDER**********
    @When("Deanlerin gender bilgilerini databasede sorgular")
    public void deanlerin_gender_bilgilerini_databasede_sorgular() {
        genderlist = Collections.singletonList(DBUtils.getQueryResultList("select gender from dean"));
        System.out.println("genderlist = " + genderlist);

    }
    @Then("Admin deanin gender bilgilerini gorebildigini dogrular")
    public void admin_deanin_gender_bilgilerini_gorebildigini_dogrular() {
        Assert.assertTrue(genderlist.toString().contains("MALE"));

    }
    //************PHONE NUMBER***************
    @When("Deanlerin phone number  bilgilerini databasede sorgular")
    public void deanlerin_phone_number_bilgilerini_databasede_sorgular() {
        phonenumberlist = Collections.singletonList(DBUtils.getQueryResultList("select phone_number from dean"));
        System.out.println("deanlist = " + phonenumberlist);

    }
    @Then("Admin deanin phone number bilgilerini gorebildigini dogrular")
    public void admin_deanin_phone_number_bilgilerini_gorebildigini_dogrular() {
        Assert.assertTrue(phonenumberlist.toString().contains("[126-654-8765]"));

    }
    //****************SSN***********
    @When("Deanlerin ssn bilgilerini databasede sorgular")
    public void deanlerin_ssn_bilgilerini_databasede_sorgular() {
        ssnlist = Collections.singletonList(DBUtils.getQueryResultList("select ssn from dean"));
        System.out.println("deanlist = " + ssnlist);

    }
    @Then("Admin deanin ssn bilgilerini gorebildigini dogrular")
    public void admin_deanin_ssn_bilgilerini_gorebildigini_dogrular() {
        Assert.assertTrue(ssnlist.toString().contains("[564-34-8765]"));
    }
    //****************USER NAME*************
    @When("Deanlerin username bilgilerini databasede sorgular")
    public void deanlerin_username_bilgilerini_databasede_sorgular() {
        usernamelist = Collections.singletonList(DBUtils.getQueryResultList("select username from dean"));
        System.out.println("deanlist = " + usernamelist);

    }
    @Then("Admin deanin  username bilgilerini gorebildigini dogrular")
    public void admin_deanin_username_bilgilerini_gorebildigini_dogrular() {
        Assert.assertTrue(usernamelist.toString().contains("[Brennan.Lehner51]"));
    }
    @Then("Admin deanin  username bilgilerini goremedigini dogrular")
    public void admin_deanin_username_bilgilerini_goremedigini_dogrular() {

    }



}