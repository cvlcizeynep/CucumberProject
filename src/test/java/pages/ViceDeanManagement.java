package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class ViceDeanManagement {
     //Zeynep ,Erkam bey,Nuran,ibrahim
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
    @FindBy(xpath = "//div[contains(text(),'Error: User with phone number 147-258-0123 already')]")
    public WebElement alreadyPhoneAlertMessage;
    @FindBy(xpath = "//div[normalize-space()='Minimum 8 character']")
    public WebElement passwordMinumummessage;
   @FindBy(xpath = "//body/div[@id='root']/div[contains(@class,'app')]/main[contains(@class,'content')]/div/div[contains(@class,'Toastify')]/div[contains(@class,'Toastify__toast-container Toastify__toast-container--top-center')]/div[@id='145']/div[1]")
    public WebElement formatOutSSn;
   @FindBy(xpath ="//div[contains(text(),'Please enter valid phone number')]")public WebElement invalidPhoneMessage;
@FindBy(xpath = "//div[contains(text(),'Error: User with username')]") public WebElement alreadyUsername;

   @FindBy(xpath ="(//div[contains(@class,'invalid-feedback')][normalize-space()='Required'])[1]")public WebElement requiredName;
   @FindBy(xpath ="//div[contains(@class,'container-fluid')]//div[2]//div[1]//div[1]")public WebElement requiredSurNme;
   @FindBy(css ="body > div:nth-child(2) > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2)")public WebElement requiredBirthPlace;
   @FindBy(css="div[class='mb-3'] div[class='invalid-feedback']")public WebElement requiredDateofBirth;
   @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(2)") public WebElement requiredPhone;
   @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(1) > div:nth-child(7) > div:nth-child(1) > div:nth-child(2)") public WebElement requiredSsn;
   @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(1) > div:nth-child(8) > div:nth-child(1) > div:nth-child(2)") public WebElement requiredUsername;
   @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(1) > div:nth-child(9) > div:nth-child(1) > div:nth-child(2)") public WebElement requiredPassword;
@FindBy(css = "div[role='alert'] div:nth-child(1)")
    public WebElement invalidBirtDateMessage;
@FindBy(xpath = "//a[normalize-space()='Logout']") public WebElement logout;
@FindBy(xpath = "//button[normalize-space()='Yes']")public WebElement yes;

@FindBy(xpath = "//div[text()='Vice dean Saved']") public  WebElement viceDeanSaved;









   //ibrahim 60 ila 80 arası
   @FindBy(xpath = "//*[.='Student Management']") public WebElement StudentManagement;
   @FindBy(xpath = "//select[@id='advisorTeacherId']") public WebElement ChooseadvisorTeacher ;
   @FindBy(xpath = "//*[@id='email']") public WebElement email;
   @FindBy(id ="username") public WebElement username;
   @FindBy(xpath = "//*[@id='fatherName']") public WebElement fatherName;
   @FindBy(xpath = "//*[@id='motherName']") public WebElement motherName;
   @FindBy(xpath = "//*[text()='Student saved Successfully']") public  WebElement succesfully;
   @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")public  WebElement nameRequired;
    @FindBy(xpath = "//div[text()='Please select advisor teacher']") public  WebElement teacherPopup;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[2]")public WebElement surnameRequired;









//************************


}
