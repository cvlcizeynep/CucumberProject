@20Negaive
Feature:

  Background:
    Given Kullanici Teacher olarak login olur.
    Then Basariyla teacher girisi yaptigini dogrular.
    And Menuye tiklar
    And Meet Manegamente tiklarız
    And Edite tiklar

  Scenario Outline:

    And Choose Students e tiklar
    When Alanlara  bilgileri girer "<ogrenci>", "<tarih>", "<star time>", "<stop time>","<description>"
    And Submit e tiklar
    And Toplanti guncellenmedi yazisini gorur
    Then close the application
    Examples:
      | ogrenci    | tarih       | star time | stop time | description |
      | yagiz Ates | 11.05.2023  | 14:12     | 13:12     | BCA         |
      | yagiz Ates | 12-05-2000  | 11:12     | 12:12     | BCA         |
      | yagiz Ates | 13-05--9000 | 11:12     | 12:12     | BCA         |

