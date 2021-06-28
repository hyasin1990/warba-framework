Feature: As a user, I should be able to transfer money to myself from a knet card.

  Background:
    Given send notification was shown to user and he allows it
    When user swipes under get started screen and hits get started button
    Then user clicks on login button
    When user enters username as "warba13"
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
    And user enters the amount as "911911>"
    And user clicks on next button
    And user selects "Warba" app
    Then user skips the tutorial

    @TransferFromKnet
    Scenario: Transfer Money From Knet To Self
      Given user clicks on services tab
      When user clicks on transfer money Icon
      Then user selects my self beneficiary
      And user selects knet as an account from
      Then user selects an account
      When user fills in an amount to transfer as "900"
      And user fills in optional description as "description"
      Then user clicks transfer button
      When user invokes banks list
      And user selects a purpose as "Knet Test Card [KNET1]"
      And user fills in card number as "0000000001"
      And user invokes expiration month list
      And user selects a purpose as "09"
      And user invokes expiration year list
      And user selects a purpose as "2021"
      And user fills in pin as "1234"
      Then user clicks on submit button
      And user clicks on confirm button of knet
      Then user gets redirected to transfer successful screen
      And user clicks on X icon
      Then user clicks on logout icon
      And user clicks on untrust link
      Then user confirms unlinking the device












