@US063
Feature:  Vice Dean olusturulurken birth place birt date,cinsiyet ve phone bos birakilmamali ve uygun doldurulmalidir.

  Background:Dean olrak giris

    Given Kullanici Dean olarak login olur.
    Given Kullanici name "<Name>" kismina valid  girer
    When Kullanici Surname kismina valid "serhat" girer

    Scenario:TC04 Birt place bos birakilmamalidir
      When Kullanici birtplace alanini bos birakir
      And  Kullanici Cinsiyet kismini secer
      And  Kullanici Dogum tarihine "03061988" girer
      And Kullanici  telefon numarasina "678-187-8765" girer
      And  Kullanici SSN kismina valid "705-08-9876" girer
      And Kullanici user name "serhty" girer
      And   Kullanici en az sekiz karakterden oluşan password "i8790754432" girer
      And   Kullanici submit tusuna tiklar.
      Then Kullanici birtplace kismi bos birakildiginda required uyarisi alarak kayit olunamdigini dogrular
     # Then logout olur
      Then close driver

        Scenario: TC06 Dogum tarihi bos birakilamaz
          And Birth Place kismina valid "Ankara" girer
          And  Kullanici Cinsiyet kismini secer
          And  Kullanici Dogum tarihini bos birakir
          And Kullanici  telefon numarasina "678-187-8765" girer
          And  Kullanici SSN kismina valid "705-08-9876" girer
          And Kullanici user name "serhty" girer
          And   Kullanici en az sekiz karakterden oluşan password "i8790754432" girer
          And   Kullanici submit tusuna tiklar.
          Then Kullanici telefon no bos birakildiginda  kayit olunamdigini dogrular
          Then close driver

         Scenario: TC07 Dogum tarihi gelecek zaman secilemez
           And Birth Place kismina valid "Ankara" girer
           And  Kullanici Cinsiyet kismini secer
           And  Kullanici Dogum tarihine gelecek tarih girer.
           And Kullanici  telefon numarasina "678-187-8765" girer
           And  Kullanici SSN kismina valid "705-08-9876" girer
           And Kullanici user name "serhty" girer
           And   Kullanici en az sekiz karakterden oluşan password "i8790754432" girer
           And   Kullanici submit tusuna tiklar.
           Then Kullanici gecmis tarih olmali uyarisi alir.
         #  Then logout olur
           Then close driver

           Scenario: TC08 Telefon no bos birakilmamalidir
             And Birth Place kismina valid "Ankara" girer
             And  Kullanici Cinsiyet kismini secer
             And  Kullanici Dogum tarihine "03061988" girer
             And Kullanici  telefon numarasini bos birakir
             And  Kullanici SSN kismina valid "705-08-9876" girer
             And Kullanici user name "serhty" girer
             And   Kullanici en az sekiz karakterden oluşan password "i8790754432" girer
             And   Kullanici submit tusuna tiklar.
             Then Kullanici telefon no bos birakildiginda required uyarisi alarak kayit olunamadigini dogrular
            # Then logout olur
             Then close driver

             Scenario: TC09 Telefon no istenen formatta girilmelidir.
               And Birth Place kismina valid "Ankara" girer
               And  Kullanici Cinsiyet kismini secer
               And  Kullanici Dogum tarihine "03061988" girer
               And Kullanici  telefon numarasini format disi "po-plkj" girer
               And  Kullanici SSN kismina valid "705-08-9876" girer
               And Kullanici user name "serhty" girer
               And   Kullanici en az sekiz karakterden oluşan password "i8790754432" girer
               And   Kullanici submit tusuna tiklar.
               Then Kullanici telefon no format disi girildiginde invalid number uyarisi alarak kayit olunamadigini dogrular
              # Then logout olur
               Then close driver

  Scenario: TC05 Cinsiyet kismi bos birakilamaz
    And Birth Place kismina valid "Ankara" girer
    And Kullanici Cinsiyet kismini secmez
    And  Kullanici Dogum tarihine "03061988" girer
    And Kullanici  telefon numarasina "678-187-8765" girer
    And  Kullanici SSN kismina valid "705-08-9876" girer
    And Kullanici user name "serhty" girer
    And   Kullanici en az sekiz karakterden oluşan password "i8790754432" girer
   # And   Kullanici submit tusuna tiklar.
    Then Kullanici cinsiyet kismi bos birakildiginda  kayit olunamdigini dogrular
        #Then logout olur
    Then close driver






