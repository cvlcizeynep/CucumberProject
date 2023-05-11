@US02_Api
  Feature:Guest_User
    @US02_TC01
    Scenario:TC01
      Given Admin Guest User List olusturmak icin post request gonderir
      When Guest User datayi get request ile dogrular
      Then Guest user datayi delete request ile siler
