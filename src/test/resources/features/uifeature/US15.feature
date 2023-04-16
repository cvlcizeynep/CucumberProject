@viceDeanAdd
Feature: Vice Dean ogrenci  olusturabilmelidir

  Background:
    When Kullanici viceDean olarak login olur.
    Then Basariyla viceDean girisi yaptigini dogrular.
    When Menu butonuna tiklar
    When Student Management butonuna tiklar
    Scenario:TC02 name alani bos birakilir

      Then Vice Dean Choose "<Advisor Teacher>" Advisor_Teacher alani secilir
      Then Vice Dean "<Name>"Name alanını bos birakilir
      Then Vice Dean "<surname>" surname alanina valid bir deger girer
      Then Vice Dean "<Birth Place>" Birth Place alanina valid bir deger girer
      Then Vice Dean "<Email>" Email alanina valid bir deger girer
      Then Vice Dean "<Phone>" Phone alanina valid bir deger girer
      Then Vice Dean Gender secer
      Then Vice Dean "<Date Of Birth>" Date Of Birth alanina valid bir deger girer
      Then Vice Dean "<Ssn>" Ssn alanina valid bir deger girer
      Then Vice Dean "<User Name>" User Name alanina valid bir deger girer
      Then Vice "<Father>" Father alanina valid bir deger girer
      Then Vice "<Mother>" Mother alanina valid bir deger girer
      Then Vice "<Password>" Password alanina valid bir deger girer
      Then Vice Dean Submit Butonuna tiklar
      And Vice  Required  ibaresini gorur dogrulamasini yapar











  Scenario Outline: Ogrecinin danisman ogretmeni secilmelidir.
    Then Vice Dean Choose "<Advisor Teacher>" Advisor_Teacher alani secilir
    Then Vice Dean "<Name>"Name alanina vaild bir deger girer
    Then Vice Dean "<surname>" surname alanina valid bir deger girer
    Then Vice Dean "<Birth Place>" Birth Place alanina valid bir deger girer
    Then Vice Dean "<Email>" Email alanina valid bir deger girer
    Then Vice Dean "<Phone>" Phone alanina valid bir deger girer
    Then Vice Dean Gender secer
    Then Vice Dean "<Date Of Birth>" Date Of Birth alanina valid bir deger girer
    Then Vice Dean "<Ssn>" Ssn alanina valid bir deger girer
    Then Vice Dean "<User Name>" User Name alanina valid bir deger girer
    Then Vice "<Father>" Father alanina valid bir deger girer
    Then Vice "<Mother>" Mother alanina valid bir deger girer
    Then Vice "<Password>" Password alanina valid bir deger girer
    Then Vice Dean Submit Butonuna tiklar
    And Vice  Dean succesfully  ibaresini gorur dogrulamasini yapar

    Examples:Choose Advisor Teacher

      | Advisor Teacher | Name  | surname | Birth Place | Email             | Phone        | Date Of Birth | Ssn         | User Name | Father | Mother | Password |
      | m               | janet | al      | ordu        | janet@hotmail.com | 534-301-4211 | 01.01.1990    | 420-53-0010 | janetal   | adem   | havva  | 12345678 |