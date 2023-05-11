package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.List;

public class US01_GusetUserRegisterDb {
    List<Object> userNameList = new ArrayList<>();



    @Then("Database ile bağlantı kesilir.")
    public void database_ile_baglanti_kesilir() {
      DBUtils.closeConnectionAndStatement();
    }

    @Given("Database icin contact saglanir")
    public void database_icin_contact_saglanir() {
        DBUtils.createConnection();
    }



   }
