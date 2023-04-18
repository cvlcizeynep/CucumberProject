@20Negaive
Feature:

  Background:
    Given Kullanici Teacher olarak login olur.
    Then Basariyla teacher girisi yaptigini dogrular.
    And Menuye tiklar
    And Meet Manegamente tiklarız
    And Edite tiklar
    And Select student e bir ogrenci secer
  Scenario: 7

    And Eski bir tarih "12-05-2000" girer
    And Star time  "11:12" girer
    And Stop time  "12:12" girer
    And Deskription  "BCA" girer
    And Submit e tiklar
    And old_date_error  mesajini gorur
    Then close the application

  Scenario: 8

    And Ileri bir Star time  "14:12" girer
    And Stop time  "13:12" girer
    And Deskription  "BCA" girer
    And Submit e tiklar
    And start_time_error mesajini gorur
    Then close the application


  Scenario: 9

    And Cok ileride bir tarih "13-05-9000" girer
    And Star time  "11:12" girer
    And Stop time  "12:12" girer
    And Deskription  "BCA" girer
    And Submit e tiklar
    And forward_date_error mesajini gorur
    Then close the application













































