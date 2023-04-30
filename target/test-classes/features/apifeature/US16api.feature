
Feature: Vice Dean, kullanıcıların gönderdiği mesajları görebilmelidir.
  @api16
  Scenario:  TC01
    Given Teacher API ile login olarak bir mesaj olusturur
    And Vice Dean olusturulan tum mesajlari API ile goruntuler
   # Then Vice Dean bir mesaji API ile siler