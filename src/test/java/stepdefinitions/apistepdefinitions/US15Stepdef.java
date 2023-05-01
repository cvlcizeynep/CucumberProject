package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import pojos.StudentObjectPojo;
import pojos.StudentOutherPojo;
import utilities.FakerUtils;

import static base_url.StudentManagementBaseUrl.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static utilities.FakerUtils.*;


public class US15Stepdef {
    Response response;
    Faker faker;
    StudentObjectPojo object;
    StudentOutherPojo expectedData;



    @Given("Vice Dean butun gerekli alanlari doldurur ve ogrenci ekleyebilmelidir")
    public void vice_dean_butun_gerekli_alanlari_doldurur_ve_ogrenci_ekleyebilmelidir() {
        Faker faker = new Faker();
        viceDeanSetUp();
        spec.pathParams("first", "students", "second", "save");


//        String name = faker.name().firstName();
//        String fathername = faker.name().firstName();
//        String mothername = faker.name().firstName();
//        String surname = faker.name().lastName();
//        String username = faker.name().username();
//        String gender = "Male";
//        String Advisor_Teacher = "249";
//        String email = faker.internet().emailAddress();
//        String password = faker.internet().password();
//        String birthPlace = faker.address().city();
//        String birthDay = "01.01.1990";
//        String passwordd = faker.bothify("a1S#f??rQ");
//
//        String phoneNumber = faker.phoneNumber().phoneNumber().replaceAll("[^0-9]", "");
//        String formattedPhoneNumber = String.format("%s-%s-%s",
//                phoneNumber.substring(0, 3),
//                phoneNumber.substring(3, 6),
//                phoneNumber.substring(6, 10)
//        );
//        String ssn = faker.idNumber().ssnValid().replaceAll("[^0-9]", "");
//        String formattedSSN = ssn.substring(0, 3) + "-" + ssn.substring(3, 5) + "-" + ssn.substring(5, 9);

        //Set the url


        //http://164.92.252.42:8080/students/save
        nameFaker();

         object = new StudentObjectPojo(251,usernameFaker(),nameFaker(),surnameFaker(),"01.01.1990", birthPlaceFaker(), phoneNumberFaker(), "MALE", 1234, nameFaker()
                , nameFaker(),emailFaker(), true);
         expectedData = new StudentOutherPojo(object, "Student saved Successfully");
      //  System.out.println(expectedData);
        Response response = given(spec).body(expectedData).when().post("{first}/{second}");

        response.prettyPrint();
    }

//    @Then("eklen ogrencinin olustunu dogrular")
//    public void eklen_ogrencinin_olustunu_dogrular() {
//       response.then().statusCode(200).
//              body("object.username",equalTo(expectedData.getObject().getUsername()));

   // }


}
