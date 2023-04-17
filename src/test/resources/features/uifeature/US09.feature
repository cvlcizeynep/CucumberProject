@US9
  #TCO1#TC02#TC03#TC04

Feature:Vice dean ders secme

  Background:
    Given Kullanici viceDean olarak login olur.
    And Lessons a tiklar1


  Scenario: Kullanici ders secebilmelidir


    When histoloji dersinin oldugu son page e gecmek için >> tiklar
    When Daha once olusturulan histoloji dersinin listede goruldugunu dogrular
    When histoloji dersinin satiri, compulsory sutununun altinda No yazdigini dogrular
    When histoloji dersinin credit Score unun 25 olarak girildigini dogrular
    When Istenen dersin yanindaki cop kutusuna tiklayarak dersi siler
    Then close driver





