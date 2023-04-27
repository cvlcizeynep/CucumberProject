package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DBUtils;

import java.sql.*;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static utilities.DBUtils.getResultset;

public class US05Steps {
    ResultSet resultSet;
    Statement statement;
    Connection connection;


    @Given("Admin dean tablosunu cagirir")
    public void admin_dean_tablosunu_cagirir() throws SQLException {

//        Connection connection = DriverManager.getConnection("jdbc:postgresql://209.38.244.227:5432/school_management","select_user","43w5ijfso");
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("SELECT * FROM dean");
//        resultSet.next();
//        System.out.println("resultSet = " + resultSet.getString(2));

        DBUtils.createConnection();
        String query="select * from dean WHERE id=2";
        DBUtils.executeQuery(query);
        DBUtils.getResultset().getRow();






    }

    @Then("Admin deanin bilgilerini gorebildigini dogrular")
    public void admin_deanin_bilgilerini_gorebildigini_dogrular() {



    }



}
