@US13DB
Feature: Vice Dean Teacher ekleyebilmelidir.

  Scenario: TC01 Eklenen vice dean database gorulebilmelidir.

    Given Kullanici viceDean olarak login olur.
    Given Kullanici Teacher ekler
    When Database icin connect saglanir
    When Databaseden olusturulan teacher bilgileri sorgulanir
    Then Databasede vice deanin ekledigi teacher in goruldugu dogrulanir.