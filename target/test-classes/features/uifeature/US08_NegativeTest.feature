@U08Negatıve8
Feature: US8NegativeTest
Background:
  Given Kullanici viceDean olarak login olur.
  And Basariyla viceDean girisi yaptigini dogrular.
  And Lessons a tiklar

  Scenario: TC10

    And And Lesson Name "fizik13" girer
    And Credit  Score  "?:"  gırer
    And Submit  e tiklarr
    And Hata mesajini gorur
    Then close the application

  @failedScenario
  Scenario:TC11
    And And Lesson Name "fizik13" girer
    And Credit  Score  "-1"  gırer
    And Submit  e tiklarr
    And Hata mesajini gorur0
    Then close the application

  @failedScenario
    Scenario:TC12
      And And Lesson Name "fizik13" girer
      And Credit  Score  "0"  gırer
      And Submit  e tiklarr
      And Hata mesajini gorur
      Then close the application
@failedScenario
  Scenario:TC13
    Given Kullanici viceDean olarak login olur.
    And Basariyla viceDean girisi yaptigini dogrular.
    #And Lessons a tiklar
    And And Lesson Name "fizik13" girer
    And Credit  Score  "200000001"  gırer
    And Submit  e tiklarr
    And Hata mesajini gorur
    Then close the application