@us04-test01
Feature: Admin dean ekleyebilmeli

  Background:
    Given Kullanici Admin olarak giris yapar

#tc03-tc06-tc09-tc12-tc15-tc21-tc23-tc25
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

#tc02-tc05-tc08
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
    And Kullanici basariyla Dean ekleyebildigini dogrular.
    Then close driver
    Examples: data
      | Name | Surname | Birth Place | Birth of Date | Password |
      | 123  | abc     | izmir       | 11.11.1111    | 12345678 |
      | abc  | 123     | izmir       | 11.11.1111    | 12345678 |
      | abc  | abc     | 123          | 11.11.1111    | 12345678 |

#tc14
  @us04-test03
  Scenario Outline: Phone_kismina_harf_girisi_testi
    Given Kullanici Name kismina valid  girer
    When Kullanici Surname kismina valid  girer
    And Kullanici Birth place kismina valid deger girer
    And  Kullanici Gender kismini secer
    And  Kullanici Date of birth alanina "<Date of Birth>" bir tarih girer
    And Kullanici Phone Number alanina "aaa-bbb-cccc" degerini girer
    And  Kullanici SSN  alanina valid bir deger girer
    And Kullanici User Name alanina valid bir deger girer
    And   Kullanici en az sekiz karakterden oluşan Password "<Password>" girer
    And   Kullanici submit tusuna tiklar.
    And Kullanici dean ekleyemedigini dogrular
    Then close driver
    Examples: data
      | Date of Birth | Password |
      | 12.02.2000   | 12345678  |

#tc18-tc19-tc20-
  @us04-test04
  Scenario Outline: SSN_Bolumu_Negatif_Testi
    Given Kullanici Name kismina valid  girer
    When Kullanici Surname kismina valid  girer
    And Kullanici Birth place kismina valid deger girer
    And  Kullanici Gender kismini secer
    And  Kullanici Date of birth alanina "<Date of Birth>" bir tarih girer
    And Kullanici Phone Number alanina valid bir deger girer
    And  Kullanici SSN  "<SSN>" girer
    And Kullanici User Name alanina valid bir deger girer
    And   Kullanici en az sekiz karakterden oluşan Password "<Password>" girer
    And   Kullanici submit tusuna tiklar.
    And Kullanici ssn box altinda uyari yazisi ciktigini dogrular
    Then close driver
    Examples: data
      | Date of Birth | SSN         | Password |
      | 12.02.2000    | 11111-1111  | 12345678 |
      | 12.02.2000    | 111-111111 | 12345678 |
      | 12.02.2000    | 111111111 | 12345678 |

#tc26
  @us04-test05
  Scenario Outline: Password_bolumune_sekiz_karakterden_az_rakamgirisi_testi
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
    And Kullanici password box altinda uyari yazisi ciktigini dogrular
    Then close driver
    Examples: data
      | Date of Birth | Password |
      | 12.02.2000   | 1234567  |

