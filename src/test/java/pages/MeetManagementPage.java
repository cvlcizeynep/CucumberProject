package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MeetManagementPage {
    //Muammer bey, Nuran hanim


    public MeetManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Menu']")  public WebElement menu;
    @FindBy(xpath = "//a[text()='Meet Management']") public WebElement meet_Management;
    @FindBy(xpath = "//input[@id='date']")  public WebElement date;
    @FindBy(xpath = "//input[@id='startTime']") public WebElement startTime;
    @FindBy(xpath = "//input[@id='stopTime']") public WebElement stopTime;
    @FindBy(xpath = "//input[@id='description']")   public WebElement description;
    @FindBy(xpath = "//button[text()='Submit']")   public WebElement Submit;

    @FindBy(xpath = "//*[@class='fa-solid fa-trash']")   public WebElement meetDelete;
    //*[@class='Toastify__toast-container Toastify__toast-container--top-center']
    @FindBy(xpath = "//button[@class='btn btn-danger']")   public WebElement deleteBasarili;


    @FindBy(xpath = "//*[@class='text-dark btn btn-outline-info']")   public WebElement edit;
    @FindBy(xpath = "//*[text()='must be a later date']")   public WebElement old_date_error;
    @FindBy(xpath = "//*[text()='Error: start time must not be greater than or equal to stop time']")   public WebElement start_time_error;
    @FindBy(xpath = "//*[@style='vertical-align: inherit;']")   public WebElement forward_date_error;


    @FindBy(xpath = "(//input[@id='date'])[2]")  public WebElement edate;
    @FindBy(xpath = "(//*[@id='startTime'])[2]") public WebElement estartTime;
    @FindBy(xpath = "(//input[@id='stopTime'])[2]") public WebElement estopTime;
    @FindBy(xpath = "(//input[@id='description'])[2]")   public WebElement edescription;
    @FindBy(xpath = "(//button[text()='Submit'])[2]")   public WebElement esubmit;










    @FindBy(xpath = "//div[@class=' css-19bb58m']") public WebElement ChooseStedentsButton;
    @FindBy(xpath = "//h3[@class='fw-bold p-3 card-header']")
    public WebElement MeetManagementBaslik;

    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']")
    public WebElement MeetpopUpMesaji;
    @FindBy(xpath = "//input[@type='date']")
    public WebElement dateButton;
    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement hataMesaji;

}




















