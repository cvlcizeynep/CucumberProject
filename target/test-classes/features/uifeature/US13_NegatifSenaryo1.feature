@gulser
Feature:Teacher Ekleme Negatif Senaryo 1

  Background:
    When Kullanici viceDean olarak login olur.
    Then Basariyla viceDean girisi yaptigini dogrular.
    When Menu butonuna tiklar
    When Teacher Management butonuna tiklar
    When Choose Lessons alanindan bir ders secer

  Scenario Outline: Alanlari Bos Birakarak Ogretmen Ekleme


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





















