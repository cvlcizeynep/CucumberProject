@US10
Feature:Vice dean ders secebilmeli

   Given Kullanici viceDean olarak login olur.
  Scenario:Kullanici ders secebilmelidir

    And  lessons Programi tiklar
    And  select lessoni tıklar
    And  acılan ders listesinden ders secer
    And Education Term i secer
    And acilan menuden SPRİNG_SEMESTERi secer
    And CHOOSE DAYii tiklar
    And acilan menuden Mondayi tiklar
    And Start Time i tiklar
    And gecerli bir saat degeri girer
    And Stop Time i tiklar
    And gecerli bir saat degeri girer
    Then close driver
