@US05DB
Feature: Admin Dean'lerin Name, Gender, Phone Number, SSN, User Name bilgilerini görebilmeli

  Scenario: TC01 Admin deanlerin bilgilerini gorebilmeli
    Given Database icin contact saglanir
    When Deanlerin name bilgilerini databasede sorgular
    Then Admin deanin  name bilgilerini gorebildigini dogrular
    Then Close Database

