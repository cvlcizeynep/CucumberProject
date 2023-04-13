package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeanManagementPage {

    //nuran hanim,hayriye hanim
    public DeanManagementPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[normalize-space()='Menu']")
    public WebElement MenuButton;

    @FindBy(xpath = "//a[normalize-space()='Dean Management']")
    public WebElement DeanManagementButton;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement NameButton;

    @FindBy(xpath = "//input[@id='surname']")
    public WebElement SurnameButton;
    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement BirthplaceButton;
    @FindBy(xpath = "//input[contains(@value,'FEMALE')]")
    public WebElement FemaleButton;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement MaleButton;
    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement DateOfBirthButton;
    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement PhoneNumberButton;
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement SsnButton;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement UserNameButton;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement PasswordButton;
    @FindBy(xpath = "//button[normalize-space()='Submit']")
    public WebElement SubmitButton;
    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement popUpMesaji;
    @FindBy(xpath = "//div[.='Required']")
    public WebElement RequiredYazisi;

    @FindBy(xpath = "//div[.='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement SsnUyariYazisi;
    @FindBy(xpath = "//div[.='Minimum 8 character']")
    public WebElement passwordBoxUyariYazisi;



}
