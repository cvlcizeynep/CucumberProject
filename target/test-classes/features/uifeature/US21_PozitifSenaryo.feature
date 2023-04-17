@US21_Pozitif

Feature: Ogrenci Choose Lesson Listesini Görüntüleyebilmeli

  Background:
    When Kullanici ogrenci olarak login olur

  Scenario: TCO1_Teacher_Day_StartTime_StopTime_bilgilerini gorebilmeli
    Given kullanici Choose Lesson Management sayfasini goruntuler
    Then kullanici Choose Lesson listesinde Teacher goruntuler
    Then kullanici Choose Lesson listesinde Day goruntuler
    Then kullanici Choose Lesson listesinde Start Time goruntuler
    Then kullanici Choose Lesson listesinde Stop Time goruntuler
    And sayfa kapatilir


  Scenario: TC02_Ogrenci_ders_secebilmeli
    Given kullanici Choose Lesson Management sayfasini goruntuler
    When kullanici Choose lesson sutunundan ders secimi yapar
    Then kullanici ders secimi yaptigini dogrular
    And sayfa kapatilir


  Scenario: TC04_Ogrenci_sectigi_dersi_Lesson_Program_Listte_gorebilmeli
    Given kullanici Choose Lesson Management sayfasini goruntuler
    Then kullanici Lesson Program List altinda sectigi dersleri goruntuler
    And sayfa kapatilir


  Scenario: TC05_Ogrenci_sinav_notlarini_gorebilmeli
    Given kullanici menu butonuna tiklar
    When kullanici Grades and Announcements kismina tiklar
    Then kullanici Student Info List altinda Lesson Name goruntuler
    Then kullanici Student Info List altinda Absentee goruntuler
    Then kullanici Student Info List altinda Midterm Exam goruntuler
    Then kullanici Student Info List altinda Final Exam goruntuler
    Then kullanici Student Info List altinda Note goruntuler
    Then kullanici Student Info List altinda Info Note goruntuler
    Then kullanici Student Info List altinda Average goruntuler
    And sayfa kapatilir


  Scenario: TC06_Ogrenci_danismaninin_olusturdugu_toplantilari_gorebilmeli
    Given kullanici menu butonuna tiklar
    When kullanici Grades and Announcements kismina tiklar
    Then kullanici Meet List altinda Date goruntuler
    Then kullanici Meet List altinda Start Time goruntuler
    Then kullanici Meet List altinda Stop Time goruntuler
    Then kullanici Meet List  altinda Description goruntuler
    And sayfa kapatilir