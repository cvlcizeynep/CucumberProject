package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;

import java.sql.*;

import static org.testng.AssertJUnit.assertEquals;

public class US17_StudentInfoDB {
    @Given("Teacher Ders, Öğrenci ve dönem i gorur, dogrular")
    public void teacher_ders_öğrenci_ve_dönem_i_gorur_dogrular() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM student_info");
        resultSet.next();
        assertEquals(0,resultSet.getInt("absentee"));
        assertEquals("99",resultSet.getString("final_exam"));
        assertEquals("Basarili Ogrenci",resultSet.getString("info_note"));

    }

}
