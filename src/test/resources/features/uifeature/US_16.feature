@16
Feature:Vice Dean, kullanıcıların gönderdiği mesajları görebilmelidir.

  @16_1
  Scenario: Vice Dean, mesajları,yazarlarını,e-maillerini,gönderilme tarihi ve subject bilgilerini görüntüleyebilmelidir.
    Given  Kullanici viceDean olarak login olur
    And Kullanici Contact butonuna tiklar
    And Kullanici Your Name textboxini  gecerli yourname bilgisini girer
    And Kullanici Your Mail textboxini  gecerli mailini girer
    And Kullanici Subject textboxini doldurur
    And Kullanici Message textboxini doldurur
    And Kullanici Send Message butonuna tiklar
    And Kullanici basarili giris yapildigini dogrular
    And Kullanici Menu butonuna tiklar
    And Kullanici Contact Get All butonuna tiklar.
   # And Kullanici gonderen kisi isminin Name sutununda goruntulendigini dogrular
    And Kullanici gonderen kisinin mailinin Email sutununda goruntulendigini dogrular
   # And Kullanici mesajin gonderilme tarinini Date sutununda goruntulendigini dogrular
   # And Kullanici mesajin konusunun Subject sutununda goruntulendigini dogrular
   # And Kullanici mesajin Message sutununda goruntulendigini dogrular

