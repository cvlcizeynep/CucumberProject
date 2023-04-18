@gulser
Feature:Teacher Guncelleme Pozitif Senaryo

  Background:
    When Kullanici viceDean olarak login olur.
    Then Basariyla viceDean girisi yaptigini dogrular.
    When Menu butonuna tiklar
    When Teacher Management butonuna tiklar


  @smoke
    @edit
  Scenario: Edit Alani Pozitif Senaryo
    When Olusturulan ogretmenin edit butonuna tiklar
    When Edit sayfasindaki Choose Lessons alanindan bir ders secer
    When name alanına valid bir deger girer
    When surname alanına valid bir deger girer
    When birth place alanına valid bir deger girer
    When email alanına bir deger girer
    When phone alanına bir deger girer
    When SSN alanına bir deger girer
    When edit alanında ıs advisor teacher butonuna tıklar
    When edit alanında cinsiyet secer
    When edit alanında date of birth "01091998" girer
    When username alanına bir deger girer
    When password alanına valid bir deger girer
    When Edit alanindaki Submit butonuna tiklar
   # Then Teacher updated successful yazisini gorur
   # Then guncellemeyi dogrular



  Scenario: Olusturulan_bilgilerin_goruntulenmesi
    When Teacher List alaninda ogretmenin name bilgilerini gorur
    When Teacher List alaninda ogretmenin phone number bilgilerini gorur
    When Teacher List alaninda ogretmenin SSN bilgilerini gorur
    Then Teacher List alaninda ogretmenin username bilgilerini gorur







