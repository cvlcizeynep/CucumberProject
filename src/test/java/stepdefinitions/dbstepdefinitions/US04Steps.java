package stepdefinitions.dbstepdefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DeanManagementPage;
import pages.MeetManagementPage;
import utilities.DBUtils;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class US04Steps {
    List<Object> deanbirtdaylist= new ArrayList<>();
    List<Object> deanNamelist= new ArrayList<>();
    List<Object> deanSurnamelist= new ArrayList<>();
    List<Object> deanPhonelist= new ArrayList<>();
    List<Object> deanSsnlist= new ArrayList<>();
    List<Object> deanUsernamelist= new ArrayList<>();
    List<Object> deanPasswordlist= new ArrayList<>();
    List<Object> deanBirthPlacelist= new ArrayList<>();
   DeanManagementPage deanManagementPage=new DeanManagementPage();
    Faker faker = new Faker();
    String name = faker.name().firstName();
    String surname = faker.name().lastName();
    String username = faker.name().username();
    String birthplace = faker.address().city();
    String phone = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(1000, 9999);
    String Ssn = faker.number().numberBetween(100, 999) + "-" + faker.number().numberBetween(10, 99) + "-" + faker.number().numberBetween(1000, 9999);
    String password = faker.internet().password(8, 17);
    @Given("Kullanici Dean ekler")
    public void kullanici_dean_ekler() {

        deanManagementPage.MenuButton.click();
        deanManagementPage.DeanManagementButton.click();
        deanManagementPage.NameButton.sendKeys(name);
        deanManagementPage.SurnameButton.sendKeys(surname);
        deanManagementPage.BirthplaceButton.sendKeys(birthplace);
        deanManagementPage.MaleButton.click();
        deanManagementPage.DateOfBirthButton.sendKeys("2000-01-01");
        deanManagementPage.PhoneNumberButton.sendKeys(phone);
        deanManagementPage.SsnButton.sendKeys(Ssn);
        deanManagementPage.UserNameButton.sendKeys(username);
        deanManagementPage.PasswordButton.sendKeys(password);
        deanManagementPage.SubmitButton.click();


    }
    @When("Databaseden olusturulan dean bilgileri sorgulanir")
    public void databaseden_olusturulan_dean_bilgileri_sorgulanir() {
        deanbirtdaylist= Collections.singletonList(DBUtils.getQueryResultList("select birth_day from dean"));
        deanBirthPlacelist= Collections.singletonList(DBUtils.getQueryResultList("select birth_place from dean"));
        deanNamelist= Collections.singletonList(DBUtils.getQueryResultList("select name from dean"));
        deanUsernamelist= Collections.singletonList(DBUtils.getQueryResultList("select username from dean"));
        deanSurnamelist= Collections.singletonList(DBUtils.getQueryResultList("select surname from dean"));
        deanSsnlist= Collections.singletonList(DBUtils.getQueryResultList("select ssn from dean"));
        deanPasswordlist= Collections.singletonList(DBUtils.getQueryResultList("select password from dean"));
        deanPhonelist= Collections.singletonList(DBUtils.getQueryResultList("select phone_number from dean"));

    }
    @Then("Databasede adminin ekledigi deanin goruldugu dogrulanir.")
    public void databasede_adminin_ekledigi_deanin_goruldugu_dogrulanir() {
        assert deanNamelist.toString().contains(name);
        assert deanSurnamelist.toString().contains(surname);
        assert  deanBirthPlacelist.toString().contains(birthplace);
        assert deanPhonelist.toString().contains(phone);
        assert deanUsernamelist.toString().contains(username);
        assert deanSsnlist.toString().contains(Ssn);
    }

}
