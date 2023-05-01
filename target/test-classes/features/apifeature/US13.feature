@US13API
Feature: Vice Dean Teacher ekleyebilmelidir

  @TeacherGetRequest
  Scenario:Teacher goruntulenebilmelidir
    Given kullanici teacher eklemek icin post request gonderir
    Then kullanici olusturulan teacher in bilgilerini goruntuler

    #Then verify that the response body contains all expected data


  @TeacherPostRequest
  Scenario:Vice Dean Teacher ekleyebilmelidir
    Given kullanici teacher eklemek icin post request gonderir
    Then response body nin beklendigi gibi geldigini dogrular


  @getSavedTeacherById
  Scenario:Teacher goruntulenebilmelidir
    Given kullanici gormek istedigi teacher ismini girer
    Then kullanici olusturulan teacher in bilgilerini goruntuler














