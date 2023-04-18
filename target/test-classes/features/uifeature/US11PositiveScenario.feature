@us11-tc01
Feature: Vice Dean Ders Programini gorebilmelidir

  Background:
    Given Kullanici viceDean olarak login olur

  Scenario:Program List Goruntulenebilmelidir.
    Given Kullanici Menu butonuna tiklar
    And Kullanici Lesson Management butonuna tiklar
    And Kullanici Lesson Program Bolumune tiklar
    And Kullanici Lesson program List sayfasinin goruntulendigini dogrular.
    And Kullanici olusturulan dersin goruntulendigini dogrular
    And Kullanici dersin gununu "Day" goruntuledigini dogrular
    And Kullanici Lesson'in baslama saatini "Start Time" ini goruntuledigini dogrular
    And Kullanici Lesson'in bitis saatini "Stop Time" ini goruntuledigini dogrular
    Then close driver