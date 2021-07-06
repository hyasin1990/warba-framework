Feature: As a user, I should be able to unlink hassala

  Background:
    Given send notification was shown to user and he allows it
    When user swipes under get started screen and hits get started button
    Then user clicks on login button
    When user enters username as "jamuser21"
    And user clicks on date of birth field
    And user selects date of birth as "16" of "Jun"
    And user clicks on login button
    Then security question screen displays
    When user enters proper answer as "123"
    And user clicks on next button
    Then password screen displays
    When user enters his password as "passw0rd"
    And user clicks on next button After Password
    And user invokes keyboard to enter otp
    And user enters the amount as "911911"
    And user clicks on next button
    And user selects "Warba" app
    Then user skips the tutorial

    @UnLinkHassala
    Scenario: UnLinking Hassala

      Given user scrolls down to Hassalaty section
      When user selects any created hassala
      And user skips hassala tutorial if it displays
      Then user clicks on manage icon
      Given user clicks on unlink with hassala kids tab
      When user clicks on yes unlink button
      And user clicks on done button under success
      When user clicks on close button to close manage screen
      Then user clicks on close button under hassala
      Then user clicks on logout icon
      And user clicks on untrust link
      Then user confirms unlinking the device