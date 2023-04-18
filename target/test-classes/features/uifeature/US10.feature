@US10
Feature:Vice dean ders secebilmeli


  Scenario:Kullanici ders secebilmelidir#
    Given Kullanici viceDean olarak login olur.
    And  lesson Programi tiklar
    And  select lessoni tiklar
    And  acılan ders listesindeki ilk dersi secer
    And Education Term i secer
    And acilan menuden SPRİNG_SEMESTERi secer
    Given CHOOSE DAYii tıklar
    Given acilan menuden Mondayi tıklar
    Given Start Time i tıklar
    Given gecerli bir saat degeri girer
    Given Stop Time i tiklar
    Given gecerli bir stop time girer

