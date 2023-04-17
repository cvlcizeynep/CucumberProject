@US20pozitive
Feature:US20PozıtıveTest

  Background:
    Given Kullanici Teacher olarak login olur.
    And  Menuye tiklar
    And  Meet Manegamente tiklar

  Scenario:TC1
    And Date nin gorundugunu dogrular
    Then close the application


  Scenario: TC2

    And Star Time nin gorundugunu dogrular
    Then close the application


  Scenario: TC3

    And Stop Time nin gorundugunu dogrular
    Then close the application


  Scenario: TC4
    And Description nun gorundugunu dogrular
    Then close the application

  Scenario Outline:  TC05
    And Choose Students e tiklar
    When Alanlara  bilgileri girer "<ogrenci>", "<tarih>", "<star time>", "<stop time>","<description>"
    And Submit e tiklar
    And Toplanti guncellenmedi yazisini gorur
    And deleteye tiklar
    And delete basarili yazisini gorur
    Then close the application

    Examples:
      | ogrenci | tarih      | star time  | stop time | description |
      |ahmetkr   |13-02-2023  |12:16       |15:15      |abv          |





