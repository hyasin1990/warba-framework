@AcceptJam3eya2
Feature: As a second participant I should be able to join jameya

  Background:
    Given send notification was shown to user and he allows it
    When user swipes under get started screen and hits get started button
    Then user clicks on login button
    When user enters username as "jamuser11"
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


  Scenario: Accepting Jameya By Second user

    Given user clicks on my social circle tab
    And user scrolls down to the available jameya
    When user clicks on join button to join jameya
    And user clicks on continue to confirm invitations
    And user clicks on keep going button
    When user scrolls under terms and conditions screen
    And user accepts terms and conditions
    And user selects an account
    And user selects an account
    And user confirms pay out day
#####    And user clicks on the purpose list to invoke it
    And user selects a purpose of the jameya as "Travel"
    And user clicks on upload a photo link
    And user clicks on choose from camera roll
    And user allows access permission if displayed
    And user clicks on all photos tab from photos gallery
    And user selects any photo to replace the current
    And clicks on choose to confirm it
    Then user clicks on join button to join jameya
    Then user gets redirected to success screen
    And user clicks on done
    And user clicks on back to navigate back to home screen
    And user clicks on logout icon
