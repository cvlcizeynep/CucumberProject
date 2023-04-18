@US03

Feature: Pozitif Test Senaryosu
  Background:
    Given kullanici sayfaya gider
    When kullanici Contact butonuna tiklar
    Then kullanici Concatct sayfasina yonlendirilir

  Scenario: Tum_Alanlarin_Dogru_Girilmesi
    When kullanici yourname "Ahmet" alanini doldurur
    When kullanici Your Email  alanina  valid bir deger girer
    When kullanici subject "Java" alanina valid deger  girer
    When kullanici Message "Dersler cok verimli" alanina valid deger  girer
    When kullanici Send Message alanina tiklar
    Then kullanici Contact Message Created Created Successfully mesajini goruntuler
    And sayfa kapatilir