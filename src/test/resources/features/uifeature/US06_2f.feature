@w
Feature: Vice Dean olusturulurken name ve surname bos birakilmamalidir.

  Background:dean olrak giris
    Given Kullanici Dean olarak login olur.

  @US06TC02
  Scenario: TC02 Name bos birakilmamali
    Given Kullanici Name kismina deger girmez
    When Kullanici Surname kismina valid deger girer
    And Birth Place kismina valid deger girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici Dogum tarihine "03061988" girer
    And Kullanici  telefon numarasina valid deger girer
    And  Kullanici SSN kismina valid deger girer
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici name kismi bos birakildiginda required uyarisi alarak kayit olunamdigini dogrular
    Then close driver

  @US06TC03
  Scenario: TC03 Name valid degerle doldurulmalidir.
    Given Kullanici Name kismina valid olmayan "." girer.
    When Kullanici Surname kismina valid deger girer
    And Birth Place kismina valid deger girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici Dogum tarihine "03061988" girer
    And Kullanici  telefon numarasina valid deger girer
    And  Kullanici SSN kismina valid deger girer
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici name kismina valid deger girilmediginde kayit olunmadigini dogrular.
    Then close driver

  @US06TC04
  Scenario:TC04Name valid degerle doldurulmalidir.
    Given Kullanici Name kismina valid olmayan tubtusu girer.
    When Kullanici Surname kismina valid deger girer
    And Birth Place kismina valid deger girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici Dogum tarihine "03061988" girer
    And Kullanici  telefon numarasina valid deger girer
    And  Kullanici SSN kismina valid deger girer
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici name kismina valid deger girilmediginde kayit olunmadigi mesajini gorur
    Then close driver

  @US06TC05
  Scenario:TC05 Surname bos birakilmamali
    Given Kullanici  Name kismina valid deger girer
    When Kullanici Surname kismina deger girmez
    And Birth Place kismina valid deger girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici Dogum tarihine "03061988" girer
    And Kullanici  telefon numarasina valid deger girer
    And  Kullanici SSN kismina valid deger girer
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici surname kismi bos birakildiginda kayit olunmadigi mesajini gorur
    Then close driver

  @US06TC06
  Scenario: TC06 Surname valid degerle doldurulmalidir.
    Given Kullanici  Name kismina valid deger girer
    Given Kullanici surname kismina valid olmayan  deger "#" girer.
    And Birth Place kismina valid deger girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici Dogum tarihine "03061988" girer
    And Kullanici  telefon numarasina valid deger girer
    And  Kullanici SSN kismina valid deger girer
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici surname kismina valid deger girilmediginde kayit olunmadigini dogrular.
    Then close driver

  @US06TC07
  Scenario:TC07 Surname valid degerle doldurulmalidir.
    Given Kullanici  Name kismina valid deger girer
    When Kullanici surname kismina valid olmayan tubtusu girer.
    And Birth Place kismina valid deger girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici Dogum tarihine "03061988" girer
    And Kullanici  telefon numarasina valid deger girer
    And  Kullanici SSN kismina valid deger girer
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici surname kismina valid deger girilmediginde kayit olunmadigini dogrular.
    Then close driver




