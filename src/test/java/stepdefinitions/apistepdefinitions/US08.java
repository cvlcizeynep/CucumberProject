package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.LessonPojo;
import pojos.MessagePojo;
import utilities.JsonUtil;

import static base_url.StudentManagementBaseUrl.specVicedean;
import static base_url.StudentManagementBaseUrl.viceDeanSetUp;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US08 {
    LessonPojo expected;

    Response response;

    int creditScore = Faker.instance().number().numberBetween(1, 100);
    String lessonm = Faker.instance().programmingLanguage().name();

    @Given("user sends post request for lesson data")
    public void user_sends_post_request_for_lesson_data() {
        viceDeanSetUp();
        specVicedean.pathParams("first", "lessons", "second", "save");

        expected=new LessonPojo("true","25",lessonm);
        System.out.println("expected = " + expected);

        response = given(specVicedean).body(expected).post("{first}/{second}");
        response.prettyPrint();


    }

    @Then("user gets the lesson data and assert")
    public void user_gets_the_lesson_data_and_assert() {
        assertEquals(200, response.statusCode());
        JsonPath jsonPath=response.jsonPath();
        assertEquals(expected.getLessonName(),jsonPath.getString("object.lessonName"));
        assertEquals(expected.getCreditScore(),jsonPath.getString("object.creditScore"));
        assertEquals(expected.getCompulsory(),jsonPath.getString("object.compulsory"));
        assertEquals("Lesson Created",jsonPath.getString("message"));
        assertEquals("OK",jsonPath.getString("httpStatus"));



    }
}
