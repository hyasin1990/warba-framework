Feature: As a user, I should be able to add sweep funding method

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

  @AddSweep
  Scenario:Add sweep to any created hassala


    Given user scrolls down to Hassalaty section
    When user selects any created hassala
    And user skips hassala tutorial if it displays
    And user clicks on manage icon
    Then user start swiping to funding methods section
    Given user clicks on add method link for sweep funding method
    When user selects an account
    And user enters the amount as "<10>"
    And user confirms the selection of any monthly transfer day
    And user hits confirm button
    Then user gets redirected to well done screen
    When user clicks on done
    Then user clicks on close button under hassala
    Then user clicks on logout icon







