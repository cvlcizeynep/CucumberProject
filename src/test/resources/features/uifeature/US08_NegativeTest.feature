@U08Negatıve
Feature: US8NegativeTest

  Scenario: TC04
    Given Kullanici viceDean olarak login olur.
    And Basariyla viceDean girisi yaptigini dogrular.
    And Lessons a tiklar
    And And Lesson Name "fizik13" girer
    And Credit Score "?:"  gırer
    And Submit  e tiklarr
    And Hata mesajini gorur
    Then close the application
