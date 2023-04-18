
@US9
#submiti gormuyor ayrica daha dinamik olmasi icin string kisimlar degistirilebilir

Feature:Vice dean dersi listede gorebilmeli-silebilmeli-guncelleyebilmeli
  Background:
    Given Kullanici viceDean olarak login olur.
    And Lessons a tiklarr


  Scenario:Kullanici ders secebilmelidir
    And Lessonsa "fiziks"  girer
    And Credit Score degerini "25"  gırer
    And Dersin Compulsory olup olmadığını işaretler
    And Submit butonuna tiklarr
    When Kullanici listede creditScore dersAdi ve creditScore yazdigini dorular
    When Istenen dersin yanindaki cop kutusuna tiklayarak dersi siler
    Then close driver








