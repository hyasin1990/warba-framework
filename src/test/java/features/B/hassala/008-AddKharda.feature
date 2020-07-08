Feature: As a user, I should be able to add Kharda funding method

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

  @AddKharda
  Scenario: Add Kharda funding method to any created hassala

    Given user scrolls down to Hassalaty section
    When user selects any created hassala
    And user skips hassala tutorial if it displays
    And user clicks on manage icon
    Then user start swiping to Kharda funding method section
    Given user clicks on add method link for kharda funding method
    When user accepts service disclaimer
    And user clicks on select account link for IOS
    And user selects an account
    Then user clicks on continue button
    And user clicks on continue,confirm button
    Then user gets redirected to congratulations screen of funding method
    When user clicks on done
    Then user clicks on close button under hassala
    Then user clicks on logout icon