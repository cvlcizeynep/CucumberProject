
@Admin
Feature: TC1_Admin
  Background:
    Given Kullanici admin olarak login olur.
    @smoke
    Scenario Outline:Admin_kayit_TC01
    Given Admin Name kismina valid  girer
    When Admin Surname kismina valid  girer
    And Admin Birth place kismina valid deger girer
    And Admin Gender kismini secer
    And Admin Date of birth alanina "<Date of Birth>" bir tarih girer
    And Admin Phone Number alanina valid bir deger girer
    And Admin SSN  alanina valid bir deger girer
    And Admin User Name alanina valid bir deger girer
    And Admin en az sekiz karakterden oluşan Password "<Password>" girer
    And Admin submit tusuna tiklar.
    And Admin basariyla kayit ekleyebildigini dogrular.
    Then close driver
    Examples: data
      |Date of Birth|Password|
      |11.02.2012   |12345678|














