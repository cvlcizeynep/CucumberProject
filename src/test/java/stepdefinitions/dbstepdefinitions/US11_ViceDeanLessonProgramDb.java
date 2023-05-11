package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US11_ViceDeanLessonProgramDb {
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
