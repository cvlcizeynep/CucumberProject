@smoke @us13
Feature:Teacher Ekleme Pozitif Senaryo

  Background:
    When Kullanici viceDean olarak login olur.
    Then Basariyla viceDean girisi yaptigini dogrular.
    When Menu butonuna tiklar
    When Teacher Management butonuna tiklar

  Scenario Outline:  Pozitif Senaryo
    When Choose Lessons alanindan bir ders secer
    When Alanlara bilgileri girer "<Name>", "<Surname>", "<Birth Place>", "<Password>","<Date of birth>"
    When Email alanina valid bir deger girer
    When Phone alanina valid bir deger girer
    When SSN alanina valid bir deger girer
    When Username alanina valid bir deger girer
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Gender alanindan male secer
    When Submit butonuna tiklar
    When Teacher saved successfully yazisini gorur
    When Ekran goruntusu alinir
    Then close driver

    Examples:
      | Surname | Name   | Birth Place | Password  | Date of birth |
      | Team20  | Team20 | izmir       | Team20_09 | 01-09-1998    |
