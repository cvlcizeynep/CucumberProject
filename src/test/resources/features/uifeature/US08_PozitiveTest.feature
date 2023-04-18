@US8pozitive
Feature:US8PozıtıveTest
  Background:
    Given Kullanici viceDean olarak login olur.
    And Basariyla viceDean girisi yaptigini dogrular.
    And Lessons a tiklarr

  @lesson
  Scenario:TC14

    And Lessonsa "fiziks"  girer
    Then Lesson in "fiziks" oldugunu dogrular
    Then close the application

  @Compulsory
  Scenario:TC15
    And Dersin Compulsory olup olmadığını işaretler
    And Dersin Compulsory olup olmadığını işaretlendigini dogrular
    Then close the application

  @Score3
  Scenario:TC16
    And Credit Score degerini "25"  gırer
    And Credit Score degeri girdigini dogrular
    Then close the application

@dersOlusturma
  Scenario: TC17
    And Lessonsa "figiuzuhe"  girerr
    And Credit Score "305"  gırerr
    And dersin olustugunu dogrular
    Then close the application



