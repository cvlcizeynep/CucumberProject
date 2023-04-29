package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.Given;

import static base_url.StudentManagementBaseUrl.spec;
import static base_url.StudentManagementBaseUrl.teacherSetUp;

public class US19 {
    @Given("kullanici toplanti olusturmak icin post request gonderir ve validation yapar")
    public void kullanici_toplanti_olusturmak_icin_post_request_gonderir_ve_validation_yapar() {
        teacherSetUp();
        ///meet/save
        spec.pathParams("first","meet","second","save");


    }




}
