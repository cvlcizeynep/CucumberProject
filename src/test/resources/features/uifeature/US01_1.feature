@us01aa
#1-3-5-9-13-18
Feature: "Aday öğrenciler sisteme kayıt olabilmelidir"(Register)

  Scenario Outline: Kullanıcı Boş bir bölüm ile kayıt olamaz

    Given Kullanıcı register sayfasına gider.
    When Kullanici register Name "<Name>" kismina değer  girer
    When Kullanici register Surname "<Surname>" kismina değer  girer
    And Kullanici register Birth place "<Birth Place>" kismina  deger girer
    And  Kullanici register Gender kismini secer
    And  Kullanici register Birth of Date "<Birth of Date>"  girer
    And Kullanici register Phone Number "<Phone Number>" girer
    And  Kullanici register SSN  "<SSN>" girer
    And Kullanici register User Name "<User Name>" girer
    And   Kullanici register Password "<Password>" girer
    And   Kullanici register submit tusuna tiklar.
    Examples: data
      | Name    | Surname | Birth Place | Birth of Date | Phone Number | SSN         | User Name | Password |
      |         | Montana  | İskenderun | 26.01.1996    | 123-000-1234 | 123-00-0000 | tony00001 | 12345678 |