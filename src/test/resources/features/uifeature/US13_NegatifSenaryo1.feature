@gulser1
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
    When Email alanina valid bir deger "<Email>" girer
    When Phone alanina valid bir deger "<Phone>" girer
    When SSN alanina valid bir deger "<SSN>" girer
    When Username alanina valid bir deger girer
    When Password alanina valid bir deger "<Password>" girer
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Gender alanindan male secer
    When Date of birth alanina bir tarih "<Date of birth>" girer
    When Submit butonuna tiklar
    When Submit butonunun aktif olmadigini gorur
    When Ekran goruntusu alinir
    Then close driver


    Examples:
      | Surname | Name   | Birth Place | Password | Date of birth | Email         | Phone        | SSN         |
      | Team20  |        | izmir       | asdfghjk | 09-01-1998    | a@gmail.com   | 333-226-5656 | 333-26-5656 |
      |         | Team20 | izmir       | asdfghjk | 09-01-1998    | aq@gmail.com  | 333-226-5655 | 333-26-5556 |
      | Team20  | Team20 |             | asdfghjk | 09-01-1998    | aqw@gmail.com | 333-226-5654 | 333-26-5456 |
      | Team20  | Team20 | izmir       |          | 09-01-1998    | awe@gmail.com | 333-226-5653 | 333-26-5356 |
      | Team20  | Team20 | izmir       | asdfghjk |               | aer@gmail.com | 333-226-5652 | 333-26-5256 |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    |               | 333-226-5651 | 333-26-5156 |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | aza@gmail.com |              | 333-26-5756 |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | ac@gmail.com  | 333-226-5651 |             |


  @gulser2
  Scenario Outline: Space Karakteri ile Ogretmen Ekleme

    When Choose Lessons alanindan bir ders secer
    When Name alanina space "<Name>" girer
    When Surname alanina space "<Surname>" girer
    When Birth Place alanina space "<Birth Place>" girer
    When Email alanina space "<Email>" girer
    When Phone alanina space "<Phone>" girer
    When SSN alanina space "<SSN>" girer
    When Username alanina valid bir deger girer
    When Password alanina space "<Password>" girer
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Gender alanindan male secer
    When Date of birth alanina bir tarih "<Date of birth>" girer
    When Submit butonuna tiklar
    When Submit butonunun aktif olmadigini gorur
    When Ekran goruntusu alinir
    Then close driver


    Examples:
      | Surname | Name   | Birth Place | Password | Date of birth | Email         | Phone        | SSN         |
      | Team20  |        | izmir       | asdfghjk | 09-01-1998    | asd@gmail.com | 512-310-1538 | 510-31-1538 |
      |         | Team20 | izmir       | asdfghjk | 09-01-1998    | asd@gmail.com | 512-310-2538 | 510-31-1538 |
      | Team20  | Team20 |             | asdfghjk | 09-01-1998    | asd@gmail.com | 512-310-3538 | 510-31-1538 |
      | Team20  | Team20 | izmir       |          | 09-01-1998    | asd@gmail.com | 512-310-4538 | 510-31-1538 |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    |               | 512-310-6538 | 510-31-1538 |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | asd@gmail.com | 512-310-7538 |             |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | asd@gmail.com |              | 510-31-1538 |



  @gulser3
  Scenario Outline: Invalid Degerlerle Ogretmen Ekleme

    When Choose Lessons alanindan bir ders secer
    When Name alanina valid bir deger "<Name>" girer
    When Surname alanina valid bir deger "<Surname>" girer
    When Birth Place alanina valid bir deger "<Birth Place>" girer
    When Email alanina invalid bir deger girer
    When Phone alanina invalid bir deger "<Phone>" girer
    When SSN alanina valid bir deger "<SSN>" girer
    When Username alanina valid bir deger girer
    When Password alanina valid bir deger "<Password>" girer
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Gender alanindan male secer
    When Date of birth alanina bir tarih "<Date of birth>" girer
    When Submit butonuna tiklar
    When Submit butonunun aktif olmadigini gorur
    When Ekran goruntusu alinir
    Then close driver


    Examples:
      | Surname | Name   | Birth Place | Password | Date of birth | SSN          | Phone        |
      | Team20  | Team20 | izmir       | asdfghjk | 25-01-2025    | 512-31-1538  | 510-31-1538  |
      | Team20  | Team20 | izmir       | asdfghjk | 25-01-2022    | 512-31-1538  | 510-31-1538  |
      | Team20  | Team20 | izmir       | asdfghj  | 09-01-1998    | 312-31-1538  | 510-31-1538  |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | 55555555555  | 510-31-1538  |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | abcdefgfh    | 510-31-1538  |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | 212-315-1538 | 510-31-1538  |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | 3335-66-744  | 510-31-1538  |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | 333-66-744   | 510311538000 |


  Scenario: Cinsiyet Alaninin Bos Birakilmasi

    When Choose Lessons alanindan bir ders secer
    When Name alanina valid bir deger "Team20" girer
    When Surname alanina valid bir deger "Team20" girer
    When Birth Place alanina valid bir deger "izmir" girer
    When Email alanina valid bir deger girer
    When Phone alanina valid bir deger girer
    When SSN alanina valid bir deger girer
    When Username alanina valid bir deger girer
    When Password alanina valid bir deger "Team20_09" girer
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Date of birth alanina bir tarih "01.09.1998" girer
    When Submit butonuna tiklar
    When Submit butonunun aktif olmadigini gorur
    When Ekran goruntusu alinir
    Then close driver


  Scenario: Choose Lessons Alaninin Bos Birakilmasi

    When Surname alanina valid bir deger "Team20" girer
    When Name alanina valid bir deger "Team20" girer
    When Birth Place alanina valid bir deger "izmir" girer
    When Email alanina valid bir deger girer
    When Phone alanina valid bir deger girer
    When SSN alanina valid bir deger girer
    When Username alanina valid bir deger girer
    When Password alanina valid bir deger "Team20_09" girer
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Gender alanindan male secer
    When Date of birth alanina bir tarih "01.09.1998" girer
    When Submit butonuna tiklar
    When Submit butonunun aktif olmadigini gorur
    When Ekran goruntusu alinir
    Then close driver














