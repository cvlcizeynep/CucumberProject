package stepdefinitions.dbstepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;


import static org.testng.AssertJUnit.assertEquals;


public class US19Steps {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @Given("kullanici toplanti id {string} ile sorgulama yapar")
    public void kullanici_toplanti_id_ile_sorgulama_yapar(String id) throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM MEET WHERE ID =  '"+id+"';");
        resultSet.next();
    }
    @Then("body should be like: date={string} description={string} start_time={string} stop_time={string}.")
    public void body_should_be_like_date_description_start_time_stop_time(String date, String description, String starttime, String stoptime) throws SQLException {
        String actdate= resultSet.getString("date");
        String actdecs=resultSet.getString("description");
        String actstartTime= resultSet.getString("start_time");
        String actstopTime= resultSet.getString("stop_time");


        assertEquals(date,actdate);
        assertEquals(starttime,actstartTime);
        assertEquals(stoptime,actstopTime);
        assertEquals(description,actdecs);

    }



}
