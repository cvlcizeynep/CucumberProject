@Admin
Feature: TC2_Admin
  #TC01,02,03,04,05,06,07,08,09
  Background:
    Given Kullanici admin olarak login olur.
    @failedScenario
    Scenario Outline:Admin_space_TC01
    Given Admin Name kismina space  girer
    When Admin Surname kismina space  girer
    And Admin Birth place kismina space deger girer
    And Admin Gender kismini secer
    And Admin Date of birth alanina "<Date of Birth>" bir tarih girer
    And Admin Phone Number alanina valid bir deger girer
    And Admin SSN  alanina valid bir deger girer
    And Admin User Name alanina valid bir deger girer
    And Admin en az sekiz karakterden oluşan Password "<Password>" girer
    And Admin submit tusuna tiklar.
    And Admin kayit olunmadigi dogrular.
    Then close driver
    Examples: data
      |Date of Birth|Password|
      |11.02.2012   |12345678|

  @failedScenario
  Scenario Outline:Admin_karakter_TC02
    Given Admin Name kismina ozel karakter  girer
    When Admin Surname kismina ozel karakter  girer
    And Admin Birth place kismina ozel karakter deger girer
    And Admin Gender kismini secer
    And Admin Date of birth alanina "<Date of Birth>" bir tarih girer
    And Admin Phone Number alanina valid bir deger girer
    And Admin SSN  alanina valid bir deger girer
    And Admin User Name alanina valid bir deger girer
    And Admin yedi karakterden oluşan Password "<Password>" girer
    And Admin submit tusuna tiklar.
    And Admin kayit olunmadigi dogrular.
    Then close driver
    Examples: data
      |Date of Birth|Password|
      |11.02.2012   |12345678|










