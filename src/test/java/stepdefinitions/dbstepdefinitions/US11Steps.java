package stepdefinitions.dbstepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ChooseLessonPage;
import pages.LessonsManagementPage;
import pages.LoginPage;
import stepdefinitions.uidefinitions.LoginStepDefinitions;
import utilities.ConfigReader;
import utilities.DBUtils;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static utilities.ReusableMethods.waitFor;

public class US11Steps {
    List<Object> LessonProgramList= new ArrayList<>();

    @Given("kullanici Databaseden ders programini gorebilmelidir.")
    public void kullanici_databaseden_ders_programini_gorebilmelidir() {
        LessonProgramList= Collections.
                singletonList(DBUtils.getQueryResultList("select * from lesson_program WHERE id=525"));
        System.out.println("LessonProgramList = " + LessonProgramList);
    }
    @Then("kullanici ders programini gorundugunu dogrular")
    public void kullanici_ders_programini_gorundugunu_dogrular() {
        assert LessonProgramList.toString().contains("525");
        assert LessonProgramList.toString().contains("MONDAY");
        assert LessonProgramList.toString().contains("11:20");
        assert LessonProgramList.toString().contains("12:00");
    }


}
