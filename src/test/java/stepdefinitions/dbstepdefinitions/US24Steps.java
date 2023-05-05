package stepdefinitions.dbstepdefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ContactPage;
import pages.TeacherManagementPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.sql.*;
import static utilities.FakerUtils.*;
import static utilities.ReusableMethods.waitFor;
public class US24Steps {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();
    ContactPage contactPage = new ContactPage();
    String isim = nameFaker();
    String soyisim = surnameFaker();
    String email = emailFaker();
    String phone = phoneNumberFaker();

    String ssn= ssnFaker();

    @Given("Admin Teacher ekler")
    public void adminTeacherEkler() {
        ReusableMethods.login(ConfigReader.getProperty("adminUserName"), ConfigReader.getProperty("adminPassword"));
        ReusableMethods.waitForClickablility(contactPage.menuButton, 6);
        ReusableMethods.JSEClickToElement(contactPage.menuButton);
        Driver.clickWithJS(teacherManagementPage.teacherManagement);
        teacherManagementPage.chooseLessons.click();
        waitFor(2);
        Actions action = new Actions(Driver.getDriver());
        waitFor(2);
        action.keyDown(Keys.ARROW_DOWN).sendKeys("Math", Keys.ENTER).perform();
        waitFor(2);
        teacherManagementPage.name.sendKeys(isim);
        teacherManagementPage.surname.sendKeys(soyisim);
        teacherManagementPage.birthPlace.sendKeys("Ankara");
        teacherManagementPage.email.sendKeys(email);
        teacherManagementPage.phone.sendKeys(phone);
        teacherManagementPage.ssn.sendKeys(ssn);
        teacherManagementPage.password.sendKeys("12345678");
        teacherManagementPage.isAdvisorTeacher.click();
        teacherManagementPage.genderMale.click();
        teacherManagementPage.dateOfBirth.sendKeys("21-07-1994");
        Driver.clickWithJS(teacherManagementPage.submit);
    }
    @Then("Databasede adminin ekledigi teacher in goruldugu dogrulanir.")
    public void databasede_adminin_ekledigi_teacher_in_goruldugu_dogrulanir() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        System.out.println(isim);
        resultSet = statement.executeQuery("SELECT name FROM TEACHER where name='"+isim+"';");
        resultSet.next();
        System.out.println(resultSet.getString(1));

        Assert.assertEquals(isim, resultSet.getString(1));

    }

}
