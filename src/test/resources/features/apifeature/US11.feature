@ApiUs11Test01
  Feature: ViceDean Lesson Program Goruntuleyebilmelidir
    Scenario: TC02_ViceDean_Lesson_Program_Goruntuleyebilmelidir
      Given kullanici Lesson program goruntulemek icin get request gonderir ve dogrulama yapar

    @ApiUs11Test01
    Scenario: Vice Dean Lesson program silme islemi yapabilir
      Given kullanici silmek istedigi ders icin delete request gonderir ve dogrulamayapar.