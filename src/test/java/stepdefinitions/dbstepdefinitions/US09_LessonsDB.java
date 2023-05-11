package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.When;

import java.sql.*;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class US09_LessonsDB {
    @When("Vice Dean Lessonları gorur, dogrular")
    public void vice_dean_lessonları_gorur_dogrular() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management","select_user","43w5ijfso");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM lesson WHERE lesson_id = 1");

        resultSet.next();
     assertEquals(4,resultSet.getInt("credit_score"));
     assertTrue(resultSet.getBoolean("is_compulsory"));
     assertEquals("CYPRESS",resultSet.getString("lesson_name"));


    }}
