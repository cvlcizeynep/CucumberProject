
Feature:  Dean, mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve
  subject bilgilerini görüntüleyebilmelidir.Dean mesajları silebilmelidir.

  Background: Mesaj gonderme
    Given Ogrenci mesaj gonderir.
    Given Database icin connect saglanir

  Scenario: TCO1 Dean mesajlari gorebilmelidir
    When Databaseden olusturulan mesajlar sorgulanir
    Then Gonderilen mesajlarin goruldugu dogrulanir

  Scenario: TCO2 Dean yazarlari gorebilmelidir
    When Databaseden olusturulan yazarlar sorgulanir
    Then Gonderilen mesajlarin yazarlarinin goruldugu dogrulanir

  Scenario: TCO3 Dean mesajlari gonderenlerin emaillerini gorebilmelidir
    When Databaseden mesajlari gonderenlerin emailleri  sorgulanir
    Then Gonderilen mesajlari gonderenlerin emaillerinin goruldugu dogrulanir

  Scenario: TCO3 Dean mesajlari subjectini gorebilmelidir
    When Databaseden mesajlarin subjecti  sorgulanir
    Then Gonderilen mesaajlarin subjectinin goruldugu dogrulanir


  Scenario: TC04 Dean  mesajlarin gonderildigi tarihi  gorebilmelidir
    When Databaseden mesajlarin gonderildigi tarih  sorgulanir
    Then Gonderilen mesajlarin gonderildigi tarihin goruldugu dogrulanir

