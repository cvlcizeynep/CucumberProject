Feature: API_Validate_Teacher


  @TeacherGetRequest
  Scenario:TC05_Validate_Teacher
#    Given vice dean sends get request
    Then verify that the response body contains all expected data



  @TeacherPutRequest
  Scenario: teacher update
    Given vice dean sends put request
    Then assertion


  @TeacherPostRequest
  Scenario:Post_Teacher
    Given vice dean sends post request
    Then verify that the response body should be as an expected















