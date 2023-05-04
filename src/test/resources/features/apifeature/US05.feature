@US05_Api
Feature:Dean
  @US05_TC01
  Scenario:TC01Admin Dean'lerin Name, Gender, Phone Number, SSN, User Name bilgilerini görebilmeli,guncellemeli ve silebilmeli
    Given kullanici dean eklemek icin post request gonderir
    When Dean datayi put reguest ile gunceller
    Then Dean datayi delete request ile siler
