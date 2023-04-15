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
  Scenario Outline:TC02_Alanlari Bos Birakarak Ogretmen Ekleme
    And Choose Lessons alanindan bir ders secer
    And Kullanici Name textboxina valid bir deger "<Name>" girer
    And Kullanici Surname textboxina valid bir deger "<Surname>" girer
    And Kullanici Birth Place textboxina valid bir deger "<Birth Place>" girer
    And Kullanici Email textboxina valid bir deger "<Email>"girer
    And Kullanici Phone textboxina valid bir deger "<Phone>" girer
    And Kullanici SSN textboxina valid bir deger "<SSN>"girer
    And Kullanici Username textboxina valid bir deger "<Username>" girer
    And Kullanici Password textboxina valid bir deger "<Password>" girer
    And Kullanici Is Advisor Teacher checkboxina tiklar
    And Kullanici Gender  alanindan cinsiyet "<Gender>" secer
    And Kullanici Date of birth alanina bir tarih "<Date of birth>" girer
    And Kullanici Submit butonuna tiklar
    Then Kullanici Submit butonunun aktif olmadigini gorur
    When Ekran goruntusu alinir
    Then close driver

    Examples:
      | Name   | Surname | Birth Place | Username | Date of birth | Email         | Phone        | Password    | Gender | SSN         |
      |        | Team20  | izmir       | asdfghjk | 09-01-1998    | asd@gmail.com | 512-310-1538 | 510-31-1538 | male   | 333-26-5656 |
      | Team20 |         | izmir       | asdfghjk | 09-01-1998    | asd@gmail.com | 512-310-2538 | 510-31-1538 | male   | 333-26-5656 |
      | Team20 | Team20  |             | asdfghjk | 09-01-1998    | asd@gmail.com | 512-310-3538 | 510-31-1538 | male   | 333-26-5656 |
      | Team20 | Team20  | izmir       |          | 09-01-1998    | asd@gmail.com | 512-310-4538 | 510-31-1538 | male   | 333-26-5656 |
      | Team20 | Team20  | izmir       | asdfghjk |               | asd@gmail.com | 512-310-6538 | 510-31-1538 | male   | 333-26-5656 |
      | Team20 | Team20  | izmir       | asdfghjk | 09-01-1998    |               | 512-310-7538 | 510-31-1538 | male   | 333-26-5656 |
      | Team20 | Team20  | izmir       | asdfghjk | 09-01-1998    | asd@gmail.com |              | 510-31-1538 | male   | 333-26-5656 |
      | Team20 | Team20  | izmir       | asdfghjk | 09-01-1998    | asd@gmail.com | 512-310-7538 | 510-31-1538 | male   | 333-26-5656 |
      | Team20 | Team20  | izmir       | asdfghjk | 09-01-1998    | asd@gmail.com | 512-310-7538 |             | male   | 333-26-5656 |
      | Team20 | Team20  | izmir       | asdfghjk | 09-01-1998    | asd@gmail.com | 512-310-7538 | 510-31-1538 |        | 333-26-5656 |
      | Team20 | Team20  | izmir       | asdfghjk | 09-01-1998    | asd@gmail.com | 512-310-7538 | 510-31-1538 | male   |             |
      | Team20 | Team20  | izmir       | asdfghjk | 09-01-1998    | asdgmail.com  | 512-310-7538 | 510-31-1538 | male   | 333-26-5656 |

  @3
  Scenario Outline:TC03_SSN 9 rakam icermelidir
    And Choose Lessons alanindan bir ders secer
    And Kullanici Name textboxina valid bir deger "<Name>" girer
    And Kullanici Surname textboxina valid bir deger "<Surname>" girer
    And Kullanici Birth Place textboxina valid bir deger "<Birth Place>" girer
    And Kullanici Email textboxina valid bir deger "<Email>"girer
    And Kullanici Phone textboxina valid bir deger "<Phone>" girer
    And Kullanici SSN textboxina  bir deger "<SSN>"girer
    And Kullanici Username textboxina valid bir deger "<Username>" girer
    And Kullanici Password textboxina valid bir deger "<Password>" girer
    And Kullanici Is Advisor Teacher checkboxina tiklar
    And Kullanici Gender  alanindan cinsiyet "<Gender>" secer
    And Kullanici Date of birth alanina bir tarih "<Date of birth>" girer
    And Kullanici Submit butonuna tiklar
    Then Kullanici Submit butonunun aktif olmadigini gorur
    When Ekran goruntusu alinir
    Then close driver
    Examples:
      | Name  | Surname | Birth Place | Username | Date of birth | Email         | Phone        | Password    | Gender | SSN          |
      | Erkam | Team20  | izmir       | asdfghjk | 09-01-1998    | asd@gmail.com | 512-310-1538 | 510-31-1538 | male   | 333-26-5656  |
      | Erkam | Team20  | izmir       | asdfghjk | 09-01-1998    | asd@gmail.com | 512-310-1538 | 510-31-1538 | male   | 33-26-5656   |
      | Erkam | Team20  | izmir       | asdfghjk | 09-01-1998    | asd@gmail.com | 512-310-1538 | 510-31-1538 | male   | 3333-26-5656 |