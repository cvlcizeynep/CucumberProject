package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static base_url.StudentManagementBaseUrl.*;
import static io.restassured.RestAssured.given;


public class US15Stepdef {
    Response response;
    Faker faker = new Faker();
    String name = faker.name().firstName();
    String surname = faker.name().lastName();
    String username = faker.name().username();
    String email = faker.internet().emailAddress();
    String password = faker.internet().password();
    String phoneNumber = faker.phoneNumber().phoneNumber().replaceAll("[^0-9]", "");
    String formattedPhoneNumber = String.format("%s-%s-%s",
            phoneNumber.substring(0, 3),
            phoneNumber.substring(3, 6),
            phoneNumber.substring(6, 10)
    );
    String ssn = faker.idNumber().ssnValid().replaceAll("[^0-9]", "");
    String formattedSSN=ssn.substring(0,3)+"-"+ssn.substring(3,5)+"-"+ssn.substring(5,9);

    @Given("Vice Dean butun gerekli alanlari doldurur ve ogrenci ekleyebilmelidir")
    public void viceDeanButunGerekliAlanlariDoldururVeOgrenciEkleyebilmelidir() {

        //Set the url
        studentSetUp();
        //adminSetUp();//http://164.92.252.42:8080/students/save
        spec.pathParams("first", "students", "second", "save");
        Response response = given().spec(spec).when().put("/{first}/{second}");
            response.prettyPrint();


    }

    @Then("eklen ogrencinin olustunu dogrular")
    public void eklenOgrencininOlustunuDogrular() {
    }
}
