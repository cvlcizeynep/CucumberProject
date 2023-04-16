@us01
#1-3-5-9-13-18
  Feature: "Aday öğrenciler sisteme kayıt olabilmelidir"(Register)
    Background: Kullanıcı Register sayfasına gider
      Scenario Outline: Kullanıcı Boş bir bölüm ile kayıt olamaz
        Given Kullanici register Name "<Name>" kismina değer  girer
        When Kullanici register Surname "<Surname>" kismina değer  girer
        And Kullanici Birth place "<Birth Place>" kismina valid deger girer
        And  Kullanici Gender kismini secer
        And  Kullanici Birth of Date "<Birth of Date>"  girer
        And Kullanici Phone Number "<Phone Number>" girer
        And  Kullanici SSN  "<SSN>" girer
        And Kullanici User Name "<User Name>" girer
        And   Kullanici en az sekiz karakterden oluşan Password "<Password>" girer
        And   Kullanici submit tusuna tiklar.
        And Kullanici Guest User Registered yazısı görmez.
        Then close driver
        Examples: data
          | Name    | Surname | Birth Place | Birth of Date | Phone Number | SSN         | User Name | Password |
          |         | Montana  | İskenderun | 26.01.1996    | 123-000-1234 | 123-00-0000 | tony00001 | 12345678 |
          | Tommy   |          | Vice City  | 26.01.1996    | 123-001-1234 | 123-01-0000 | tommy00001 | 12345678 |
          | Micheal |Santana   |            | 26.01.1996    | 123-002-1234 | 123-02-0000 | micheal00001 | 12345678 |
          | Emrah |Kaman   |  Kadıköy          | 26.01.1996 |              | 123-03-0000 | emrah00001 | 12345678 |
          | Emrah |Kaman   |  Kadıköy          | 26.01.1996 |  23423    | 123-03-0000 | emrah00001 | 12345678 |
          | İlkay  |Akkaya   |  Bodrum          |           |123-05-1234   | 123-05-0000 | ilkay00001 | 12345678 |
          | İlkay  |Akkaya   |  Bodrum          |  12.12         |123-05-1234   | 123-05-0000 | ilkay00001 | 12345678 |
          | Cem    |Yılmaz   |  İskenderun          |26.01.1996 |123-06-1234   |             | cem00001 | 12345678 |
          | Cem    |Yılmaz   |  İskenderun          |26.01.1996 |123-006-1234   |  12306   | cem00001 | 12345678 |
          | Can    |Yılmaz   |  İskenderun          |26.01.1996 |123-07-1234   | 123-07-0000  |         | 12345678 |
          | Ayberk |Cam      |  İskenderun          |26.01.1996 |123-08-1234   | 123-08-0000  |ayberk00001|        |
          | Ayberk |Cam      |  İskenderun          |26.01.1996 |123-08-1234   | 123-08-0000  |ayberk00001| 12345 |


    Scenario Outline:  Kullanıcı bütün boşluklara uygun değerler girerek kayıt olabilir
      Given Kullanici Name "<Name>" kismina valid  girer
      When Kullanici Surname "<Surname>" kismina valid  girer
      And Kullanici Birth place "<Birth Place>" kismina valid deger girer
      And  Kullanici Gender kismini secer
      And  Kullanici Birth of Date "<Birth of Date>"  girer
      And Kullanici Phone Number "<Phone Number>" girer
      And  Kullanici SSN  "<SSN>" girer
      And Kullanici User Name "<User Name>" girer
      And   Kullanici en az sekiz karakterden oluşan Password "<Password>" girer
      And   Kullanici submit tusuna tiklar.
      And Kullanici Guest User Registered yazısı görür.
      Then close driver
      Examples: data
        | Name    | Surname | Birth Place | Birth of Date | Phone Number | SSN         | User Name | Password |
        | Tony    | Montana  | İskenderun | 26.01.1996    | 123-000-1234 | 123-00-0000 | tony00001 | 12345678 |
        | Tommy   | Vercetti   | Vice City  | 26.01.1996    | 123-001-1234 | 123-01-0000 | tommy00001 | 12345678 |
        | Micheal |Santana   | İskenderun   | 26.01.1996    | 123-002-1234 | 123-02-0000 | micheal00001 | 12345678 |
        | Emrah |Kaman   |  Kadıköy          | 26.01.1996 |  123-003-1234 | 123-03-0000 | emrah00001 | 12345678 |
        | Alice |Miller   |  Ula          | 26.01.1996 |  123-004-1234 | 123-04-0000 |alice00001 | 12345678 |
        | İlkay  |Akkaya   |  Bodrum          | 26.01.1996   |123-05-1234   | 123-05-0000 | ilkay00001 | 12345678 |
        | Cem    |Yılmaz   |  İskenderun          |26.01.1996 |123-006-1234   |  123-06-0000   | cem00001 | 12345678 |
        | Can    |Yılmaz   |  İskenderun          |26.01.1996 |123-007-1234   | 123-07-0000  | can00001 | 12345678 |
        | Ayberk |Cam      |  İskenderun          |26.01.1996 |123-008-1234   | 123-08-0000  |ayberk00001|123345678|
        | Emre |Yigit      |  İskenderun          |26.01.1996 |123-995-1234   | 123-99-1234  |emre002|123345678|

    Scenario Outline: TC16 Kullanıcı 3. ve 5. rakamdan sonra "-" içermeyen bir "ssn" ile kayıt oluşturamaz
      Given Kullanici Name "<Name>" kismina valid  girer
      When Kullanici Surname "<Surname>" kismina valid  girer
      And Kullanici Birth place "<Birth Place>" kismina valid deger girer
      And  Kullanici Gender kismini secer
      And  Kullanici Birth of Date "<Birth of Date>"  girer
      And Kullanici Phone Number "<Phone Number>" girer
      And  Kullanici SSN  "<SSN>" girer
      And Kullanici User Name "<User Name>" girer
      And   Kullanici en az sekiz karakterden oluşan Password "<Password>" girer
      And   Kullanici submit tusuna tiklar.
      And Kullanici Please enter valid ssn yazısı görür.
      Then close driver
      Examples: data
        | Name    | Surname | Birth Place | Birth of Date | Phone Number | SSN         | User Name | Password |
        | Cem    |Yılmaz   |  İskenderun          |26.01.1996 |123-006-1234   |  12306000099   | cem00001 | 12345678 |

    Scenario Outline: TC11 Kullanıcı Cinsiyet seçmeden üye olamaz.
      Given Kullanici Name "<Name>" kismina valid  girer
      When Kullanici Surname "<Surname>" kismina valid  girer
      And Kullanici Birth place "<Birth Place>" kismina valid deger girer
      And  Kullanici Birth of Date "<Birth of Date>"  girer
      And Kullanici Phone Number "<Phone Number>" girer
      And  Kullanici SSN  "<SSN>" girer
      And Kullanici User Name "<User Name>" girer
      And   Kullanici en az sekiz karakterden oluşan Password "<Password>" girer
      And   Kullanici submit tusuna tiklar.
      And Kullanici Guest User Registered yazısı görmez.
      Then close driver
      Examples: data
        | Name    | Surname | Birth Place | Birth of Date | Phone Number | SSN         | User Name | Password |
        | Alice |Miller   |  Ula          | 26.01.1996 |  123-004-1234 | 123-04-0000 |alice00001 | 12345678 |

    Scenario Outline: TC7 Kullanıcı (xxx-xxx-xxxx) formatının dışında arada "-" olmadan telefon numarasını giremez.
      Given Kullanici Name "<Name>" kismina valid  girer
      When Kullanici Surname "<Surname>" kismina valid  girer
      And Kullanici Birth place "<Birth Place>" kismina valid deger girer
      And  Kullanici Gender kismini secer
      And  Kullanici Birth of Date "<Birth of Date>"  girer
      And Kullanici Phone Number "<Phone Number>" girer
      And  Kullanici SSN  "<SSN>" girer
      And Kullanici User Name "<User Name>" girer
      And   Kullanici en az sekiz karakterden oluşan Password "<Password>" girer
      And   Kullanici submit tusuna tiklar.
      And Kullanici Please enter valid phone number yazısı görür.
      Then close driver
      Examples: data
        | Name    | Surname | Birth Place | Birth of Date | Phone Number | SSN         | User Name | Password |
        | Emrah |Kaman   |  Kadıköy          | 26.01.1996 |  123200321234 | 123-03-0000 | emrah00001 | 12345678 |