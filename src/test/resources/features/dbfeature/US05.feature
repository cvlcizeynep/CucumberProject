@US05DB
Feature: Admin deanlerin bilgilerini gorebilmeli,guncellemeli,silebilmeli
Background:
#  Given Kullanici Admin olarak giris yapar
#  Given Kullanici Name kismina valid  girer
#  When Kullanici Surname kismina valid  girer
#  And Kullanici Birth place kismina valid deger girer
#  And  Kullanici Gender kismini secer
#  And  Kullanici Date of birth alanina "<Date of Birth>" bir tarih girer
#  And Kullanici Phone Number alanina valid bir deger girer
#  And  Kullanici SSN  alanina valid bir deger girer
#  And Kullanici User Name alanina valid bir deger girer
#  And   Kullanici en az sekiz karakterden oluşan Password "<Password>" girer
#  And   Kullanici submit tusuna tiklar.

  Scenario: TC01 Admin deanlerin bilgilerini gorebilmeli
    Given Admin dean tablosunu cagirir
    Then Admin deanin bilgilerini gorebildigini dogrular

