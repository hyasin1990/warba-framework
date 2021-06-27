Feature: This feature is for creating self standing order

  Background:
    Given send notification was shown to user and he allows it
    When user swipes under get started screen and hits get started button


  @CreateSelfStanding
  Scenario: Create self standing order

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
    And user selects "Warba" app
    Then user skips the tutorial
    When user clicks on services tab
    And user scrolls down to Standing order icon
    And user clicks on standing order icon
    Then user clicks on create transfer standing order tab
    And user selects my self
    And user selects an account
    And user selects an account
    And user clicks in how much you want to send field
    And user enters the amount as "10"
    And user selects standing order frequency as "Daily"
    And user clicks on start date selector
    And user selects date as "11", "January", "2021" and submits it
#   And User selects goal end date as "Day" of "Month" , "Year"
    And user clicks in number of transfers field
    And user enters the amount as "2"
#    And user enters number of transfers as "2"
    And user clicks on description field
    And user enters description as "Testing OWN" and submits it
    And user hits create button
    Then user gets redirected to success screen
    And user clicks on done button under success
    And user clicks on logout icon







    










