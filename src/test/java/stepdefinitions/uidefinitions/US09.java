//package stepdefinitions.uidefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.asserts.SoftAssert;
//import pages.LessonsManagementPage;
//import utilities.Driver;
//import utilities.ReusableMethods;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class US09 {
//
//    LessonsManagementPage lessonsManagementPage=new LessonsManagementPage();
//    @When("Kullanici listede creditScore dersAdi ve creditScore yazdigini dorular")
//    public void kullaniciListedeCreditScoreDersAdiVeCreditScoreYazdiginiDorular() {
//        List<String> lessonsListString = new ArrayList<>();
//        List<WebElement> lessonsList = Driver.getDriver().findElements(By.xpath("(//table)[1]//tr//td[1]"));
//        lessonsList.forEach(t -> lessonsListString.add(t.getText()));
//        while (!lessonsListString.contains("fiziks")) {
//            Driver.clickWithJS(lessonsManagementPage.sagTus_asli);
//            lessonsList = Driver.getDriver().findElements(By.xpath("(//table)[1]//tr//td[1]"));
//            lessonsListString.clear();
//            lessonsList.forEach(t ->lessonsListString.add(t.getText()));
//            ReusableMethods.waitFor(2);
//        }
//        int indexName = lessonsListString.indexOf("fiziks");
//        WebElement compulsorySutun = Driver.getDriver().findElement(By.xpath("(//table)[1]//tr["+(indexName+1)+"]//td[2]"));
//        System.out.println(compulsorySutun.getText());
//        WebElement creditSutun = Driver.getDriver().findElement(By.xpath("(//table)[1]//tr["+(indexName+1)+"]//td[3]"));
//        System.out.println(creditSutun.getText());
//
//
//        SoftAssert softAssert=new SoftAssert();
//        Assert.assertTrue(lessonsListString.contains("fiziks"));
//        Assert.assertEquals(compulsorySutun.getText(),"Yes");
//        Assert.assertEquals(creditSutun.getText(), "25");
//        softAssert.assertAll();
//    }
//
//
//    @And("Submit butonuna tiklarr")
//    public void submitButonunaTiklarr() {
//        ReusableMethods.JSEClickToElement(lessonsManagementPage.submit);
//    }
//
//    @When("Istenen dersin yanindaki cop kutusuna tiklayarak dersi siler")
//    public void istenenDersinYanindakiCopKutusunaTiklayarakDersiSiler() {
//        lessonsManagementPage.cop.click();
//    }
//}
//
