package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class US20Steps {
    ResultSet resultSet;
    Connection connection;
    Statement statement;

    @Given("query gonderirr")
    public void query_gonderirr() throws SQLException {

        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select *from meet where id=128");
        resultSet.next();

    }

    @Then("validete data2@DBtestt")
    public void validete_data2_d_btestt() throws SQLException {
        assertEquals(128, resultSet.getInt("id"));
        assertEquals("2023-05-14", resultSet.getString("date"));
        assertEquals( "hm",resultSet.getString("description"));
        assertEquals("07:00:00", resultSet.getString("start_time"));
        assertEquals("08:00:00", resultSet.getString("stop_time"));
        assertEquals(352, resultSet.getInt("advisor_teacher_id"));
        connection.close();
        statement.close();
        resultSet.close();

    }
}