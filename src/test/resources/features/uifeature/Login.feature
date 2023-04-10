Feature:Admin,Dean,ViceDean,Teacher ve Student Loginleri

  @login
  Scenario: Admin Login
    Given Kullanici admin olarak login olur.
    Then Basariyla admin girisi yaptigini dogrular.
    Then close driver

  @login
  Scenario: DeanLogin

    Given Kullanici Dean olarak login olur.
    Then Basariyla Dean girisi yaptigini  dogrular.
    Then close driver

  @login
  Scenario: ViceDeanLogin

    Given Kullanici viceDean olarak login olur.
    Then Basariyla viceDean girisi yaptigini dogrular.

  Scenario:

    Given Kullanici Teacher olarak login olur.
    Then Basariyla teacher girisi yaptigini dogrular.

  Scenario:

    Given Kullanici Student olarak login olur.
    Then Basariyla student girisi yaptigini dogrular.
