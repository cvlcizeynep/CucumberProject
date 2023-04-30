package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static utilities.DBUtils.insertDataIntoTable;

public class US01steps {
    List<Object> userNameList = new ArrayList<>();



    @Then("Database ile bağlantı kesilir.")
    public void database_ile_baglanti_kesilir() {
      DBUtils.closeConnectionAndStatement();
    }

    @Given("Database icin contact saglanir")
    public void database_icin_contact_saglanir() {
        DBUtils.createConnection();
    }



    @Given("Kullanıcı database'de username'i {string} olan hesabın varlığını doğrular")
    public void kullanici_databasede_usernamei_string_olan_hesabin_varligini_dogrular(String string) {
     userNameList  = Collections.singletonList(DBUtils.getQueryResultList("select username from guest_user"));
        Assert.assertTrue(userNameList.toString().contains(string));
}}
