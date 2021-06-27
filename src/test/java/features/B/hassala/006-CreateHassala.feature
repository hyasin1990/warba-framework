Feature: As a user, I should be able to create new Hassala

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


  @CreateHassala
  Scenario Outline: Creating new Hassala

    Given user scrolls down to Hassalaty section
    When user clicks on view all link
    And user clicks on create button to create hassala
    And user skips the tutorial if it displays
    And user clicks on saving option link
    And user selects goal category as "<Category>"
    And user enters hassala name as "<Hassala name>"
    And user clicks on choose from camera roll
    And user allows access permission if displayed
    And user clicks on all photos tab from photos gallery
    And user selects any photo
    Then clicks on choose to confirm it
    When user clicks on the amount field to start typing
    And user enters the amount as "<Goal amount>"
    And User selects goal end date as "<Day>" of "<Month>" , "<Year>"
    And user clicks on confirm button
    Then user gets redirected to terms and conditions
    Given user scrolls down until accept button displays
    When user accepts the terms
    Then user gets redirected to congratulations screen
    When user clicks on done
    Then user clicks on close to get redirected to all hassala screen
    And user clicks on back to navigate back to home screen
    Then user clicks on logout icon

    Examples:
      | Category |  | Hassala name      |  | Goal amount |  | Day |  | Month |  | Year |
      | House    |  | Automated Hassala |  | 500         |  | 11  |  | Sep   |  | 2022 |




