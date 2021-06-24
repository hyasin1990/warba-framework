Feature: As a user, I should be able to add new WU beneficiary to transfer money

  Background:

    Given send notification was shown to user and he allows it
    When user swipes under get started screen and hits get started button

    @AddWuBeneficiary

    Scenario: Add new beneficiary and transfer money

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
      And user scrolls down to wu icon
      And user clicks on wu icon
      Then user clicks on beneficiaries tab
