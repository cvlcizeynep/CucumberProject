package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import pojos.StudentObjectPojo;
import pojos.StudentOutherPojo;
import pojos.StudentRequestPojo;

import static base_url.StudentManagementBaseUrl.*;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.FakerUtils.*;



public class US25 {
    Response response;
    StudentObjectPojo object ;
    StudentOutherPojo expectedData;
    StudentRequestPojo request;
    @Given("Admin butun gerekli alanlari doldurur ve ogrenci ekleyebilmelidir")
    public void admin_butun_gerekli_alanlari_doldurur_ve_ogrenci_ekleyebilmelidir() {
        adminSetUp();
        spec.pathParams("first", "students", "second", "save");
        nameFaker();
        surnameFaker();
        usernameFaker();
        phoneNumberFaker();
        emailFaker();
        birthPlaceFaker();

        request = new StudentRequestPojo(251,"1990-01-01",birthPlaceFaker(),emailFaker(),nameFaker(),"MALE",nameFaker(),nameFaker(),passwordFaker(),
                phoneNumberFaker(),ssnFaker(),surnameFaker(),usernameFaker());
        System.out.println(request);
    }
    @Then("eklenen ogrencinin olustunu dogrular")
    public void eklenen_ogrencinin_olustunu_dogrular() {
        response = given(spec).body(request).when().post("{first}/{second}");
        response.prettyPrint();
        expectedData = response.as(StudentOutherPojo.class);
        assertEquals(200,response.getStatusCode());
        assertEquals("Student saved Successfully",expectedData.getMessage());

    }
}
