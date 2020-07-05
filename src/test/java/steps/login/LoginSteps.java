package steps.login;

import elements.login.LoginElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import screens.login.LoginScreen;
import steps.Hooks;
import util.Util;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import static elements.login.LoginElements.*;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static util.GeneralUtil.get;


public class LoginSteps {
    AppiumDriver driver = Hooks.driver;
    LoginElements loginElements = new LoginElements(driver);
    Util util = new Util(driver);
    LoginScreen loginScreen = new LoginScreen();


    @Given("send notification was shown to user and he allows it")
    public void send_notification_was_shown_to_user() throws IOException {
//        if (get("NO_RESET").equals("false") && get("TESTING_PLATFORM").equals("IOS"))
//        {
//            allowBtn.click();
//        }
        util.clickOnElementIfDisplayed(allowBtn);
    }

    @When("user swipes under get started screen and hits get started button")
    public void user_Swipes_Under_GetStarted_Screen() throws IOException {

        if (get("NO_RESET").equals("false"))
        {
            loginScreen.user_Swipes_Under_GetStarted_Screen();
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
            keyDone.click();
        }else if (get("TESTING_PLATFORM").equals("Android"))
        {
            util.andrSelectBirthDate(day,month,datePicker);
            okBtn.click();
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
        driver.hideKeyboard();
        //keyDone.click();
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
        driver.hideKeyboard();
        //keyDone.click();
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


    @Then("user skips the tutorial")
    public void userSkipsTheTutorial() throws IOException {
        util.waitForElementToBeClickable(portfolioBtn, 200);
        if (get("NO_RESET").equals("false"))
        {
            tutSkip.click();
        }
    }

    @Then("user clicks on logout icon")
    public void user_clicks_on_logout_icon() {
        util.waitForElementToBeClickable(logoutIcon, 200);
        logoutIcon.click();
    }

}
