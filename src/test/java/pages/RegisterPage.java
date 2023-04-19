package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    //emre bey ve Hayriye hanim
 public RegisterPage(){
     PageFactory.initElements(Driver.getDriver(),this);}
     @FindBy(xpath = "//*[@placeholder='Name']") public WebElement name;
     @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]") public WebElement namefeedback;
    @FindBy(xpath = "//*[@placeholder='Surname']") public WebElement surname;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]") public WebElement surnamefeedback;
    @FindBy(xpath = "//*[@placeholder='Birth Place']") public WebElement birthplace;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]") public WebElement birthplacefeedback;
    @FindBy(xpath = "//*[@placeholder='Phone Number']") public WebElement phonenumber;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]") public WebElement phonenumberfeedback;
    @FindBy(xpath = "(//*[@name='gender'])[1]") public WebElement genderfemale;
    @FindBy(xpath = "(//*[@name='gender'])[2]") public WebElement gendermale;

    @FindBy(xpath = "//*[@type='date']") public WebElement dateofbhirt;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]") public WebElement dateofbhirtfeedback;
    @FindBy(xpath = "//*[@placeholder='ssn']") public WebElement ssn;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]") public WebElement ssnfeedback;
    @FindBy(xpath = "//*[@placeholder='username']") public WebElement username;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]") public WebElement usernamefeedback;
    @FindBy(xpath = "//*[@id='password']") public WebElement password;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]") public WebElement passwordfeedback;
    //@FindBy(xpath = "//button[text()='Register']") public WebElement registerbutton;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement registerSubmitButton;

////div[@class='Toastify__toast-body']/div[1]
     @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']")
     public WebElement succesfullyRegistered;
     @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click']")
     public WebElement pleaseentervalidssn;
     @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--error Toastify__toast--close-on-click']")
     public WebElement pleaseentervalidphone;


    ////div[@class='Toastify__toast-body']/div[1]
//    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-center']") public WebElement popUpmesaji;



}
