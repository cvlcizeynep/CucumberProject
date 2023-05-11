@US01_Api
Feature:Guest_User_Register

  Scenario:TC01 Valid değerler girerek guest user olusturulabilmelidir.
    Given Admin Guest User List olusturmak icin post request gonderir US01
    When Guest User datayi get request ile dogrular US01

    Scenario: TC02 Daha önce kullanılmıs bir ssn kullanarak kayıt olunamaz.
      Given Admin Guest User List olusturmak icin invalid ssn ile post request gonderir US01
      When Guest User invalid ssn ile datayi get request ile dogrulayamaz US01

  Scenario: TC03 Boş bir ssn kullanarak kayıt olunamaz.
    Given Admin Guest User List olusturmak icin boş bir ssn ssn ile post request gonderir US01
    When Guest User bos ssn ile  datayi get request ile dogrulayamaz US01