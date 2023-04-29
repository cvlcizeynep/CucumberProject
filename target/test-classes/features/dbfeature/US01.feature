@US01DB
Feature: "Aday öğrenciler sisteme kayıt olabilmelidir.(Register)"

  Background: Kullanıcı databes'e bağlanır.
    Given Database icin contact saglanir

  Scenario: TC01 Registerdaki bütün alanlar valid değerlerle doldurularak öğrenci kaydı yapılabilmeli
  Given  Kullanıcı insert into methodu ile valid değerler ile öğrenci kaydı yapar.
    And Kayıt yaptığını doğrular
    Then Database ile bağlantı kesilir.

    Scenario: TC02 Registerdaki alanlar valid olmayan değerlerle doldurularak kayıt olunamaz.
      Given  Kullanıcı insert into methodu ile valid olmayan değerler ile öğrenci kaydı yapar.
      And Kayıt yapamadığını doğrular
      Then Database ile bağlantı kesilir.