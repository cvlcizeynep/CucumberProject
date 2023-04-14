@24
Feature:Admin teacher olusturabilmeli

  Background:
    Given Kullanici admin olarak login olur.
    And Kullanici Menu butonuna tiklar
    And Teacher Management butonuna tiklar
@1
  Scenario:TC01_Ogretmenin girecegi ders secilmelidir.
    And Choose Lessons alanindan bir ders secer
@2
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
    And Kullanici Submit butonuna tiklar
    Then Kullanici Submit butonunun aktif olmadigini gorur

    Examples:
      | Birth Place | gender | Date of birth |
      | Ankara      | male   | 09-01-1998    |
@3
  Scenario Outline: TC03_Surname girilmelidir, bos birakilamaz
    And Choose Lessons alanindan bir ders secer
    And Kullanici Name textboxina valid bir deger girer
    And Kullanici Birth Place textboxina valid bir deger "<Birth Place>" girer
    And Kullanici Email textboxina valid bir deger girer
    And Kullanici Phone textboxina valid bir deger girer
    And Kullanici SSN textboxina valid bir deger girer
    And Kullanici Username textboxina valid bir deger girer
    And Kullanici Password textboxina valid bir deger girer
    And Kullanici Is Advisor Teacher checkboxina tiklar
    And Kullanici Gender  alanindan cinsiyet "<gender>" secer
    And Kullanici Date of birth alanina bir tarih "<Date of birth>" girer
    And Kullanici Submit butonuna tiklar
    Then Kullanici Submit butonunun aktif olmadigini gorur

    Examples:
      | Birth Place | gender | Date of birth |
      | Ankara      | male   | 09-01-1998    |

@4
  Scenario Outline: TC04_Birth Place girilmelidir, bos bırakılamaz
    And Choose Lessons alanindan bir ders secer
    And Kullanici Name textboxina valid bir deger girer
    And Kullanici Surname textboxina valid bir deger girer
    And Kullanici Email textboxina valid bir deger girer
    And Kullanici Phone textboxina valid bir deger girer
    And Kullanici SSN textboxina valid bir deger girer
    And Kullanici Username textboxina valid bir deger girer
    And Kullanici Password textboxina valid bir deger girer
    And Kullanici Is Advisor Teacher checkboxina tiklar
    And Kullanici Gender  alanindan cinsiyet "<gender>" secer
    And Kullanici Date of birth alanina bir tarih "<Date of birth>" girer
    And Kullanici Submit butonuna tiklar
    Then Kullanici Submit butonunun aktif olmadigini gorur

    Examples:
      | gender | Date of birth |
      | male   | 09-01-1998    |


@5
  Scenario Outline:TC05_Email Alaninin bos birakilmasi

  Examples:
    |  |