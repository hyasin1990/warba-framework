package steps.login;

import elements.login.LoginElements;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import steps.Hooks;
import util.Util;

import java.io.IOException;

import static elements.login.LoginElements.*;
import static util.GeneralUtil.get;


public class LoginSteps {
    AppiumDriver driver = Hooks.driver;
    LoginElements loginElements = new LoginElements(driver);
    Util util = new Util(driver);


    @Given("send notification was shown to user and he allows it")
    public void send_notification_was_shown_to_user() throws IOException {
        if (get("NO_RESET").equals("false") && get("TESTING_PLATFORM").equals("IOS"))
        {
            allowBtn.click();
        }
       // util.clickOnElementIfDisplayed(allowBtn);
    }

    @When("user swipes under get started screen and hits get started button")
    public void user_Swipes_Under_GetStarted_Screen() throws IOException {
        if (get("NO_RESET").equals("false"))
        {
            if (get("TESTING_PLATFORM").equals("IOS")) {
                util.swipeOnElement(getStartedTut1, "left");
                util.swipeOnElement(getStartedTut2, "left");

            } else if(get("TESTING_PLATFORM").equals("Android"))  {
                util.swipeByCoordinates(900, util.generateY(getStartedTut1), 0, util.generateY(getStartedTut1), 1);
                util.swipeByCoordinates(900, util.generateY(getStartedTut1), 0, util.generateY(getStartedTut1), 1);
            }
            getStartedBtn.click();
        }
    }

    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
    loginBtn.click();
    }


    @When("^user enters username as \"(.*)\"$")
    public void user_Enters_Proper_Username_As(String username) {
        usernameField.click();
        usernameField.sendKeys(username);
    }

    @And("user clicks on date of birth field")
    public void user_clicks_on_date_of_birth_field() {
        dobField.click();
    }

    @And("^user selects date of birth as \"(.*)\" of \"(.*)\"$")
    public void userSelectsDateOfBirth(String day, String month) throws InterruptedException, IOException {

        if (get("TESTING_PLATFORM").equals("IOS"))
        {
            util.selectDateBasedOnUserSelection(day, month, datePicker);
//           int intUserday = Integer.parseInt(day);
//           int intStandDay = Integer.parseInt(datePicker.get(0).getAttribute("value"));
//
//           while (intUserday!=intStandDay)
//           {
//               if (intUserday>intStandDay)
//               {
//                   try
//                   {
//                       util.nextScroll(datePicker,0);
//                       intStandDay+=1;
//
//                   } catch (StaleElementReferenceException ignored)
//                   {
//                       System.out.println("Excepton is caught");
//                   }
//               } else
//               {
//                   try
//                   {
//                       util.previousScroll(datePicker,0);
//                       intStandDay--;
//
//
//                   } catch (StaleElementReferenceException ignored)
//                   {
//                       System.out.println("Exception is caught");
//                   }
//                   System.out.println("int stand day is "+ intStandDay);
//               }
//
//           }
//
//           String standMonth = datePicker.get(1).getAttribute("value");
//           int intStandMonth = 0;
//           int intUserMonth = 0;
//            HashMap<Integer, String> dateMap = new HashMap<Integer, String>();
//            dateMap.put(1, "Jan");
//            dateMap.put(2, "Feb");
//            dateMap.put(3, "Mar");
//            dateMap.put(4, "Apr");
//            dateMap.put(5, "May");
//            dateMap.put(6, "Jun");
//            dateMap.put(7, "Jul");
//            dateMap.put(8, "Aug");
//            dateMap.put(9, "Sep");
//            dateMap.put(10, "Oct");
//            dateMap.put(11, "Nov");
//            dateMap.put(12, "Dec");
//
//
//            for (int i=1;i<dateMap.size();i++)
//            {
//                if (dateMap.get(i).equals(standMonth))
//                {
//                    intStandMonth=i;
//
//                }
//                if (dateMap.get(i).equalsIgnoreCase(month))
//                {
//                    intUserMonth=i;
//                }
//            }
//
//            while (intStandMonth!=intUserMonth)
//           {
//
//               if (intUserMonth>intStandMonth)
//               {
//                   try {
//                       util.nextScroll(datePicker,1);
//                   } catch (StaleElementReferenceException ignored)
//                   {
//
//                   }
//                   intStandMonth+=1;
//               } else
//               {
//                   try {
//                       util.previousScroll(datePicker,1);
//                   } catch (StaleElementReferenceException ignored)
//                   {
//
//                   }
//                   intStandMonth-=1;
//               }
//           }
            keyDone.click();
//        }else if (get("TESTING_PLATFORM").equals("Android"))
//        {
//            util.andrSelectBirthDate(day,month,datePicker);
//            okBtn.click();
       }
    }

    @And("user clicks login button")
    public void user_clicks_login_button() {
        loginBtn.click();
    }

    @Then("security question screen displays")
    public void security_question_screen_displays() {
        Assert.assertTrue(secTitle.isDisplayed());
    }

    @When("^user enters proper answer as \"(.*)\"$")
    public void user_enters_proper_answer(String answer) {
        answerTxt.sendKeys(answer);
        //driver.hideKeyboard();
        keyDone.click();
    }

    @And("user clicks on next button")
    public void user_clicks_on_next_button() {
        nextBtn.click();
    }

    @Then("password screen displays")
    public void password_Screen_Displays() {
        Assert.assertTrue(passTitle.isDisplayed());
    }

    @When("^user enters his password as \"(.*)\"$")
    public void user_Enters_His_Password_As(String password) {
        passTxt.sendKeys(password);
        //driver.hideKeyboard();
        keyDone.click();
    }

    @And("user invokes keyboard to enter otp")
    public void user_invokes_keyboard_to_enter_otp()
    {
        otpField.click();
    }
    @And("user clicks on next button After Password")
    public void user_clicks_on_next_button_After_Password() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS"))
        {
            loginBtn.click();
        } else if (get("TESTING_PLATFORM").equals("Android"))
        {
            nextBtn.click();
        }
    }

    @And("^user selects \"(.*)\" app$")
    public void user_selects_app(String app)
    {
        if (app.equalsIgnoreCase("Warba"))
        {
            util.waitForElementToBeClickable(warbaTab,30);
            warbaTab.click();
        } else if (app.equals("Youth"))
        {
            util.waitForElementToBeClickable(youthTab,30);
            youthTab.click();
        }
    }


    @Then("user skips the tutorial")
    public void userSkipsTheTutorial() throws IOException {
        //util.waitForElementToBeClickable(portfolioBtn, 200);
       // util.waitForElementToBeClickable(portfolioBtn,70);
        if (get("NO_RESET").equals("false"))
        {
            util.waitForElementToBeClickable(tutSkip,70);
            tutSkip.click();
        }
    }

    @Then("user clicks on logout icon")
    public void user_clicks_on_logout_icon() {
        util.waitForElementToBeClickable(logoutIcon, 200);
        logoutIcon.click();
    }

    @And("user clicks on untrust link")
    public void user_Clicks_On_Untrust_Link() {
        util.waitForElementToBeClickable(unlinkDevice,100);
        unlinkDevice.click();
    }

    @Then("user confirms unlinking the device")
    public void user_Confirms_Unlinking_The_Device() {
        util.waitForElementToBeClickable(unlinkConfirm,100);
        unlinkConfirm.click();

    }
}
