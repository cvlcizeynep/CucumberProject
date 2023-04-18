@us04-tc01 @smoke
Feature: Admin dean ekleyebilmeli
  Background:
    Given Kullanici Admin olarak giris yapar
#tc01-tc04-tc07-tc10-tc11-tc13-tc16-tc22-tc24
  Scenario Outline: Admin dean olusturabilmeli
    Given Kullanici Name kismina valid  girer
    When Kullanici Surname kismina valid  girer
    And Kullanici Birth place kismina valid deger girer
    And  Kullanici Gender kismini secer
    And  Kullanici Date of birth alanina "<Date of Birth>" bir tarih girer
    And Kullanici Phone Number alanina valid bir deger girer
    And  Kullanici SSN  alanina valid bir deger girer
    And Kullanici User Name alanina valid bir deger girer
    And   Kullanici en az sekiz karakterden oluşan Password "<Password>" girer
    And   Kullanici submit tusuna tiklar.
    And Kullanici basariyla Dean ekleyebildigini dogrular.
    Then close driver
    Examples: data
      |Date of Birth|Password|
      |11.11.1111   |12345678|