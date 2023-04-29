@US02DB
Feature: Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini görebilmeli

  Scenario: TC01 Admin Guest User name bilgilerini gorebilmeli
    Given Database icin contact saglanir
    When Admin Guest User name bilgilerini databasede sorgular
    Then Admin Guest User name bilgilerini gorebildigini dogrular
    Then Close Database

  Scenario: TC02 Admin Guest User phone number bilgilerini gorebilmeli
    Given Database icin contact saglanir
    When Admin Guest User phone number bilgilerini databasede sorgular
    Then Admin Guest User phone number bilgilerini gorebildigini dogrular
    Then Close Database

  Scenario: TC03 Admin Guest User ssn bilgilerini gorebilmeli
    Given Database icin contact saglanir
    When Admin Guest User ssn bilgilerini databasede sorgular
    Then Admin Guest User ssn bilgilerini gorebildigini dogrular
    Then Close Database

  Scenario: TC04 Admin Guest User username bilgilerini gorebilmeli
    Given Database icin contact saglanir
    When Admin Guest User username bilgilerini databasede sorgular
    Then Admin Guest User username bilgilerini gorebildigini dogrular
    Then Close Database

  Scenario: TC05 Admin Guest User List bilgilerini silebilir
    #UI
    #Given Kullanici admin olarak login olur.
    #And Menu botonuna tiklar
    #And Main menu sayfasindan Guest User List tiklar
    #When Guest User List bilgilerini siler
    #DB
    When Database icin contact saglanir
    When Admin Guest User username bilgilerini databasede sorgular
    Then Admin Guest User username bilgilerini goremedigini dogrular
    Then Close Database

