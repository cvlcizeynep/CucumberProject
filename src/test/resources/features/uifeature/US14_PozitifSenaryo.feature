@pozitif1
Feature:Teacher Guncelleme Pozitif Senaryo

Scenario: hadi bakalim
    When Kullanici viceDean olarak login olur.
    Then Basariyla viceDean girisi yaptigini dogrular.
    When Menu butonuna tiklar
    When Teacher Management butonuna tiklar
    When Choose Lessons alanindan bir ders secer
    When Name alanina valid bir deger "Ayse" girer
    When Surname alanina valid bir deger "Nur" girer
    When Birth Place alanina valid bir deger "izmir" girer
    When Email alanina valid bir deger girer
    When Phone alanina valid bir deger girer
    When SSN alanina valid bir deger girer
    When Username alanina valid bir deger girer
    When Password alanina valid bir deger "123456789" girer
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Gender alanindan male secer
    When Date of birth alanina bir tarih "01.09.1998" girer
    When Submit butonuna tiklar
    When Teacher saved successfully yazisini gorur
    When Teacher list alanindaki bir ogretmenin edit butonuna tiklar
    When Edit teacher sayfasini goruntuler



 # Scenario: Olusturulan_bilgilerin_goruntulenmesi

  #  When Teacher List alaninda ogretmenin name bilgilerini gorur
  #  When Teacher List alaninda ogretmenin phone number bilgilerini gorur
  #  When Teacher List alaninda ogretmenin SSN bilgilerini gorur
  #  Then Teacher List alaninda ogretmenin username bilgilerini gorur


  Scenario Outline:  Pozitif Senaryo


    When Choose Lessons alanindan bir ders secer
    When Name alanini siler
    When Name alanina valid bir deger "<Name>" girer
    When Surname alanini siler
    When Surname alanina valid bir deger "<Surname>" girer
    When Birth Place alanini siler
    When Birth Place alanina valid bir deger "<Birth Place>" girer
    When Email alanini siler
    When Email alanina valid bir deger girer
    When Phone alanini siler
    When Phone alanina valid bir deger girer
    When SSN alanini siler
    When SSN alanina valid bir deger girer
    When Username alanini siler
    When Username alanina valid bir deger girer
    When Password alanini siler
    When Password alanina valid bir deger "<Password>" girer
    When Is Advisor Teacher alanindaki checkbox a tiklar
    When Gender alanindan male secer
    When Date of birth alanini siler
    When Date of birth alanina bir tarih "<Date of birth>" girer
    When Submit butonuna tiklar
    When Teacher saved successfully yazisini gorur
    When Ekran goruntusu alinir
    Then close driver


    Examples:
      | Surname | Name   | Birth Place | Password  | Date of birth |
      | Team20  | Team20 | izmir       | Team20_09 | 09-01-1998    |
