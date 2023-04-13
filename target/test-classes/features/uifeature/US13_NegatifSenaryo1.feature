@gulser
Feature:Teacher Ekleme Negatif Senaryo 1

  Background:
    When Kullanici viceDean olarak login olur.
    Then Basariyla viceDean girisi yaptigini dogrular.
    When Menu butonuna tiklar
    When Teacher Management butonuna tiklar


  Scenario Outline: Alanlari Bos Birakarak Ogretmen Ekleme

    When Choose Lessons alanindan bir ders secer
    When Name alanina valid bir deger "<Name>" girer
    When Surname alanina valid bir deger "<Surname>" girer
    When Birth Place alanina valid bir deger "<Birth Place>" girer
    When Email alanina valid bir deger girer
    When Phone alanina valid bir deger girer
    When SSN alanina valid bir deger girer
    When Username alanina valid bir deger girer
    When Password alanina valid bir deger "<Password>" girer
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Gender alanindan cinsiyet "<Cinsiyet>" secer
    When Date of birth alanina bir tarih "<Date of birth>" girer
    When Submit butonuna tiklar
    When Submit butonunun aktif olmadigini gorur
    Then close driver


    Examples:
      | Surname | Name   | Birth Place | Password | Date of birth | Cinsiyet |
      | Team20  |        | izmir       | asdfghjk | 09-01-1998    | male     |
      |         | Team20 | izmir       | asdfghjk | 09-01-1998    | female   |
      | Team20  | Team20 |             | asdfghjk | 09-01-1998    | male     |
      | Team20  | Team20 | izmir       |          | 09-01-1998    | female   |
      | Team20  | Team20 | izmir       | asdfghjk |               | male     |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    |          |


      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | male     |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | female   |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | male     |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | female   |


  @gulser2
  Feature:Teacher Ekleme Negatif Senaryo 2

  Scenario Outline: Space Karakteri ile Ogretmen Ekleme

    When Choose Lessons alanindan bir ders secer
    When Name alanina valid bir deger "<Name>" girer
    When Surname alanina valid bir deger "<Surname>" girer
    When Birth Place alanina valid bir deger "<Birth Place>" girer
    When Email alanina valid bir deger "<Email>" girer
    When Phone alanina valid bir deger girer
    When SSN alanina valid bir deger "<SSN>" girer
    When Username alanina valid bir deger girer
    When Password alanina valid bir deger "<Password>" girer
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Gender alanindan cinsiyet "<Cinsiyet>" secer
    When Date of birth alanina bir tarih "<Date of birth>" girer
    When Submit butonuna tiklar
    When Submit butonunun aktif olmadigini gorur
    Then close driver


    Examples:
      | Surname | Name   | Birth Place | Password | Date of birth | Cinsiyet | Email         | SSN         |
      | Team20  |        | izmir       | asdfghjk | 09-01-1998    | male     | asd@gmail.com | 512-31-1538 |
      |         | Team20 | izmir       | asdfghjk | 09-01-1998    | female   | asd@gmail.com | 512-31-1538 |
      | Team20  | Team20 |             | asdfghjk | 09-01-1998    | male     | asd@gmail.com | 512-31-1538 |
      | Team20  | Team20 | izmir       |          | 09-01-1998    | female   | asd@gmail.com | 512-31-1538 |
      | Team20  | Team20 | izmir       | asdfghjk |               | male     | asd@gmail.com | 512-31-1538 |
      | Team20  | Team20 | izmir       | asdfghjk |               | male     |               | 512-31-1538 |
      | Team20  | Team20 | izmir       | asdfghjk |               | male     | asd@gmail.com |             |


  @gulser3
  Feature:Teacher Ekleme Negatif Senaryo 3

  Scenario Outline: Invalid Degerlerle Ogretmen Ekleme

    When Choose Lessons alanindan bir ders secer
    When Name alanina valid bir deger "<Name>" girer
    When Surname alanina valid bir deger "<Surname>" girer
    When Birth Place alanina valid bir deger "<Birth Place>" girer
    When Email alanina valid bir deger "<Email>" girer
    When Phone alanina valid bir deger girer
    When SSN alanina valid bir deger "<SSN>" girer
    When Username alanina valid bir deger girer
    When Password alanina valid bir deger "<Password>" girer
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Gender alanindan cinsiyet "<Cinsiyet>" secer
    When Date of birth alanina bir tarih "<Date of birth>" girer
    When Submit butonuna tiklar
    When Submit butonunun aktif olmadigini gorur
    Then close driver


    Examples:
      | Surname | Name   | Birth Place | Password | Date of birth | Cinsiyet | Email         | SSN          |
      | Team20  | Team20 | izmir       | asdfghjk | 25-01-2025    | female   | asd@gmail.com | 512-31-1538  |
      | Team20  | Team20 | izmir       | asdfghj  | 09-01-1998    | male     | asd@gmail.com | 312-31-1538  |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | male     | asd@gmail.com | 55555555555  |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | male     | asd@gmail.com | abcdefgfh    |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | male     | asd@gmail.com | 212-315-1538 |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | female   | asd@gmail.com | 3335-66-744  |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | female   | ffffff        | 333-66-744   |






















