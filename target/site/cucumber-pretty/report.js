$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/jameya/CreateJameya.feature");
formatter.feature({
  "name": "Creating a jameya then accepting it by two participants",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CreateJam3eya"
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
formatter.scenario({
  "name": "Accepting Jameya By Second user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateJam3eya"
    }
  ]
});
formatter.step({
  "name": "user enters username as \"jamuser11\"",
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
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on next button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "password screen displays",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login.LoginSteps.password_Screen_Displays()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user enters his password as \"passw0rd\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_Enters_His_Password_As(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on next button After Password",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_next_button_After_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user skips the tutorial",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login.LoginSteps.userSkipsTheTutorial()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on my social circle tab",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.jameya.CreateJameyaSteps.user_clicks_on_my_social_circle_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user scrolls down to the available jameya",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.JoinJameyaSteps.user_scrolls_down_to_the_available_jameya()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on join button to join jameya",
  "keyword": "When "
});
formatter.match({
  "location": "steps.jameya.JoinJameyaSteps.user_clicks_on_join_button_to_join_jameya()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on continue to confirm invitations",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.CreateJameyaSteps.user_Clicks_On_Continue_To_Confirm_Invitations()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on keep going button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.JoinJameyaSteps.user_clicks_on_keep_going_button()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user scrolls under terms and conditions screen",
  "keyword": "When "
});
formatter.match({
  "location": "steps.jameya.CreateJameyaSteps.user_Scrolls_Under_Terms_And_Conditions_Screen()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user accepts terms and conditions",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.CreateJameyaSteps.user_Accepts_Terms_And_Conditions()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user selects an account",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.TopupSteps.user_Selects_An_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user selects an account",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.TopupSteps.user_Selects_An_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user confirms pay out day",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.CreateJameyaSteps.user_Confirms_PayOut_Day()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user selects a purpose of the jameya as \"Travel\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.CreateJameyaSteps.user_Selects_A_Purpose_Of_The_Jameya_As(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on upload a photo link",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.CreateJameyaSteps.user_Clicks_On_Upload_A_Photo_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on choose from camera roll",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.CreateSteps.user_Clicks_On_Choose_From_CameraRoll()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user allows access permission if displayed",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.CreateSteps.user_Allows_Access_Permission()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on all photos tab from photos gallery",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.CreateSteps.user_Clicks_On_All_Photos_Tab_From_Photos_Gallery()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user selects any photo to replace the current",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.CreateSteps.user_Selects_Any_Photo_To_Replace_The_Current()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "clicks on choose to confirm it",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.CreateSteps.clicks_On_Choose_To_Confirm_It()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on join button to join jameya",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.jameya.JoinJameyaSteps.user_clicks_on_join_button_to_join_jameya()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user gets redirected to success screen",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.hassala.TopupSteps.user_Gets_Redirected_To_success_Screen()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on done",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.CreateSteps.user_Clicks_On_Done()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on back to navigate back to home screen",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.CreateSteps.user_Clicks_On_Back_To_Navigate_Back_To_Home_Screen()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on logout icon",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_logout_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
formatter.scenario({
  "name": "Starting jameya by host",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateJam3eya"
    }
  ]
});
formatter.step({
  "name": "user enters username as \"jamuser27\"",
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
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on next button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "password screen displays",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login.LoginSteps.password_Screen_Displays()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user enters his password as \"passw0rd\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_Enters_His_Password_As(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on next button After Password",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_next_button_After_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user skips the tutorial",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login.LoginSteps.userSkipsTheTutorial()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on my social circle tab",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.jameya.CreateJameyaSteps.user_clicks_on_my_social_circle_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user selects the created jameya",
  "keyword": "When "
});
formatter.match({
  "location": "steps.jameya.CreateJameyaSteps.user_selects_the_created_jameya()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on start jameya button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.JoinJameyaSteps.user_clicks_on_start_jameya_button()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user confirms both participants details",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.JoinJameyaSteps.user_confirms_both_participants_details()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on start jameya button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.JoinJameyaSteps.user_clicks_on_start_jameya_button()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the OTP field to start typing it",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.jameya.JoinJameyaSteps.user_clicks_on_the_otp_field_to_start_typing_it()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user enters OTP as \"111111\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.JoinJameyaSteps.user_enters_OTP_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on next button",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on back to navigate back to home screen",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.CreateSteps.user_Clicks_On_Back_To_Navigate_Back_To_Home_Screen()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on logout icon",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_logout_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
formatter.scenario({
  "name": "Deleting any created jameya after accepting it by participants",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateJam3eya"
    }
  ]
});
formatter.step({
  "name": "user enters username as \"jamuser27\"",
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
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on next button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "password screen displays",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login.LoginSteps.password_Screen_Displays()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user enters his password as \"passw0rd\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_Enters_His_Password_As(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on next button After Password",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_next_button_After_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user skips the tutorial",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login.LoginSteps.userSkipsTheTutorial()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on my social circle tab",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.jameya.CreateJameyaSteps.user_clicks_on_my_social_circle_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user selects the created jameya",
  "keyword": "When "
});
formatter.match({
  "location": "steps.jameya.CreateJameyaSteps.user_selects_the_created_jameya()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on jameya dots menu",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.JoinJameyaSteps.user_clicks_on_jameya_dots_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on delete jameya tab",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.jameya.JoinJameyaSteps.user_clicks_on_delete_jameya_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on continue button to delete jameya",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.JoinJameyaSteps.user_clicks_on_continue_button_to_delete_jameya()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on back to navigate back to home screen",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.CreateSteps.user_Clicks_On_Back_To_Navigate_Back_To_Home_Screen()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on logout icon",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_logout_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});