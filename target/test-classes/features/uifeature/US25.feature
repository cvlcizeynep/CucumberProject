@AdminAdd
Feature: Admin ogrenci  olusturabilmelidir

  Background:
    Given Kullanici admin olarak login olur.
    Then Basariyla admin girisi yaptigini dogrular.
    When Menu butonuna tiklar
    When Student Management butonuna tiklar


  @US25_TC01
  Scenario Outline: TC_01 Ogrecinin danisman ogretmeni secilmelidir.
    Then Admin Choose "<Advisor Teacher>" Advisor_Teacher alani secilir
    Then Admin "<Name>"Name alanina vaild bir deger girer
    Then Admin "<surname>" surname alanina valid bir deger girer
    Then Admin "<Birth Place>" Birth Place alanina valid bir deger girer
    Then Admin "<Email>" Email alanina valid bir deger girer
    Then Admin "<Phone>" Phone alanina valid bir deger girer
    Then Admin Gender secer
    Then Admin "<Date Of Birth>" Date Of Birth alanina valid bir deger girer
    Then Admin "<Ssn>" Ssn alanina valid bir deger girer
    Then Admin "<User Name>" User Name alanina valid bir deger girer
    Then Admin"<Father>" Father alanina valid bir deger girer
    Then Admin"<Mother>" Mother alanina valid bir deger girer
    Then Admin"<Password>" Password alanina valid bir deger girer
    Then Admin Submit Butonuna tiklar
    And Admin succesfully ibaresini gorur dogrulamasini yapar
    Then close driver


    Examples:Choose Advisor Teacher

      | Advisor Teacher | Name  | surname | Birth Place | Email             | Phone        | Date Of Birth | Ssn         | User Name | Father | Mother | Password |
      | m | janet | al | ordu | janet@hotmail.com | 534-301-4211 | 01.01.1990 | 420-53-0010 | janetal | adem | havva | 12345678 |