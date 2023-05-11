@End2End

Feature:Dean, mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve
  subject bilgilerini görüntüleyebilmelidir.Dean mesajları silebilmelidir.

Scenario: TC01 Mesaj Gonderme ve Dogrulama
  Given Kullanici mesaj gondermek icin post yapar
  Then Kullanici gonderdigi mesajin ve ona ait bilgilerin goruldugunu dogrular

  Scenario: TC02 ui ve api mesajalrini karsilastirma
    Given UI da gorulen mesajlar bir liste atilir
    When Apiden butun mesajlar bir liste atilir
    Then Api ve Ui daki mesajlar karsilastirilarak dogrulama yapilir