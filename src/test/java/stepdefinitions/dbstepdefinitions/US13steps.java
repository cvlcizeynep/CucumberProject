package stepdefinitions.dbstepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TeacherManagementPage;
import utilities.DBUtils;
import utilities.Driver;
import utilities.FakerUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static utilities.FakerUtils.*;
import static utilities.ReusableMethods.waitFor;

public class US13steps {
    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();
    List<Object> teacherBirtdaylist = new ArrayList<>();
    List<Object> teacherNamelist = new ArrayList<>();
    List<Object> teacherSurnamelist = new ArrayList<>();
    List<Object> teacherPhonelist = new ArrayList<>();
    List<Object> teacherSsnlist = new ArrayList<>();
    List<Object> teacherUsernamelist = new ArrayList<>();
    List<Object> teacherPasswordlist = new ArrayList<>();
    List<Object> teacherBirthPlacelist = new ArrayList<>();

    Faker faker = new Faker();
    String name = faker.name().firstName();
    String surname = faker.name().lastName();
    String username = faker.name().username();
    String birthplace = faker.address().city();
    String phone = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);
    String Ssn = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(10, 99) + "-" + faker.number().numberBetween(1000, 9999);
    String password = faker.internet().password(8, 17);


    @Given("Kullanici Teacher ekler")
    public void kullanici_teacher_ekler() {
        Driver.clickWithJS(teacherManagementPage.menu);
        Driver.clickWithJS(teacherManagementPage.teacherManagement);
        teacherManagementPage.chooseLessons.click();
        waitFor(2);
        Actions action = new Actions(Driver.getDriver());
        waitFor(2);
        action.keyDown(Keys.ARROW_DOWN).sendKeys("Math", Keys.ENTER).perform();
        teacherManagementPage.name.sendKeys(nameFaker());
        waitFor(2);
        teacherManagementPage.surname.sendKeys(surnameFaker());
        waitFor(2);
        teacherManagementPage.username.sendKeys(usernameFaker());
        waitFor(2);
        teacherManagementPage.birthPlace.sendKeys(birthPlaceFaker());
        waitFor(2);
        teacherManagementPage.dateOfBirth.sendKeys("01.09.1998");
        waitFor(2);
        teacherManagementPage.ssn.sendKeys(ssnFaker());
        waitFor(2);
        teacherManagementPage.phone.sendKeys(phoneNumberFaker());
        waitFor(2);
        teacherManagementPage.password.sendKeys(passwordFaker());
        waitFor(2);
        Driver.clickWithJS(teacherManagementPage.genderMale);
        waitFor(2);
        teacherManagementPage.email.sendKeys(emailFaker());
        waitFor(2);
        Driver.clickWithJS(teacherManagementPage.submit);
        Driver.closeDriver();

    }

    @Then("Databaseden olusturulan teacher bilgileri sorgulanir")
    public void databasede_vice_deanin_ekledigi_teacher_in_goruldugu_dogrulanir() {
        teacherBirtdaylist = Collections.singletonList(DBUtils.getQueryResultList("select birth_day from teacher"));
        teacherBirthPlacelist = Collections.singletonList(DBUtils.getQueryResultList("select birth_place from teacher"));
        teacherNamelist = Collections.singletonList(DBUtils.getQueryResultList("select name from teacher"));
        teacherUsernamelist = Collections.singletonList(DBUtils.getQueryResultList("select username from teacher"));
        teacherSurnamelist = Collections.singletonList(DBUtils.getQueryResultList("select surname from teacher"));
        teacherSsnlist = Collections.singletonList(DBUtils.getQueryResultList("select ssn from teacher"));
        teacherPasswordlist = Collections.singletonList(DBUtils.getQueryResultList("select password from teacher"));
        teacherPhonelist = Collections.singletonList(DBUtils.getQueryResultList("select phone_number from teacher"));
    }

    @Then("Databasede vice deanin ekledigi teacher in goruldugu dogrulanir.")
    public void databasedeViceDeaninEkledigiTeacherInGorulduguDogrulanir() {
        Assert.assertTrue(teacherNamelist.toString().contains(name));
        assert teacherSurnamelist.toString().contains(surname);
        assert teacherBirthPlacelist.toString().contains(birthplace);
        assert teacherPhonelist.toString().contains(phone);
        assert teacherUsernamelist.toString().contains(username);
        assert teacherBirtdaylist.toString().contains("01.09.1998");
        assert teacherSsnlist.toString().contains(Ssn);

    }
}
