@us18
Feature:"Teacher, öğrenciye verdiği notları, görebilmeli ve güncelleyebilmelidir.(Student Info List)"

  Background:
    Given Kullanici Teacher olarak login olur.
    And Basariyla teacher girisi yaptigini dogrular.
    And  Kullanıcı Menu seceneğine tıklar
    And Student Info Managment seceneğine tıklar

Scenario: TC-1 Student Info List'te; Name, Lesson Name, Ansentee, Midterm and Final Exam, Note, Info Note ve Average bilgilerini görebilmeli

Given  Student Info List'te Name görülebilmeli
And Student Info List'te Lesson name görülebilmeli
And Student Info List'te Ansentee görülebilmeli
And Student Info List'te Midterm Exam görülebilmeli
And Student Info List'te Final Exam görülebilmeli
And Student Info List'te Info Note görülebilmeli
And Student Info List'te Average görülebilmeli
  Then close driver
  Scenario: TC-2 Kullanıcı Absentee Girmeden Not bilgisi güncelleyemez

    Given ilk sıradaki ogrencinin yanındaki edit butonuna tıklar
 And  Kullanıcı choose lessons butonuna tiklar ve dersi seçer
    And  Kullanıcı Choose Education Term kısmına tıklar ve dönemi seçer
    And  Kullanıcı Midterm Exam kısmına "not" girer
    And  Kullanıcı Final Exam kısmına "not" girer
    And  Kullanıcı Info Note kısmına "not" girer
    And  Kullanıcı submit butonuna tıklar
 And Kullanıcı Please enter absentee yazisi görür
    Then close driver

  Scenario: Kullanıcı Midterm Exam Girmeden Not bilgisi güncelleyemez

    Given ilk sıradaki ogrencinin yanındaki edit butonuna tıklar
    And  Kullanıcı choose lessons butonuna tiklar ve dersi seçer
    And  Kullanıcı Choose Education Term kısmına tıklar ve dönemi seçer
    And  Kullanıcı Absentee kısmına "not" girer
    And  Kullanıcı Final Exam kısmına "not" girer
    And  Kullanıcı Info Note kısmına "not" girer
    And  Kullanıcı submit butonuna tıklar
    And Kullanıcı Please enter midterm exam yazısı görür
    Then close driver

Scenario: Kullanıcı Final Exam Girmeden Not bilgisi güncelleyemez

  Given İlk sıradaki öğrencinin yanındaki edit butonuna tıklar
  And  Kullanıcı choose lessons butonuna tiklar ve dersi seçer
  And  Kullanıcı Choose Education Term kısmına tıklar ve dönemi seçer
  And  Kullanıcı Absentee kısmına "not" girer
  And  Kullanıcı Midterm Exam kısmına "not" girer
  And  Kullanıcı Info Note kısmına "not" girer
  And  Kullanıcı submit butonuna tıklar
  And Kullanıcı Please enter final exam yazısı görür
  Then close driver


  Scenario: Kullanıcı Info Note Girmeden Not bilgisi güncelleyemez
    Given İlk sıradaki öğrencinin yanındaki edit butonuna tıklar
    And  Kullanıcı choose lessons butonuna tiklar ve dersi seçer
    And  Kullanıcı Choose Education Term kısmına tıklar ve dönemi seçer
    And  Kullanıcı Absentee kısmına "not" girer
    And  Kullanıcı Midterm Exam kısmına "not" girer
    And  Kullanıcı Final Exam kısmına "not" girer
    And  Kullanıcı submit butonuna tıklar
    And Kullanıcı Please enter Info Note yazısı görür
    Then close driver


  Scenario: Kullanıcı ders seçmeden Not bilgisi güncelleyemez

    Given İlk sıradaki öğrencinin yanındaki edit butonuna tıklar
    And  Kullanıcı Choose Education Term kısmına tıklar ve dönemi seçer
    And  Kullanıcı Absentee kısmına "not" girer
    And  Kullanıcı Midterm Exam kısmına "not" girer
    And  Kullanıcı Final Exam kısmına "not" girer
    And  Kullanıcı Info Note kısmına "not" girer
    And  Kullanıcı submit butonuna tıklar
    And Kullanıcı Student Info Updated Succesfully yazısı görmez
    Then close driver

Scenario: Kullanıcı Education Term Girmeden Not bilgisi güncelleyemez

  Given İlk sıradaki öğrencinin yanındaki edit butonuna tıklar
  And  Kullanıcı choose lessons butonuna tiklar ve dersi seçer
  And  Kullanıcı Absentee kısmına "not" girer
  And  Kullanıcı Midterm Exam kısmına "not" girer
  And  Kullanıcı Final Exam kısmına "not" girer
  And  Kullanıcı Info Note kısmına "not" girer
  And  Kullanıcı submit butonuna tıklar
  And Kullanıcı Student Info Updated Succesfully yazısı görmez
  Then close driver


Scenario: Kullanıcı not kısımlarından herhangi birisine integer dışında değer girerek not editleyemez.

  Given İlk sıradaki öğrencinin yanındaki edit butonuna tıklar
  And  Kullanıcı choose lessons butonuna tiklar ve dersi seçer
  And  Kullanıcı Choose Education Term kısmına tıklar ve dönemi seçer
  And  Kullanıcı Absentee kısmına "not" girer
  And  Kullanıcı Midterm Exam kısmına "not" girer
  And  Kullanıcı Final Exam kısmına "not" girer
  And  Kullanıcı Info Note kısmına "not" a harfi girer
  And  Kullanıcı submit butonuna tıklar
  And Kullanıcı Student Info Updated Succesfully yazısı görmez
  Then close driver
Scenario: Kullanıcı her şeyi doğru yaparak Not bilgisi güncelleyebilir.
  Given İlk sıradaki öğrencinin yanındaki edit butonuna tıklar
  And  Kullanıcı choose lessons butonuna tiklar ve dersi seçer
  And  Kullanıcı Choose Education Term kısmına tıklar ve dönemi seçer
  And  Kullanıcı Absentee kısmına "not" girer
  And  Kullanıcı Midterm Exam kısmına "not" girer
  And  Kullanıcı Final Exam kısmına "not" girer
  And  Kullanıcı Info Note kısmına "not" girer
  And  Kullanıcı submit butonuna tıklar
  And Kullanıcı Student Info Updated Succesfully yazısı görür
  Then close driver

@18e
Scenario: Öğrenci Not bilgisini silebilmeli
Given İstenilen öğrencinin yanındaki delete butonuna basar
When StudenT delete Succesfully yazısı ekranda çıkar
  Then close driver


