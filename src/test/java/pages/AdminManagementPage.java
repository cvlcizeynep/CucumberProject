package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminManagementPage {
    //hayriye hanim,ibrahim bey,
    public AdminManagementPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='name']")
    public WebElement AdminName;
    @FindBy(xpath = "(//div[text()='Required'])[1]")
    public WebElement AdminNameRequired;
    @FindBy(xpath = "//input[@id='surname']")
    public WebElement AdminSurname;
    @FindBy(xpath = "(//div[text()='Required'])[2]")
    public WebElement AdminSurnameRequired;
    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement AdminBirthPlace;
    @FindBy(xpath = "(//div[text()='Required'])[3]")
    public WebElement AdminBirtPlaceRequired;
    @FindBy(xpath = "(//input[@name='gender'])[1]")
    public WebElement AdminFemale;
    @FindBy(xpath = "(//input[@name='gender'])[2]")
    public WebElement AdminMale;
    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement AdminDateOfBird;
    @FindBy(xpath = "(//div[text()='Required'])[4]")
    public WebElement AdminDateOfBirthRequired;
    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement AdminPhone;
    @FindBy(xpath = "(//div[text()='Required'])[5]")
    public WebElement AdminPhoneRequired;
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement AdminSsn;
    @FindBy(xpath = "(//div[text()='Required'])[6]")
    public WebElement AdminSsnRequired;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement AdminUsername;
    @FindBy(xpath = "(//div[text()='Required'])[7]")
    public WebElement AdminUsernameRequired;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement AdminPassword;
    @FindBy(xpath = "(//div[text()='Required'])[8]")
    public WebElement AdminPasswordRequired;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement AdminSubmit;
    @FindBy(xpath = "//*[@id='2']")
    public WebElement AdminSaved;
    @FindBy(xpath = "//body/div[@id='root']/div[@class='app']/main[@class='content']/div/div[@class='Toastify']/div[@class='Toastify__toast-container Toastify__toast-container--top-center']/div[@id='20']/div[@role='alert']/div[1]")
    public WebElement saveSuccesfullyMessage;
    @FindBy(xpath = "//div[text()='Admin Saved']")
    public WebElement adminSaved;
    @FindBy (xpath = "//*[text()='Minimum 8 character']")
    public WebElement minimum8;
    @FindBy(xpath = "//*[text()='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement minimin11ssn;
    @FindBy(xpath = "//*[text()='Please enter valid SSN number']")
    public WebElement ssnMesaj;
    @FindBy(xpath = "//*[text()='Please enter valid phone number']")
    public WebElement phoneNumberMesaj;




}
