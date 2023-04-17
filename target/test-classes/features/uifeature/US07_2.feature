@deanmessagedelete
Feature: Dean mesajlari silebilmeli
  Background: Dean get all sayfasina gider
    Given Kullanici Dean olarak login olur.
    Then Basariyla Dean girisi yaptigini  dogrular.
    When Kullanici acilan sayfada menu kismina tiklar
    When Menuden contact get all u tiklar

  Scenario: TC01 Delete tusu gorulebilmeli
    Then Acilan sayfada delete tusunu goruldugunu dogrular

  Scenario: TC02 Dean mesajlari silebilmeli
    When Acilan sayfada bir mesaji siler
    Then Kullanici dean hesabiyla mesajlarin silinebildigini dogrular.