package stepdefinitions.dbstepdefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.sql.*;
import static stepdefinitions.uidefinitions.US16MessageContact.email;
import static stepdefinitions.uidefinitions.US16MessageContact.name;

public class US16db {
    java.sql.Connection connection;
    Statement statement;
    ResultSet resultSet;

    @When("Databaseden olusturulan mesaj maille sorgulanir")
    public void databasedenOlusturulanMesajMailleSorgulanir() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM contact_message where email='"+email+"'");
        resultSet.next();
        System.out.println(email);
        System.out.println(resultSet.getString(3));
        Assert.assertEquals(email,resultSet.getString(3));
    }

    @When("Databaseden olusturulan mesaj isimle sorgulanir")
    public void databasedenOlusturulanMesajIsimleSorgulanir() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM contact_message where name='"+name+"'");
        resultSet.next();
        System.out.println(name);
        System.out.println(resultSet.getString(5));
        Assert.assertEquals(name,resultSet.getString(5));
    }


}
