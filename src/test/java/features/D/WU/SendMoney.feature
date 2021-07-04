Feature: As a user I should be able to select a beneficiary and send money

  Background:
    Given send notification was shown to user and he allows it
    When user swipes under get started screen and hits get started button

  @WUSendMoney
  Scenario Outline: Add new beneficiary and transfer money
    Then user clicks on login button
    When user enters username as "<username>"
    And user clicks on date of birth field
    And user selects date of birth as "<day>" of "<month>"
    And user clicks on login button
    Then security question screen displays
    When user enters proper answer as "<answer>"
    And user clicks on next button
    Then password screen displays
    When user enters his password as "<password>"
    And user clicks on next button After Password
    And user invokes keyboard to enter otp
    And user enters the amount as "<Login OTP>"
    And user clicks on next button
    And user selects "<app>" app
    Then user skips the tutorial
    When user clicks on services tab
    And user scrolls down to wu icon
    And user clicks on wu icon
    And user clicks on beneficiaries tab
    And user searches for beneficiary "<beneficiary name>" to start sending money
    Then user invokes menu
    And user clicks on send money tab
    When fraud screen displays
    Then user accepts the fraud disclaimer
    And user selects an account
    And user selects a purpose as "<purpose of transfer>"
    And user clicks on next button to proceed with conversation
    Then user clicks in transferred amount field
    And user enters the amount as "<amount>"
    And user clicks on calculate button
    And user clicks on next button to proceed with conversation
    Then user checks the terms and conditions
    And user clicks on next button to proceed with conversation
    And user clicks on review button of add WU beneficiary
    And user clicks on send money button
    And user enters his password to send money as "<password>"
    Then user clicks on verify button
    And user gets redirected to success screen
    Then user clicks on done button under success
#    And user clicks on close button to get redirected to home
    Then user clicks on logout icon
    And user clicks on untrust link
    Then user confirms unlinking the device

    Examples:
      | username | day | month | answer | password | Login OTP | app   | beneficiary name | purpose of transfer | amount |
      | warba13  | 16  | Jun   | 123    | passw0rd | 911911    | Warba | jeyson        | Saving/Investments  | 10     |

















