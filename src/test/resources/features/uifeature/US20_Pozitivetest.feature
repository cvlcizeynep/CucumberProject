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

  Scenario :  TC05

    And deleteye tiklar
    And delete basarili yazisini gorur
    Then close the application

Scenario:TC06
    And Edite tiklar
    And Select student e bir ogrenci secer
    And Bir tarih "18-08-2024" girer
    And Star time  "14:12" girer
    And Stop time  "15:12" girer
    And Deskription  "BCA" girer
    And Submit e tiklar
    And Toplantı guncellendı mesajini gorur
    Then close the application





