
@Admin
Feature: TC1_Admin
  Background:
    Given Kullanici admin olarak login olur.
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

  Scenario Outline:Admin_bos_TC02
    Given Admin Name kismina bos birakir
    When Admin Surname kismina bos birakir
    And Admin Birth place kismina bos birakir
    And Admin Gender kismini secer
    And Admin Date of birth alanini bos birakir
    And Admin Phone Number alanini bos birakir
    And Admin SSN  alanina alanini bos birakir
    And Admin User Name alanini bos birakir
    And Admin en az sekiz karakterden oluşan Password "<Password>" girer
    And Admin submit tusuna tiklar.
    And Admin Required dogrular.
    Then close driver
    Examples: data
      |Date of Birth|Password|
      |11.02.2012   |12345678|

  Scenario Outline:Admin_password_TC03
    Given Admin Name kismina valid  girer
    When Admin Surname kismina valid  girer
    And Admin Birth place kismina valid deger girer
    And Admin Gender kismini secer
    And Admin Date of birth alanina "<Date of Birth>" bir tarih girer
    And Admin Phone Number alanina valid bir deger girer
    And Admin SSN  alanina valid bir deger girer
    And Admin User Name alanina valid bir deger girer
    And Admin yedi karakterden oluşan Password "<Password>" girer
    And Admin submit tusuna tiklar.
    And Admin Minimum sekiz character yazisini dogrular.
    Then close driver
    Examples: data
      |Date of Birth|Password|
      |11.02.2012   |1234567|

  Scenario Outline:Admin_SSN_TC04
    Given Admin Name kismina valid  girer
    When Admin Surname kismina valid  girer
    And Admin Birth place kismina valid deger girer
    And Admin Gender kismini secer
    And Admin Date of birth alanina "<Date of Birth>" bir tarih girer
    And Admin Phone Number alanina valid bir deger girer
    And Admin SSN  alanina - koymadan  bir "<deger>" girer
    And Admin User Name alanina valid bir deger girer
    And Admin yedi karakterden oluşan Password "<Password>" girer
    And Admin submit tusuna tiklar.
    And Admin Minimum onbir character XXX-XX-XXXX yazisini dogrular.
    Then close driver
    Examples: data
      |Date of Birth|Password|deger|
      |11.02.2012   |12345678|123456789|

  Scenario Outline:Admin_SSN_TC05
    Given Admin Name kismina valid  girer
    When Admin Surname kismina valid  girer
    And Admin Birth place kismina valid deger girer
    And Admin Gender kismini secer
    And Admin Date of birth alanina "<Date of Birth>" bir tarih girer
    And Admin Phone Number alanina valid bir deger girer
    And Admin SSN  alanina bir "<deger>" girer
    And Admin User Name alanina valid bir deger girer
    And Admin yedi karakterden oluşan Password "<Password>" girer
    And Admin submit tusuna tiklar.
    And Admin Please enter valid SSN number yazisini dogrular.
    Then close driver
    Examples: data
      |Date of Birth|Password|deger|
      |11.02.2012   |12345678|452-23-35698|

  Scenario Outline:Admin_ileritarih_TC06
    Given Admin Name kismina valid  girer
    When Admin Surname kismina valid  girer
    And Admin Birth place kismina valid deger girer
    And Admin Gender kismini secer
    And Admin Date of birth alanina ileri "<Date of Birth>" bir tarih girer
    And Admin Phone Number alanina valid bir deger girer
    And Admin SSN  alanina valid bir deger girer
    And Admin User Name alanina valid bir deger girer
    And Admin en az sekiz karakterden oluşan Password "<Password>" girer
    And Admin submit tusuna tiklar.
    And Admin ileri bir tarih girilemez yazisini dogrular.
    Then close driver
    Examples: data
      |Date of Birth|Password|
      |11.12.2023   |12345678|












