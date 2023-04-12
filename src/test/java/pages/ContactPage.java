package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactPage {

    //fatmanur hanim ,erkam bey
    public ContactPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Contact']")
    public WebElement contactButton;

    @FindBy(xpath="//input[@id='name']")
    public WebElement yourNameTextbox;

    @FindBy(xpath="//input[@id='email']")
    public WebElement yourEmailTextbox;

    @FindBy(xpath="//input[@id='subject']")
    public WebElement subjectTextbox;

    @FindBy(xpath="//textarea[@id='message']")
    public WebElement messageTextbox;

    @FindBy(xpath="(//button[@type='button'])[5]")
    public WebElement sendMessageButton;

    @FindBy(xpath="//*[text()='Contact Message Created Successfully']")
    public WebElement successfullyToastify;

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath="(//a[@role='button'])[9]")
    public WebElement contactGetAllButton;

    @FindBy(xpath="(//span[@aria-hidden='true'])[4]")
    public WebElement goToLastPage;

    @FindBy(xpath="d-flex justify-content-start ps-5 col")
    public WebElement howManyPages;

}
