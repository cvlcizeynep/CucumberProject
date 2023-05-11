package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ContactPage;
import pages.TeacherManagementPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.sql.*;
import static stepdefinitions.dbstepdefinitions.US13_TeacherSaveDb.*;
import static utilities.ReusableMethods.waitFor;

public class US14_TeacherPutDb {
    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();
    ContactPage contactPage = new ContactPage();
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("Vice Dean Teacher gunceller")
    public void viceDeanTeacherGunceller() {
        ReusableMethods.login(ConfigReader.getProperty("viceDeanUserName"), ConfigReader.getProperty("viceDeanPassword"));
        ReusableMethods.waitForClickablility(contactPage.menuButton, 6);
        ReusableMethods.JSEClickToElement(contactPage.menuButton);
        Driver.clickWithJS(teacherManagementPage.teacherManagement);
        for (int i = 1; i < 7; i++) {

            Driver.clickWithJS(teacherManagementPage.sagOkButton);
            waitFor(2);
        }
        Driver.clickWithJS(teacherManagementPage.editButton);
        teacherManagementPage.editTeacherYazisi.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Math" + Keys.ENTER).perform();
        waitFor(2);
//        Actions action = new Actions(Driver.getDriver());
//        waitFor(2);
//        action.keyDown(Keys.ARROW_DOWN).sendKeys("Math", Keys.ENTER).perform();
//        waitFor(2);
        teacherManagementPage.editNameTextBox.sendKeys(isim);
        teacherManagementPage.editSurnameTextBox.sendKeys(soyisim);
        teacherManagementPage.editBirthPlace.sendKeys("Ankara");
      //  teacherManagementPage.editEmailTextbox.sendKeys(email);
       // teacherManagementPage.editPhoneTextbox.sendKeys(phone);
      //  teacherManagementPage.editSsnTextbox.sendKeys(ssn);
       // teacherManagementPage.editUsernameTextbox.sendKeys(username);
        teacherManagementPage.editPasswordTextbox.sendKeys("12345678");
        teacherManagementPage.editIsAdvisorTeacher.click();
        teacherManagementPage.editGenderMale.click();
        teacherManagementPage.editdateOfBirth.sendKeys("21-07-1994");
        Driver.clickWithJS(teacherManagementPage.editSubmitButton);
    }

//    @When("Databasede vice dean in ekledigi teacher in goruldugu dogrulanir.")
//    public void databasedeViceDeanInEkledigiTeacherInGorulduguDogrulanir() throws SQLException {
//        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
//        statement = connection.createStatement();
//        System.out.println(isim);
//        resultSet = statement.executeQuery("SELECT name FROM TEACHER where name='" + isim + "';");
//        resultSet.next();
//        System.out.println(resultSet.getString(1));
//
//        Assert.assertEquals(isim, resultSet.getString(1));
//    }
}
