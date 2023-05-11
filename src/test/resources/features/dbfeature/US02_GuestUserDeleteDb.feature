@US02DB
Feature: Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini görebilmeli

  Scenario Outline: TC01 Admin Guest User name bilgilerini gorebilmeli
     #UI
    Given Guest user "<name>" "<surname>" "<birthplace>" "<phone>"  "<date>" "<ssn>" "<username>" "<password>" girerek kayit olur
    #DB
    When Database icin connect saglanir
    When Admin Guest User name bilgilerini databasede sorgular
    Then Admin Guest User name bilgilerini gorebildigini dogrular
    Then Close Database

    Examples:
      | name | surname | birthplace | phone | date | ssn | username | password |
      |hayriye |kilic    |izmir      |598-256-6589|12-12-2012|235-56-5896|hayriyekilic|12345678|

  Scenario: TC02 Admin Guest User phone number bilgilerini gorebilmeli
    Given Database icin connect saglanir
    When Admin Guest User phone number bilgilerini databasede sorgular
    Then Admin Guest User phone number bilgilerini gorebildigini dogrular
    Then Close Database

  Scenario: TC03 Admin Guest User ssn bilgilerini gorebilmeli
    Given Database icin connect saglanir
    When Admin Guest User ssn bilgilerini databasede sorgular
    Then Admin Guest User ssn bilgilerini gorebildigini dogrular
    Then Close Database

  Scenario: TC04 Admin Guest User username bilgilerini gorebilmeli
    Given Database icin connect saglanir
    When Admin Guest User username bilgilerini databasede sorgular
    Then Admin Guest User username bilgilerini gorebildigini dogrular
    Then Close Database

  Scenario: TC05 Admin Guest User List bilgilerini silebilir
    #Api
    Given Guest user datayi delete request ile siler
    #DB
    When Database icin connect saglanir
    When Admin Guest User username bilgilerini databasede sorgular
    Then Admin Guest User username bilgilerini goremedigini dogrular
    Then Close Database

