Feature: This feature is for checking view all screen

  Background:
    Given send notification was shown to user and he allows it
    When user swipes under get started screen and hits get started button
    Then user clicks on login button
    When user enters username as "jamuser28"
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


  @ViewAll
  Scenario: Checking view all hassala screen tabs

    Given user scrolls down to Hassalaty section
    When user clicks on view all link
    Then user clicks on broken tab
    And user clicks on achieved tab
    And user clicks on inactive tab
    And user clicks on active tab once again
    And user clicks on back to navigate back to home screen
    Then user clicks on logout icon