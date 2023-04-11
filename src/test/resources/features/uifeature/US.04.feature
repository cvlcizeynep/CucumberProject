@us04-tc01
Feature: Admin dean ekleyebilmeli
  Background:
    Given Kullanici Admin olarak giris yapar

  Scenario Outline: Admin dean olusturabilmeli
    Given Kullanici Name "<Name>" kismina valid  girer
    When Kullanici Surname "<Surname>" kismina valid  girer
    And Kullanici Birth place "<Birth Place>" kismina valid deger girer
    And  Kullanici Gender kismini secer
    And  Kullanici Birth of Date "<Birth of Date>"  girer
    And Kullanici Phone Number "<Phone Number>" girer
    And  Kullanici SSN  "<SSN>" girer
    And Kullanici User Name "<User Name>" girer
    And   Kullanici en az sekiz karakterden oluşan Password "<Password>" girer
    And   Kullanici submit tusuna tiklar.
    Then Kullanici basariyla Dean ekleyebildigini dogrular.

    Examples: Data
      |Name | Surname | Birth Place| Birth of Date |  Phone Number| SSN         | User Name |Password |
      |John|Smith     |London       |01.05.2000     |551-789-9732  |719-69-3120|deneme32   |12345678 |