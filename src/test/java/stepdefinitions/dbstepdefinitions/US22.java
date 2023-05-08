package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US22 {
    List<Object> usernamelist = new ArrayList<>();
    @Then("Admin bilgileri database de dogrulanir")
    public void adminBilgileriDatabaseDeDogrulanir() {
        usernamelist= Collections.singletonList(DBUtils.getQueryResultList("select username from admins"));
        System.out.println("Admin_username = " + usernamelist);
        Assert.assertTrue(usernamelist.toString().contains("[Team20_ADMIN]"));

    }
}
