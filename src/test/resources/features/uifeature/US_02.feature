@Guest
Feature: TC1_Guest_User
  Background:
    Given Kullanici admin olarak login olur.
    And Menu botonuna tiklar
    And Main menu sayfasindan Guest User List tiklar

  Scenario:Guest_User_TC01
    Then Guest User List, Name bilgisinin goruldugunu dogrular
    Then close driver

  Scenario:Guest_User_TC02
    Then Guest User List, Phone Number bilgisinin goruldugunu dogrular
    Then close driver

  Scenario:Guest_User_TC03
    Then Guest User List, SSN bilgisinin goruldugunu dogrular
    Then close driver

  Scenario:Guest_User_TC04
    Then Guest User List, User Name bilgisinin goruldugunu dogrular
    Then close driver

  Scenario:Guest_User_TC05
    Then Guest User List bilgilerini siler
    Then Guest User deleted Successful mesaji goruldugunu dogrular
    Then close driver