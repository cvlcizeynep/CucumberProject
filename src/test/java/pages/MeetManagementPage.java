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

    @FindBy(xpath = "//*[@class='css-13cymwt-control']")   public WebElement ChoseStuentds1;

    @FindBy(id="react-select-2-input")   public WebElement ChoseStuentds2;

    @FindBy(xpath = "//button[text()='Submit']")   public WebElement meetSubmit;
    @FindBy(xpath = "//*[@class='text-dark btn btn-outline-info']")   public WebElement edit;

    @FindBy(xpath = "//*[@class='fa-solid fa-trash']")   public WebElement meetDelete;
    @FindBy(xpath = "//div[contains(text()='Meet Deleted Successfully  ']")   public WebElement deleteBasarili;



    @FindBy(xpath = "//*[@class=' css-19bb58m']")  public WebElement editChoseStuentds1;
    @FindBy(id="react-select-5-input")  public WebElement editChoseStuentds2;
    @FindBy(xpath = "//input[@id='date']")  public WebElement editDate;
    @FindBy(xpath = "//input[@id='startTime']") public WebElement editMeetStartTime;

    @FindBy(xpath = "//input[@id='stopTime']") public WebElement editMeetStopTime;

    @FindBy(xpath = "//input[@id='description']")   public WebElement editMeetDescription;

    @FindBy(xpath = "//button[text()='Submit']")   public WebElement editMeetSubmit;

    @FindBy(xpath = "//div[@role='alert']")   public WebElement editMeetBasarili;

    @FindBy(xpath = "//div[contains(text()='JSON parse error: Cannot coerce empty  ']")   public WebElement editMeetUyariMesaji;
}




















