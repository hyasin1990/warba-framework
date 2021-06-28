$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/D/WU/AddBeneficiary.feature");
formatter.feature({
  "name": "As a user, I should be able to add new WU beneficiary to transfer money",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add new beneficiary and transfer money",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddWuBeneficiary"
    }
  ]
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on date of birth field",
  "keyword": "And "
});
formatter.step({
  "name": "user selects date of birth as \"\u003cday\u003e\" of \"\u003cmonth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "security question screen displays",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters proper answer as \"\u003canswer\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on next button",
  "keyword": "And "
});
formatter.step({
  "name": "password screen displays",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters his password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on next button After Password",
  "keyword": "And "
});
formatter.step({
  "name": "user invokes keyboard to enter otp",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the amount as \"\u003cLogin OTP\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on next button",
  "keyword": "And "
});
formatter.step({
  "name": "user selects \"\u003capp\u003e\" app",
  "keyword": "And "
});
formatter.step({
  "name": "user skips the tutorial",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on services tab",
  "keyword": "When "
});
formatter.step({
  "name": "user scrolls down to wu icon",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on wu icon",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on beneficiaries tab",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on add new beneficiary button",
  "keyword": "When "
});
formatter.step({
  "name": "user fills in first name as \"\u003cfirstName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user fills in middle name as \"\u003cmiddleName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user fills in last name as \"\u003clastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on next button to proceed with conversation",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on select country link",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks in search field to search for country",
  "keyword": "When "
});
formatter.step({
  "name": "user searches country as \"\u003ccountry\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user selects the searched country",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on select nationality link",
  "keyword": "And "
});
formatter.step({
  "name": "user searches for nationality as \"\u003cnationality\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects the searched country",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks in description field and fills description as \"\u003cdescription\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on review button of add WU beneficiary",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on add beneficiary button",
  "keyword": "And "
});
formatter.step({
  "name": "user gets redirected to otp screen",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on the OTP field",
  "keyword": "And "
});
formatter.step({
  "name": "user fills in beneficiary OTP as \"\u003cBenef OTP\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on activate button",
  "keyword": "Then "
});
formatter.step({
  "name": "user gets redirected to success screen",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on done button under success",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on close button to get redirected to home",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on logout icon",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on untrust link",
  "keyword": "And "
});
formatter.step({
  "name": "user confirms unlinking the device",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "day",
        "month",
        "answer",
        "password",
        "app",
        "firstName",
        "middleName",
        "lastName",
        "country",
        "nationality",
        "description",
        "Login OTP",
        "Benef OTP"
      ]
    },
    {
      "cells": [
        "testuser12",
        "16",
        "Jun",
        "123",
        "passw0rd",
        "Warba",
        "saliah",
        "rahamath",
        "basha",
        "united arab emirates",
        "Qatar",
        "Automated Description",
        "911911",
        "111111"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "send notification was shown to user and he allows it",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.login.LoginSteps.send_notification_was_shown_to_user()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user swipes under get started screen and hits get started button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_Swipes_Under_GetStarted_Screen()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new beneficiary and transfer money",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddWuBeneficiary"
    }
  ]
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \"testuser12\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_Enters_Proper_Username_As(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on date of birth field",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_date_of_birth_field()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user selects date of birth as \"16\" of \"Jun\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.userSelectsDateOfBirth(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "security question screen displays",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login.LoginSteps.security_question_screen_displays()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user enters proper answer as \"123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_enters_proper_answer(java.lang.String)"
});
