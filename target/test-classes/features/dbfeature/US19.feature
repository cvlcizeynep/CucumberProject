@DB19
Feature: Teacher öğrenciler ile toplantı düzenleyebilmeli

  Scenario Outline: : TC01 Teacher ogreciler toplantilar duzenleyebilmelidir.
    Given Database icin connect saglanir
    And kullanici toplanti id "<id>" ile sorgulama yapar
    Then body should be like: date="<date>" description="<description>" start_time="<start_time>" stop_time="<stop_time>".

    Examples:data
      | id | date | description | start_time | stop_time |
      | 252 | 2025-01-01 | toplanti     | 14:00:00     | 15:00:00    |

