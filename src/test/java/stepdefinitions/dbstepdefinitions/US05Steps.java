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



}