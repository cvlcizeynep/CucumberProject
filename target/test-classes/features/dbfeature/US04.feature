@US04DB
Feature: Admin Dean ekleyebilmelidir.

  Scenario: TC01 Eklenen dean database gorulebilmelidir.
    Given Kullanici admin olarak login olur.
    And Kullanici Dean ekler
    When Database icin connect saglanir
    When Databaseden olusturulan dean bilgileri sorgulanir
    Then Databasede adminin ekledigi deanin goruldugu dogrulanir.
