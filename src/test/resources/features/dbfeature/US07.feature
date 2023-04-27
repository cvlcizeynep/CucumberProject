@US07DB
Feature:  Dean, mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve
  subject bilgilerini görüntüleyebilmelidir.Dean mesajları silebilmelidir.

  Scenario: TCO1 Dean mesajlari gorebilmelidir
    Given Database icin contact saglanir
    When Databaseden olusturulan mesajlar sorgulanir
    Then Gonderilen mesajlarin goruldugu dogrulanir
