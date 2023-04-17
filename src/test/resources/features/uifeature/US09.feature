@US9
  #TCO1#TC02#TC03#TC04

 Feature : Vice dean ders secme

  Background:
    Given Kullanici viceDean olarak login olur.
    And Lessons a tiklar_asl


  Scenario Outline : Kullanici ders secebilmelidir
    And  Lessonsa "<ders>" girer
    And  dersin credit Score unun "<deger>"  olarak girer
    And  Dersin Compulsory oldugunu işaretler
    When Daha once olusturulan dersin listede goruldugunu dogrular
    When dersin satiri, compulsory sutununun altinda Yes yazdigini dogrular
    When Credit Score degeri girdigini dogrular
    When Istenen dersin yanindaki cop kutusuna tiklayarak dersi siler
    #Then close driver
    Examples: | ders   | deger|
              | fiziks | 3    |





