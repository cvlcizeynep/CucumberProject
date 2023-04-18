package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentInfoManagement {
    //asli hanim, Emre bey

    public StudentInfoManagement() {


        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@aria-controls='offcanvasNavbar-expand-false']")
    public WebElement menuStudentInfo;
    @FindBy(xpath = "(//a[@role='button'])[10]")
    public WebElement studentInfoManagmentButtonStudentInfo;
    @FindBy(xpath = "//*[@class='text-dark btn btn-outline-info']")
    public WebElement ilkEditStudentInfo;
    @FindBy(xpath = "//*[@class='btn btn-danger']")
    public WebElement ilkDeleteStudentInfo;
    @FindBy(xpath = "(//*[@class='table table-striped table-bordered table-hover'])")
    public WebElement tableStudentInfo;
    @FindBy(xpath = "(//*[@id='lessonId'])[2]")
    public WebElement chooseLessonStudentInfo;
    @FindBy(xpath = "(//*[@id='educationTermId'])[2]")
    public WebElement chooseEducationTermStudentInfo;
    @FindBy(xpath = "(//*[@placeholder='Absentee'])[2]")
    public WebElement absenteeStudentInfo;
    @FindBy(xpath = "(//*[@placeholder='Midterm Exam'])[2]")
    public WebElement midtermStudentInfo;
    @FindBy(xpath = "(//*[@placeholder='Final Exam'])[2]")
    public WebElement finalStudentInfo;
    @FindBy(xpath = "(//*[@placeholder='Info Note'])[2]")
    public WebElement infoNoteStudentInfo;
    @FindBy(xpath = "(//*[@type='button'])[11]")
    public WebElement submitStudentInfo;
    @FindBy(xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement alertStudentInfo;












}
