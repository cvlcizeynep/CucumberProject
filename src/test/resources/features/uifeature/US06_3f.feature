@smoke
Feature:  Vice Dean olusturulurken birth place birt date,cinsiyet ve phone bos birakilmamali ve uygun doldurulmalidir.

  Background:Dean olrak giris
    Given Kullanici Dean olarak login olur.
    Given Kullanici  Name kismina valid deger girer
    When Kullanici Surname kismina valid deger girer

    @US06TC08
    Scenario: TC08 Birt place bos birakilmamalidir
      When Kullanici birtplace alanini bos birakir
      And  Kullanici Cinsiyet kismini secer
      And  Kullanici Dogum tarihine "03061988" girer
      And Kullanici  telefon numarasina valid deger girer
      And  Kullanici SSN kismina valid deger girer
      And Kullanici User Name alanina valid deger girer
      And   Kullanici en az sekiz karakterden oluşan password  girer
      And   Kullanici submit tusuna tiklarr.
      Then Kullanici birtplace kismi bos birakildiginda required uyarisi alarak kayit olunamdigini dogrular
      Then close driver

      @US06TC09
      Scenario: TC09 Dogum tarihi bos birakilamaz
        And Birth Place kismina valid deger girer
        And  Kullanici Cinsiyet kismini secer
        And  Kullanici Dogum tarihini bos birakir
        And Kullanici  telefon numarasina valid deger girer
        And  Kullanici SSN kismina valid deger girer
        And Kullanici User Name alanina valid deger girer
        And   Kullanici en az sekiz karakterden oluşan password  girer
        And   Kullanici submit tusuna tiklarr.
        Then Kullanici dogum tarihi bos birakildiginda  kayit olunamdigini dogrular
        Then close driver


  Scenario: TC10 Dogum tarihi gelecek zaman secilemez
    And Birth Place kismina valid deger girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici Dogum tarihine gelecek tarih girer.
    And Kullanici  telefon numarasina valid deger girer
    And  Kullanici SSN kismina valid deger girer
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici gecmis tarih olmali uyarisi alir.
    Then close driver

    Scenario: TC11 Telefon no bos birakilmamalidir
      And Birth Place kismina valid deger girer
      And  Kullanici Cinsiyet kismini secer
      And  Kullanici Dogum tarihine "03061988" girer
      And Kullanici  telefon numarasini bos birakir
      And  Kullanici SSN kismina valid deger girer
      And Kullanici User Name alanina valid deger girer
      And   Kullanici en az sekiz karakterden oluşan password  girer
      And   Kullanici submit tusuna tiklarr.
      Then Kullanici telefon no bos birakildiginda required uyarisi alarak kayit olunamadigini dogrular
      Then close driver

  Scenario: TC12 Telefon no istenen formatta girilmelidir.
    And Birth Place kismina valid deger girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici Dogum tarihine "03061988" girer
    And Kullanici  telefon numarasini format disi "po-plkj" girer
    And  Kullanici SSN kismina valid deger girer
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici telefon no format disi girildiginde invalid number uyarisi alarak kayit olunamadigini dogrular
    Then close driver








