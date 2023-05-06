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
    StudentObjectPojo object;
    StudentOutherPojo expectedData;



    @Given("Vice Dean butun gerekli alanlari doldurur ve ogrenci ekleyebilmelidir")
    public void vice_dean_butun_gerekli_alanlari_doldurur_ve_ogrenci_ekleyebilmelidir() {

        viceDeanSetUp();
        spec.pathParams("first", "students", "second", "save");

        nameFaker();
        surnameFaker();
        usernameFaker();
        phoneNumberFaker();
        emailFaker();
        birthPlaceFaker();



         object = new StudentObjectPojo(251,"ibrahim",nameFaker(),surnameFaker(),"01-01-1991", birthPlaceFaker(), phoneNumberFaker(), "MALE", 1234, nameFaker()
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
