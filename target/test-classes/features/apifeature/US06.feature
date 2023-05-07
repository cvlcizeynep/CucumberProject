@US06API
Feature: Dean Vice Dean Hesabi Olusturabilmelidir.

  Scenario: TC01 Dean butun gerekli alanlari doldurarak Vice Dean ekleyebilmeli.
    Given Dean butun gerekli alanlari doldurarak Vice Dean ekler
    Then Eklenen vice deanin olustugunu test eder.

    Scenario: TC02 Name kismi bos birakilarak post yapma
      Given Dean name kismi bos bir body ile post request yapar
      Then Name kismi bos birakilinca post yapilamadigini dogrular

      Scenario: TC03 Surname ve birth place kismi bos birakilarak post yapma
        Given Kullanici Dean tokeniyle surname ve birt place bos birakilarak post yapar
        Then Surname ve birth place bosken post yapilamadigini dogrular

        Scenario: TC04 Telefon ve ssn kismina tekrarli veri ile post yapma
          Given Kullanici dean tokeniyle telefon ve SSN  kismina tekrarli veri ile post yapar
          Then SSN ve telefon tekrarli olunca post yapilamadigini dogrular

          Scenario: TC05 Username kismina tekrarli veri ile post yapma
            Given Kullanici dean tokeniyle username  kismina tekrarli veri ile post yapar
            Then Kullanici tekrarli username ile post yapilamadigini dogrular

            Scenario: TC06 Bos body ile post yapma
              Given Kullanici dean tokeniyle bos body gondererek post yapar
              Then  Kullanici bos body ile post yapilmadigini dogrular

              Scenario: TC07 Invalid degerlerle post yapma
                Given Kullanici post bodysine invalid degerler girer
                Then Kulanici invalid degerlerle post yapilmadigini dogrular.
