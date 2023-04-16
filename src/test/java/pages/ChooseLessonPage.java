package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChooseLessonPage {

    public ChooseLessonPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[text()='Choose Lesson Management']")
    public WebElement chooseLessonManagement;

    @FindBy(xpath = "(//*[text()='Teacher'])[1]")
    public  WebElement teacher;

    @FindBy(xpath = "(//*[text()='Day'])[1]")
    public WebElement day;

    @FindBy(xpath = "(//*[text()='Start Time'])[1]")
    public WebElement startTime;

    @FindBy(xpath = "(//*[text()='Stop Time'])[1]")
    public WebElement stopTime;

    @FindBy(xpath = "(//*[@id='lessonProgramId'])[1]")
    public WebElement ilkDers;

    @FindBy(xpath ="//*[text()='Lesson added to Student']" )
    public WebElement dersEklendiPopUp;

    @FindBy(xpath = "(//*[@type='button'])[5]")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='Lesson Program List']")
    public WebElement LessonProgramList;

    @FindBy(xpath = "(//*[@type='button'])[1]")
    public WebElement menuButton;

    @FindBy(xpath = "//*[text()='Grades and Announcements']")
    public WebElement gradesAnnouncement;

    @FindBy(xpath = "(//*[@id='lessonProgramId'])[3]")
    public WebElement ayniSaatGunDersi;

    @FindBy(xpath = "//*[text()='Error: Course schedule cannot be selected for the same hour and day']")
    public WebElement sameHour_DayPopup;
}
