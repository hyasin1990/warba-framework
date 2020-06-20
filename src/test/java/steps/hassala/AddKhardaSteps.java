package steps.hassala;

import elements.hassala.*;
import elements.login.LoginElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.Hooks;
import util.Util;

import java.io.IOException;

import static elements.hassala.CreateElements.screenBack;
import static elements.hassala.CreateElements.screenClose;
import static elements.hassala.ManageElements.*;
import static elements.login.LoginElements.confirmBtn;
import static util.GeneralUtil.get;

public class AddKhardaSteps {

    AppiumDriver driver = Hooks.driver;
    CreateElements createElements = new CreateElements(driver);
    TopUpElements topupElements = new TopUpElements(driver);
    WithdrawElements withdrawElements = new WithdrawElements(driver);
    BreakElements breakElements = new BreakElements(driver);
    ManageElements manageElements = new ManageElements(driver);
    LoginElements loginElements = new LoginElements(driver);

    Util util = new Util(driver);


    @Then("user start swiping to Kharda funding method section")
    public void user_start_swiping_to_Kharda_section() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.swipeUntilElementIsDisplayed(secSaveAs, 62, 668, 62, 152, 2);
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            util.waitForElementToBeClickable(editLink,30);
            util.swipeByCoordinates(800,1950,800,400,3);
        }
    }

    @And("user clicks on select account link for IOS")
    public void user_Clicks_On_Select_Account_Link() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            selectAccountLink.click();
        }
    }

    @Given("user clicks on add method link for kharda funding method")
    public void user_clicks_on_add_method_link_for_Kharda_funding_method() {
        addMethods.get(3).click();
    }


    @Then("user clicks on continue button")
    public void user_Clicks_On_Continue_Button() {
        continueBtn.click();
    }

    @And("user clicks on continue,confirm button")
    public void user_Clicks_On_Continue_Confirm_Button() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            continueBtn.click();
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            confirmBtn.click();
        }
    }

    @When("user clicks on close button under hassala")
    public void user_Clicks_On_Close_Button_To_Get_Redirected_To_Home() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.waitForElementToBeClickable(screenClose, 20);
            screenClose.click();
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            util.waitForElementToBeClickable(hssalaBack, 20);
            hssalaBack.click();
            util.waitForElementToBeClickable(screenBack, 20);
            screenBack.click();
            screenBack.click();
        }

    }
}
