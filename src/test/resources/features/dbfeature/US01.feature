@US01DB
Feature: "Aday öğrenciler sisteme kayıt olabilmelidir.(Register)"


  Scenario Outline: TC01 Registerdaki bütün alanlar valid değerlerle doldurularak öğrenci kaydı yapılabilmeli ve bu kaydı database ile sorgulayabilmeli
    Given Kullanıcı register sayfasına gider.
    When Kullanici register Name "<Name>" kismina değer  girer
    When Kullanici register Surname "<Surname>" kismina değer  girer
    And Kullanici register Birth place "<Birth Place>" kismina  deger girer
    And  Kullanici register Birth of Date "<Birth of Date>"  girer
    And Kullanici register Phone Number "<Phone Number>" girer
    And  Kullanici register Gender kismini secer
    And  Kullanici register SSN  "<SSN>" girer
    And Kullanici register User Name "<User Name>" girer
    And   Kullanici register Password "<Password>" girer
    And   Kullanici register submit tusuna tiklar.
    And Kullanici Guest User Registered yazısı görür.
    Then close driver
    Examples: data
      | Name | Surname | Birth Place | Birth of Date | Phone Number | SSN         | User Name | Password  |
      | Emre | Yigit   | İskenderun  | 26.01.1996    | 123-995-1405 | 123-59-1315 | emre012   | 123345678 |

    Scenario: TC02 TC01'deki kayıdın database'de olup olmadığı sorgulanır.
      Given Database icin contact saglanir
      And  Kullanıcı database'de username'i "emre012" olan hesabın varlığını doğrular
      Then Database ile bağlantı kesilir.