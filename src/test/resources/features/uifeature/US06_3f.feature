@US06.3
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

  @US06TC09 @failedScenario
  Scenario: TC08 Birt place kismina valid deger girilmelidir
    When Kullanici birtplace alanina valid olmayan "@" dger girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici Dogum tarihine "03061988" girer
    And Kullanici  telefon numarasina valid deger girer
    And  Kullanici SSN kismina valid deger girer
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici birtplace kismina valid deger girilmediginde kayit olunamadigini dogrular
    Then close driver


  @US06TC10
  Scenario: TC10 Dogum tarihi bos birakilamaz
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

  @US06TC11
  Scenario: TC11 Dogum tarihi gelecek zaman secilemez
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

  @US06TC12 @failedScenario
  Scenario: TC12 Dogum tarihi onceki yuzyillardan secilemez
    And Birth Place kismina valid deger girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici Dogum tarihine "03061200" girer
    And Kullanici  telefon numarasina valid deger girer
    And  Kullanici SSN kismina valid deger girer
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici invalid tarih uyarisi alir
    Then close driver

  @US06TC13
  Scenario: TC13 Telefon no bos birakilmamalidir
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

  @US06TC14
  Scenario: TC14 Telefon no istenen formatta girilmelidir.
    And Birth Place kismina valid deger girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici Dogum tarihine "03061988" girer
    And Kullanici  telefon numarasini format disi "123456789987" girer
    And  Kullanici SSN kismina valid deger girer
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici telefon no format disi girildiginde invalid number uyarisi alarak kayit olunamadigini dogrular
    Then close driver

  @US06TC15
  Scenario: TC15 Kayitli telefonla kayit yapilamaz
    And Birth Place kismina valid deger girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici Dogum tarihine "03061988" girer
    And Kullanici  telefon numarasini daha once kayit olan tlf girer girer
    And  Kullanici SSN kismina valid deger girer
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici telefon noyu onceden kayitli olan bir no ile girerse already uyrisi alarak kayit olunamadigini dogrular
    Then close driver





