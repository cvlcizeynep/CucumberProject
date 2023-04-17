@viceDeanAddNegative
Feature: Vice Dean ogrenci  olusturabilmelidir

  Background:
    When Kullanici viceDean olarak login olur.
    Then Basariyla viceDean girisi yaptigini dogrular.
    When Menu butonuna tiklar
    When Student Management butonuna tiklar



  @US15_TC04_
  Scenario Outline:TC_04 name surname username mother father alani space girilir
    Then Vice Dean Choose "<Advisor Teacher>" Advisor_Teacher alani secilir
    Then Vice Dean "<Name>"Name alanini space girilir
    Then Vice Dean "<surname>" surname alanini space girilir
    Then Vice Dean "<Birth Place>" Birth Place alanina valid bir deger girer
    Then Vice Dean "<Email>" Email alanina valid bir deger girer
    Then Vice Dean "<Phone>" Phone alanina valid bir deger girer
    Then Vice Dean Gender secer
    Then Vice Dean "<Date Of Birth>" Date Of Birth alanina valid bir deger girer
    Then Vice Dean "<Ssn>" Ssn alanina valid bir deger girer
    Then Vice Dean "<User Name>" User Name alanini space girilir
    Then Vice "<Father>" Father alanini space girilir
    Then Vice "<Mother>" Mother alanini space girilir
    Then Vice "<Password>" Password alanini space girilir
    Then Vice Dean Submit Butonuna tiklar
    And Vice  Dean succesfully  ibaresini gorur dogrulamasini yapar
    Then close driver
    Examples:
      | Advisor Teacher | Date Of Birth |  | Password |
      | Cem Can           | 01.01.1990    |  | 12345678 |




