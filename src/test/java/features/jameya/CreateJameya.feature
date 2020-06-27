Feature: Creating new jameya

  Background:
    Given send notification was shown to user and he allows it
    When user swipes under get started screen and hits get started button
    Then user clicks on login button
    When user enters username as "jamuser29"
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

  @CreateJam3eya
    Scenario: Creating jameya and accepting it by two invitees
      Given user clicks on my social circle tab
      When user clicks on show link
      And user clicks on Create a Jam3eya link
      Then user clicks on continue under disclaimer if displayed
      When user scrolls under terms and conditions screen
      And user accepts terms and conditions
      Then create jameya screen displays
      When user fills in a name for jam3eya as "Test Jam3eya"
      And user selects a purpose of the Jam3eya as "Travel"
      And user clicks on upload a photo link
      And user clicks on choose from camera roll
      And user allows access photos permission if displayed
      And user clicks on all photos tab from photos gallery
      And user selects any photo to replace the current
      And clicks on choose to confirm it
      And user clicks on next button of Jameya screen
      Then user gets redirected to step 2 of creating Jameya
      When user clicks on add participants link
      And user allows access permission if displayed
      Then user selects two contacts
      When user clicks on done to submit selected contacts
      And user clicks on next button of Jameya screen
      And user clicks on continue to confirm invitations
      And user selects monthly amount
      And user clicks on day selector and confirm the first value
      And user clicks on select account link
      Then user selects an account
      When user clicks on Choose dates link
      And user clicks on each available month to select participant
      Then user clicks on continue button
      And user confirms pay out day
      When user clicks on select account link
      And user selects an account
      And user clicks on confirm button
      Then user gets redirected to success screen
      And user clicks on done
      And user clicks on logout icon




