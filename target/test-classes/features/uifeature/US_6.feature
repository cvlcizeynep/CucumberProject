Feature: Dean Vice Dean ekleyebilmeli

  Background:
    Given Kullanici Dean olarak login olur.
Scenario Outline: TC01 Dean basariyla viceDean eklemeli
    Given Kullanici "<Name>" kismina valid  girer
    When Kullanici "<Surname>" kismina valid  girer
    And "<Birth Place>" kismina valid deger girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici "<Dogum tarihi>" girer
    And Kullanici "<Telefon numarasi>" girer
    And  Kullanici valid "<SSN>" girer
    And Kullanici "<User Name>" girer
    And   Kullanici en az 8 karakterden oluşan "<Password>" girer
    And   Kullanici submit tusuna tiklar.
    Then Kullanici basariyla Vice Dean ekleyebildigini dogrular.

    Examples: Name data
        | Name |Surname|Birth Place|Dogum tarihi|Telefon numarasi|SSN|User Name|Password|
        | Zeynep|Orhan |Londra     |03.08.1987  |552-678-9876    |455-987-9876|zeyorhan|12wertyumn|
        |Huseyin|Eken  |Bitlis      |19.06.1985  |765-876-8765    |876-876-0987|huseyni |789uikmnh |
        |Ayse   |Narci |Izmir      |09.09.1990  |786-987-8765    |654-987-9876|aysenarc|87990jnmkg|
