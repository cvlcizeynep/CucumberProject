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
    @FindBy(xpath = "//*[@class='text-dark btn btn-outline-info']")   public WebElement edit;
    @FindBy(xpath = "((//*[@type='button'])[7]")   public WebElement meetDelete;
    @FindBy(xpath = "//button[@class='btn btn-danger']")   public WebElement deleteBasarili;
    @FindBy(xpath = "//*[@id='react-select-2-live-region']")  public WebElement ChoseStuentds;


    @FindBy(xpath = "//input[@id='startTime']") public WebElement StartTime;
    @FindBy(xpath = "//input[@id='stopTime']") public WebElement StopTime;
    @FindBy(xpath = "//input[@id='description']")   public WebElement Description;
    @FindBy(xpath = "//div[@role='alert']")   public WebElement meetBasarili;
    @FindBy(xpath = "(//*[@class='Toastify__toast-container Toastify__toast-container--top-center'])[1]")
    public WebElement editMeetUyariMesaji;
    @FindBy(xpath = "//h3[@class='fw-bold p-3 card-header']")
    public WebElement MeetManagementBaslik;
    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    public WebElement ChooseStedentsButton;
    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']")
    public WebElement MeetpopUpMesaji;
    @FindBy(xpath = "//input[@type='date']")
    public WebElement dateButton;
    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement hataMesaji;

}




















