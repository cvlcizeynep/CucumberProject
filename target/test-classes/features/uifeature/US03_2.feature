@US03
Feature: Your Name alaninin testi

  Background:
    Given kullanici sayfaya gider
    When kullanici Contact butonuna tiklar

    Then kullanici Concatct sayfasina yonlendirilir
@failedScenario
Scenario Outline: US03_NegativeScenario
    When kullanici yourname "<Your Name>" alanini doldurur
    When kullanici email "<Your Email>" alanina valid deger girer
    When kullanici subject "<Subject>" alanina valid deger  girer
    When kullanici Message "<Message>" alanina valid deger  girer
    When kullanici Send Message alanina tiklar
    Then kullanici Contact Message Created Created Successfully mesajini goruntulemez
    And sayfa kapatilir



    Examples: data

      |Your Name | Your Email           | Subject | Message                   |
      |Cahit     | zarifsair            | Java    |Kaliteli bir egitim aldim  |
      |Cahit     | zarifsairr@gmail.com  |   !     |Kaliteli bir egitim aldim  |
      |Cahit     | zariffsair@gmail.comr |   2     |Kaliteli bir egitim aldim  |
      |Cahit     | zaarifsair@gmail.com  |  Java   |           a               |
      |Cahit     | zarifssair@gmail.com  |  Java   | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |






  Scenario: Aynı maili gün icinde ikinci kez kullanamaz
    When kullanici Your Name alanina  valid bir deger "Ayse" girer
    When kullanici Your Email  alanina  valid bir deger girer
    When kullanici subject  alanina valid bir deger "resim" girer
    When kullanici  mesaj alanina valid bir deger "renkleri seviyorum" girer
    When kullanici Send Message alanina tiklar
    When kullanici Your Name alanina  valid bir deger "Beyza" girer
    When kullanici Your Email  alanina  ayni maili girer
    When kullanici subject  alanina valid bir deger "muzik" girer
    When kullanici  mesaj alanina valid bir deger "notalari seviyorum" girer
    When kullanici Send Message alanina tiklar
    Then kullanici uyari ayni maili kullanamayacgi mesaji alir
    And sayfa kapatilir



  Scenario: Name alanının bos birakilması testi

    When kullanici yourname alanini bos birakir
    When kullanici Your Email  alanina  valid bir deger girer
    When kullanici subject  alanina valid bir deger "resim" girer
    When kullanici  mesaj alanina valid bir deger "renkleri seviyorum" girer
    When kullanici Send Message alanina tiklar
    Then kullanici ilgili alanda Required mesaji alir
    And sayfa kapatilir



  Scenario: Email alanının bos birakilması testi

    When kullanici Your Name alanina  valid bir deger "Ayse" girer
    When kullanici Your Email  alanini bos birakir
    When kullanici subject  alanina valid bir deger "resim" girer
    When kullanici  mesaj alanina valid bir deger "renkleri seviyorum" girer
    When kullanici Send Message alanina tiklar
    Then kullanici email alaninda Required mesaji alir
    And sayfa kapatilir



  Scenario: Subject alanının bos birakilması testi

    When kullanici Your Name alanina  valid bir deger "Ayse" girer
    When kullanici Your Email  alanina  valid bir deger girer
    When kullanici subject  alanini bos birakir
    When kullanici  mesaj alanina valid bir deger "renkleri seviyorum" girer
    When kullanici Send Message alanina tiklar
    Then kullanici subject alaninda Required mesaji alir
    And sayfa kapatilir


  Scenario: Message alanının bos birakilması testi

    When kullanici Your Name alanina  valid bir deger "Ayse" girer
    When kullanici Your Email  alanina  valid bir deger girer
    When kullanici subject  alanina valid bir deger "resim" girer
    When kullanici  mesaj alanini bos birakir
    When kullanici Send Message alanina tiklar
    Then kullanici message alaninda Required mesaji alir
    And sayfa kapatilir
