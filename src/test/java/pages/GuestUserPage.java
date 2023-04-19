package pages;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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
    @FindBy(xpath = "//table//thead//tr[1]//th")
    public WebElement namebaslık;
    @FindBy(xpath = "//table//thead//tr[2]//th")
    public WebElement phonenumberbaslık;
    @FindBy(xpath = "//table//thead//tr[3]//th")
    public WebElement ssnbaslık;
    @FindBy(xpath = "//table//thead//tr[4]//th")
    public WebElement usernamebaslık;


}
