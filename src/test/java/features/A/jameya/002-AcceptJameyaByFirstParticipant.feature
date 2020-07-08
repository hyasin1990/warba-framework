@AcceptJameya1
  Feature: As a first participant I should be able to join jameya

  Background:
    Given send notification was shown to user and he allows it
    When user swipes under get started screen and hits get started button
    Then user clicks on login button
    When user enters username as "jamuser31"
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

Scenario: Accepting Jameya By First User

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
######  And user clicks on the purpose list to invoke it
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


Scenario: Accepting Jameya By Second user

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

Scenario: Starting jameya by host

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


Scenario: Deleting any created jameya after accepting it by participants

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
Given user clicks on my social circle tab
When user selects the created jameya
And user clicks on jameya dots menu
Then user clicks on delete jameya tab
And user clicks on continue button to delete jameya
And user clicks on back to navigate back to home screen
And user clicks on logout icon



#  Scenario: Cancel the created jameya before accepting it by participants
#  When user enters username as "jamuser27"
#  And  user clicks on date of birth field
#  And user selects date of birth as "16" of "Jun"
#  And user clicks on login button
#  Then security question screen displays
#  When user enters proper answer as "123"
#  And user clicks on next button
#  Then password screen displays
#  When user enters his password as "passw0rd"
#  And user clicks on next button After Password
#  Then user skips the tutorial
#  Given user clicks on my social circle tab
#  When user selects the created jameya
#  And user clicks on cancel to cancel jameya
#  And user confirms the cancellation
#  And user clicks on back to navigate back to home screen
#  And user clicks on logout icon
#