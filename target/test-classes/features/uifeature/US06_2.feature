@nameSurnameNegative
Feature: Vice Dean olusturulurken name ve surname bos birakilmamalidir.

  Background:dean olrak giris
    Given Kullanici Dean olarak login olur.

  Scenario: TC02 Name bos birakilmamali
    Given Kullanici Name kismina deger girmez
    When Kullanici Surname kismina valid "serhat" girer
    And Birth Place kismina valid "Ankara" girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici Dogum tarihine "03061988" girer
    And Kullanici  telefon numarasina "678-187-8765" girer
    And  Kullanici SSN kismina valid "705-08-9876" girer
    And Kullanici user name "serhty" girer
    And   Kullanici en az sekiz karakterden oluşan password "i8790754432" girer
    And   Kullanici submit tusuna tiklar.
    Then Kullanici name kismi bos birakildiginda required uyarisi alarak kayit olunamdigini dogrular
    Then close driver

    #bug duzeltildikten sonra calistirilacak
  #Scenario: TC03 Name valid degerle doldurulmalidir.
  #  Given Kullanici Name kismina valid olmayan "." girer.
  #  When Kullanici Surname kismina valid "deger" girer
   # And Birth Place kismina valid "deger" girer
   # And  Kullanici Cinsiyet kismini secer
    #And  Kullanici Dogum tarihine "deger" girer
   # And Kullanici  telefon numarasina "Telefon numarasi" girer
   # And  Kullanici SSN kismina valid "SSN" girer
   # And Kullanici user name "User Name" girer
   # And   Kullanici en az sekiz karakterden oluşan password "Password" girer
   # And   Kullanici submit tusuna tiklar.
   # Then Kullanici name kismina valid deger girilmediginde kayit olunmadigi mesajini gorur

#  Scenario:TC04Name valid degerle doldurulmalidir.
#    Given Kullanici Name kismina valid olmayan tubtusu girer.
#    When Kullanici Surname kismina valid "deger" girer
#    And Birth Place kismina valid "deger" girer
#    And  Kullanici Cinsiyet kismini secer
#    And  Kullanici Dogum tarihine "deger" girer
#    And Kullanici  telefon numarasina "Telefon numarasi" girer
#    And  Kullanici SSN kismina valid "SSN" girer
#    And Kullanici user name "User Name" girer
#    And   Kullanici en az 8 karakterden oluşan password "Password" girer
#    #And   Kullanici submit tusuna tiklar.
#    #Then Kullanici name kismina valid deger girilmediginde kayit olunmadigi mesajini gorur
#   # Then close driver

  Scenario:TC05 Surname bos birakilmamali
    Given Kullanici "Name" kismina valid deger girer
    When Kullanici Surname kismina deger girmez
    And Birth Place kismina valid "deger" girer
    And  Kullanici Cinsiyet kismini secer
    And  Kullanici Dogum tarihine "deger" girer
    And Kullanici  telefon numarasina "Telefon numarasi" girer
    And  Kullanici SSN kismina valid "SSN" girer
    And Kullanici user name "User Name" girer
    And   Kullanici en az sekiz karakterden oluşan password "Password" girer
    And   Kullanici submit tusuna tiklar.
    Then Kullanici surname kismi bos birakildiginda kayit olunmadigi mesajini gorur
    Then close driver

#  Scenario: TC06 Surname valid degerle doldurulmalidir.
#    Given Kullanici "Name" kismina valid deger girer
#    Given Kullanici surname kismina valid olmayan  deger "#" girer.
#    And Birth Place kismina valid "deger" girer
#    And  Kullanici Cinsiyet kismini secer
#    And  Kullanici Dogum tarihine "deger" girer
#    And Kullanici  telefon numarasina "Telefon numarasi" girer
#    And  Kullanici SSN kismina valid "SSN" girer
#    And Kullanici user name "User Name" girer
#    And   Kullanici en az sekiz karakterden oluşan password "Password" girer
#    And   Kullanici submit tusuna tiklar.
#    Then Kullanici surname kismina valid deger girilmediginde kayit olunmadigi mesajini gorur
#    Then close driver
#
#  Scenario:TC07 Surname valid degerle doldurulmalidir.
#    Given Kullanici "Name" kismina valid deger girer
#    When Kullanici surname kismina valid olmayan tubtusu girer.
#    And Birth Place kismina valid "deger" girer
#    And  Kullanici Cinsiyet kismini secer
#    And  Kullanici Dogum tarihine "deger" girer
#    And Kullanici  telefon numarasina "Telefon numarasi" girer
#    And  Kullanici SSN kismina valid "SSN" girer
#    And Kullanici user name "User Name" girer
#    And   Kullanici en az 8 karakterden oluşan password "Password" girer
#    And   Kullanici submit tusuna tiklar.
#    Then Kullanici surname kismina valid deger girilmediginde kayit olunmadigi mesajini gorur
#    Then close driver
