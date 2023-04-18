
Feature:Admin teacher olusturabilmeli


  @smoke @24_0
  Scenario Outline:Pozitif scenario
    Given Kullanici admin olarak login olur.
    And Kullanici Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Choose Lessons alanindan bir ders secer
    And Kullanici Name textboxina valid bir deger "<Name>" girer
    And Kullanici Surname textboxina valid bir deger "<Surname>" girer
    And Kullanici Birth Place textboxina valid bir deger "<Birth Place>" girer
    And Kullanici Email textboxina valid bir deger girer
    And Kullanici Phone textboxina valid bir deger girer
    And Kullanici SSN textboxina valid bir deger girer
    And Kullanici Username textboxina valid bir deger  girer
    And Kullanici Password textboxina valid bir deger "<Password>" girer
    And Kullanici Is Advisor Teacher checkboxina tiklar
    And Kullanici Gender  alanindan cinsiyet "<Gender>" secer
    And Kullanici Date of birth alanina bir tarih "<Date of birth>" girer
    And Kullanici Submit butonuna tiklar
    Then close driver

    Examples:
      | Surname | Name   | Birth Place | Password | Date of birth | Gender |
      | Team20  | Team20 | izmir       | 12345678 | 01-09-1998    | male   |
