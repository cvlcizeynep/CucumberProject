package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.*;

public class US08Steps {
    ResultSet resultSet;
    Connection connection;
    Statement statement;
    @Given("query gonderir")
    public void query_gonderir() throws SQLException {

        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM lesson WHERE lesson_id = 6");
        resultSet.next();

    }
    @Then("validete data")
    public void validete_data() throws SQLException {
        assertEquals(6, resultSet.getInt("lesson_id"));
        assertEquals(5, resultSet.getInt("credit_score"));
        assertEquals("Math", resultSet.getString("lesson_name"));

        assertTrue( resultSet.getBoolean("is_compulsory"));

        connection.close();
        statement.close();
        resultSet.close();
    }

}

