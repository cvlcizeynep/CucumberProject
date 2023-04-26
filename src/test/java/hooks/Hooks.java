package hooks;

import io.cucumber.java.After;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

//import static base_url.StudentManagementBaseUrl.setUp;

public class Hooks {
    /*
    Hooks : Her bir Scenario yada Scenario Outline dan ONCE yada SONRA calismasmasini istedigim metotlar konur
    @Before ve @After metotlarini icerir
    Burda onemli olan raporlama isleminin ekran goruntusuyle birlikde Hooks yardimiyla yapilmasidir
     */
  /*
   ------------5 kullanicimiz oldugu icin before methodunu iptal ettim(Erkam-->4.26.2023))-----------------
   @Before()
    public void before(){
        setUp();
    }
    */

    @After
    public void tearDownScenarios(Scenario scenario){
        System.out.println("After Metotu");
//        Eger bir Scenario FAIL ederse, ekran goruntusunu al ve rapora ekle
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//                       ekran goruntusu    file tipi                  ekran goruntusunun adi
            scenario.attach(failedScreenshot, "image/png", "failed_scenario_"+scenario.getName());

        }
        Driver.wait(1);
        Driver.closeDriver();
    }
}

