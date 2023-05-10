@US07API
Feature: Admin vice dean ekleyebilmleidri
Scenario: TC01 Admin butun gerekli alanlari doldurarak Vice Dean ekleyebilmeli.
Given Dean butun gerekli alanlari doldurarak Vice Dean ekler
Then Eklenen vice deanin olustugunu test eder.

Scenario: TC02 Name kismi bos birakilarak post yapma
Given Admin name kismi bos bir body ile post request yapar
Then Name  bos birakilinca post yapilamadigini dogrular

Scenario: TC03 Surname ve birth place kismi bos birakilarak post yapma
Given Admin tokeniyle surname ve birt place bos birakilarak post yapar
Then Surname ve Birth Place bosken post yapilamadigini dogrular

Scenario: TC04 Telefon ve ssn kismina tekrarli veri ile post yapma
Given Admin tokeniyle telefon ve SSN  kismina tekrarli veri ile post yapar
Then Ssn ve telefon tekrarli olunca post yapilamadigini dogrular

Scenario: TC05 Username kismina tekrarli veri ile post yapma
Given Admin tokeniyle username  kismina tekrarli veri ile post yapar
Then Tekrarli username ile post yapilamadigini dogrular

Scenario: TC06 Bos body ile post yapma
Given Admin tokeniyle bos body gondererek post yapar
Then  Bos body ile post yapilmadigini dogrular

Scenario: TC07 Invalid degerlerle post yapma
Given Admin tokeniyle post bodysine invalid degerler girer
Then Invalid degerlerle post yapilmadigini dogrular.