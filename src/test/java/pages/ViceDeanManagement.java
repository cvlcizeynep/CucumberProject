package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.security.auth.x500.X500Principal;

public class ViceDeanManagement {
     //Zeynep ,Erkam bey,Nuran
     { PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//input[@id='name'] ") public WebElement name;
    @FindBy(xpath = "//input[@id='surname']") public WebElement surName;
    @FindBy(xpath = "//input[@id='birthPlace']") public WebElement birthPlace;
    @FindBy(xpath = "//input[@id='ssn']")public WebElement SSN;
    @FindBy(xpath = "//input[@id='username']")public WebElement userName;
    @FindBy(xpath = "//input[@id='password']")public WebElement password;
    @FindBy(xpath = "//input[@value='FEMALE']")public WebElement female;
    @FindBy(xpath = "//input[@value='MALE']") public WebElement male;
    @FindBy(xpath = "//input[@id='birthDay']")public WebElement birtDate;
    @FindBy(xpath = "//input[@id='phoneNumber']") public WebElement phone;
    @FindBy(css = "button[class='fw-semibold btn btn-primary btn-lg']") public WebElement submit;
    @FindBy(xpath = "//div[@id='8']//div[@role='alert']")public WebElement invalidSSNalertMessage;
    @FindBy(xpath = "//body/div[@id='root']/div[@class='app']/main[@class='content']/div/div[@class='Toastify']/div[@class='Toastify__toast-container Toastify__toast-container--top-center']/div[@id='20']/div[@role='alert']/div[1]")
    public WebElement saveSuccesfullyMessage;
    @FindBy(xpath = "//div[@id='27']//div[@role='alert']//div[contains(text(),'Error: User with ssn 269-29-7548 already register')]")
    public WebElement alreadySsnAlertMessage;
    @FindBy(xpath = "//div[@role='alert']//div[contains(text(),'Error: User with phone number 479-855-4566 already')]")
    public WebElement alreadyPhoneAlertMessage;
    @FindBy(xpath = "//div[normalize-space()='Minimum 8 character']")
    public WebElement passwordMinumummessage;
   @FindBy(xpath = "//body/div[@id='root']/div[contains(@class,'app')]/main[contains(@class,'content')]/div/div[contains(@class,'Toastify')]/div[contains(@class,'Toastify__toast-container Toastify__toast-container--top-center')]/div[@id='145']/div[1]")
    public WebElement formatOutSSn;
   @FindBy(xpath = "//div[@role='alert']//div[contains(text(),'Please enter valid phone number')]")public WebElement invalidPhoneMessage;


   @FindBy(xpath ="(//div[contains(@class,'invalid-feedback')][normalize-space()='Required'])[1]")public WebElement requiredName;
   @FindBy(xpath ="(//div[contains(@class,'invalid-feedback')][normalize-space()='Required'])[2]")public WebElement requiredSurNme;
   @FindBy(xpath ="(//div[contains(@class,'invalid-feedback')][normalize-space()='Required'])[3]")public WebElement requiredBirthPlace;
   @FindBy(xpath ="(//div[contains(@class,'invalid-feedback')][normalize-space()='Required'])[4]")public WebElement requiredDateofBirth;
   @FindBy(xpath = "(//div[contains(@class,'invalid-feedback')][normalize-space()='Required'])[5]") public WebElement requiredPhone;
   @FindBy(xpath = "(//div[contains(@class,'invalid-feedback')][normalize-space()='Required'])[6]") public WebElement requiredSsn;
   @FindBy(xpath = "(//div[contains(@class,'invalid-feedback')][normalize-space()='Required'])[7]") public WebElement requiredUsername;
   @FindBy(xpath = "(//div[contains(@class,'invalid-feedback')][normalize-space()='Required'])[8]") public WebElement requiredPassword;
@FindBy(xpath = "//body/div[@id='root']/div[@class='app']/main[@class='content']/div/div[@class='Toastify']/div[@class='Toastify__toast-container Toastify__toast-container--top-center']/div[@id='18']/div[@role='alert']/div[2]")
    public WebElement invalidBirtDateMessage;
@FindBy(xpath = "//a[normalize-space()='Logout']") public WebElement logout;
@FindBy(xpath = "//button[normalize-space()='Yes']")public WebElement yes;













}
