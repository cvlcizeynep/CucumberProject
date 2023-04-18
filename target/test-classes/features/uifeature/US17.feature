@US10
Feature:Vice dean ders secebilmeli


  Scenario:Kullanici ders secebilmelidir#
    Given Kullanici Teacher olarak login olur.
    And  acilan menuden bir ogrenci secer
    And  acilan Student Info Management sayfasından Choose Education Term ı tıklar
    And  acilan menuden bir ogretim donemi secer
    And  acilan Student Info Management sayfasından Absentee ye tıklar
    And ogrencinin kac gun  devamsızlık yaptıgını girer
    Given acilan Student Info Management sayfasından Midterm Exam a tıklar
    Given Midterm exam kısmına bir ara sınav Notu girer
    Given acilan Student Info Management sayfasından Final Exam a tıklar
    Given Final exam kısmına bir final Notu girer
    Given acilan Student Info Management sayfasından Info Note a tıklar
    Given Info Note kısmına bir bilgi notu girer
