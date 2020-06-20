package steps.hassala;

import elements.hassala.CreateElements;
import elements.hassala.TopUpElements;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import steps.Hooks;
import util.Util;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static elements.hassala.CreateElements.*;
import static elements.hassala.TopUpElements.*;
import static elements.login.LoginElements.*;
import static util.GeneralUtil.get;
import static util.Util.hold;


public class TopupSteps {

    AppiumDriver driver = Hooks.driver;
    CreateElements createElements = new CreateElements(driver);
    TopUpElements topupElements = new TopUpElements(driver);
    Util util = new Util(driver);


    @When("user selects any created hassala")
    public void user_Selects_Any_Created_Hassala() {
        chancHassala.click();
    }

    @And("user skips hassala tutorial if it displays")
    public void user_Skips_Hassala_Tutorial_If_It_Displays() throws IOException {

        if (get("NO_RESET").equals("false")) {
            tutSkip.click();
        }

        //  if (get("TESTING_PLATFORM").equals("IOS"))
        //   {
        util.waitForElementToBeClickable(topupIcon, 30);
        savedAmount = hssalaValues.get(5).getText();
        doubleInitAmount = util.digitsExtractor(savedAmount);
        //}
    }

    @And("user clicks on top up icon")
    public void user_Clicks_On_TopUp_Icon() {
        util.waitForElementToBeClickable(topupIcon, 40);
        topupIcon.click();
    }


    @And("user selects an account")
    public void user_Selects_An_Account() {
        util.waitForElementToBeClickable(kwdAccount,30);
        kwdAccount.click();
    }

    @And("user put focus in top up amount field an account")
    public void user_put_in_TopUpTxt() {
        topupAmountTxt.click();
    }


    @And("^user fills in description as \"(.*)\"$")
    public void user_Fills_In_description_As(String desc) throws IOException {
        descTxt.sendKeys(desc);

        if (get("TESTING_PLATFORM").equals("IOS")) {
            keyDone.click();

        } else if (get("TESTING_PLATFORM").equals("Android")) {
            util.andrClickEnter();
        }
    }

    @And("user hits confirm button")
    public void user_Hits_Confirm_Button() {
        confirmBtn.click();
    }

    @Then("user gets redirected to success screen")
    public void user_Gets_Redirected_To_success_Screen() {
        util.waitForElementToBeVisible(successTxt, 100);
        Assert.assertTrue(successTxt.isDisplayed());
    }


    @Then("user gets redirected to hasssala screen to check if the amount")
    public void user_Gets_Redirected_To_Hasssala_Screen_To_Check_If_The_Amount_Got_ToppedUp() {
        savedAmount = hssalaValues.get(5).getText();
        double doubleToppedAmount = util.digitsExtractor(savedAmount);
        Assert.assertNotEquals(doubleToppedAmount, doubleInitAmount);
    }

    @When("user clicks on close button to get redirected to home")
    public void user_Clicks_On_Close_Button_To_Get_Redirected_To_Home() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.waitForElementToBeClickable(screenClose, 20);
            screenClose.click();
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            util.waitForElementToBeClickable(screenBack, 20);
            screenBack.click();
            screenBack.click();
        }

    }
}
