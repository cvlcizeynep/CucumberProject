Feature: API_Validate_Teacher

  @TeacherPostRequest
  Scenario:Post_Teacher
    Given admin sends post request
    When do assertion for post
