
  @lessons_add_Lesson
  Feature: Lesson Creation

  Scenario: TC01_Post_Lesson
    Given user sends post request for lesson data
    #kullanıcı  lesson data için post request göderir
    Then user gets the lesson data and assert
    #lesson datayı alır ve doğrular




