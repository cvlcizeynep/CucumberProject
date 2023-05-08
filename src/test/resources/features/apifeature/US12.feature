@US12_Api
Feature:"Vice Dean öğretmene ders atayabilmelidir.(Lesson Program - Lesson Program Assignment)"

  Scenario:TC01 Valid değerler girerek ders programı oluşturulmalıdır.
    Given ViceDean ders programı olusturmak icin post request gonderir US12
    When Guest User datayi get request ile dogrular US12

  Scenario:TC02 Choose Lessons bölümüne oluşturulan dersin geldiği görülmelidir.
    Given ViceDean TC01'de olusturulan dersin bilgilerini girerek dersi görür US12

    Scenario: TC03 Ders için öğretmen seçilebilmelidir.
      Given ViceDean TC01'de oluşturulan derse bir öğretmen atar US12
