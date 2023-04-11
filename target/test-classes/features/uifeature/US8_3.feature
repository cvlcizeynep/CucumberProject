Feature:Vice_dean_credit_scoreyi_valit_girme

  @Score3  @ms
  Scenario:TC03credit_scoreyi_valit_girme_testi

    Given  Kullanici viceDean olarak login olur.
    And Basariyla viceDean girisi yaptigini dogrular.
    And Lessons a tiklar
    And Credit Score "25"  girer
    Then Credit Score degeri girdigini dogrular
    Then close the application