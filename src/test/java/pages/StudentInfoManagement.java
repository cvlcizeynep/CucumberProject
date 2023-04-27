package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentInfoManagement {
public StudentInfoManagement(){


        PageFactory.initElements(Driver.getDriver(),this);}

@FindBy(xpath = "//*[@aria-controls='offcanvasNavbar-expand-false']")
public WebElement menuStudentInfo;
@FindBy(xpath = "(//a[@role='button'])[10]")
public WebElement studentInfoManagmentButtonStudentInfo;
@FindBy(xpath = "//html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/span[1]/button[1]")
public WebElement ilkEditStudentInfo;
@FindBy(xpath = "(//*[@class='fa-solid fa-trash'])[1]")
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

    @FindBy(xpath = "//*[@class='table table-striped table-bordered table-hover']")
    public WebElement table;

    @FindBy(xpath = "(//*[@type='button'])[11]")
    public WebElement submitStudentInfo;
    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click']")
    public WebElement pleaseenterabsentee;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']/div[1]")
    public WebElement deleteyazisi;


}
