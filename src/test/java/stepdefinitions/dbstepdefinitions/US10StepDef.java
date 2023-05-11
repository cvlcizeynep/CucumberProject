package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.sql.*;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class US10StepDef {

    @Given("Vice Dean education_term_id,day,start_time,stop_time i gorur, dogrular")
    public void vice_dean_education_term_id_day_start_time_stop_time_i_gorur_dogrular() throws SQLException {


        Connection connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM lesson_program WHERE id = 1482");

        resultSet.next();
assertEquals(1,resultSet.getInt("education_term_id"));
assertEquals("FRIDAY",resultSet.getString("day"));
assertEquals("16:00:00",resultSet.getString("start_time"));
assertEquals("17:00:00",resultSet.getString("stop_time"));

    }
    }
