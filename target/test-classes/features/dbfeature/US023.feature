@US23DB
  Feature: Adminin ekledigi Dean databasede goruntulenmelidir.

  Scenario: TC01 Adminin ekledigi dean databaseden dogrulanir.

  Given Kullanici admin olarak login olur.
    When Admin Dean ekler
    When Database icin connect saglanir
    When Databaseden adminin olusturdugu vice dean bilgileri sorgulanir
    Then Databaseden adminin ekledigi vice deanin goruldugu dogrulanir.
