package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuestUserPage {
    //hayriyehanim
    public GuestUserPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@aria-controls='offcanvasNavbar-expand-false']")
    public WebElement menuButton;
    @FindBy(xpath = "//a[text()='Guest User']")
    public WebElement guestUser;
    @FindBy (xpath = "//*[@class='btn btn-danger'][1]")
    public  WebElement silmeButonu;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public  WebElement mesaj;

}
