@viceDeanAdd
Feature: Vice Dean ogrenci  olusturabilmelidir

  Background:
    When Kullanici viceDean olarak login olur.
    Then Basariyla viceDean girisi yaptigini dogrular.
    When Menu butonuna tiklar
    When Teacher Management butonuna tiklar

  Scenario Outline: Ogrecinin danısman ogretmeni secilmelidir.
    Then Vice Dean Choose "<Advisor Teacher>" alani secildigi dogrulanir
    Then Vice Dean "<Name>" alanina vaild bir deger girer
    Then Vice Dean "<surname>" alanina valid bir deger girer
    Then Vice Dean "<Birth Place>" alanina valid bir deger girer
    Then Vice Dean "<Email>" alanina valid bir deger girer
    Then Vice Dean "<Phone>" alanina valid bir deger girer
    Then Vice Dean Gender secer
    Then Vice Dean "<Date Of Birth>" alanina valid bir deger girer
    Then Vice Dean "<Ssn>" alanina valid bir deger girer
    Then Vice Dean "<User Name>" alanina valid bir deger girer
    Then Vice "<Father>" alanina valid bir deger girer
    Then Vice "<Mother>" alanina valid bir deger girer
    Then Vice "<Password>" alanina valid bir deger girer
    Then Vice Dean Submit Butonuna tiklar
    And Vice  Dean succesfully  ibaresini gorur dogrulamasini yapar

    Examples:Choose Advisor Teacher

      | Advisor Teacher | Name  | surname | Birth Place | Email             | Phone        | Date Of Birth | Ssn         | User Name | Father | Mother | Password |
      | m               | janet | al      | ordu        | janet@hotmail.com | 534-301-4211 | 01.01.1990    | 420-53-0010 | janetal   | adem   | havva  | 12345678 |