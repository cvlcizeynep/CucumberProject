package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ContactPage;
import pages.TeacherManagementPage;
import utilities.*;
import utilities.Driver;

import java.sql.*;

import static utilities.FakerUtils.*;
import static utilities.ReusableMethods.waitFor;

public class US13_TeacherSaveDb {
    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();
    ContactPage contactPage = new ContactPage();
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    public static String isim = nameFaker();
    public static String soyisim = surnameFaker();
    public static String email = emailFaker();
    public static String phone = phoneNumberFaker();
    public static String ssn = ssnFaker();
    public static String username = usernameFaker();


    @Given("Vice Dean Teacher ekler")
    public void viceDeanTeacherEkler() {
        ReusableMethods.login(ConfigReader.getProperty("viceDeanUserName"), ConfigReader.getProperty("viceDeanPassword"));
        ReusableMethods.waitForClickablility(contactPage.menuButton, 6);
        ReusableMethods.JSEClickToElement(contactPage.menuButton);
        Driver.clickWithJS(teacherManagementPage.teacherManagement);
        teacherManagementPage.chooseLessons.click();
        waitFor(2);
        Actions action = new Actions(Driver.getDriver());
        waitFor(2);
        action.keyDown(Keys.ARROW_DOWN).sendKeys("Math", Keys.ENTER).perform();
        waitFor(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(teacherManagementPage.editNameTextBox).sendKeys(Keys.BACK_SPACE + isim).perform();
        actions.doubleClick(teacherManagementPage.editSurnameTextBox).sendKeys(Keys.BACK_SPACE + soyisim).perform();
        actions.doubleClick(teacherManagementPage.editBirthPlace).sendKeys(Keys.BACK_SPACE + "Ankara").perform();
        actions.doubleClick(teacherManagementPage.editEmailTextbox).sendKeys(Keys.BACK_SPACE + email).perform();
        actions.doubleClick(teacherManagementPage.editPhoneTextbox).sendKeys(Keys.BACK_SPACE + phone).perform();
        actions.doubleClick(teacherManagementPage.editSsnTextbox).sendKeys(Keys.BACK_SPACE + ssn).perform();
        actions.doubleClick(teacherManagementPage.editUsernameTextbox).sendKeys(Keys.BACK_SPACE + username).perform();
        actions.doubleClick(teacherManagementPage.editPasswordTextbox).sendKeys(Keys.BACK_SPACE + "12345678").perform();
        teacherManagementPage.editdateOfBirth.sendKeys("21-07-1994");
        teacherManagementPage.editIsAdvisorTeacher.click();
        teacherManagementPage.editGenderMale.click();
        Driver.clickWithJS(teacherManagementPage.submit);
    }

    @When("Databasede vice dean in ekledigi teacher in goruldugu dogrulanir.")
    public void databasedeViceDeanInEkledigiTeacherInGorulduguDogrulanir() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        System.out.println(isim);
        resultSet = statement.executeQuery("SELECT name FROM TEACHER where name='" + isim + "';");
        resultSet.next();
        System.out.println(resultSet.getString(1));

        Assert.assertEquals(isim, resultSet.getString(1));
    }



//    @Then("Databaseden olusturulan teacher bilgileri sorgulanir")
//    public void databasede_vice_deanin_ekledigi_teacher_in_goruldugu_dogrulanir() {
//        teacherBirtdaylist = Collections.singletonList(DBUtils.getQueryResultList("select birth_day from teacher"));
//        teacherBirthPlacelist = Collections.singletonList(DBUtils.getQueryResultList("select birth_place from teacher"));
//        teacherNamelist = Collections.singletonList(DBUtils.getQueryResultList("select name from teacher"));
//        teacherUsernamelist = Collections.singletonList(DBUtils.getQueryResultList("select username from teacher"));
//        teacherSurnamelist = Collections.singletonList(DBUtils.getQueryResultList("select surname from teacher"));
//        teacherSsnlist = Collections.singletonList(DBUtils.getQueryResultList("select ssn from teacher"));
//        teacherPasswordlist = Collections.singletonList(DBUtils.getQueryResultList("select password from teacher"));
//        teacherPhonelist = Collections.singletonList(DBUtils.getQueryResultList("select phone_number from teacher"));
//    }
//
//    @Then("Databasede vice deanin ekledigi teacher in goruldugu dogrulanir.")
//    public void databasedeViceDeaninEkledigiTeacherInGorulduguDogrulanir() {
//        Assert.assertTrue(teacherNamelist.toString().contains(nameFaker()));
//        assert teacherSurnamelist.toString().contains(surname);
//        assert teacherBirthPlacelist.toString().contains(birthplace);
//        assert teacherPhonelist.toString().contains(phone);
//        assert teacherUsernamelist.toString().contains(username);
//        assert teacherBirtdaylist.toString().contains("01.09.1998");
//        assert teacherSsnlist.toString().contains(Ssn);
//
//    }



}
