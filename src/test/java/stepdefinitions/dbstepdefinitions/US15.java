package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US15 {
    List<Object> studentSave = new ArrayList<>();

    @Then("ogrenci bilgileri database de dogrulanir")
    public void ogrenci_bilgileri_database_de_dogrulanir() {

        studentSave = Collections.singletonList((DBUtils.getQueryResultList("select * from student where username='ibrahimKILIC'")));
        System.out.println(studentSave);

        Assert.assertTrue(studentSave.toString().contains("ibrahimKILIC"));
        Assert.assertTrue(studentSave.toString().contains("klic@gmail.com"));
        Assert.assertTrue(studentSave.toString().contains("200-503-2136"));
        Assert.assertTrue(studentSave.toString().contains("320-03-0136"));

    }

    @Then("Close Database")
    public void close_database() {
        DBUtils.closeConnection();
    }
}
