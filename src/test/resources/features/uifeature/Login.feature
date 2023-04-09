Feature:
  @login
  Scenario: Admin Login
    When Kullanici StudentManagement sayfasina gider.
    When Kullanici admin olarak login olur.
    Then Basariyla Login oldugunu dogrular.

