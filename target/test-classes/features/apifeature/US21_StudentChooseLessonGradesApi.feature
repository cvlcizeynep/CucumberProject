@End2End

Feature: Student Controller

  @US21_API01
  Scenario: TC01_OgrenciDersleriListeHalindeGoruntuler
    Given ogrenci dersleri goruntuler
    Then ders listesinin goruntulendigini dogrular


  @US21_API02
  Scenario: TC02_OgrenciSectigiDersleriListeHalindeGoruntuler
    Given ogrenci sectigi dersleri goruntuler
    Then sectigi derslerin listesinin goruntulendigini dogrular


  @US21_API03
  Scenario: TC03_OgrenciDersNotlariniGoruntuler
    Given ogrenci ders notlarini goruntuler
    Then ders notlarinin listesinin goruntulendigini dogrular


  @US21_API04
  Scenario: TC03_OgrenciToplantilariGoruntuler
    Given ogrenci ogretmeninin olusturdugu toplantilari goruntuler
    Then ders olusturulan toplantilarin listesinin goruntulendigini dogrular