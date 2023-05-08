@US03Api
Feature: Contact Creation

  @US03_API01
  Scenario: TC01_TumAlanlarinDogruGirilmesi
    Given kullanici Contact kismindan mesaj gonderir
    Then mesaj basarili sekilde gonderilir



  @US03_API02
  Scenario: TC02_NameAlaniBosBirakilmasi
    Given kullanici name alanini bos birakarak mesaj gonderir
    Then name alani hata mesaji aldigini dogrular


  @US03_API03
  Scenario: TC03_MailAlaninaInvalidDegerGirilmesi
    Given kullanici mail alanina invalid deger girerek mesaj gonderir
    Then email alani hata mesaji aldigini dogrular


  @US03_API04
  Scenario: TC04_EmailAlanininBosBirakilmasi
    Given kullanici email alanini bos birakarak mesaj gonderir
    Then email alani bos hata mesajini gordugunu dogrular


  @US03_API05
  Scenario: TC05_SubjectAlanininBosBirakilmasi
    Given kullanici subject alanini bos birakarak mesaj gonderir
    Then subject alani hata mesaji aldigini dogrular


  @US03_API06
  Scenario: TC06_SubjectAlaninaInvalidDegerGirilmesi
    Given kullanici subject alanina invalid deger girerek mesaj gonderir
    Then subject alani invalid deger hata mesajini goruntuler


  @US03_API07
  Scenario: TC07_MessageAlanininBosBirakilmasi
    Given kullanici message alanini bos birakarak mesaj gonderir
    Then mesaj alani hata mesajini gordugunu dogrular


  @US03_API08
  Scenario: TC08_MessageAlaninaInvalidDegerGirilmesi
    Given kullanici message alanina invalid (a) deger girerek mesaj gonderir
    Then subject alani invalid deger hata mesajini goruntuledigini dogrular


  @US03_API09
  Scenario: TC9_AyniMailleIkinciMesajGonderemez
    Given kullanici gun icinde ayni maille mesaj gondermeye calisir
    Then ayni maille ikinci mesaj gondermez mesajini goruntuledigini dogrular

