package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US07Steps {
    List<Object> contactDb= new ArrayList<>();
    @Given("Database icin contact saglanir")
    public void database_icin_contact_saglanir() {
        DBUtils.createConnection();

    }
    @When("Databaseden olusturulan mesajlar sorgulanir")
    public void databaseden_olusturulan_mesajlar_sorgulanir() {
        contactDb= Collections.singletonList(DBUtils.getQueryResultList("select * from contact_message where email='apit@gmail.com'"));
        System.out.println(contactDb);
    }
    @Then("Gonderilen mesajlarin goruldugu dogrulanir")
    public void gonderilen_mesajlarin_goruldugu_dogrulanir() {
        Assert.assertTrue(contactDb.toString().contains("[[[11, 2023-04-25, apit@gmail.com, test, Deneme, apitest]]]"
        ));

    }





}
