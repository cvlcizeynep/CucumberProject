Feature:

  @login
  Scenario: Admin Login
    When Kullanici StudentManagement sayfasina gider.
    When Kullanici admin olarak login olur.
    Then Basariyla admin girisi yaptigini dogrular.
    Then close driver

  @login
  Scenario: DeanLogin
    When Kullanici StudentManagement sayfasina gider.
    When Kullanici Dean olarak login olur.
    Then Basariyla Dean girisi yaptigini  dogrular.
    Then close driver

  @login
  Scenario: ViceDeanLogin
    When Kullanici StudentManagement sayfasina gider.
    When Kullanici viceDean olarak login olur.
    Then Basariyla viceDean girisi yaptigini dogrular.

  Scenario:
    When Kullanici StudentManagement sayfasina gider.
    When Kullanici Teacher olarak login olur.
    Then Basariyla teacher girisi yaptigini dogrular.

  Scenario:
    When Kullanici StudentManagement sayfasina gider.
    When Kullanici Student olarak login olur.
    Then Basariyla student girisi yaptigini dogrular.
