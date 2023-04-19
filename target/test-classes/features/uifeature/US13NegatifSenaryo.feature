@US13
Feature:Teacher Ekleme Negatif Senaryo 1

  Background:
    Given Kullanici viceDean olarak login olur.
    Then Basariyla viceDean girisi yaptigini dogrular.
    When Menu butonuna tiklar
    When Teacher Management butonuna tiklar


  Scenario Outline: Alanini Bos Birakarak Ogretmen Ekleme
    When Choose Lessons alanindan bir ders secer
    When Alanlara bilgileri girer "<Name>", "<Surname>", "<Birth Place>", "<Password>","<Date of birth>","<Email>","<Phone>","<SSN>","<Username>"
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Gender alanindan male secer
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


  Scenario Outline: Cinsiyet Alaninin Bos Birakilmasi
    When Choose Lessons alanindan bir ders secer
    When Alanlara bilgileri girer "<Name>", "<Surname>", "<Birth Place>", "<Password>","<Date of birth>"
    When Email alanina valid bir deger girer
    When Phone alanina valid bir deger girer
    When SSN alanina valid bir deger girer
    When Username alanina valid bir deger girer
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Submit butonuna tiklar
    When Hata mesaji alir
    When Ekran goruntusu alinir
    Then close driver
    Examples:
      | Surname | Name   | Birth Place | Password  | Date of birth |
      | Team20  | Team20 | izmir       | 123456789 | 01-09-1998    |


  Scenario Outline: Choose Lessons Alaninin Bos Birakilmasi
    When Alanlara bilgileri girer "<Name>", "<Surname>", "<Birth Place>", "<Password>","<Date of birth>"
    When Email alanina valid bir deger girer
    When Phone alanina valid bir deger girer
    When SSN alanina valid bir deger girer
    When Username alanina valid bir deger girer
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Gender alanindan male secer
    When Submit butonuna tiklar
   # When Hata mesaji alir
    When Ekran goruntusu alinir
    Then close driver
    Examples:
      | Surname | Name   | Birth Place | Password  | Date of birth |
      | Team20  | Team20 | izmir       | 123456789 | 01-09-1998    |


  @failedScenario1
  Scenario Outline: Space Karakteri ile Ogretmen Ekleme
    When Choose Lessons alanindan bir ders secer
    When Alanlara space karakteri girer "<Name>", "<Surname>", "<Birth Place>", "<Password>","<Date of birth>","<Email>","<Phone>","<SSN>","<Username>"
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Gender alanindan male secer
    When Submit butonuna tiklar
    When Submit butonunun aktif olmadigini gorur
    When Ekran goruntusu alinir
    Then close driver

    Examples:
      | Surname | Name   | Birth Place | Password | Email         | Phone        | SSN         | Date of birth |
      | Team20  |        | izmir       | asdfghjk | asd@gmail.com | 512-310-1538 | 510-31-1538 | 09-01-1998    |
      |         | Team20 | izmir       | asdfghjk | asd@gmail.com | 512-310-2538 | 510-31-1538 | 09-01-1998    |
      | Team20  | Team20 |             | asdfghjk | asd@gmail.com | 512-310-3538 | 510-31-1538 | 09-01-1998    |
      | Team20  | Team20 | izmir       |          | asd@gmail.com | 512-310-4538 | 510-31-1538 | 09-01-1998    |
      | Team20  | Team20 | izmir       | asdfghjk |               | 512-310-6538 | 510-31-1538 | 09-01-1998    |
      | Team20  | Team20 | izmir       | asdfghjk | asd@gmail.com | 512-310-7538 |             | 09-01-1998    |
      | Team20  | Team20 | izmir       | asdfghjk | asd@gmail.com |              | 510-31-1538 | 09-01-1998    |


  Scenario Outline: Invalid Degerlerle Ogretmen Ekleme

    When Choose Lessons alanindan bir ders secer
    When Alanlara bilgileri girer "<Name>", "<Surname>", "<Birth Place>", "<Password>","<Date of birth>","<Phone>","<SSN>"
    When Email alanina invalid bir deger girer
    When Username alanina valid bir deger girer
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Gender alanindan male secer
    When Submit butonuna tiklar
    When Submit butonunun aktif olmadigini gorur
    When Ekran goruntusu alinir
    Then close driver

    Examples:
      | Surname | Name   | Birth Place | Password | Date of birth | SSN          | Phone        |
      | Team20  | Team20 | izmir       | asdfghjk | 25-01-2025    | 512-31-1538  | 510-311-1538 |
      | Team20  | Team20 | izmir       | asdfghjk | 25-01-2022    | 512-31-1538  | 510-311-1538 |
      | Team20  | Team20 | izmir       | asdfghj  | 09-01-1998    | 312-31-1538  | 510-311-1538 |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | 55555555555  | 510-311-1538 |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | abcdefgfh    | 510-311-1538 |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | 212-315-1538 | 510-311-1538 |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | 3335-66-744  | 510-311-1538 |
      | Team20  | Team20 | izmir       | asdfghjk | 09-01-1998    | 333-66-744   | 510311538000 |



    @username
  Scenario Outline: Username Alaninin Bos Birakilmasi
    When Choose Lessons alanindan bir ders secer
    When Alanlara bilgileri girer "<Name>", "<Surname>", "<Birth Place>", "<Password>","<Date of birth>"
    When Email alanina valid bir deger girer
    When Phone alanina valid bir deger girer
    When SSN alanina valid bir deger girer
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Gender alanindan male secer
    When Submit butonuna tiklar
   # When Submit butonunun aktif olmadigini gorur
    When Ekran goruntusu alinir
    Then close driver

    Examples:
      | Surname | Name   | Birth Place | Password  | Date of birth |
      | Team20  | Team20 | izmir       | 123456789 | 01-09-1998    |



    @username
  Scenario Outline: Username Alanina Space Karakter Girilmesi
    When Choose Lessons alanindan bir ders secer
    When Alanlara bilgileri girer "<Name>", "<Surname>", "<Birth Place>", "<Password>","<Date of birth>"
    When Email alanina valid bir deger girer
    When Phone alanina valid bir deger girer
    When SSN alanina valid bir deger girer
    When Username alanina space deger girer
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Gender alanindan male secer
    When Submit butonuna tiklar
   # When Submit butonunun aktif olmadigini gorur
    When Ekran goruntusu alinir
    Then close driver

    Examples:
      | Surname | Name   | Birth Place | Password  | Date of birth |
      | Team20  | Team20 | izmir       | 123456789 | 01-09-1998    |



    @username
  Scenario Outline: Username Alanina Invalid Deger Girilmesi
    When Choose Lessons alanindan bir ders secer
    When Alanlara bilgileri girer "<Name>", "<Surname>", "<Birth Place>", "<Password>","<Date of birth>"
    When Email alanina valid bir deger girer
    When Phone alanina valid bir deger girer
    When SSN alanina valid bir deger girer
    When Username alanina invalid deger "<Username>" girer
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Gender alanindan male secer
    When Submit butonuna tiklar
    When Submit butonunun aktif olmadigini gorur
    When Ekran goruntusu alinir
    Then close driver

    Examples:
      | Surname | Name   | Birth Place | Password  | Date of birth | Username  |
      | Team20  | Team20 | izmir       | 123456789 | 01-09-1998    | ***?/-]   |
      | Team20  | Team20 | izmir       | 123456789 | 01-09-1998    | 123456789 |



