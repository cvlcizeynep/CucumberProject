@us04-test01
Feature: Admin dean ekleyebilmeli

  Background:
    Given Kullanici Admin olarak giris yapar

  Scenario Outline: Test01_Zorunlu_Alanlarin_Bos_Birakilmasi
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
    And Kullanici uyari yazisi gordugunu dogrular.
    Then close driver
    Examples: data
      | Name    | Surname | Birth Place | Birth of Date | Phone Number | SSN         | User Name | Password |
      |         | abc     | izmir       | 11.11.1111    | 236-789-7412 | 456-96-7852 | Deneme963 | 12345678 |
      | Team20N |         | Izmir       | 11.11.1111    | 236-789-7412 | 456-96-7452 | Deneme963 | 12345678 |
      | Team20N | abc     |             | 11.11.1111    | 236-789-7412 | 456-96-7452 | Deneme963 | 12345678 |
      | Team20N | abc     | Izmir       |               | 236-789-7412 | 456-96-7452 | Deneme963 | 12345678 |
      | Team20N | abc     | Izmir       | 11.11.1111    |              | 456-96-7452 | Deneme963 | 12345678 |
      | Team20N | abc     | Izmir       | 11.11.1111    | 236-789-7412 |             | Deneme963 | 12345678 |
      | Team20N | abc     | Izmir       | 11.11.1111    | 236-789-7412 | 456-96-7452 |           | 12345678 |
      | Team20N | abc     | Izmir       | 11.11.1111    | 236-789-7412 | 456-96-7452 | Deneme963 |          |

  @us04-test02
  Scenario Outline: Sayisal_deger_ile_kayit_testi
    Given Kullanici Name "<Name>" kismina valid  girer
    When Kullanici Surname "<Surname>" kismina valid  girer
    And Kullanici Birth place "<Birth Place>" kismina valid deger girer
    And  Kullanici Gender kismini secer
    And  Kullanici Birth of Date "<Birth of Date>"  girer
    And Kullanici Phone Number alanina valid bir deger girer
    And  Kullanici SSN  alanina valid bir deger girer
    And Kullanici User Name alanina valid bir deger girer
    And   Kullanici en az sekiz karakterden oluşan Password "<Password>" girer
    And   Kullanici submit tusuna tiklar.
    #And Kullanici basariyla Dean ekleyebildigini dogrular.
    Then close driver
    Examples: data
      | Name | Surname | Birth Place | Birth of Date | Password |
      | 123  | abc     | izmir       | 11.11.1111    | 12345678 |
      | abc  | 123     | izmir       | 11.11.1111    | 12345678 |
      | abc  | abc     | 123          | 11.11.1111    | 12345678 |

