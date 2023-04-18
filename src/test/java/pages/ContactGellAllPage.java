package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class ContactGellAllPage {
    { PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menu_button;
    @FindBy(xpath = "//a[normalize-space()='Contact Get All']")
    public WebElement contact_getAll_button;
    @FindBy(xpath = "//*[.='Contact Message']")
    public WebElement contact_message_header;
    @FindBy(xpath = "//*[.='Name']")
    public WebElement name_column;
    @FindBy(xpath = "//*[.='Email']")
    public WebElement email_column;
    @FindBy(xpath = "//*[.='Date']")
    public WebElement date_column;
    @FindBy(xpath = "//*[.='Subject']")
    public WebElement subject_column;
    @FindBy(xpath = "//*[.='Message']")
    public WebElement message_column;
    @FindBy(xpath = "//a[normalize-space()='Vice Dean Management']")
    public WebElement viceDeanManagement;
    @FindBy(xpath = "//body/div[@id='offcanvasNavbar-expand-lg']/div[@class='offcanvas-header']/button[1]")
    public WebElement xButton;
   @FindBy(xpath = "//dletetusu") public WebElement deleteButton;
   @FindBy(xpath="//succesfullydelete") public WebElement succesfullyDelete;

}



