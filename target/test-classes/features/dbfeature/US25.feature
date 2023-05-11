Feature: Admin ogrenci sorgulama
  @db25
  Scenario:Admin_ogrenci_dogrulama
    Given Database icin connect saglanir
    Then ogrenci bilgileri database de dogrulanir
    Then Close Database