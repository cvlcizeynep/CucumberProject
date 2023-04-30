@US06DB
Feature: Dean Vice Dean ekleyebilmelidir.

Scenario: TC01 Eklenen vice dean database gorulebilmelidir.

Given Kullanici Dean olarak login olur.
Given Kullanici Vice Dean ekler
When Database icin connect saglanir
When Databaseden olusturulan vice dean bilgileri sorgulanir
Then Databasede deanin ekledigi vice deanin goruldugu dogrulanir.




