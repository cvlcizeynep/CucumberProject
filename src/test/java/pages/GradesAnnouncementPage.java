package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GradesAnnouncementPage {
    //Fatmanur hanim


    public GradesAnnouncementPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[text()='Lesson Name']")
    public WebElement lessonName;

    @FindBy(xpath = "//*[text()='Absentee']")
    public WebElement absentee;

    @FindBy(xpath = "//*[text()='Midterm Exam']")
    public WebElement midtermExam;

    @FindBy(xpath = "//*[text()='Final Exam']")
    public WebElement finalExam;

    @FindBy(xpath = "//*[text()='Note']")
    public WebElement note;

    @FindBy(xpath = "//*[text()='Info Note']")
    public WebElement infoNote;

    @FindBy(xpath = "//*[text()='Average']")
    public WebElement average;

    @FindBy(xpath = "//*[text()='Date']")
    public WebElement date;

    @FindBy(xpath = "//*[text()='Start Time']")
    public WebElement startTime;

    @FindBy(xpath = "//*[text()='Stop Time']")
    public WebElement stopTime;

    @FindBy(xpath = "//*[text()='Description']")
    public WebElement description;
}
