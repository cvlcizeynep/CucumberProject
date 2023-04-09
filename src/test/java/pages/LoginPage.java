package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){    //butun takim uyelerinin sayfasi
    PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(xpath = "//a[@class='header_link ms-2']") public WebElement login;
    @FindBy(xpath ="//input[@id='username']" ) public WebElement userName;
    @FindBy(xpath = "//*[@id='password']") public WebElement password;
    @FindBy(xpath = "//button[.='Login']") public WebElement signinLogin;






}
