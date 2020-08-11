Feature: This feature is for breaking an existing hassala

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
    Then user skips the tutorial

    @BreakHassala
    Scenario: Break any created hassala
      Given user scrolls down to Hassalaty section
      When user selects any created hassala
      And user skips hassala tutorial if it displays
      When user clicks on Break Hassala tab
      And user confirms break hassala action
      And  user selects a reason and confirms it
      And user selects an account
      And user fills in description as "Auto Break"
      And user hits confirm button
      Then user gets redirected to success screen
      When user clicks on done
      Then user gets redirected to home screen
      Then user clicks on logout icon







