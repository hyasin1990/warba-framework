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
  "name": "Accepting Jameya By First User",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateJam3eya"
    }
  ]
});
formatter.step({
  "name": "user enters username as \"jamuser31\"",
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
  "name": "user enters username as \"jamuser31\"",
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
  "name": "user clicks on join button to join jameya",
  "keyword": "When "
});
formatter.match({
  "location": "steps.jameya.JoinJameyaSteps.user_clicks_on_join_button_to_join_jameya()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Can\u0027t locate an element by this strategy: By.chained({By.xpath: //XCUIElementTypeButton[contains(@name,\u0027Join\u0027)]})\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.findElement(AppiumElementLocator.java:126)\n\tat io.appium.java_client.pagefactory.interceptors.InterceptorOfASingleElement.intercept(InterceptorOfASingleElement.java:59)\n\tat io.appium.java_client.ios.IOSElement$$EnhancerByCGLIB$$d311658.click(\u003cgenerated\u003e)\n\tat steps.jameya.JoinJameyaSteps.user_clicks_on_join_button_to_join_jameya(JoinJameyaSteps.java:35)\n\tat ✽.user clicks on join button to join jameya(file:///Users/abhishekjain/Documents/Practice%20Projects/iPhone/WarbaProject/src/test/java/features/jameya/CreateJameya.feature:112)\nCaused by: org.openqa.selenium.TimeoutException: Expected condition failed: waiting for io.appium.java_client.pagefactory.AppiumElementLocator$WaitingFunction@726cbf49 (tried for 1 second(s) with 500 milliseconds interval)\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:304)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.waitFor(AppiumElementLocator.java:99)\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.findElement(AppiumElementLocator.java:119)\n\tat io.appium.java_client.pagefactory.interceptors.InterceptorOfASingleElement.intercept(InterceptorOfASingleElement.java:59)\n\tat io.appium.java_client.ios.IOSElement$$EnhancerByCGLIB$$d311658.click(\u003cgenerated\u003e)\n\tat steps.jameya.JoinJameyaSteps.user_clicks_on_join_button_to_join_jameya(JoinJameyaSteps.java:35)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\n\tat io.cucumber.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:124)\n\tat io.cucumber.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:29)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:134)\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:597)\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:173)\n\tat org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)\n\tat org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:816)\n\tat org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:146)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)\n\tat java.util.ArrayList.forEach(ArrayList.java:1257)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:766)\n\tat org.testng.TestRunner.run(TestRunner.java:587)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:384)\n\tat org.testng.SuiteRunner.access$000(SuiteRunner.java:28)\n\tat org.testng.SuiteRunner$SuiteWorker.run(SuiteRunner.java:425)\n\tat org.testng.internal.thread.ThreadUtil.lambda$execute$0(ThreadUtil.java:68)\n\tat java.util.concurrent.FutureTask.run(FutureTask.java:266)\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)\n\tat java.lang.Thread.run(Thread.java:748)\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.chained({By.xpath: //XCUIElementTypeButton[contains(@name,\u0027Join\u0027)]})\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027Hussams-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:ca3:c068:5757:5934%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.5\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: driver.version: IOSDriver\n\tat io.appium.java_client.pagefactory.bys.builder.ByChained.findElement(ByChained.java:74)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:57)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.findElement(IOSDriver.java:1)\n\tat io.appium.java_client.pagefactory.bys.ContentMappedBy.findElement(ContentMappedBy.java:50)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:57)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.findElement(IOSDriver.java:1)\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.lambda$0(AppiumElementLocator.java:120)\n\tat io.appium.java_client.pagefactory.AppiumElementLocator$WaitingFunction.apply(AppiumElementLocator.java:172)\n\tat io.appium.java_client.pagefactory.AppiumElementLocator$WaitingFunction.apply(AppiumElementLocator.java:1)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\n\t... 42 more\n",
  "status": "failed"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on continue to confirm invitations",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.CreateJameyaSteps.user_Clicks_On_Continue_To_Confirm_Invitations()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on keep going button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.JoinJameyaSteps.user_clicks_on_keep_going_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user scrolls under terms and conditions screen",
  "keyword": "When "
});
formatter.match({
  "location": "steps.jameya.CreateJameyaSteps.user_Scrolls_Under_Terms_And_Conditions_Screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user accepts terms and conditions",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.CreateJameyaSteps.user_Accepts_Terms_And_Conditions()"
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
  "name": "user confirms pay out day",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.CreateJameyaSteps.user_Confirms_PayOut_Day()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user selects a purpose of the jameya as \"Travel\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.CreateJameyaSteps.user_Selects_A_Purpose_Of_The_Jameya_As(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on upload a photo link",
  "keyword": "And "
});
formatter.match({
  "location": "steps.jameya.CreateJameyaSteps.user_Clicks_On_Upload_A_Photo_Link()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on choose from camera roll",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.CreateSteps.user_Clicks_On_Choose_From_CameraRoll()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user allows access permission if displayed",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.CreateSteps.user_Allows_Access_Permission()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on all photos tab from photos gallery",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.CreateSteps.user_Clicks_On_All_Photos_Tab_From_Photos_Gallery()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user selects any photo to replace the current",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.CreateSteps.user_Selects_Any_Photo_To_Replace_The_Current()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "clicks on choose to confirm it",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.CreateSteps.clicks_On_Choose_To_Confirm_It()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on join button to join jameya",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.jameya.JoinJameyaSteps.user_clicks_on_join_button_to_join_jameya()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user gets redirected to success screen",
  "keyword": "Then "
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
  "name": "user clicks on done",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.CreateSteps.user_Clicks_On_Done()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on back to navigate back to home screen",
  "keyword": "And "
});
formatter.match({
  "location": "steps.hassala.CreateSteps.user_Clicks_On_Back_To_Navigate_Back_To_Home_Screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on logout icon",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.user_clicks_on_logout_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});