package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import pojos.MeetResponsePojo;


import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static base_url.StudentManagementBaseUrl.spec;
import static base_url.StudentManagementBaseUrl.teacherSetUp;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class US19_AddMeetApi {
    @Given("kullanici toplanti olusturmak icin post request gonderir ve validation yapar")
    public void kullanici_toplanti_olusturmak_icin_post_request_gonderir_ve_validation_yapar() {
        teacherSetUp();
        spec.pathParams("first","meet","second","save");

        ArrayList<Integer> studentId=new ArrayList<>();
        studentId.add(63);
        Faker faker = new Faker();
        LocalDate date = faker.date().future(365, java.util.concurrent.TimeUnit.DAYS).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date.format(formatter);

        MeetResponsePojo body=new MeetResponsePojo(formattedDate,"toplanti","22:00","22:01",studentId);

        Response response= given(spec).body(body).when().post("{first}/{second}");
        response.prettyPrint();


        response. then().
                assertThat().
                statusCode(200).
                body("message", equalTo("Meet Saved Successfully")).
                body("object.description", equalTo("toplanti")).
                body("object.date", equalTo(formattedDate)).
                body("object.startTime", equalTo("22:00:00")).
                body("object.stopTime", equalTo("22:01:00")).
                body("object.students[0].id", equalTo(63)).
                body("object.students[0].name", equalTo("namesiz")).
                body("object.students[0].surname", equalTo("surname")).
                body("object.students[0].email", equalTo("aabbcc@gmai.com"));



    }




}
