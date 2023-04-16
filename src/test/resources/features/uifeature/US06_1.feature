@adddean
Feature: Dean Vice Dean ekleyebilmeli

  Background:
    Given Kullanici Dean olarak login olur.
Scenario Outline: TC01 Dean basariyla viceDean eklemeli
    Given Kullanici name "<Name>" kismina valid  girer
    When Kullanici  surname "<Surname>" kismina valid  girer
    And Kullanici birt place "<Birth Place>" kismina valid deger girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici dogum tarihine  "<Dogum tarihi>" girer
    And Kullanici telefon numarasi "<Telefon numarasi>" girer
    And  Kullanici ssn kismina valid "<SSN>" girer
    And Kullanici username "<User Name>" girer
    And   Kullanici en az sekiz karakterden oluşan password "<Password>" girer
    And   Kullanici submit tusuna tiklar.
    Then Kullanici basariyla Vice Dean ekleyebildigini dogrular.
    Then close driver

    Examples: Name data
        | Name |Surname|Birth Place|Dogum tarihi|Telefon numarasi|SSN|User Name|Password|
        | Zeynep|Orhan |Londra     |03.08.1987  |572-677-9876    |405-28-9876|zerhn|12wertyumn|
        |Huseyin|Eken  |Bitlis      |19.06.1985  |085-176-8765    |176-87-0987|enoi |789uikmnh |
        |Ayse   |Narci |Izmir      |09.09.1990  |756-967-8765    |754-98-9876|enrmc|87990jnmkg|
