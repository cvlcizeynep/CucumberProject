Feature: API_Validate_Teacher

  @TeacherPostRequest
  Scenario:Post_Teacher
    Given admin sends post request
    When verify that the response body should be as an expected
