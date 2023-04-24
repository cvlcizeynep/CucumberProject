package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LessonsManagementPage {
    public LessonsManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //asli hanim,muammer bey,
    @FindBy(id ="controlled-tab-example-tab-lessonsList") public WebElement lessons;
    @FindBy(id ="lessonName")  public WebElement lessonName;
    @FindBy(id="compulsory") public WebElement compulsory;
    @FindBy(id="Submit") public WebElement submit;
    @FindBy(id="creditScore") public WebElement creditScore;

    @FindBy(xpath="//div[@class='Toastify__toast-body']") public WebElement lessonDersOluşturulduMesaji;
    @FindBy(xpath="//*[@class='Toastify__toast-body']") public WebElement lessonhataMesaji;



    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement LessonProgramButton;
    @FindBy(xpath = "//h5[normalize-space()='Lesson Program List']")
    public WebElement LessonProgramListBaslik;
    @FindBy(xpath = "//div[@class='col']//th[contains(text(),'Day')]")
    public WebElement LessonProgramListDayYazisi;
    @FindBy(xpath = "//div[@class='col']//th[contains(text(),'Start Time')]")
    public WebElement LessonProgramListStartTimeYazisi;

    @FindBy(xpath = "//div[@class='col']//th[contains(text(),'Stop Time')]")
    public WebElement LessonProgramListStopTimeYazisi;
    @FindBy(xpath = "//a[normalize-space()='Lesson Management']")
    public WebElement LessonManagement;















  //Asli
  @FindBy(xpath="//div[@id='controlled-tab-example-tabpane-lessonsList']//span[@aria-hidden='true'][normalize-space()='»']")
  public WebElement sagOkTusu;
@FindBy(xpath="//span[normalize-space()='histoloji']")
    public WebElement histoloji;
@FindBy(xpath = "//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[10]/td[2]/span[1]")
public WebElement compulsoryYes;
@FindBy(xpath="//span[normalize-space()='3']")
public  WebElement creditScore3;
@FindBy(xpath = "//tbody/tr[3]/td[4]/span[1]/button[1]/i[1]")
public WebElement silmeButonu_asl;
@FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement lessonsSecenek;
@FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-lessonsList']//span[@aria-hidden='true'][contains(text(),'›')]")
    public WebElement sagTus_asli;
@FindBy(xpath = "//button[@class='nav-link active']")
    public WebElement lessonProgram_asl;
    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    public WebElement selectLesson_asl;
    @FindBy(xpath = "//select[@id='term']")
    public WebElement educationTerm_asl;
    @FindBy(xpath = "//select[@id='day']")
    public WebElement chooseDay_asl;
    @FindBy(xpath ="//input[@id='startTime']")
    public WebElement startTime_asl;
    @FindBy(xpath = "//input[@id='stopTime']")
    public WebElement stopTime_asl;

}
