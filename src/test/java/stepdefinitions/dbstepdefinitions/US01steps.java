package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static utilities.DBUtils.insertDataIntoTable;

public class US01steps {
    @Given("Kullanıcı insert into methodu ile valid değerler ile öğrenci kaydı yapar.")
    public void kullanici_insert_into_methodu_ile_valid_degerler_ile_ogrenci_kaydi_yapar() {
        // Tablo adı ve eklenecek sütunlar ve değerlerinin listesi
        String tableName = "guest_user";
        String[] columnValueArray = new String[] {"birth_day 26-01-1996","gender MALE", "surname yigit", "name Emre","password rtyuwerıtuweyrıtuewyru", "phone_number 567-907-4023", "ssn 567-90-7403", "username emre12312312", "user_role_id 7"};

        // Verileri tabloya ekleme işlemi
        insertDataIntoTable(tableName, columnValueArray);
    }
    @Given("Kayıt yaptığını doğrular")
    public void kayit_yaptigini_dogrular() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Database ile bağlantı kesilir.")
    public void database_ile_baglanti_kesilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Given("Kullanıcı insert into methodu ile valid olmayan değerler ile öğrenci kaydı yapar.")
    public void kullanici_insert_into_methodu_ile_valid_olmayan_degerler_ile_ogrenci_kaydi_yapar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Kayıt yapamadığını doğrular")
    public void kayit_yapamadigini_dogrular() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
