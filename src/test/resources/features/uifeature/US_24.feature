

@24
Feature:Admin teacher olusturabilmeli

  Background:
    Given Kullanici admin olarak login olur.
    And Kullanici Menu butonuna tiklar
    And Teacher Management butonuna tiklar

  Scenario:TC01_Ogretmenin girecegi ders secilmelidir.
    And Choose Lessons alanindan bir ders secer

  Scenario Outline:TC02_Name girilmelidir,bos birakilamaz.
    And Choose Lessons alanindan bir ders secer
    And Kullanici Surname textboxina valid bir deger girer
    And Kullanici Birth Place textboxina valid bir deger "<Birth Place>" girer
    And Kullanici Email textboxina valid bir deger girer
    And Kullanici Phone textboxina valid bir deger girer
    And Kullanici SSN textboxina valid bir deger girer
    And Kullanici Username textboxina valid bir deger girer
    And Kullanici Password textboxina valid bir deger girer
    And Kullanici Is Advisor Teacher checkboxina tiklar
    And Kullanici Gender  alanindan cinsiyet "<gender>" secer
    And Kullanici Date of birth alanina bir tarih "<Date of birth>" girer
    And Kullanici Name textboxinin altinda "Required" yazisini gorur
    And Kullanici Submit butonuna tiklar
    And Kullanici Submit butonunun aktif olmadigini gorur


    Examples:
      | Birth Place |gender|Date of birth|
      | Ankara      |male  |09-01-1998   |
