@pozitif
Feature:Teacher Ekleme Pozitif Senaryo

  Background:
    When Kullanici viceDean olarak login olur.
    Then Basariyla viceDean girisi yaptigini dogrular.
    When Menu butonuna tiklar
    When Teacher Management butonuna tiklar


  Scenario Outline:  Pozitif Senaryo

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
    When Teacher saved successfully yazisini gorur
    When Ekran goruntusu alinir
    Then close driver


    Examples:
      | Surname | Name   | Birth Place | Password  | Cinsiyet | Date of birth |
      | Team20  | Team20 | izmir       | Team20_09 | male     | 09-01-1998    |
