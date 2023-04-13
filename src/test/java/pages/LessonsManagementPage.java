package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LessonsManagementPage {
    public LessonsManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //asli hanim,muammer bey,
    @FindBy(id ="controlled-tab-example-tab-lessonsList") public WebElement lessons;
    @FindBy(id ="lessonName")  public WebElement lessonName;
    @FindBy(id="compulsory") public WebElement compulsory;
    @FindBy(id="creditScore") public WebElement creditScore;
    @FindBy(xpath="//*[text()='Submit']") public WebElement Submit;
    @FindBy(xpath="//font[contains(text(),'Ders Oluşturuldu')]") public WebElement lesson_Created;














  //Asli



}
