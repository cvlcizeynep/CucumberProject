Feature: Vicedean mesaj sorgulama

  @db16
  Scenario: TC01 Vice dean database ile mesajlari gorulebilmelidir.
    When Database icin connect saglanir
    When Databaseden olusturulan mesajlar sorgulanir

  Scenario: TC02 Vicedean mesaj silebilmelidir
      #bizim silme yetkimiz olmadigi icin yapilmadi
