Feature: API_Validate_Teacher


  @TeacherGetRequest
  Scenario:TC05_Validate_Teacher
    Given send get request and validate body



  @TeacherPutRequest
  Scenario:Put_Teacher
    Given send put request and validate body










#  @API1
#  Scenario Outline: Put_Teacher
#    Given set the expected data "<Name>",<Surname>,<Username>,"<Birth Place>","<Password>","<Date of birth>","<Phone>","<Gender>","<SSN>"
#    When user sends the PUT request
#    Then status code should be 200 for rooms
#    #Then verify that the response body should be as an expected
#    Examples:
#      | Surname | Name   | Birth Place | Password | Date of birth | Phone        | SSN         | Gender | Username |
#      | Team20  | Team20 | izmir       | 12345678 | 09-01-1998    | 333-226-5656 | 333-26-5656 | MALE   | ahmetcan |






