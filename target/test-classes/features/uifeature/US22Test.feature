@Admin
Feature: TC3_Admin
  #TC01,02,03,04,05,06,07,08,09
  Background:
    Given Kullanici admin olarak login olur.
    Given Admin Name kismina valid  girer
    When Admin Surname kismina valid  girer
    And Admin Birth place kismina valid deger girer
    And Admin Gender kismini secer
    And Admin User Name alanina valid bir deger girer
  Scenario Outline:Admin_ssnKarakter_TC01
    And Admin Phone Number alanina valid bir deger girer
    And Admin Date of birth alanina "<Date of Birth>" bir tarih girer
    And Admin SSN  alanina ozel karakter girer
    And Admin en az sekiz karakterden oluşan Password "<Password>" girer
    And Admin submit tusuna tiklar.
    And Admin Please enter valid SSN number yazisini dogrular.
    Then close driver
    Examples: data
      |Date of Birth|Password|
      |11.02.2012   |12345678|

  Scenario Outline:Admin_numberKarakter_TC02
    And Admin Date of birth alanina "<Date of Birth>" bir tarih girer
    And Admin Phone Number alanina ozel karakter girer
    And Admin SSN  alanina valid bir deger girer
    And Admin yedi karakterden oluşan Password "<Password>" girer
    And Admin submit tusuna tiklar.
    And  Admin Please enter valid phone number yazisini dogrular.
    Then close driver
    Examples: data
      |Date of Birth|Password|
      |11.02.2012   |12345678|

  Scenario Outline:Admin_ssnSpace_TC03
    And Admin Phone Number alanina valid bir deger girer
    And Admin Date of birth alanina "<Date of Birth>" bir tarih girer
    And Admin SSN  alanina space girer
    And Admin en az sekiz karakterden oluşan Password "<Password>" girer
    And Admin submit tusuna tiklar.
    And Admin Please enter valid SSN number yazisini dogrular.
    Then close driver
    Examples: data
      |Date of Birth|Password|
      |11.02.2012   |12345678|


  Scenario Outline:Admin_numberSpace_TC04
    And Admin Date of birth alanina "<Date of Birth>" bir tarih girer
    And Admin Phone Number alanina space girer
    And Admin SSN  alanina valid bir deger girer
    And Admin yedi karakterden oluşan Password "<Password>" girer
    And Admin submit tusuna tiklar.
    And  Admin Please enter valid phone number yazisini dogrular.
    Then close driver
    Examples: data
      |Date of Birth|Password|
      |11.02.2012   |12345678|










