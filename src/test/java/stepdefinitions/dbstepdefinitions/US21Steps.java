package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US21Steps {
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("ogrenci dersleri Databasete goruntuler")
    public void ogrenci_dersleri_databasete_goruntuler() throws SQLException {
        //SELECT * FROM lesson_program
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM lesson_program");
        resultSet.next();

    }
    @Then("ders listesinin Databasete goruntulendigini dogrular")
    public void ders_listesinin_databasete_goruntulendigini_dogrular() throws SQLException {
        assertEquals(2,resultSet.getInt("id"));
        assertEquals("TUESDAY",resultSet.getString("day"));
        assertEquals("10:00:00",resultSet.getString("start_time"));
        assertEquals("12:00:00",resultSet.getString("stop_time"));
        assertEquals(1,resultSet.getInt("education_term_id"));

        connection.close();
        statement.close();
        resultSet.close();


    }

    @Given("ogrenci sectigi dersleri Databasete goruntuler")
    public void ogrenci_sectigi_dersleri_databasete_goruntuler() throws SQLException {
        //SELECT * FROM student where id=10;   //SELECT * FROM student_lessonprogram WHERE student_id=10;
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM student_lessonprogram WHERE student_id=10");
        resultSet.next();
    }
    @Then("sectigi derslerin listesinin Databasete goruntulendigini dogrular")
    public void sectigi_derslerin_listesinin_databasete_goruntulendigini_dogrular() throws SQLException {
        assertEquals(3,resultSet.getInt("lesson_program_id"));
        resultSet.next();
        assertEquals(5,resultSet.getInt("lesson_program_id"));
        resultSet.next();
        assertEquals(8,resultSet.getInt("lesson_program_id"));
    }



    @Given("ogrenci ders notlarini Databasete goruntuler")
    public void ogrenci_ders_notlarini_databasete_goruntuler() throws SQLException {
        //SELECT * FROM student_info where student_id=10
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM student_info where student_id=10");
        resultSet.next();
    }
    @Then("ders notlarinin listesinin Databasete goruntulendigini dogrular")
    public void ders_notlarinin_listesinin_databasete_goruntulendigini_dogrular() throws SQLException {
        assertEquals(74,resultSet.getInt("id"));
        assertEquals(0,resultSet.getInt("absentee"));
        assertEquals(99,resultSet.getInt("exam_average"));
        assertEquals(99,resultSet.getInt("final_exam"));
        assertEquals("Basarili Ogrenci",resultSet.getString("info_note"));
        assertEquals("AA",resultSet.getString("letter_grade"));
        assertEquals(99,resultSet.getInt("midterm_exam"));
        assertEquals(3,resultSet.getInt("lesson_lesson_id"));
        assertEquals(10,resultSet.getInt("student_id"));

        resultSet.next();
        assertEquals(382,resultSet.getInt("id"));
        assertEquals(6,resultSet.getInt("absentee"));
        assertEquals(60,resultSet.getInt("final_exam"));
        assertEquals("your road is the best road",resultSet.getString("info_note"));
        assertEquals("FF",resultSet.getString("letter_grade"));
        assertEquals(1,resultSet.getInt("lesson_lesson_id"));
        assertEquals(10,resultSet.getInt("student_id"));

        connection.close();
        statement.close();
        resultSet.close();
    }



    @Given("ogrenci ogretmeninin olusturdugu toplantilari Databasete goruntuler")
    public void ogrenci_ogretmeninin_olusturdugu_toplantilari_databasete_goruntuler() throws SQLException {
        //SELECT * FROM meet where description='meeting';
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM meet where description='meeting'");
        resultSet.next();
    }
    @Then("ders olusturulan toplantilarin listesinin Databasete goruntulendigini dogrular")
    public void ders_olusturulan_toplantilarin_listesinin_databasete_goruntulendigini_dogrular() throws SQLException {
        assertEquals(324,resultSet.getInt("id"));
        assertEquals("2024-06-04",resultSet.getString("date"));
        assertEquals("meeting",resultSet.getString("description"));
        assertEquals("15:07:00",resultSet.getString("start_time"));
        assertEquals("17:07:00",resultSet.getString("stop_time"));
        assertEquals(798,resultSet.getInt("advisor_teacher_id"));

        connection.close();
        statement.close();
        resultSet.close();
    }
}