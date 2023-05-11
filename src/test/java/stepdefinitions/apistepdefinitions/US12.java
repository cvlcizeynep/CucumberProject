package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.*;

import java.util.ArrayList;

import static base_url.StudentManagementBaseUrl.spec;
import static base_url.StudentManagementBaseUrl.viceDeanSetUp;
import static io.restassured.RestAssured.given;

public class US12 {
    Response response;
    LessonProgramPojo expectedData;
    LessonProgramAuthorPojo expectedDataOuther;
    LessonProgramAuthorPojo object;
    Faker faker =new Faker();
    int num =faker.number().numberBetween(1,30);

    @Given("ViceDean ders programı olusturmak icin post request gonderir US12")
    public void vice_dean_ders_programı_olusturmak_icin_post_request_gonderir_us12() {
        viceDeanSetUp();
        spec.pathParams("first", "lessonPrograms", "second", "save");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        Faker faker = new Faker();

        LessonProgramPojo expectedData = new LessonProgramPojo("MONDAY", 1, list, "22:01", "22:02");

        Response response = spec.given().body(expectedData).when().post("first/second");
        response.prettyPrint();

    }


    @When("Guest User datayi get request ile dogrular US12")
    public void guest_user_datayi_get_request_ile_dogrular_us12() {

    }



    @Given("ViceDean TC01'de olusturulan dersin bilgilerini girerek dersi görür US12")
    public void vice_dean_tc01_de_olusturulan_dersin_bilgilerini_girerek_dersi_görür_us12() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @Given("ViceDean TC01'de oluşturulan derse bir öğretmen atar US12")
    public void vice_dean_tc01_de_oluşturulan_derse_bir_öğretmen_atar_us12() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
