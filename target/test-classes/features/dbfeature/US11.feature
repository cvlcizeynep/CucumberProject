@US11DB
  Feature: Vice Dean ders programını görebilmeli ve güncellemeler yapabilmelidir.
    Scenario: TC01 Vice Dean ders programını Databaseden görebilmelidir.
      Given Database icin connect saglanir
      And kullanici Databaseden ders programini gorebilmelidir.
      Then kullanici ders programini gorundugunu dogrular