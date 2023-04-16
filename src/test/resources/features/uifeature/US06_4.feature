@qwe
Feature: Vice Dean olusturulurken SSN,username,password bos birakilmamali ve uygun doldurulmalidir.

  Background:  Given Kullanici Dean olarak login olur.
    Given Kullanici  Name kismina valid deger girer
    When Kullanici Surname kismina valid deger girer
    And Birth Place kismina valid deger girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici Dogum tarihine "03061988" girer
    And Kullanici  telefon numarasina valid deger girer

  Scenario: TC13
    When Kullanici  SSN girmez bos birakir
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Ssn girilmediginde kayit yapilmadigini dogrular
    Then close driver


  Scenario: TC14
    When Kullanici format disi bir SSN "ssn" girer
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici valid olmayan ssn ile giris yapilamadigini uyari alarak dogrular
    Then close driver

  Scenario: TC15
    When Kullanici kayitli uniq olmayan bir SSN "ssn" ile deger girer
    And Kullanici User Name alanina valid deger girer
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici uniq olmayan   ssn girdiginde  uyari alarak dogrulama yapar.
    Then close driver

  Scenario: TC16
    And  Kullanici SSN kismina valid deger girer
    When Kullanici User Name girmez bos birakir
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici username kismi bos birakildiginda kayit olunmadigi mesajini gorur
    Then close driver

  Scenario:TC17
    And  Kullanici SSN kismina valid deger girer
    When Kullanici User Name kismina tub tusuyla basar karakter girmez
    And   Kullanici en az sekiz karakterden oluşan password  girer
    And   Kullanici submit tusuna tiklarr.
    Then  Kullanici username kismina tub tusuyla basilip bos birakildiginda kayit olunmadigini uyari alarak dogrular
    Then close driver

  Scenario:TC18

    And  Kullanici SSN kismina valid deger girer
    And Kullanici User Name alanina valid deger girer
    When Kullanici  yedi karakterden oluşan password girer
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici sekizden az karakterli password ile  kayit olunmadigini uyari alarak dogrular
    Then close driver

  Scenario:TC19
    And  Kullanici SSN kismina valid deger girer
    And Kullanici User Name alanina valid deger girer
    When Kullanici   password kismini bos birakir
    And   Kullanici submit tusuna tiklarr.
    Then Kullanici password kisminin  doldurulmadigi uyarisini alir
    Then close driver
