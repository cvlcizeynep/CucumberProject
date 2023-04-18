@Dean
Feature: TC1_Dean_User
  Background:
    Given Kullanici admin olarak login olur.
    And Menu botonuna tiklar
    And Main menu sayfasindan Dean Management tiklar

  Scenario:Dean_User_TC01
    And Admin Deanlerin, Name bilgisinin goruldugunu dogrular
    Then close driver

  Scenario:Dean_User_TC02
    And Admin Deanlerin, Gender bilgisinin goruldugunu dogrular
    Then close driver

  Scenario:Dean_User_TC03
    And Admin Deanlerin, Phone Number bilgisinin goruldugunu dogrular
    Then close driver

  Scenario:Dean_User_TC04
    And Admin Deanlerin, SSN bilgisinin goruldugunu dogrular
    Then close driver

  Scenario:Dean_User_TC05
    And Admin Deanlerin, User Name bilgisinin goruldugunu dogrular
    Then close driver

    Scenario: Dean_User_TC06
      Then Kullanici delete butonunun varligini assert eder

    Scenario:Edit_alani_TC07

      When Olusturulan daen'in edit butonuna tiklar
       And  Edit sayfasindaki Cinsiyet kismini secer
       And  telefon numarasini gunceller
       And  password girer
       And  edit sayfasindaki submit tusuna tiklar.
       Then Dean updated Successful mesaji goruntulenmeli dogrular.
       Then close driver


















