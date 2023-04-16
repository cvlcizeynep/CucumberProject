@US21_Negatif

Feature: Ogrenci Choose Lesson Listesini Görüntüleyebilmeli

  Background:
    When Kullanici ogrenci olarak login olur

  Scenario: TC03_Ogrenci_ayni_saatte_aynigun_ders_secemez
    Given kullanici Choose Lesson Management sayfasini goruntuler
    When kullanici Choose lesson sutununda daha once sectigi ayni gun aynı saat ders secer
    When kullanici submit butonuna tiklar
    Then kullanici ders secimi yapilamadigi uyarisini alir
    And sayfa kapatilir