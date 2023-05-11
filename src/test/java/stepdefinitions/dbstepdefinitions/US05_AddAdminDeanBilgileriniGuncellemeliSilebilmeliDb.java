package stepdefinitions.dbstepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pages.DeanManagementPage;
import pojos.DeanObjectPojo;
import pojos.DeanPojo;
import utilities.ConfigReader;
import utilities.DBUtils;
import utilities.Driver;
import utilities.ReusableMethods;

import java.sql.*;
import java.util.*;

import static base_url.StudentManagementBaseUrl.adminSetUp;
import static base_url.StudentManagementBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class US05_AddAdminDeanBilgileriniGuncellemeliSilebilmeliDb {
    Response response;
    DeanObjectPojo object;
    DeanPojo expectedData;

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

    @Given("Kullanici Dean bilgisi ekler")
    public void kullanici_dean_bilgisi_ekler() {
        ReusableMethods.login(ConfigReader.getProperty("adminUserName"),ConfigReader.getProperty("adminPassword"));
        deanManagementPage.MenuButton.click();
        deanManagementPage.DeanManagementButton.click();
        deanManagementPage.NameButton.sendKeys(name);
        deanManagementPage.SurnameButton.sendKeys(surname);
        deanManagementPage.BirthplaceButton.sendKeys(birthplace);
        deanManagementPage.MaleButton.click();
        deanManagementPage.DateOfBirthButton.sendKeys("2000-01-01");
        deanManagementPage.PhoneNumberButton.sendKeys(phone);
        deanManagementPage.SsnButton.sendKeys(Ssn);
        deanManagementPage.UserNameButton.sendKeys("hayat_guzel");
        deanManagementPage.PasswordButton.sendKeys(password);
        deanManagementPage.SubmitButton.click();
        Driver.closeDriver();




    }
    @When("Databaseden olusturulan dean bilgileri sorgulanir ve dogrulanir")
    public void databaseden_olusturulan_dean_bilgileri_sorgulanir_ve_dogrulanir() {
        deanbirtdaylist= Collections.singletonList(DBUtils.getQueryResultList("select birth_day from dean"));
        deanBirthPlacelist= Collections.singletonList(DBUtils.getQueryResultList("select birth_place from dean"));
        deanNamelist= Collections.singletonList(DBUtils.getQueryResultList("select name from dean"));
        deanUsernamelist= Collections.singletonList(DBUtils.getQueryResultList("select username from dean"));
        deanSurnamelist= Collections.singletonList(DBUtils.getQueryResultList("select surname from dean"));
        deanSsnlist= Collections.singletonList(DBUtils.getQueryResultList("select ssn from dean"));
        deanPasswordlist= Collections.singletonList(DBUtils.getQueryResultList("select password from dean"));
        deanPhonelist= Collections.singletonList(DBUtils.getQueryResultList("select phone_number from dean"));

    //dogrulama
//        assert deanNamelist.toString().contains(name);
//        assert deanSurnamelist.toString().contains(surname);
//        assert  deanBirthPlacelist.toString().contains(birthplace);
//        assert deanPhonelist.toString().contains(phone);
//        assert deanUsernamelist.toString().contains(username);
//        assert deanSsnlist.toString().contains(Ssn);

    }
    @Given("Dean datayi put reguest ile gunceller.")
    public void dean_datayi_put_reguest_ile_gunceller() {


        faker =new Faker();
        String name=faker.name().name();
        String phoneNumber=faker.phoneNumber().phoneNumber().replaceAll("[^0-9]", "");
        phoneNumber = String.format("%s-%s-%s",
                phoneNumber.substring(0, 3),
                phoneNumber.substring(3, 6),
                phoneNumber.substring(6, 10));
        String usernames=faker.name().username();
        String ssn=faker.idNumber().ssnValid().replaceAll("[^0-9]","");
        String SSN=ssn.substring(0,3)+"-"+ssn.substring(3,5)+"-"+ssn.substring(5,9);

        adminSetUp();
        spec.pathParams("first","dean","second","update","third",747);
        object=new DeanObjectPojo("2000-01-02","London", "MALE","hayat","12345678",phoneNumber,SSN,"abcdef","hayat_guzel");
        expectedData=new DeanPojo(object,"Dean updated Successful","OK");
        System.out.println(expectedData);

        response=given().spec(spec).body(object).put("{first}/{second}/{third}");
        response.prettyPrint();
        ReusableMethods.waitFor(2);


    }




    @When("Databaseden guncellenen dean bilgileri sorgulanir ve dogrulanir")
    public void databaseden_guncellenen_dean_bilgileri_sorgulanir_ve_dogrulanir() {
        deanUsernamelist= Collections.singletonList(DBUtils.getQueryResultList("select username from dean"));
        assertTrue( deanUsernamelist.toString().contains("hayat_guzel"));
        ReusableMethods.waitFor(2);
    }


    @Given("Dean datayi delete request ile siler.")
    public void dean_datayi_delete_request_ile_siler() throws SQLException {
        //**********************id 'yi dinamik almak için*************
        DBUtils.createConnection();
        Statement st = DBUtils.createStatement();
        String query = ("SELECT * FROM dean WHERE username = 'hayat_guzel'");
        ResultSet rs = st.executeQuery(query);
        List<Object> id = new ArrayList<>();
        while(rs.next()){
            id.add(rs.getString(1));
        }
        System.out.println("id " + id);
        int yeniid = Integer.parseInt((String) id.get(0));
        System.out.println("yeniid " + yeniid);
        ReusableMethods.waitFor(3);

        adminSetUp();
        spec.pathParams("first","dean","second","delete","third",yeniid);
        Map<String,String> expecteddata=new HashMap<>();
        expecteddata.put("message","Dean Deleted");
        expecteddata.put("httpStatus","OK");
        System.out.println(expecteddata);

        Response response=given(spec).delete("{first}/{second}/{third}");
        response.prettyPrint();
       // response.then().statusCode(200).body("message",equalTo("Dean Deleted"));

        ReusableMethods.waitFor(2);

    }
    @When("Databaseden silinen dean bilgileri sorgulanir ve dogrulanir")
    public void databaseden_silinen_dean_bilgileri_sorgulanir_ve_dogrulanir() {
        deanUsernamelist= Collections.singletonList(DBUtils.getQueryResultList("select username from dean"));
        assertFalse( deanUsernamelist.toString().contains("hayat_guzel"));


    }



}