package stepdefinitions.uidefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.TeacherManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_24 {

    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();
    Faker faker = new Faker();

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
        } else {
            Assert.assertTrue(teacherManagementPage.popUp.isDisplayed());
        }
    }

    @And("Kullanici Date of birth alanina bir tarih {string} girer")
    public void kullaniciDateOfBirthAlaninaBirTarihGirer(String dateOfBirth) {
        teacherManagementPage.dateOfBirth.sendKeys(dateOfBirth);
    }


    @Given("Kullanici Submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {
        Driver.clickWithJS(teacherManagementPage.submit);
      //  ReusableMethods.waitFor(6);
    }

    @Given("Kullanici Submit butonunun aktif olmadigini gorur")
    public void kullanici_submit_butonunun_aktif_olmadigini_gorur() {
        Assert.assertFalse(teacherManagementPage.submit.isSelected());
    }

    @And("Kullanici Name textboxina valid bir deger girer")
    public void kullaniciNameTextboxinaValidBirDegerGirer() {
       String isim = faker.name().name();
       teacherManagementPage.name.sendKeys(isim);
    }
}

