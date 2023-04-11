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
    @FindBy(xpath = "//*[@placeholder='Password']") public WebElement password;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]") public WebElement passwordfeedback;
    @FindBy(xpath = "//button[text()='Register']") public WebElement registerbutton;




}
