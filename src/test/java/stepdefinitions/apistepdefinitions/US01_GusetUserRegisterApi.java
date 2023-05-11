package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.GuestUserObjectPojo;
import pojos.GuestUserOutherPojo;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static base_url.StudentManagementBaseUrl.adminSetUp;
import static base_url.StudentManagementBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static utilities.FakerUtils.*;

public class US01_GusetUserRegisterApi {
    Response response;
    GuestUserObjectPojo object;
    GuestUserOutherPojo expectedData;
    Faker faker = new Faker();
    String ssn = faker.number().numberBetween(100, 999) + "-" +
            faker.number().numberBetween(10, 99) + "-" + faker.number().numberBetween(1000, 9999);
    String username = faker.name().username();
    String ssn2="000-00-0000";
    String ssn3="";

    @Given("Admin Guest User List olusturmak icin post request gonderir US01")
    public void admin_guest_user_list_olusturmak_icin_post_request_gonderir_us01() {

        adminSetUp();
        spec.pathParams("first", "guestUser", "second", "register");
        nameFaker();
        surnameFaker();
        birthPlaceFaker();
        phoneNumberFaker();
        ssnFaker();
        usernameFaker();
        phoneNumberFaker();
        object = new GuestUserObjectPojo(1, "1996-01-01", birthPlaceFaker(), "MALE", nameFaker(), "12345678", phoneNumberFaker(), ssn, surnameFaker(), usernameFaker());
        expectedData = new GuestUserOutherPojo(object, "Guest User Save", "CREATED");
        System.out.println(expectedData);
        response = given().spec(spec).body(object).post("{first}/{second}");
        response.prettyPrint();
    }

    @When("Guest User datayi get request ile dogrular US01")
    public void guest_user_datayi_get_request_ile_dogrular_us01() {
        response.then().statusCode(200).body("object.name", equalTo(expectedData.getObject().getName()),
                "object.phoneNumber", equalTo(expectedData.getObject().getPhoneNumber()),
                "object.ssn", equalTo(expectedData.getObject().getSsn()),
                "object.username", equalTo(expectedData.getObject().getUsername()));

    }

    List<Object> userNameList = new ArrayList<>();

    @Given("Kullanıcı database'de Tc01'de olusturdugu hesabi dogrular")
    public void kullanici_databasede_usernamei_string_olan_hesabin_varligini_dogrular() {
        userNameList = Collections.singletonList(DBUtils.getQueryResultList("select username from guest_user"));
        Assert.assertTrue(userNameList.toString().contains(usernameFaker()));


    }

    @Given("Admin Guest User List olusturmak icin invalid ssn ile post request gonderir US01")
    public void admin_guest_user_list_olusturmak_icin_invalid_ssn_ile_post_request_gonderir_us01() {
        adminSetUp();
        spec.pathParams("first", "guestUser", "second", "register");
        nameFaker();
        surnameFaker();
        birthPlaceFaker();
        phoneNumberFaker();
        ssnFaker();
        usernameFaker();
        phoneNumberFaker();
        object = new GuestUserObjectPojo(1, "1996-01-01", birthPlaceFaker(), "MALE", nameFaker(), "12345678", phoneNumberFaker(), ssn2, surnameFaker(), usernameFaker());
        expectedData = new GuestUserOutherPojo(object, "Guest User Save", "CREATED");
        System.out.println(expectedData);
        response = given().spec(spec).body(object).post("{first}/{second}");
        response.prettyPrint();

    }

    @Given("Admin Guest User List olusturmak icin boş bir ssn ssn ile post request gonderir US01")
    public void admin_guest_user_list_olusturmak_icin_bos_bir_ssn_ssn_ile_post_request_gonderir_us01() {
        adminSetUp();
        spec.pathParams("first", "guestUser", "second", "register");
        nameFaker();
        surnameFaker();
        birthPlaceFaker();
        phoneNumberFaker();
        ssnFaker();
        usernameFaker();
        phoneNumberFaker();
        object = new GuestUserObjectPojo(1, "1996-01-01", birthPlaceFaker(), "MALE", nameFaker(), "12345678", phoneNumberFaker(), ssn3, surnameFaker(), usernameFaker());
        expectedData = new GuestUserOutherPojo(object, "Guest User Save", "CREATED");
        System.out.println(expectedData);
        response = given().spec(spec).body(object).post("{first}/{second}");
        response.prettyPrint();
    }

    @When("Guest User invalid ssn ile datayi get request ile dogrulayamaz US01")
    public void guest_user_invalid_ssn_ile_datayi_get_request_ile_dogrulayamaz_us01() {
        response.then().statusCode(400);
    }



    @When("Guest User bos ssn ile  datayi get request ile dogrulayamaz US01")
    public void guest_user_bos_ssn_ile_datayi_get_request_ile_dogrulayamaz_us01() {
        response.then().statusCode(400);
    }

}