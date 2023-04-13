Feature:Vice_dean_ders_oluşturma

  @lesson @ms
  Scenario:TC01ders_olusturma_testi

    Given Kullanici viceDean olarak login olur.
    And Basariyla viceDean girisi yaptigini dogrular.
    And Lessons a tiklar
    And Lessonsa "fiziks"  girer
    Then Lesson in "fiziks" oldugunu dogrular
    Then close the application