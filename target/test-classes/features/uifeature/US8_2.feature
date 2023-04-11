Feature:Vice_dean_compulsory_alani_isaretleme

  @Compulsory @ms
  Scenario:TC02compulsory_alani_isaretleme_testi

    Given  Kullanici viceDean olarak login olur.
    And Basariyla viceDean girisi yaptigini dogrular.
    And Lessons a tiklar
    And Dersin Compulsory olup olmadığını işaretler
    And Dersin Compulsory olup olmadığını işaretlendigini dogrular
    Then close the application

















