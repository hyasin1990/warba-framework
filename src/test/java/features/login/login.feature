Feature: This feature is for allowing user to login successfully to Warba banking app on IOS

  Background:
    Given send notification was shown to user and he allows it
    When user swipes under get started screen and hits get started button


  @Login
  Scenario: Verify login scenario
    Then user clicks on login button
    When user enters username as "jamuser21"
    And  user clicks on date of birth field
    And user selects date of birth as "16" of "Jun"
    And user clicks on login button
    Then security question screen displays
    When user enters proper answer as "123"
    And user clicks on next button
    Then password screen displays
    When user enters his password as "passw0rd"
    And user clicks on next button After Password
    And user selects "Warba" app
    Then user skips the tutorial
    Then user clicks on logout icon



