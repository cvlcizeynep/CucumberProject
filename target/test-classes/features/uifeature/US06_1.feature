@US06.1, @smoke
Feature: Dean Vice Dean ekleyebilmeli

  Background:
    Given Kullanici Dean olarak login olur.
Scenario: TC01 Dean basariyla viceDean eklemeli
    Given Kullanici  Name kismina valid deger girer
    When Kullanici Surname kismina valid deger girer
    And Birth Place kismina valid deger girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici Dogum tarihine "03061988" girer
    And Kullanici  telefon numarasina valid deger girer
    And  Kullanici SSN kismina valid deger girer
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklar.
    Then Kullanici basariyla Vice Dean ekleyebildigini dogrular.
    Then close driver

