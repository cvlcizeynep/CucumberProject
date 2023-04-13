package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.DeanManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

 public class US04 {
     Faker faker;
     DeanManagementPage deanManagementPage=new DeanManagementPage();
     JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
     @Given("Kullanici Admin olarak giris yapar")
     public void kullanici_admin_olarak_giris_yapar() {
         ReusableMethods.login("Team20_N","12345678");
         deanManagementPage.MenuButton.click();
         deanManagementPage.DeanManagementButton.click();
     }
     @Given("Kullanici Name kismina valid  girer")
     public void kullaniciNameKisminaValidGirer() {
         faker=new Faker();
         deanManagementPage.NameButton.sendKeys(faker.name().name());

     }
     @When("Kullanici Surname kismina valid  girer")
     public void kullaniciSurnameKisminaValidGirer() {
         faker=new Faker();
         deanManagementPage.SurnameButton.sendKeys(faker.name().lastName());
     }
     @And("Kullanici Birth place kismina valid deger girer")
     public void kullaniciBirthPlaceKisminaValidDegerGirer() {
         faker=new Faker();
         deanManagementPage.BirthplaceButton.sendKeys(faker.address().city());
     }
     @When("Kullanici Gender kismini secer")
     public void kullanici_gender_kismini_secer() {
         deanManagementPage.MaleButton.click();
     }

     @And("Kullanici Date of birth alanina {string} bir tarih girer")
     public void kullaniciDateOfBirthAlaninaBirTarihGirer(String date) {
         deanManagementPage.DateOfBirthButton.sendKeys(date);
     }
     @And("Kullanici Phone Number alanina valid bir deger girer")
     public void kullaniciPhoneNumberAlaninaValidBirDegerGirer() {
         faker=new Faker();
         String phoneNumber=faker.phoneNumber().phoneNumber().replaceAll("[^0-9]", "");
         phoneNumber = String.format("%s-%s-%s",
                 phoneNumber.substring(0, 3),
                 phoneNumber.substring(3, 6),
                 phoneNumber.substring(6, 10));
         deanManagementPage.PhoneNumberButton.sendKeys(phoneNumber);
     }
     @And("Kullanici SSN  alanina valid bir deger girer")
     public void kullaniciSSNAlaninaValidBirDegerGirer() {
         faker=new Faker();
         String ssn=faker.idNumber().ssnValid().replaceAll("[^0-9]","");
         String SSN=ssn.substring(0,3)+"-"+ssn.substring(3,5)+"-"+ssn.substring(5,9);
         deanManagementPage.SsnButton.sendKeys(SSN);
     }
     @And("Kullanici User Name alanina valid bir deger girer")
     public void kullaniciUserNameAlaninaValidBirDegerGirer() {
         faker=new Faker();
         deanManagementPage.UserNameButton.sendKeys(faker.name().username());
     }
     @And("Kullanici en az sekiz karakterden oluşan Password {string} girer")
     public void kullaniciEnAzSekizKarakterdenOluşanPasswordGirer(String password) {
         deanManagementPage.PasswordButton.sendKeys(password);
     }
     @When("Kullanici submit tusuna tiklar.")
     public void kullanici_submit_tusuna_tiklar() {
         deanManagementPage.SubmitButton.click();
     }

     @Then("Kullanici basariyla Dean ekleyebildigini dogrular.")
     public void kullanici_basariyla_dean_ekleyebildigini_dogrular()  {
         Assert.assertTrue(deanManagementPage.popUpMesaji.isDisplayed());
     }


     @Given("Kullanici Name kismini bos birakir")
     public void kullaniciNameKisminiBosBirakir() {
         js.executeScript("arguments[0].scrollIntoView(true);",deanManagementPage.NameButton);
         deanManagementPage.NameButton.sendKeys("");

     }

     @Then("Kullanici uyari yazisi gordugunu dogrular.")
     public void kullaniciUyariYazisiGordugunuDogrular() {
         assertTrue(deanManagementPage.RequiredYazisi.isDisplayed());
     }


     @When("Kullanici Surname alanini bos birakir")
     public void kullaniciSurnameAlaniniBosBirakir() {
         js.executeScript("arguments[0].scrollIntoView(true);",deanManagementPage.SurnameButton);
         deanManagementPage.SurnameButton.sendKeys("");
     }


     @Given("Kullanici Name {string} kismina valid  girer")
     public void kullaniciNameKisminaValidGirer(String name) {
         deanManagementPage.NameButton.sendKeys(name);

     }

     @When("Kullanici Surname {string} kismina valid  girer")
     public void kullaniciSurnameKisminaValidGirer(String surname) {
         deanManagementPage.SurnameButton.sendKeys(surname);
     }

     @And("Kullanici Birth place {string} kismina valid deger girer")
     public void kullaniciBirthPlaceKisminaValidDegerGirer(String place) {
         deanManagementPage.BirthplaceButton.sendKeys(place);
     }

     @And("Kullanici Birth of Date {string}  girer")
     public void kullaniciBirthOfDateGirer(String date) {
         deanManagementPage.DateOfBirthButton.sendKeys(date);
     }

     @And("Kullanici Phone Number {string} girer")
     public void kullaniciPhoneNumberGirer(String phone) {
         deanManagementPage.PhoneNumberButton.sendKeys(phone);
     }

     @And("Kullanici SSN  {string} girer")
     public void kullaniciSSNGirer(String ssn) {
         deanManagementPage.SsnButton.sendKeys(ssn);

     }

     @And("Kullanici User Name {string} girer")
     public void kullaniciUserNameGirer(String username) {
         deanManagementPage.UserNameButton.sendKeys(username);
     }


     @And("Kullanici Phone Number alanina {string} degerini girer")
     public void kullaniciPhoneNumberAlaninaDegeriniGirer(String phone) {
         deanManagementPage.PhoneNumberButton.sendKeys(phone);
     }

     @And("Kullanici dean ekleyemedigini dogrular")
     public void kullaniciDeanEkleyemediginiDogrular() {

         Assert.assertTrue(deanManagementPage.popUpMesaji.isDisplayed());

     }

     @And("Kullanici ssn box altinda uyari yazisi ciktigini dogrular")
     public void kullaniciSsnBoxAltindaUyariYazisiCiktiginiDogrular() {
         assertTrue(deanManagementPage.SsnUyariYazisi.isDisplayed());
     }

     @And("Kullanici password box altinda uyari yazisi ciktigini dogrular")
     public void kullaniciPasswordBoxAltindaUyariYazisiCiktiginiDogrular() {
         assertTrue(deanManagementPage.passwordBoxUyariYazisi.isDisplayed());
     }
}
