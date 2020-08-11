@DeleteJameya
Feature: As a host I should be able to delete jameya

  Background:
    Given send notification was shown to user and he allows it
    When user swipes under get started screen and hits get started button
    Then user clicks on login button
    When user enters username as "warba11"
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

  Scenario: Deleting any created jameya after accepting it by participants

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
