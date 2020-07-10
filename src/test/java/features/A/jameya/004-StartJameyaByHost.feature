@StartJameya
Feature: As a host I should be able to start jameya

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


  Scenario: Starting jameya by host

    Given user clicks on my social circle tab
    When user selects the created jameya
    And user clicks on start jameya button
    And user confirms both participants details
    And user clicks on start jameya button
    Then user clicks on the OTP field to start typing it
    And user enters OTP as "111111"
    Then user clicks on next button
    And user clicks on back to navigate back to home screen
    And user clicks on logout icon

