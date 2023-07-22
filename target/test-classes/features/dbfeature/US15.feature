Feature: ViceDean ogrenci sorgulama
  @db15
  Scenario:ViceDean_ogrenci_dogrulama
    Given Database icin connect saglanir
    Then ogrenci bilgileri database de dogrulanir
    Then Close Database