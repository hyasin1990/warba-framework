Feature: As a user, I should be able to remove sweep funding method

  Background:
    Given send notification was shown to user and he allows it
    When user swipes under get started screen and hits get started button
    Then user clicks on login button
    When user enters username as "jamuser27"
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

  @RemoveSweep
  Scenario: Removing sweep funding method from hassala

    Given user scrolls down to Hassalaty section
    When user selects any created hassala
    And user skips hassala tutorial if it displays
    And user clicks on manage icon
    Then user start swiping to funding methods section
    Given user swipes on Sweep funding method to delete it
    When user clicks on delete icon
    And user confirms the deletion
    Then user checks if Sweep funding method got deleted
    When user clicks on close button to close manage screen
    Then user clicks on close button to get redirected to home
    Then user clicks on logout icon

