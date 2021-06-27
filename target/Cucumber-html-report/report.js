$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/D/WU/SendMoney.feature");
formatter.feature({
  "name": "As a user I should be able to select a beneficiary and send money",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add new beneficiary and transfer money",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@WUSendMoney"
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
  "name": "user searches for beneficiary \"\u003cbeneficiary name\u003e\" to start sending money",
  "keyword": "And "
});
formatter.step({
  "name": "user invokes menu",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on send money tab",
  "keyword": "And "
});
formatter.step({
  "name": "fraud screen displays",
  "keyword": "When "
});
formatter.step({
  "name": "user accepts the fraud disclaimer",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects an account",
  "keyword": "And "
});
formatter.step({
  "name": "user selects a purpose as \"\u003cpurpose of transfer\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on next button to proceed with conversation",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks in transferred amount field",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the amount as \"\u003camount\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on calculate button",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on next button to proceed with conversation",
  "keyword": "And "
});
formatter.step({
  "name": "user checks the terms and conditions",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on next button to proceed with conversation",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on review button of add WU beneficiary",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on send money button",
  "keyword": "And "
});
formatter.step({
  "name": "user enters his password to send money as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on verify button",
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
        "Login OTP",
        "app",
        "beneficiary name",
        "purpose of transfer",
        "amount"
      ]
    },
    {
      "cells": [
        "warba12",
        "16",
        "Jun",
        "123",
        "passw0rd",
        "911911",
        "Warba",
        "Fadi",
        "Saving/Investments",
        "10"
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
      "name": "@WUSendMoney"
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
  "name": "user enters username as \"warba12\"",
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
  "error_message": "java.lang.IndexOutOfBoundsException: Index: 0, Size: 0\n\tat java.util.ArrayList.rangeCheck(ArrayList.java:659)\n\tat java.util.ArrayList.get(ArrayList.java:435)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat io.appium.java_client.pagefactory.ElementListInterceptor.getObject(ElementListInterceptor.java:40)\n\tat io.appium.java_client.pagefactory.interceptors.InterceptorOfAListOfElements.intercept(InterceptorOfAListOfElements.java:49)\n\tat $java.util.ArrayList$$EnhancerByCGLIB$$b5855c01.get(\u003cgenerated\u003e)\n\tat util.Util.previousScroll(Util.java:495)\n\tat util.Util.selectDateBasedOnUserSelection(Util.java:210)\n\tat steps.login.LoginSteps.userSelectsDateOfBirth(LoginSteps.java:72)\n\tat ✽.user selects date of birth as \"16\" of \"Jun\"(file:///Users/abhishekjain/Documents/Practice%20Projects/iPhone/WarbaProject/src/test/java/features/D/WU/SendMoney.feature:12)\n",
  "status": "failed"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "security question screen displays",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login.LoginSteps.security_question_screen_displays()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user enters proper answer as \"123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_enters_proper_answer(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on next button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "password screen displays",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login.LoginSteps.password_Screen_Displays()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user enters his password as \"passw0rd\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_Enters_His_Password_As(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on next button After Password",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_next_button_After_Password()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user invokes keyboard to enter otp",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_invokes_keyboard_to_enter_otp()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user enters the amount as \"911911\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.CreateSteps.user_Enters_The_Amount(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on next button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user selects \"Warba\" app",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_selects_app(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user skips the tutorial",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login.LoginSteps.userSkipsTheTutorial()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on services tab",
  "keyword": "When "
});
formatter.match({
  "location": "steps.standingorder.CreateStandingSteps.When_user_clicks_on_services_()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user scrolls down to wu icon",
  "keyword": "And "
});
formatter.match({
  "location": "steps.wu.AddBeneficiarySteps.user_Scrolls_Down_To_transfer_money_Icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on wu icon",
  "keyword": "And "
});
formatter.match({
  "location": "steps.wu.AddBeneficiarySteps.user_Clicks_On_Transfer_Money_Icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on beneficiaries tab",
  "keyword": "And "
});
formatter.match({
  "location": "steps.wu.AddBeneficiarySteps.user_clicks_on_beneficiaries_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user searches for beneficiary \"Fadi\" to start sending money",
  "keyword": "And "
});
formatter.match({
  "location": "steps.wu.SendMoneySteps.user_searches_for_beneficiary_to_start_sending_money(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user invokes menu",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.wu.SendMoneySteps.userInvokesMenu()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on send money tab",
  "keyword": "And "
});
formatter.match({
  "location": "steps.wu.SendMoneySteps.userClicksOnSendMoneyTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "fraud screen displays",
  "keyword": "When "
});
formatter.match({
  "location": "steps.wu.SendMoneySteps.fraudScreenDisplays()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user accepts the fraud disclaimer",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.wu.SendMoneySteps.userAcceptsTheFraudDisclaimer()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user selects an account",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.TopupSteps.user_Selects_An_Account()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user selects a purpose as \"Saving/Investments\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.CreateJameyaSteps.user_Selects_A_Purpose_As(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on next button to proceed with conversation",
  "keyword": "And "
});
formatter.match({
  "location": "steps.wu.AddBeneficiarySteps.user_clicks_on_next_button_to_proceed_with_conversation()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks in transferred amount field",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.wu.SendMoneySteps.userClicksInTransferredAmountField()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user enters the amount as \"10\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.CreateSteps.user_Enters_The_Amount(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on calculate button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.wu.SendMoneySteps.userClicksOnCalculateButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on next button to proceed with conversation",
  "keyword": "And "
});
formatter.match({
  "location": "steps.wu.AddBeneficiarySteps.user_clicks_on_next_button_to_proceed_with_conversation()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user checks the terms and conditions",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.wu.SendMoneySteps.userChecksTheTermsAndConditions()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on next button to proceed with conversation",
  "keyword": "And "
});
formatter.match({
  "location": "steps.wu.AddBeneficiarySteps.user_clicks_on_next_button_to_proceed_with_conversation()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on review button of add WU beneficiary",
  "keyword": "And "
});
formatter.match({
  "location": "steps.wu.AddBeneficiarySteps.user_clicks_on_review_button_of_add_WU_beneficiary()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on send money button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.wu.SendMoneySteps.userClicksOnSendMoneyButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user enters his password to send money as \"passw0rd\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.wu.SendMoneySteps.user_enters_his_password_to_send_money_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on verify button",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.wu.SendMoneySteps.userClicksOnVerifyButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user gets redirected to success screen",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.TopupSteps.user_Gets_Redirected_To_success_Screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on done button under success",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.jameya.JoinJameyaSteps.user_Clicks_On_Done()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on close button to get redirected to home",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.TopupSteps.user_Clicks_On_Close_Button_To_Get_Redirected_To_Home()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on logout icon",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_logout_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on untrust link",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_Clicks_On_Untrust_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user confirms unlinking the device",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_Confirms_Unlinking_The_Device()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});