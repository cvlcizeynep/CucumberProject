package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.LessonObjectPojo;
import pojos.LessonPojo;

import static base_url.StudentManagementBaseUrl.*;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US08 {
    LessonPojo expected;
    LessonObjectPojo lessonObjectPojo;
    Response response;

    int creditScore = Faker.instance().number().numberBetween(1, 100);
    String lessons = Faker.instance().programmingLanguage().name();

    @Given("user sends post request for lesson data")
    public void user_sends_post_request_for_lesson_data() {
        viceDeanSetUp();
        spec.pathParams("first", "lessons", "second", "save");

        lessonObjectPojo=new LessonObjectPojo(63,lessons,creditScore,"dvdfegvdfehdvdfgdgdfdfdgdfg");
        expected=new LessonPojo(lessonObjectPojo,"Lesson Created","OK");
        System.out.println("expected = " + expected);

        response = given(spec).body(expected).post("{first}/{second}");
        response.prettyPrint();


    }

    @Then("user gets the lesson data and assert")
    public void user_gets_the_lesson_data_and_assert() {
        assertEquals(200, response.statusCode());
        JsonPath jsonPath=response.jsonPath();
        assertEquals(expected.getObject().getLessonName(),jsonPath.getString("object.lessonName"));
        assertEquals(expected.getObject().getCreditScore(),jsonPath.getString("object.creditScore"));
        assertEquals(expected.getObject().getLessonName(),jsonPath.getString("object.lessonName"));
        assertEquals(expected.getObject().getCompulsory(),jsonPath.getString("object.compulsory"));
        assertEquals("Lesson Created",jsonPath.getString("message"));
        assertEquals("OK",jsonPath.getString("httpStatus"));



    }
}
