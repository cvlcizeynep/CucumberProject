@US10
Feature:Teacher, öğrencilere not verebilmelidir.



  Scenario:Kullanici ders secebilmelidir#
    Given Kullanici Teacher olarak login olur.
  Given choose lesson tiklar

    And  acilan Student Info Management sayfasindan Choose Education Term ı tiklar
    And  acilan menuden bir ogretim donemi secer
    And  acilan Student Info Management sayfasından Absentee ye tiklar
    And ogrencinin kac gun  devamsizlik yaptigini girer
    Given acilan Student Info Management sayfasından Midterm Exam a tiklar
    Given Midterm exam kısmına bir ara sınav Notu girer
    Given acilan Student Info Management sayfasindan Final Exam a tiklar
    Given Final exam kismina bir final Notu girer
    Given acilan Student Info Management sayfasından Info Note a tiklar
    Given Info Note kısmına bir bilgi notu girer
