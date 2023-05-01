package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import stepdefinitions.uidefinitions.US16;
import utilities.DBUtils;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.mongodb.QueryOperators.WHERE;
import static org.apache.hc.core5.http.HttpHeaders.FROM;
import static org.postgresql.core.SqlCommandType.SELECT;

public class US16db {
    @When("Databaseden olusturulan mesaj sorgulanir")
    public void databasedenOlusturulanMesajSorgulanir() throws SQLException {
        DBUtils.createConnection();
        US16 MAIL = new US16();
        ResultSet resultset = DBUtils.createStatement().executeQuery("SELECT * FROM  contact_message  WHERE MAIL.email");
        resultset.next();
        System.out.println(resultset.getString(3));

    }
}
