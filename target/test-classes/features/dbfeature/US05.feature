@US05DB
Feature: Admin Dean'lerin Name, Gender, Phone Number, SSN, User Name bilgilerini görebilmeli

  Scenario: TC01 Admin deanlerin name bilgilerini gorebilmeli
    #api
   # Given kullanici dean eklemek icin post request gonderir
    Given Database icin connect saglanir
    When Deanlerin name bilgilerini databasede sorgular
    Then Admin deanin  name bilgilerini gorebildigini dogrular
    Then Close Database

  Scenario: TC02 Admin deanlerin gender bilgilerini gorebilmeli
    Given Database icin connect saglanir
    When Deanlerin gender bilgilerini databasede sorgular
    Then Admin deanin gender bilgilerini gorebildigini dogrular
    Then Close Database

  Scenario: TC03 Admin deanlerin phone number bilgilerini gorebilmeli
    Given Database icin connect saglanir
    When Deanlerin phone number  bilgilerini databasede sorgular
    Then Admin deanin phone number bilgilerini gorebildigini dogrular
    Then Close Database

  Scenario: TC04 Admin deanlerin SSN bilgilerini gorebilmeli
    Given Database icin connect saglanir
    When Deanlerin ssn bilgilerini databasede sorgular
    Then Admin deanin ssn bilgilerini gorebildigini dogrular
    Then Close Database

  Scenario: TC05 Admin deanlerin username bilgilerini gorebilmeli
    Given Database icin connect saglanir
    When Deanlerin username bilgilerini databasede sorgular
    Then Admin deanin  username bilgilerini gorebildigini dogrular
    Then Close Database

  Scenario: TC06 Admin Deanleri silebilmeli
    #API

    #DB
    Given Database icin connect saglanir
    When Deanlerin username bilgilerini databasede sorgular
    Then Admin deanin  username bilgilerini goremedigini dogrular
    Then Close Database

  Scenario: TC07 Admin Deanleri  günceleyebilmeli
    #UI
   # Given Kullanici admin olarak login olur.
    #And Menu botonuna tiklar
   # And Main menu sayfasindan Dean Management tiklar
    #And  Edit sayfasindaki Cinsiyet kismini secer
    #And  telefon numarasini gunceller
    #And  password girer
    #And  edit sayfasindaki submit tusuna tiklar.
    #DB
    Given Database icin connect saglanir
    When Deanlerin phone number  bilgilerini databasede sorgular
    Then Admin deanin  phone number bilgisinin guncellendigini dogrular
    Then Close Database


