package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.StudentSavePojo;

import static base_url.StudentManagementBaseUrl.*;
import static io.restassured.RestAssured.given;


public class US15Stepdef {
    Response response;
    Faker faker ;

    StudentSavePojo object;

    @Given("Vice Dean butun gerekli alanlari doldurur ve ogrenci ekleyebilmelidir")
    public void viceDeanButunGerekliAlanlariDoldururVeOgrenciEkleyebilmelidir() {
        faker=new Faker();
        viceDeanSetUp();
        spec.pathParams("first", "students", "second", "save");


        String name = faker.name().firstName();
        String fathername = faker.name().firstName();
        String mothername = faker.name().firstName();
        String surname = faker.name().lastName();
        String username = faker.name().username();
        String gender = "Male";
        String Advisor_Teacher = "249";
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();
        String birthPlace = faker.address().city();
        String birthDay = "01.01.1990";
        String passwordd = faker.bothify("a1S#f??rQ");

        String phoneNumber = faker.phoneNumber().phoneNumber().replaceAll("[^0-9]", "");
        String formattedPhoneNumber = String.format("%s-%s-%s",
                phoneNumber.substring(0, 3),
                phoneNumber.substring(3, 6),
                phoneNumber.substring(6, 10)
        );
        String ssn = faker.idNumber().ssnValid().replaceAll("[^0-9]", "");
        String formattedSSN=ssn.substring(0,3)+"-"+ssn.substring(3,5)+"-"+ssn.substring(5,9);

        response=given().spec(spec).body(object).post("{first}/{second}");
        response.prettyPrint();
        //Set the url

        /*
         public static void viceDeanSetUp() {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization",  generateTokenVicedean()).
                setBaseUri(ConfigReader.getProperty("APIURL")).build();
    }
         */
       //http://164.92.252.42:8080/students/save

        StudentSavePojo object = new StudentSavePojo(249,
               birthDay,birthPlace,email,fathername,gender,mothername,name,password,phoneNumber,formattedSSN,surname
        ,username);
        Response response = given().spec(spec).body(object).when().put("/{first}/{second}");
        System.out.println(object);
        response.prettyPrint();

    }

    @Then("eklen ogrencinin olustunu dogrular")
    public void eklenOgrencininOlustunuDogrular() {
    }
}
