Feature: As a user, I should be able to add new WU beneficiary to transfer money

  Background:

    Given send notification was shown to user and he allows it
    When user swipes under get started screen and hits get started button

  @AddWuBeneficiary
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
    When user clicks on add new beneficiary button
    And user fills in first name as "<firstName>"
    And user fills in middle name as "<middleName>"
    And user fills in last name as "<lastName>"
    Then user clicks on next button to proceed with conversation
    Given user clicks on select country link
    When user clicks in search field to search for country
    And user searches country as "<country>"
    And user selects the searched country
    And user clicks on select nationality link
    Then user searches for nationality as "<nationality>"
    And user selects the searched country
    And user clicks in description field and fills description as "<description>"
    Then user clicks on review button of add WU beneficiary
    And user clicks on add beneficiary button
    Then user gets redirected to otp screen
    And user clicks on the OTP field
    And user fills in beneficiary OTP as "<Benef OTP>"
    Then user clicks on activate button
    And user gets redirected to success screen
    Then user clicks on done button under success
    And user clicks on close button to get redirected to home
    Then user clicks on logout icon
    And user clicks on untrust link
    Then user confirms unlinking the device


    Examples:
      | username | day | month | answer | password | app   | firstName | middleName | lastName    | country      | nationality | description           | Login OTP | Benef OTP |
      | warba13  | 16  | Jun   | 123    | passw0rd | Warba | JEYSON    | RAJU       | CHILAKAPATI | Saudi Arabia | Kuwait      | Automated Description | 911911    | 111111    |