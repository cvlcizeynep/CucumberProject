package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.TeacherManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.LocalDate;
import java.time.ZoneId;

public class US24TeacherCreating {

    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();
    Faker faker = new Faker();
    public static String isim;

    @Given("Kullanici Surname textboxina valid bir deger girer")
    public void kullanici_surname_textboxina_valid_bir_deger_girer() {
        Faker faker = new Faker();
        String sn = faker.name().fullName().replaceAll(" ", "");
        String surname = sn.substring(0, 1).toUpperCase() + sn.substring(1).toLowerCase();
        if (surname.contains(".")) {
            surname.replaceAll(".", "");
        }
        teacherManagementPage.surname.sendKeys(surname);
    }

    @And("Kullanici Birth Place textboxina valid bir deger {string} girer")
    public void kullaniciBirthPlaceTextboxinaValidBirDegerGirer(String sehir) {
        teacherManagementPage.birthPlace.sendKeys(sehir);
    }

    @Given("Kullanici Email textboxina valid bir deger girer")
    public void kullanici_email_textboxina_valid_bir_deger_girer() {
        teacherManagementPage.email.sendKeys(faker.internet().emailAddress());
    }

    @Given("Kullanici Phone textboxina valid bir deger girer")
    public void kullanici_phone_textboxina_valid_bir_deger_girer() {
        String phoneNumber = faker.phoneNumber().phoneNumber().replaceAll("[^0-9]", "");
        phoneNumber = String.format("%s-%s-%s",
                phoneNumber.substring(0, 3),
                phoneNumber.substring(3, 6),
                phoneNumber.substring(6, 10)
        );
        teacherManagementPage.phone.sendKeys(phoneNumber);
    }

    @Given("Kullanici SSN textboxina valid bir deger girer")
    public void kullanici_ssn_textboxina_valid_bir_deger_girer() {
        String ssn = faker.idNumber().ssnValid().replaceAll("[^0-9]", "");
        String formattedSSN = ssn.substring(0, 3) + "-" + ssn.substring(3, 5) + "-" + ssn.substring(5, 9);
        teacherManagementPage.ssn.sendKeys(formattedSSN);
    }

    @Given("Kullanici Username textboxina valid bir deger girer")
    public void kullanici_username_textboxina_valid_bir_deger_girer() {
        teacherManagementPage.username.sendKeys(faker.name().username());
    }

    @Given("Kullanici Password textboxina valid bir deger girer")
    public void kullanici_password_textboxina_valid_bir_deger_girer() {
        teacherManagementPage.password.sendKeys("12345678");
    }

    @Given("Kullanici Is Advisor Teacher checkboxina tiklar")
    public void kullanici_is_advisor_teacher_checkboxina_tiklar() {
        teacherManagementPage.isAdvisorTeacher.click();
    }

    @And("Kullanici Gender  alanindan cinsiyet {string} secer")
    public void kullaniciGenderAlanindanCinsiyetSecer(String gender) {
        if (gender.equals("male")) {
            teacherManagementPage.genderMale.click();
        } else if (gender.equals("female")) {
            teacherManagementPage.genderFemale.click();
        }
        Assert.assertFalse(teacherManagementPage.submit.isSelected());

    }

    @And("Kullanici Date of birth alanina bir tarih {string} girer")
    public void kullaniciDateOfBirthAlaninaBirTarihGirer(String dateOfBirth) {
        teacherManagementPage.dateOfBirth.sendKeys(dateOfBirth);
    }


    @Given("Kullanici Submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {
        Driver.clickWithJS(teacherManagementPage.submit);
    }

    @Given("Kullanici Submit butonunun aktif olmadigini gorur")
    public void kullanici_submit_butonunun_aktif_olmadigini_gorur() {
        Assert.assertFalse(teacherManagementPage.submit.isSelected());
    }

    @And("Kullanici Name textboxina valid bir deger girer")
    public void kullaniciNameTextboxinaValidBirDegerGirer() {
        isim =  faker.name().name();
        teacherManagementPage.name.sendKeys(isim);
    }

    @And("Kullanici Email textboxina valid bir deger {string}girer")
    public void kullaniciEmailTextboxinaValidBirDegerGirer(String email) {
        teacherManagementPage.email.sendKeys(email);
    }

    @And("Kullanici Phone textboxina valid bir deger {string} girer")
    public void kullaniciPhoneTextboxinaValidBirDegerGirer(String phone) {
        teacherManagementPage.phone.sendKeys(phone);
    }

    @And("Kullanici SSN textboxina valid bir deger {string}girer")
    public void kullaniciSSNTextboxinaValidBirDegerGirer(String SSN) {
        teacherManagementPage.ssn.sendKeys(SSN);
    }

    @And("Kullanici Username textboxina valid bir deger {string} girer")
    public void kullaniciUsernameTextboxinaValidBirDegerGirer(String username) {
        teacherManagementPage.username.sendKeys(username);
    }

    @And("Kullanici Password textboxina valid bir deger {string} girer")
    public void kullaniciPasswordTextboxinaValidBirDegerGirer(String password) {
        ReusableMethods.JSEClickToElement(teacherManagementPage.password);
        teacherManagementPage.password.sendKeys(password);
    }

    @And("Kullanici Name textboxina valid bir deger {string} girer")
    public void kullaniciNameTextboxinaValidBirDegerGirer(String name) {
        teacherManagementPage.name.sendKeys(name);
    }

    @And("Kullanici Surname textboxina valid bir deger {string} girer")
    public void kullaniciSurnameTextboxinaValidBirDegerGirer(String surname) {
        teacherManagementPage.surname.sendKeys(surname);
    }

    @And("Kullanici SSN textboxina  formata uygun bir deger {string} girer")
    public void kullaniciSSNTextboxinaFormataUygunBirDegerGirer(String ssn) {
        Assert.assertFalse(!ssn.substring(3, 4).equals("-") || !ssn.substring(6, 7).equals("-"));
    }

    @And("Kullanici SSN textboxina  {int} rakam icerenbir deger {string}girer")
    public void kullaniciSSNTextboxinaRakamIcerenbirDegerGirer(int arg0, String SSN) {
        SSN.replaceAll("\\D", "");
        int length = SSN.replaceAll("\\D", "").length();
        Assert.assertNotEquals(9, length);
    }

    @And("Kullanici Password textboxina {int}  karakter iceren bir deger {string} girer")
    public void kullaniciPasswordTextboxinaKarakterIcerenBirDegerGirer(int arg0, String password) {
        Assert.assertNotEquals(password.length(), 8);
    }

    @And("Kullanici Username textboxina valid bir deger  girer")
    public void kullaniciUsernameTextboxinaValidBirDegerGirer() {
        teacherManagementPage.username.sendKeys(faker.name().username());
    }

    @And("Kullanici Date of birth alanina ileri bir tarih girer")
    public void kullaniciDateOfBirthAlaninaIleriBirTarihGirer() {

        LocalDate forwardDate = LocalDate.of(2025, 6, 11);
        LocalDate currentDate = LocalDate.now(ZoneId.of("Turkey"));
        if (forwardDate.isAfter(currentDate)) {
            String ay = String.valueOf(forwardDate.getMonthValue());
            //System.out.println(ay);
            String gun = String.valueOf(forwardDate.getDayOfMonth());
            //System.out.println(gun);
            String yil = String.valueOf(forwardDate.getYear());
            //System.out.println(yil);
            teacherManagementPage.dateOfBirth.sendKeys(ay, gun, yil, Keys.ENTER);

        }

    }




}

