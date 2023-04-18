@viceDeanAdd
Feature: Vice Dean ogrenci  olusturabilmelidir

  Background:
    When Kullanici viceDean olarak login olur.
    Then Basariyla viceDean girisi yaptigini dogrular.
    When Menu butonuna tiklar
    When Student Management butonuna tiklar


  @US15_TC01 @smoke
  Scenario Outline: TC_01 Ogrecinin danisman ogretmeni secilmelidir.
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
      | m | janet | al | ordu | janet@hotmail.com | 534-301-4211 | 01.01.1990 | 420-53-0010 | janetal | adem | havva | 12345678 |


  @US15_TC02
  Scenario Outline:TC_02 Choose Advisor Teacher alani  bos birakilir

    Then Vice Dean Choose "<Advisor Teacher>" Advisor_Teacher alani bos birakilir
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
    And Vice Dean kayit yapilamadigini dogrular


    Examples:Choose Advisor Teacher

      | Advisor Teacher | Name | surname | Birth Place | Email | Phone | Date Of Birth | Ssn | User Name | Father | Mother | Password |
      |                 |      |         |             |       |       | 01.01.1990    |     |           |        |        | 12345678 |

  @US15_TC03
  Scenario Outline:TC_03 name alani bos birakilir
    Then Vice Dean Choose "<Advisor Teacher>" Advisor_Teacher alani secilir
    Then Vice Dean "<Name>"Name alanini bos birakilir
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

   Examples:
     | Advisor Teacher | Date Of Birth |  | Password |
     | m               | 01.01.1990    |  | 12345678 |

  @US15_TC09
  Scenario Outline:TC_03 email alani bos birakilir
    Then Vice Dean Choose "<Advisor Teacher>" Advisor_Teacher alani secilir
    Then Vice Dean "<Name>"Name alanina vaild bir deger girer
    Then Vice Dean "<surname>" surname alanina valid bir deger girer
    Then Vice Dean "<Birth Place>" Birth Place alanina valid bir deger girer
    Then Vice Dean "<Email>" Email alanina deger girmez
    Then Vice Dean "<Phone>" Phone alanina valid bir deger girer
    Then Vice Dean Gender secer
    Then Vice Dean "<Date Of Birth>" Date Of Birth alanina valid bir deger girer
    Then Vice Dean "<Ssn>" Ssn alanina valid bir deger girer
    Then Vice Dean "<User Name>" User Name alanina valid bir deger girer
    Then Vice "<Father>" Father alanina valid bir deger girer
    Then Vice "<Mother>" Mother alanina valid bir deger girer
    Then Vice "<Password>" Password alanina valid bir deger girer
    Then Vice Dean Submit Butonuna tiklar
    And Vice  emailRequired  ibaresini gorur dogrulamasini yapar

    Examples:
      | Advisor Teacher | Date Of Birth |  | Password |
      | m               | 01.01.1990    |  | 12345678 |

  @US15_TC10
  Scenario Outline:TC_10 phone  alani bos birakilir
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
    And Vice  phoneRequired  ibaresini gorur dogrulamasini yapar

    Examples:
      | Advisor Teacher | Date Of Birth |  | Password |
      | m               | 01.01.1990    |  | 12345678 |

  @US15_TC13
  Scenario Outline:TC_10 gender  alani bos birakilir
    Then Vice Dean Choose "<Advisor Teacher>" Advisor_Teacher alani secilir
    Then Vice Dean "<Name>"Name alanina vaild bir deger girer
    Then Vice Dean "<surname>" surname alanina valid bir deger girer
    Then Vice Dean "<Birth Place>" Birth Place alanina valid bir deger girer
    Then Vice Dean "<Email>" Email alanina valid bir deger girer
    Then Vice Dean "<Phone>" Phone alanina valid bir deger girer
    Then Vice Dean Gender secmez
    Then Vice Dean "<Date Of Birth>" Date Of Birth alanina valid bir deger girer
    Then Vice Dean "<Ssn>" Ssn alanina valid bir deger girer
    Then Vice Dean "<User Name>" User Name alanina valid bir deger girer
    Then Vice "<Father>" Father alanina valid bir deger girer
    Then Vice "<Mother>" Mother alanina valid bir deger girer
    Then Vice "<Password>" Password alanina valid bir deger girer
    Then Vice Dean Submit Butonuna tiklar
    And Vice  error  mesaji gorur

    Examples:
      | Advisor Teacher | Date Of Birth |  | Password |
      | m               | 01.01.1990    |  | 12345678 |

  @US15_TC14
  Scenario Outline:TC_14 Date of Birth  alani bos birakilir
    Then Vice Dean Choose "<Advisor Teacher>" Advisor_Teacher alani secilir
    Then Vice Dean "<Name>"Name alanina vaild bir deger girer
    Then Vice Dean "<surname>" surname alanina valid bir deger girer
    Then Vice Dean "<Birth Place>" Birth Place alanina valid bir deger girer
    Then Vice Dean "<Email>" Email alanina valid bir deger girer
    Then Vice Dean "<Phone>" Phone alanina valid bir deger girer
    Then Vice Dean Gender secer
    Then Vice Dean "<Date Of Birth>" Date Of Birth alanina deger girmez
    Then Vice Dean "<Ssn>" Ssn alanina valid bir deger girer
    Then Vice Dean "<User Name>" User Name alanina valid bir deger girer
    Then Vice "<Father>" Father alanina valid bir deger girer
    Then Vice "<Mother>" Mother alanina valid bir deger girer
    Then Vice "<Password>" Password alanina valid bir deger girer
    Then Vice Dean Submit Butonuna tiklar
    And Vice  DateOfBirthRequired  ibaresini gorur dogrulamasini yapar

    Examples:
      | Advisor Teacher | Date Of Birth |  | Password |
      | m               |               |  | 12345678 |


  @US15_TC16
  Scenario Outline:TC_16 Ssn  alani bos birakilir
    Then Vice Dean Choose "<Advisor Teacher>" Advisor_Teacher alani secilir
    Then Vice Dean "<Name>"Name alanina vaild bir deger girer
    Then Vice Dean "<surname>" surname alanina valid bir deger girer
    Then Vice Dean "<Birth Place>" Birth Place alanina valid bir deger girer
    Then Vice Dean "<Email>" Email alanina valid bir deger girer
    Then Vice Dean "<Phone>" Phone alanina valid bir deger girer
    Then Vice Dean Gender secer
    Then Vice Dean "<Date Of Birth>" Date Of Birth alanina valid bir deger girer
    Then Vice Dean "<Ssn>" Ssn alanina deger girmez
    Then Vice Dean "<User Name>" User Name alanina valid bir deger girer
    Then Vice "<Father>" Father alanina valid bir deger girer
    Then Vice "<Mother>" Mother alanina valid bir deger girer
    Then Vice "<Password>" Password alanina valid bir deger girer
    Then Vice Dean Submit Butonuna tiklar
    And Vice  ssnRequired  ibaresini gorur dogrulamasini yapar

    Examples:
      | Advisor Teacher | Date Of Birth |  | Password |
      | m               | 01.01.1990    |  | 12345678 |





