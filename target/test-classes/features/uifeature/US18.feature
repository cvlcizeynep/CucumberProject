@us18
Feature:"Teacher, öğrenciye verdiği notları, görebilmeli ve güncelleyebilmelidir.(Student Info List)"

  Background:
    Given Kullanici Teacher olarak login olur.
    And Basariyla teacher girisi yaptigini dogrular.

Scenario: TC-1 Student Info List'te; Name, Lesson Name, Ansentee, Midterm and Final Exam, Note, Info Note ve Average bilgilerini görebilmeli

#Student Info List'te Name görülebilmeli
#Student Info List'te Lesson name görülebilmeli
#Student Info List'te Ansentee görülebilmeli
#Student Info List'te Midterm Exam görülebilmeli
#Student Info List'te Final Exam görülebilmeli
#Student Info List'te Info Note görülebilmeli
#Student Info List'te Average görülebilmeli
  Scenario: TC-2 Kullanıcı Absentee Girmeden Not bilgisi güncelleyemez

  Scenario: Kullanıcı Midterm Exam Girmeden Not bilgisi güncelleyemez



Scenario: Kullanıcı Final Exam Girmeden Not bilgisi güncelleyemez

Scenario: Kullanıcı Info Note Girmeden Not bilgisi güncelleyemez

Scenario: Kullanıcı ders seçmeden Not bilgisi güncelleyemez

Scenario: Kullanıcı Education Term Girmeden Not bilgisi güncelleyemez

Scenario: Kullanıcı not kısımlarından herhangi birisine integer dışında değer girerek not editleyemez.

Scenario: Kullanıcı her şeyi doğru yaparak Not bilgisi güncelleyebilir.

Scenario: Öğrenci Not bilgisini silebilmeli


