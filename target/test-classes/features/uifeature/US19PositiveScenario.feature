@us19
Feature: Teacher, toplantıları görebilmeli, güncelleyebilmeli ve silebilmelidir.

  Background:
    Given Kullanici Teacher olarak login olur.
    And Basariyla teacher girisi yaptigini dogrular.
    #tc01-tc02-tc04-tc06-tc08
  Scenario Outline: "Choose Students" öğrenci seçilebilmeli
    Given Kullanici Menu butonuna tiklar ve Meet Management secenegini tiklar
    And Kullanici Meet Management sayfasinin acildigini dogrular
    And Kullanici Choose Students sekmesine tiklayip ogrenci secebildigini dogrular.
    And Kullanici Date of Meet "<Date of Meet>" alanini doldurur.
    And Kullanici Start time "<Start time>" alanini doldurur
    And Kullanici Stop Time "<Stop Time>" alanini doldur
    And Kullanici Description "<Description>" alanini doldur
    And Kullanici submit tusuna tiklar.
    And Kullanici toplanti olustugunu dogrular
    Then close driver
    Examples: data
      | Date of Meet | Start time | Stop Time | Description |
      | 11.05.2023   | 12.07      | 14.06     | Toplanti    |