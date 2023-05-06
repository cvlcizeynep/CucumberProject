@US01DB
Feature: "Aday öğrenciler sisteme kayıt olabilmelidir.(Register)"


  Scenario: TC01 Registerdaki bütün alanlar valid değerlerle doldurularak öğrenci kaydı yapılabilmeli
    Given Admin Guest User List olusturmak icin post request gonderir US01

    Scenario: TC02 TC01'deki kayıdın database'de olup olmadığı sorgulanır.
      Given Database icin contact saglanir
      And  Kullanıcı database'de Tc01'de olusturdugu hesabi dogrular
      Then Database ile bağlantı kesilir.