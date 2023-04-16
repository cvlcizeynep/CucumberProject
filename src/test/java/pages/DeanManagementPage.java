package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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

    //Edit
    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover']//tbody//td[6])[3]//button")
    //"(//*[@class='text-dark btn btn-outline-info'])[20]"
    public WebElement deanListEditButonu;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement deanListeditpopupmesaji;
    @FindBy(xpath = "(//*[@role='button'])[21]")
    public WebElement soneklenenegit;
    @FindBy(xpath = "//main[@class='content']//li[4]//a[1]")
    public WebElement deanListEditsagButton;
    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover'])//tbody//tr//td[1]")
    //((//table[@class='table table-striped table-bordered table-hover'])//tbody//td[5])[20]hayriye
    public List<WebElement> deanListKayitliKisi;
    @FindBy(xpath = "//span[text()='hayriye']")
    public WebElement hayriyeText;
    @FindBy(xpath = "(//span[@aria-hidden='true'])[4]")
    public WebElement ileriEdit2;
    @FindBy(xpath = "(//span[@aria-hidden='true'])[3]")
    public WebElement ileriEdit;
    @FindBy(xpath = "//span[.='»']")
    public WebElement viceDeanListSonSayfa;
    @FindBy(xpath = "//h5[.='Vice Dean List']")
    public WebElement viceDeanListText;
    @FindBy(xpath = "//table//tr[last()]//td[5]")
    public WebElement viceDeanList;
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover']//tbody//tr//td[1]")
    public List<WebElement> isimlertext;






}
