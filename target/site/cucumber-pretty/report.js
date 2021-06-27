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
  "error_message": "org.openqa.selenium.StaleElementReferenceException: The previously found element \"\"textField_dateOfBirth\" TextField\" is not present in the current view anymore. Make sure the application UI has the expected state. Original error: No matches found for Elements matching predicate \u0027wdName \u003d\u003d \"textField_dateOfBirth\" AND (1 \u003d\u003d 1 OR identifier \u003d\u003d 0 OR frame \u003d\u003d 0 OR value \u003d\u003d 0 OR title \u003d\u003d 0 OR label \u003d\u003d 0 OR elementType \u003d\u003d 0 OR enabled \u003d\u003d 0 OR placeholderValue \u003d\u003d 0 OR selected \u003d\u003d 0)\u0027 from input {(\n    Window, {{0.0, 0.0}, {390.0, 844.0}},\n    Window, {{0.0, 0.0}, {390.0, 844.0}},\n    Window, {{0.0, 0.0}, {390.0, 844.0}},\n    Other, {{0.0, 0.0}, {390.0, 844.0}},\n    Other, {{0.0, 0.0}, {390.0, 844.0}},\n    Other, {{0.0, 0.0}, {390.0, 844.0}},\n    Other, {{0.0, 0.0}, {390.0, 844.0}},\n    Other, {{0.0, 0.0}, {390.0, 844.0}},\n    Other, {{0.0, 509.0}, {390.0, 335.0}},\n    Other, {{0.0, 509.0}, {390.0, 335.0}},\n    Other, {{0.0, 0.0}, {390.0, 844.0}},\n    Toolbar, {{0.0, 509.0}, {390.0, 44.0}}, identifier: \u0027Toolbar\u0027, label: \u0027Toolbar\u0027,\n    Other, {{0.0, 553.0}, {390.0, 233.0}},\n    Other, {{0.0, 509.0}, {390.0, 44.0}},\n    Other, {{0.0, 553.0}, {390.0, 233.0}},\n    Other, {{0.0, 553.0}, {390.0, 233.0}},\n    Other, {{0.0, 553.0}, {390.0, 291.0}},\n    NavigationBar, {{0.0, 47.0}, {390.0, 44.0}}, identifier: \u0027Warba_Online.LoginView\u0027,\n    Other, {{0.0, 0.0}, {390.0, 844.0}},\n    Other, {{0.0, 509.0}, {390.0, 44.0}},\n    Other, {{0.0, 553.0}, {390.0, 291.0}},\n    Keyboard, {{0.0, 553.0}, {390.0, 233.0}},\n    Button, {{9.0, 777.7}, {65.2, 65.8}}, label: \u0027Emoji\u0027,\n    Button, {{315.9, 777.3}, {65.2, 65.8}}, identifier: \u0027dictation\u0027, label: \u0027Dictate\u0027,\n    Button, {{8.0, 47.0}, {53.0, 44.0}}, label: \u0027Demo\u0027,\n    Button, {{285.0, 47.0}, {46.0, 44.0}}, label: \u0027notifications alert\u0027,\n    Button, {{339.0, 47.0}, {43.0, 44.0}}, label: \u0027arabic\u0027,\n    Other, {{0.0, 0.0}, {390.0, 844.0}},\n    Other, {{0.0, 509.0}, {390.0, 44.0}},\n    Other, {{0.0, 553.0}, {390.0, 291.0}},\n    Other, {{0.0, 553.0}, {390.0, 233.0}},\n    StaticText, {{9.0, 777.7}, {0.0, 0.0}},\n    StaticText, {{315.9, 777.3}, {0.0, 0.0}},\n    Other, {{0.0, 0.0}, {390.0, 844.0}},\n    Button, {{0.0, 509.0}, {45.0, 44.0}}, label: \u0027Previous\u0027, Disabled,\n    Button, {{48.0, 509.0}, {31.0, 44.0}}, label: \u0027Next\u0027,\n    Button, {{324.3, 509.0}, {65.7, 44.0}}, label: \u0027Done\u0027,\n    Other, {{163.7, 517.0}, {63.0, 28.0}}, label: \u0027Title\u0027,\n    Other, {{0.0, 553.0}, {390.0, 291.0}},\n    Other, {{0.0, 553.0}, {390.0, 291.0}},\n    Other, {{0.0, 553.0}, {390.0, 233.0}},\n    Image, {{0.0, 0.0}, {390.0, 844.0}}, identifier: \u0027Warba/Common/Background/main\u0027,\n    Image, {{114.0, 189.3}, {162.0, 162.0}}, identifier: \u0027Warba/Platform/negativeFullLogo\u0027,\n    Other, {{115.3, 456.0}, {159.7, 21.0}},\n    Other, {{16.0, 504.0}, {358.0, 252.0}},\n    Other, {{0.0, 754.0}, {390.0, 844.0}},\n    Button, {{163.7, 517.0}, {63.0, 28.0}}, label: \u0027Username\u0027, Disabled,\n    Key, {{0.0, 560.0}, {39.0, 46.0}}, label: \u0027q\u0027,\n    Key, {{39.0, 560.0}, {39.0, 46.0}}, label: \u0027w\u0027,\n    Key, {{78.0, 560.0}, {39.0, 46.0}}, label: \u0027e\u0027,\n    Key, {{117.0, 560.0}, {39.0, 46.0}}, label: \u0027r\u0027,\n    Key, {{156.0, 560.0}, {39.0, 46.0}}, label: \u0027t\u0027,\n    Key, {{195.0, 560.0}, {39.0, 46.0}}, label: \u0027y\u0027,\n    Key, {{234.0, 560.0}, {39.0, 46.0}}, label: \u0027u\u0027,\n    Key, {{273.0, 560.0}, {39.0, 46.0}}, label: \u0027i\u0027,\n    Key, {{312.0, 560.0}, {39.0, 46.0}}, label: \u0027o\u0027,\n    Key, {{351.0, 560.0}, {39.0, 46.0}}, label: \u0027p\u0027,\n    Key, {{19.3, 614.0}, {39.0, 46.0}}, label: \u0027a\u0027,\n    Key, {{58.3, 614.0}, {39.0, 46.0}}, label: \u0027s\u0027,\n    Key, {{97.3, 614.0}, {39.0, 46.0}}, label: \u0027d\u0027,\n    Key, {{136.3, 614.0}, {39.0, 46.0}}, label: \u0027f\u0027,\n    Key, {{175.9, 614.0}, {39.0, 46.0}}, label: \u0027g\u0027,\n    Key, {{214.9, 614.0}, {39.0, 46.0}}, label: \u0027h\u0027,\n    Key, {{253.9, 614.0}, {39.0, 46.0}}, label: \u0027j\u0027,\n    Key, {{292.9, 614.0}, {39.0, 46.0}}, label: \u0027k\u0027,\n    Key, {{331.9, 614.0}, {39.0, 46.0}}, label: \u0027l\u0027,\n    Button, {{0.0, 668.0}, {50.0, 46.0}}, identifier: \u0027shift\u0027, label: \u0027shift\u0027,\n    Key, {{58.3, 668.0}, {39.0, 46.0}}, label: \u0027z\u0027,\n    Key, {{97.3, 668.0}, {39.0, 46.0}}, label: \u0027x\u0027,\n    Key, {{136.3, 668.0}, {39.0, 46.0}}, label: \u0027c\u0027,\n    Key, {{175.9, 668.0}, {39.0, 46.0}}, label: \u0027v\u0027,\n    Key, {{214.9, 668.0}, {39.0, 46.0}}, label: \u0027b\u0027,\n    Key, {{253.9, 668.0}, {39.0, 46.0}}, label: \u0027n\u0027,\n    Key, {{292.9, 668.0}, {39.0, 46.0}}, label: \u0027m\u0027,\n    Key, {{340.2, 668.0}, {50.0, 46.0}}, identifier: \u0027delete\u0027, label: \u0027delete\u0027,\n    Key, {{0.0, 722.0}, {97.3, 46.0}}, identifier: \u0027more\u0027, label: \u0027numbers\u0027,\n    Key, {{97.3, 722.0}, {195.3, 46.0}}, label: \u0027space\u0027,\n    Button, {{292.7, 722.0}, {97.3, 46.0}}, identifier: \u0027Return\u0027, label: \u0027return\u0027,\n    Other, {{115.3, 456.0}, {127.7, 21.0}},\n    Image, {{251.0, 454.7}, {24.0, 24.0}}, identifier: \u0027Warba/Common/Arrow/arrowNextWhite\u0027,\n    Other, {{16.0, 504.0}, {358.0, 252.0}},\n    Other, {{0.0, 754.0}, {390.0, 844.0}},\n    StaticText, {{163.7, 523.0}, {63.0, 16.0}}, label: \u0027Username\u0027,\n    StaticText, {{115.3, 456.0}, {127.7, 21.0}}, label: \u0027Slide to view more\u0027,\n    Button, {{32.0, 504.0}, {326.0, 50.0}}, identifier: \u0027button_login\u0027, label: \u0027Login\u0027,\n    Button, {{32.0, 584.0}, {326.0, 48.0}}, identifier: \u0027button_createAccount\u0027, label: \u0027Register\u0027,\n    Button, {{0.0, 754.0}, {390.0, 50.0}},\n    Other, {{0.0, 762.0}, {390.0, 24.0}},\n    Other, {{0.0, 776.0}, {390.0, 722.0}},\n    Other, {{175.0, 772.0}, {40.0, 4.0}},\n    StaticText, {{175.7, 510.0}, {39.0, 38.0}}, label: \u0027Login\u0027,\n    StaticText, {{166.0, 590.0}, {58.0, 36.0}}, label: \u0027Register\u0027,\n    StaticText, {{0.0, 754.0}, {0.0, 0.0}},\n    Other, {{0.0, 776.0}, {390.0, 722.0}},\n    StaticText, {{110.0, 792.0}, {170.0, 17.0}}, label: \u0027Pull Up for Guest Account\u0027,\n    Other, {{16.0, 841.0}, {358.0, 64.7}},\n    Other, {{16.0, 937.7}, {358.0, 145.0}},\n    Other, {{16.0, 1098.7}, {358.0, 31.0}},\n    Other, {{0.0, 1338.0}, {390.0, 160.0}},\n    Other, {{16.0, 841.0}, {358.0, 64.7}},\n    Other, {{16.0, 937.7}, {358.0, 145.0}},\n    Switch, {{16.0, 1098.7}, {51.0, 31.0}}, value: 0,\n    StaticText, {{75.0, 1105.0}, {174.7, 18.3}}, label: \u0027Remember Me\u0027,\n    Button, {{259.7, 1098.7}, {114.3, 31.0}},\n    Other, {{16.0, 1354.0}, {358.0, 128.0}},\n    Other, {{16.0, 841.0}, {358.0, 64.7}},\n    Other, {{16.0, 937.7}, {358.0, 145.0}},\n    StaticText, {{259.7, 1098.7}, {0.0, 0.0}},\n    StaticText, {{259.7, 1098.7}, {114.3, 31.0}}, label: \u0027Forget Password?\u0027,\n    Button, {{16.0, 1354.0}, {358.0, 48.0}},\n    Button, {{105.7, 1434.0}, {179.0, 48.0}},\n    StaticText, {{81.0, 841.0}, {228.0, 24.3}}, label: \u0027Login to Guest Account\u0027,\n    StaticText, {{22.0, 869.3}, {346.0, 36.3}}, label: \u0027To use Warba bank special services, Warba auto, and Jam3eya.\u0027,\n    TextField, {{32.0, 937.7}, {326.0, 72.0}}, placeholderValue: \u0027Mobile number\u0027,\n    Other, {{32.0, 1009.7}, {326.0, 1.0}},\n    SecureTextField, {{32.0, 1010.7}, {326.0, 72.0}}, placeholderValue: \u0027Password\u0027,\n    StaticText, {{16.0, 1354.0}, {0.0, 0.0}},\n    StaticText, {{177.0, 1365.0}, {36.0, 26.0}}, label: \u0027Login\u0027,\n    StaticText, {{105.7, 1434.0}, {0.0, 0.0}},\n    StaticText, {{116.7, 1445.0}, {157.0, 26.0}}, label: \u0027Create a Guest Account\u0027\n)}\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027Hussams-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:1017:b91:5cc5:d958%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: io.appium.java_client.ios.IOSDriver\nCapabilities {app: /Users/abhishekjain/Develop..., automationName: XCUITest, browserName: , databaseEnabled: false, deviceName: iPhone 12, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: false, noReset: true, platform: MAC, platformName: IOS, takesScreenshot: true, udid: FD594E8E-2EB8-4327-ACB4-F66..., webStorageEnabled: false}\nSession ID: 11ffdf3f-2bab-4477-85da-bf78a1882e26\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:239)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:41)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.execute(IOSDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat io.appium.java_client.DefaultGenericMobileElement.execute(DefaultGenericMobileElement.java:45)\n\tat io.appium.java_client.MobileElement.execute(MobileElement.java:1)\n\tat io.appium.java_client.ios.IOSElement.execute(IOSElement.java:1)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat io.appium.java_client.pagefactory.ElementInterceptor.getObject(ElementInterceptor.java:40)\n\tat io.appium.java_client.pagefactory.interceptors.InterceptorOfASingleElement.intercept(InterceptorOfASingleElement.java:60)\n\tat io.appium.java_client.ios.IOSElement$$EnhancerByCGLIB$$d311658.click(\u003cgenerated\u003e)\n\tat steps.login.LoginSteps.user_clicks_on_date_of_birth_field(LoginSteps.java:64)\n\tat ✽.user clicks on date of birth field(file:///Users/abhishekjain/Documents/Practice%20Projects/iPhone/WarbaProject/src/test/java/features/D/WU/SendMoney.feature:11)\n",
  "status": "failed"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user selects date of birth as \"16\" of \"Jun\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.login.LoginSteps.userSelectsDateOfBirth(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
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