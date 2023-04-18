package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentInfoManagement {
    //asli hanim, Emre bey















































































    @FindBy(xpath = "//select[@id='studentId']")
    public WebElement chooseStudent_asl;
    @FindBy(xpath = "//select[@id='lessonId']")
    public WebElement chooseLesson_asl;
    @FindBy(xpath = "//select[@id='educationTermId']")
    public WebElement chooseEducationTerm_asl;
    @FindBy(xpath = "//input[@id='absentee']")
    public WebElement absentee_asl;
    @FindBy(xpath = "//input[@id='midtermExam']")
    public WebElement midtermExam_asl;
    @FindBy(xpath = "//input[@id='finalExam']")
    public WebElement finalExam_asl;
    @FindBy(xpath = "//input[@id='infoNote']")
    public WebElement infoNote_asl;
    @FindBy(xpath = "//button[normalize-space()='Submit']")
    public WebElement submitTeacher_asl;

}
