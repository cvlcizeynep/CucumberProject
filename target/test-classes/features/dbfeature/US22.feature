@adminDB
Feature:US_22
  Scenario:Admin_Ekleme
    Given Database icin connect saglanir
    Then Admin bilgileri database de dogrulanir
    Then Close Database