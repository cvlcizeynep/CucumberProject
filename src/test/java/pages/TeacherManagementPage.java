package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TeacherManagementPage {
    //Gulser hanim,Erkam bey,

    {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menu;
    @FindBy(xpath = "//a[text()='Teacher Management']")
    public WebElement teacherManagement;
    @FindBy(xpath = "//*[@id='name']")
    public WebElement name;

    @FindBy(id = "surname")
    public WebElement surname;
    @FindBy(id = "birthPlace")
    public WebElement birthPlace;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "phoneNumber")
    public WebElement phone;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "isAdvisorTeacher")
    public WebElement isAdvisorTeacher;
    @FindBy(xpath = "(//*[@name='gender'])[1]")
    public WebElement genderFemale;
    @FindBy(xpath = "(//*[@name='gender'])[2]")
    public WebElement genderMale;
    @FindBy(id = "birthDay")
    public WebElement dateOfBirth;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submit;
    @FindBy(id = "controlled-tab-example-tabpane-teachersList")
    public List<WebElement> required;
    @FindBy(xpath = "//*[@role='alert']")
    public WebElement popUp;
    @FindBy(xpath = "//*[text()='Teacher saved successfully']")
    public WebElement popUpBasarili;
    @FindBy(xpath = "//div[@class=' css-1xc3v61-indicatorContainer']")
    public WebElement chooseLessons;
    @FindBy(xpath = "(//*[text()='Name Surname'])[1]")
    public WebElement nameSurnameInfo;
    @FindBy(xpath = "//*[text()='Phone Number']")
    public WebElement phoneNumberInfo;
    @FindBy(xpath = "(//*[text()='Ssn'])[1]")
    public WebElement ssnInfo;
    @FindBy(xpath = "(//*[text()='User Name'])[2]")
    public WebElement userNameInfo;

    @FindBy(xpath = "(//*[@role='button'])[13]")
    public WebElement sagOkButton;
    @FindBy(xpath = "//div[text()='Edit Teacher']")
    public WebElement editTeacherYazisi;
    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[19]")
    public WebElement editButton;
    @FindBy(xpath = "(//*[@id='name'])[2]")
    public WebElement editNameTextBox;
    @FindBy(xpath = "(//input[@placeholder='Surname'])[2]")
    public WebElement editSurnameTextBox;
    @FindBy(xpath = "(//input[@placeholder='Birth Place'])[2]")
    public WebElement editBirthPlace;
    @FindBy(xpath = "(//input[@id='password'])[2]")
    public WebElement editPasswordTextbox;
    @FindBy(xpath = "(//*[@id='birthDay'])[2]")
    public WebElement editdateOfBirth;
    @FindBy(xpath = "(//input[@placeholder='Email Address'])[2]")
    public WebElement editEmailTextbox;
    @FindBy(xpath = "(//input[@id='phoneNumber'])[2]")
    public WebElement editPhoneTextbox;
    @FindBy(xpath = "(//input[@id='ssn'])[2]")
    public WebElement editSsnTextbox;
    @FindBy(xpath = "(//input[@id='username'])[2]")
    public WebElement editUsernameTextbox;
    @FindBy(xpath = "(//input[@id='isAdvisorTeacher'])[2]")
    public WebElement editIsAdvisorTeacher;
    @FindBy(xpath = "(//input[@name='gender'])[4]")
    public WebElement editGenderMale;
    @FindBy(xpath = "(//button[text()='Submit'])[2]")
    public WebElement editSubmitButton;























    //Erkam(120)
    @FindBy(xpath = "//div[contains(text(),'Must be a past date')]")
    public WebElement forwardDatePopoup;

}
