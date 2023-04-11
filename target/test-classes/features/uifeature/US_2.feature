Feature: TC1_Guest_User
Scenario:Guest_User
  Given Kullanici admin olarak login olur.
  And Menu botonuna tiklar
  And Main menu sayfasindan Guest User List tiklar
  Then Guest User List, Name, Phone Number,SSN, User Name bilgilerinin goruldugunu dogrular