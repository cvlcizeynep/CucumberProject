@emre
Feature:"Teacher, öğrenciye verdiği notları, görebilmeli ve güncelleyebilmelidir.(Student Info List)"..

  Background:
    Given Kullanici Teacher olarak login olur.
    And Basariyla teacher girisi yaptigini dogrular.
    And  Kullanıcı Menu seceneğine tıklar
    And Student Info Managment seceneğine tıklar

Scenario: Öğrenci Not bilgisini silebilmeli
Given İstenilen öğrencinin yanındaki delete butonuna basar
When StudenT delete Succesfully yazısı ekranda çıkar
Then close driver
