@b
Feature:Vice Dean, kullanıcıların gönderdiği mesajları görebilmelidir

  @16_1
  Scenario: Vice Dean, mesajları,yazarlarını,e-maillerini,gönderilme tarihi ve subject bilgilerini görüntüleyebilmelidir
    Given  Kullanici viceDean olarak login olur
    And Kullanici Contact butonuna tiklar
    And Kullanici Your Name textboxini  gecerli yourname bilgisini girer
    And Kullanici Your Mail textboxini  gecerli mailini girer
    And Kullanici Subject textboxini doldurur
    And Kullanici Message textboxini doldurur
    And Kullanici Send Message butonuna tiklar
    And Kullanici basarili giris yapildigini dogrular
    And Kullanici Menu butonuna tiklar
    And Kullanici Contact Get All butonuna tiklar
    And Kullanici gonderen kisi  Name-mail-subject-message bilgilerinin listede goruntulendigini dogrular
    And close driver


  @failedScenario
  Scenario: Vice Dean, mesajları silebilmelidir
    Given  Kullanici viceDean olarak login olur
    And Kullanici Contact butonuna tiklar
    And Kullanici Your Name textboxini  gecerli yourname bilgisini girer
    And Kullanici Your Mail textboxini  gecerli mailini girer
    And Kullanici Subject textboxini doldurur
    And Kullanici Message textboxini doldurur
    And Kullanici Send Message butonuna tiklar
    And Kullanici basarili giris yapildigini dogrular
    And Kullanici Menu butonuna tiklar
    And Kullanici Contact Get All butonuna tiklar
    Then Kullanici Delete butonuna tiklar
    And close driver
