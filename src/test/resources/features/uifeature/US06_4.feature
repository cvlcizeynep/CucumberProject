@US06
Feature: Vice Dean olusturulurken SSN,username,password bos birakilmamali ve uygun doldurulmalidir.

  Background:
    Given Kullanici Dean olarak login olur.
    Given Kullanici  Name kismina valid deger girer
    When Kullanici Surname kismina valid deger girer
    And Birth Place kismina valid deger girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici Dogum tarihine "03061988" girer
    And Kullanici  telefon numarasina valid deger girer


  @US06TC16
  Scenario: TC16 SSN bos birakilamaz
    When Kullanici  SSN girmez bos birakir
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Ssn girilmediginde kayit yapilmadigini dogrular
    Then close driver


  @US06TC17
  Scenario: TC17 SSN belirtilen formatta olmalidir
    When Kullanici format disi bir SSN "12345678978" girer
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici valid olmayan ssn ile giris yapilamadigini uyari alarak dogrular
    Then close driver

  @US06TC18
  Scenario: TC18 SSN uniq olmalidir
    When Kullanici kayitli uniq olmayan bir SSN "269-29-7548" ile deger girer
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici uniq olmayan   ssn girdiginde  uyari alarak dogrulama yapar.
    Then close driver

  @US06TC19
  Scenario: TC19 User name bos birakilamaz
    And  Kullanici SSN kismina valid deger girer
    When Kullanici User Name girmez bos birakir
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici username kismi bos birakildiginda kayit olunmadigi mesajini gorur
    Then close driver

  @US06TC20
  Scenario:TC20 Username daha once alinmamis olmalidir
    And  Kullanici SSN kismina valid deger girer
    When Kullanici User Name kismina daha once kayitli bi deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then  Kullanici username kismina tekrarli deger girildiginde kayit olunmadigini uyari alarak dogrular
    Then close driver

  @US06TC21
  Scenario:TC21 Password sekizden az karakter icermemeli

    And  Kullanici SSN kismina valid deger girer
    And Kullanici User Name alanina valid deger girer
    When Kullanici  yedi karakterden oluşan password girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici sekizden az karakterli password ile  kayit olunmadigini uyari alarak dogrular
    Then close driver

  @US06TC22
  Scenario:TC22 Password kismi bos birakilamaz
    And  Kullanici SSN kismina valid deger girer
    And Kullanici User Name alanina valid deger girer
    When Kullanici   password kismini bos birakir
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici password kisminin  doldurulmadigi uyarisini alir
    Then close driver
