
@US14API
Feature:  Vice Dean Teacher editleyebilmelidir

  @TeacherPutRequest
  Scenario: Vice Dean Teacher bilgilerini guncelleyebilmelidir
    Given kullanici teacher guncellemek icin put request gonderir
    Then response body nin beklendigi gibi geldigini dogrular