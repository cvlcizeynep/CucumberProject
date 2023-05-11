
Feature: Dean Vice Dean ekleyebilmelidir.

Scenario: TC01 Eklenen vice dean database gorulebilmelidir.

Given Kullanici Dean olarak login olur.
Given Kullanici Vice Dean ekler
When Database icin connect saglanir
When Databaseden olusturulan vice dean bilgileri sorgulanir
Then Databasede deanin ekledigi vice deanin goruldugu dogrulanir.
Then  Close Database

Scenario: TC02
  Given Kullanici Dean olarak login olur.
  Given Kullanici Vice Dean ekler
  When Database icin connect saglanir
  When Databaseden olusturulan "id" icin "5" ozellikli sorgu yapilir.
  Then Olusturulan "id" icin "5" ozellikli verinin dogrulamasi yapilir
  Then Close Database


