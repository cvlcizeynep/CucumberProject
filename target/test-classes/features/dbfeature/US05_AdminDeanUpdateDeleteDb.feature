@End2End
Feature: Admin Dean'lerin Name, Gender, Phone Number, SSN, User Name bilgilerini görebilmeli

  Scenario:TC01 Admin deanlerin name bilgilerini gorebilmeli
    Given Kullanici Dean bilgisi ekler
    And Database icin connect saglanir
    When Databaseden olusturulan dean bilgileri sorgulanir ve dogrulanir
  @US05DB1
  Scenario:TC02 Admin deanleri gunceller
    Given Dean datayi put reguest ile gunceller.
    And Database icin connect saglanir
    When Databaseden guncellenen dean bilgileri sorgulanir ve dogrulanir

  @US05DB2
  Scenario:TC02 Admin deanleri siler
    Given Dean datayi delete request ile siler.
    When Databaseden silinen dean bilgileri sorgulanir ve dogrulanir










