package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class US08Steps {
    ResultSet resultSet;
    Connection connection;
    Statement statement;
    @Given("query gonderir")
    public void query_gonderir() throws SQLException {

        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM lesson WHERE lesson_id = 5");
        resultSet.next();

    }
    @Then("validete data")
    public void validete_data() throws SQLException {
        assertEquals(5, resultSet.getInt("lesson_id"));
        assertEquals(3, resultSet.getInt("credit_score"));
        assertFalse( resultSet.getBoolean("is_compulsory"));
        assertEquals("HEAT TRANSFER", resultSet.getString("lesson_name"));
        connection.close();
        statement.close();
        resultSet.close();
    }

}

