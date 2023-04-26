@apiGetTeacher
Feature: get_teacher
  Scenario: Validate_Teacher
    Given Send getrequest to get teacher
    Then validate body

