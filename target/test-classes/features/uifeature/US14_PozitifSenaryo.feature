@pozitif1
Feature:Teacher Guncelleme Pozitif Senaryo

  Background:
    When Kullanici viceDean olarak login olur.
    Then Basariyla viceDean girisi yaptigini dogrular.
    When Menu butonuna tiklar
    When Teacher Management butonuna tiklar


  Scenario: Olusturulan_bilgilerin_goruntulenmesi
    When Teacher List alaninda ogretmenin name bilgilerini gorur
    When Teacher List alaninda ogretmenin phone number bilgilerini gorur
    When Teacher List alaninda ogretmenin SSN bilgilerini gorur
    Then Teacher List alaninda ogretmenin username bilgilerini gorur


  Scenario Outline:  Edit Alani Pozitif Senaryo
    When Olusturulan ogretmenin edit butonuna tiklar
    When Edit teacher sayfasini goruntuler
    When Edit sayfasindaki Choose Lessons alanindan bir ders secer
    Then Alanlardaki bilgileri "<Name>", "<Surname>", "<Birth Place>", "<Password>","<Date of birth>" olarak gunceller
    When Edit alanindaki Is Advisor Teacher alanindaki checkbox a tiklar
    When Edit alanindaki Gender alanindan male secer
    When Edit alanindaki Submit butonuna tiklar
    When Teacher updated successful yazisini gorur
    When Ekran goruntusu alinir
    Then close driver


    Examples:
      | Surname | Name   | Birth Place | Password  | Date of birth |
      | Team20  | Team20 | izmir       | Team20_09 | 09-01-1998    |
