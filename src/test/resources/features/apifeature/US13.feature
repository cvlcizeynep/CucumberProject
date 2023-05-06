@US13API
Feature: Vice Dean Teacher ekleyebilmelidir

  @TeacherGetRequest
  Scenario:Teacher goruntulenebilmelidir
    Given kullanici teacher eklemek icin post request gonderir
    Then kullanici gormek istedigi teacher ismini girer ve dogrular



  @TeacherPostRequest
  Scenario:Vice Dean Teacher ekleyebilmelidir
    Given kullanici teacher eklemek icin post request gonderir
    Then response body nin beklendigi gibi geldigini dogrular


  @getSavedTeacherByName
  Scenario:Teacher goruntulenebilmelidir
    Given kullanici gormek istedigi teacher ismini girer ve dogrular
    Then kullanici olusturulan teacher in bilgilerini id ile goruntuler














