@US21DB
Feature: Student Controller Database

  @US21_DB01
  Scenario: TC01_OgrenciDersleriDatabaseteListeHalindeGoruntuler
    Given ogrenci dersleri Databasete goruntuler
    Then ders listesinin Databasete goruntulendigini dogrular
    #SELECT * FROM lesson_program


  @US21_DB02
  Scenario: TC02_OgrenciSectigiDersleriDatabaseteListeHalindeGoruntuler
    Given ogrenci sectigi dersleri Databasete goruntuler
    Then sectigi derslerin listesinin Databasete goruntulendigini dogrular
    #SELECT * FROM student_lessonprogram where student_id=10;



  @US21_DB03
  Scenario: TC03_OgrenciDersNotlariniDatabaseteGoruntuler
    Given ogrenci ders notlarini Databasete goruntuler
    Then ders notlarinin listesinin Databasete goruntulendigini dogrular
    # SELECT * FROM student_info where info_note='your road is the best road'; id=382
  #SELECT * FROM student_info where student_id=10;


  @US21_DB04
  Scenario: TC04_OgrenciToplantilariDatabaseteGoruntuler
    Given ogrenci ogretmeninin olusturdugu toplantilari Databasete goruntuler
    Then ders olusturulan toplantilarin listesinin Databasete goruntulendigini dogrular
    #SELECT * FROM meet where description='meeting'; id=196
