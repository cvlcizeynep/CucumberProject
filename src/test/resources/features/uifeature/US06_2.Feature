Feature: Dean Vice Dean Eklerken Gerekli Kisimlari Doldurmadan Kayit Olusturamamalidir

  Background:dean olrak giris
    Given Kullanici Dean olarak login olur.

  Scenario TC02 Name bos birakilmamali
    Given Kullanici Name kismina deger girmez
    When Kullanici Surname kismina valid "deger" girer
    And Birth Place kismina valid "deger" girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici Dogum tarihine "deger" girer
    And Kullanici  telefon numarasina "Telefon numarasi" girer
    And  Kullanici SSN kismina valid "SSN" girer
    And Kullanici user name "User Name" girer
    And   Kullanici en az 8 karakterden oluşan password "Password" girer
    And   Kullanici submit tusuna tiklar.
    Then Kullanici name kismi bos birakildiginda kayit olunmadigi mesajini gorur
    Then close driver