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
  @Dean
    Scenario Outline:Edit_alani_TC07
      Given name "<Name>" kismina valid  girer
      When surname "<Surname>" kismina valid  girer
      And  birt place "<Birth Place>" kismina valid deger girer
      And  Cinsiyet kismini secer
      And  dogum tarihine  "<Dogum tarihi>" girer
      And  telefon numarasi "<Telefon numarasi>" girer
      And  ssn kismina valid "<SSN>" girer
      And  username "<User Name>" girer
      And  password "<Password>" girer
      And  submit tusuna tiklar.
      Then Dean updated Successful mesaji goruntulenmeli dogrular.

      Examples: Name data
        | Name |Surname|Birth Place|Dogum tarihi|Telefon numarasi|SSN|User Name|Password|
        | hayriye|kilic |kula    |03.04.1991  |507-896-9786    |455-12-9066 |hyryklc|hayriye123|
















