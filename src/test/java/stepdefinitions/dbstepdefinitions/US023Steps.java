package stepdefinitions.dbstepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactGellAllPage;
import pages.DeanManagementPage;
import pages.ViceDeanManagement;
import utilities.DBUtils;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US023Steps {
ViceDeanManagement viceDeanManagement;
    ContactGellAllPage contactGellAllPage;
    DeanManagementPage deanManagementPage;
    List<Object> vicebirtdaylist= new ArrayList<>();
    List<Object>viceNamelist= new ArrayList<>();
    List<Object>viceSurnamelist= new ArrayList<>();
    List<Object>vicePhonelist= new ArrayList<>();
    List<Object>viceSsnlist= new ArrayList<>();
    List<Object>viceUsernamelist= new ArrayList<>();
    List<Object>vicePasswordlist= new ArrayList<>();
    List<Object>viceBirthPlacelist= new ArrayList<>();

    Faker faker=new Faker();
    String name=faker.name().firstName();
    String lastname=faker.name().lastName();
    String birthplace = faker.address().city();
    String phone=faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(1000,9999);
    String Ssn=faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(10,99)+"-"+faker.number().numberBetween(1000,9999);
    String usename=faker.name().username();
    String password=faker.internet().password(8,17);


    @When("Admin Dean ekler")
    public void admin_dean_ekler() {
        contactGellAllPage=new ContactGellAllPage();
        deanManagementPage=new DeanManagementPage();
        viceDeanManagement=new ViceDeanManagement();
         Driver.clickWithJS(deanManagementPage.MenuButton);
        ReusableMethods.waitFor(1);
        contactGellAllPage.viceDeanManagement.click();
        ReusableMethods.waitFor(1);
         viceDeanManagement.name.sendKeys(name);
        viceDeanManagement.surName.sendKeys(lastname);
        viceDeanManagement.birtDate.sendKeys("09091999");
        viceDeanManagement.birthPlace.sendKeys(birthplace);
        viceDeanManagement.male.click();
        viceDeanManagement.phone.sendKeys(phone);
        viceDeanManagement.SSN.sendKeys(Ssn);
        viceDeanManagement.userName.sendKeys(usename);
        viceDeanManagement.password.sendKeys(faker.internet().password(8,17));
        viceDeanManagement.submit.click();
        ReusableMethods.waitFor(3);
        Driver.closeDriver();

    }
    @When("Databaseden adminin olusturdugu vice dean bilgileri sorgulanir")
    public void databaseden_adminin_olusturdugu_vice_dean_bilgileri_sorgulanir() {
        vicebirtdaylist= Collections.singletonList(DBUtils.getQueryResultList("select birth_day from vice_dean"));
        viceBirthPlacelist= Collections.singletonList(DBUtils.getQueryResultList("select birth_place from vice_dean"));
        viceNamelist= Collections.singletonList(DBUtils.getQueryResultList("select name from vice_dean"));
        viceUsernamelist= Collections.singletonList(DBUtils.getQueryResultList("select username from vice_dean"));
        viceSurnamelist= Collections.singletonList(DBUtils.getQueryResultList("select surname from vice_dean"));
        viceSsnlist= Collections.singletonList(DBUtils.getQueryResultList("select ssn from vice_dean"));
        vicePasswordlist= Collections.singletonList(DBUtils.getQueryResultList("select password from vice_dean"));
        vicePhonelist= Collections.singletonList(DBUtils.getQueryResultList("select phone_number from vice_dean;"));


    }
    @Then("Databaseden adminin ekledigi vice deanin goruldugu dogrulanir.")
    public void databaseden_adminin_ekledigi_vice_deanin_goruldugu_dogrulanir() {
        assert viceNamelist.toString().contains(name);
        assert viceSurnamelist.toString().contains(lastname);
        assert  viceBirthPlacelist.toString().contains(birthplace);
        assert vicePhonelist.toString().contains(phone);
        //assert vicePasswordlist.toString().contains(password);
        assert viceUsernamelist.toString().contains(usename);
        assert viceSsnlist.toString().contains(Ssn);




    }

}
