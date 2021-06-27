Feature: This feature is for withdrawing savings from any created hassala that has an amount

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

  @Withdraw
  Scenario: Withdraw savings from any created hassala
    Given user scrolls down to Hassalaty section
    When user selects any created hassala
    And user skips hassala tutorial if it displays
    When user clicks on withdraw icon
    And  user selects a reason and confirms it
    And user selects an account
    And user enters the amount as "1"
    And user fills in description as "Auto Withdraw"
    And user hits confirm button
    Then user gets redirected to success screen
    When user clicks on done
    Then user gets redirected to hasssala screen in case of IOS
    And user clicks on close button to get redirected to home in case of IOS
    Then user clicks on logout icon






