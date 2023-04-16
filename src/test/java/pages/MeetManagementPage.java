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
    @FindBy(xpath = "//button[text()='Submit']")   public WebElement meetSubmit;
    @FindBy(xpath = "//*[@class='text-dark btn btn-outline-info']")   public WebElement edit;
    @FindBy(xpath = "(//*[@class='fa-solid fa-trash'])[1]")   public WebElement meetDelete;
    @FindBy(xpath = "//*[@class='btn btn-danger']")   public WebElement deleteBasarili;
    @FindBy(xpath = "//*[@class=' css-1wy0on6']")  public WebElement ChoseStuentds;






    @FindBy(xpath = "//*[@id='react-select-3-input']")  public WebElement editChoseStuentds;
    @FindBy(xpath = "//input[@id='date']")  public WebElement editDate;
    @FindBy(xpath = "//input[@id='startTime']") public WebElement StartTime;
    @FindBy(xpath = "//input[@id='stopTime']") public WebElement StopTime;
    @FindBy(xpath = "//input[@id='description']")   public WebElement Description;
    @FindBy(xpath = "//button[text()='Submit']")   public WebElement Submit;
    @FindBy(xpath = "//div[@role='alert']")   public WebElement editMeetBasarili;
    @FindBy(xpath = "//div[contains(text()='JSON parse error: Cannot coerce empty  ']")   public WebElement editMeetUyariMesaji;
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
    @FindBy(xpath = "//div[normalize-space()='Required']")
    public WebElement RequiredMesaji;
}




















