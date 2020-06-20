package steps.hassala;

import elements.hassala.CreateElements;
import elements.hassala.TopUpElements;
import elements.hassala.WithdrawElements;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import steps.Hooks;
import util.Util;

import java.io.IOException;

import static elements.hassala.CreateElements.screenBack;
import static elements.hassala.CreateElements.screenClose;
import static elements.hassala.TopUpElements.*;
import static elements.hassala.WithdrawElements.*;
import static elements.login.LoginElements.*;
import static util.GeneralUtil.get;


public class WithdrawSteps {

    AppiumDriver driver = Hooks.driver;
    CreateElements createElements = new CreateElements(driver);
    TopUpElements topupElements = new TopUpElements(driver);
    WithdrawElements withdrawElements = new WithdrawElements(driver);
    Util util = new Util(driver);


    @When("user clicks on withdraw icon")
    public void user_clicks_on_withdraw_icon() {
        util.waitForElementToBeClickable(withdrawIcon, 20);
        withdrawIcon.click();
    }

    @And("user selects a reason and confirms it")
    public void user_Selects_AReason_And_Confirm_It() throws IOException {
        withdrawReason.click();

        if (get("TESTING_PLATFORM").equals("IOS"))
        {
            confirmBtn.click();
        } else if(get("TESTING_PLATFORM").equals("Android"))
        {
            continueBtn.click();
        }
    }


    @Then("user gets redirected to hasssala screen in case of IOS")
    public void user_Gets_Redirected_To_Hasssala_Screen_To_Check_If_The_Amount_Got_ToppedUp() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            savedAmount= hssalaValues.get(5).getText();
            double doubleToppedAmount= util.digitsExtractor(savedAmount);
            Assert.assertNotEquals(doubleToppedAmount,doubleInitAmount);
        }

    }

    @When("user clicks on close button to get redirected to home in case of IOS")
    public void user_Clicks_On_Close_Button_To_Get_Redirected_To_Home() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.waitForElementToBeClickable(screenClose, 20);
            screenClose.click();
        }
    }
}
