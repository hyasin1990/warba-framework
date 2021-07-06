Feature: As a user, I should be able to link hassala with a kid CID


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

    @LinkHassala
    Scenario: Linking Hassala

      Given user scrolls down to Hassalaty section
      When user selects any created hassala
      And user skips hassala tutorial if it displays
      Then user clicks on manage icon
      Given user clicks on link with hassala kids tab
      When user clicks yes link now button
      And user scrolls down to accept terms and conditions
      Then user fills in new CID as "321010168015"
      And user clicks on next button to proceed with linking
      Then user fills in kid name as "Nasser"
      And user selects gender as "boy"
      And user selects a relationship as "Father"
      And user fills in pin code as "0000"
      Then user clicks on confirm button
      And user clicks on done
      When user clicks on close button to close manage screen
      Then user clicks on close button under hassala
      Then user clicks on logout icon
      And user clicks on untrust link
      Then user confirms unlinking the device