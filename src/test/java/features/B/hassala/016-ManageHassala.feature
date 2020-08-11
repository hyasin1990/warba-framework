Feature: This feature is for managing up any created hassala

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
    Then user skips the tutorial


  @ManageHassala
  Scenario: Manage any created hassala by editing its name, image and goal category

    Given user scrolls down to Hassalaty section
    When user selects any created hassala
    And user skips hassala tutorial if it displays
    When user clicks on manage icon
    Given user clicks on edit link
    When user clicks on hassala image to change it
    And user clicks on choose from camera roll to upload Hassala photo
    And user allows access permission if displayed
    And user clicks on all photos tab from photos gallery
    And user selects any photo to replace the current
    Then clicks on choose to confirm it
    When user clears hassala name text field
    Then user enters new hassala name as "Automated Edit"
    When user clicks on goal category icon
    And user selects goal category as "Car"
    And user saves his changes
    When user clicks on close button to close manage screen
    Then user clicks on close button under hassala
    Then user clicks on logout icon

