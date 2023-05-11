@US13DB
Feature: Vice Dean Teacher ekleyebilmelidir.

  Scenario: TC01 Eklenen teacher database de gorulebilmelidir.
    Given Vice Dean Teacher ekler
    When Databasede vice dean in ekledigi teacher in goruldugu dogrulanir.



































       # Given Kullanici viceDean olarak login olur.
#    Given Kullanici Teacher ekler
#    Given kullanici teacher eklemek icin post request gonderir
#    When Database icin connect saglanir
#    When Databaseden olusturulan teacher bilgileri sorgulanir
#    Then Databasede vice deanin ekledigi teacher in goruldugu dogrulanir.