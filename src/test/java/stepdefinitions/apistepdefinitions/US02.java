package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.GuestUserPojo;

import static base_url.StudentManagementBaseUrl.adminSetUp;
import static base_url.StudentManagementBaseUrl.spec;

public class US02 {
    Response response;
    Faker faker;
    GuestUserPojo Object;


    @Given("Admin Guest User List olusturmak icin post request gonderir")
    public void admin_guest_user_list_olusturmak_icin_post_request_gonderir() {
        faker=new Faker();
        adminSetUp();
        spec.pathParams("first","guest_user","second","save");

    }
    @When("Guest User datayi get request ile dogrular")
    public void guest_user_datayi_get_request_ile_dogrular() {

    }
    @Then("Guest user datayi delete request ile siler")
    public void guest_user_datayi_delete_request_ile_siler() {

    }

}
