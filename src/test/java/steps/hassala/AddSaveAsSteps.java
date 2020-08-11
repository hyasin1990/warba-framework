package steps.hassala;

import elements.hassala.*;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import steps.Hooks;
import util.Util;

import java.io.IOException;
import java.util.HashMap;

import static elements.hassala.ManageElements.*;
import static elements.login.LoginElements.*;
import static util.GeneralUtil.get;
import static util.Util.hold;

public class AddSaveAsSteps {
    AppiumDriver driver = Hooks.driver;
    CreateElements createElements = new CreateElements(driver);
    TopUpElements topupElements = new TopUpElements(driver);
    WithdrawElements withdrawElements = new WithdrawElements(driver);
    BreakElements breakElements = new BreakElements(driver);
    ManageElements manageElements = new ManageElements(driver);
    Util util = new Util(driver);


    @Given("user clicks on add method link for save as you spend funding method")
    public void user_clicks_on_add_method_link_for_SaveAs_funding_method() {
        addMethods.get(2).click();
    }

    @Then("user start swiping to Save As funding method section")
    public void user_start_swiping_to_funding_methods_section() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.swipeUntilElementIsDisplayed(secKharda, 62, 668, 62, 152, 2);
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            util.andrScrollUntilTextIsDisplayed("Kharda");
        }
    }

    @When("user accepts service disclaimer")
    public void user_Accepts_Service_Disclaimer() {
        acceptBtn.click();
    }

    @And("user scrolls to the next value in the wheel")
    public void user_Scrolls_To_The_Next_Value_In_The_Wheel() throws IOException, InterruptedException {
        if (get("TESTING_PLATFORM").equals("IOS"))
        {
            HashMap<String, Object> params = new HashMap<>();
            params.put("order", "next");
            params.put("offset", 0.15);
            params.put("element", ((RemoteWebElement) saveAsPicker).getId());
            driver.executeScript("mobile: selectPickerWheelValue", params);
            keyDone.click();
        } else if (get("TESTING_PLATFORM").equals("Android"))
        { util.waitForElementToBeClickable(doneBtn,20);
           util.swipeByCoordinates(530,1689,550,1600,1);
            doneBtn.click();
        }

    }

    @And("user clicks on select account link")
    public void user_Clicks_On_Select_Account_Link() throws IOException {
        selectAccountLink.click();
    }


    @Then("user clicks on review button")
    public void user_Clicks_On_Review_Button() {
        reviewBtn.click();
    }
    @And("user hits confirm button for save as funding")
    public void user_Hits_Confirm_Button() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS"))
        {
            confirmBtn.click();
        } else if (get("TESTING_PLATFORM").equals("Android"))
        {
            util.waitForElementToBeClickable(methodContinueBtn,20);
            methodContinueBtn.click();
        }
    }


    @Then("user gets redirected to congratulations screen of funding method")
    public void user_Gets_Redirected_To_Congratulations_Screen() {
        util.waitForElementToBeVisible(saveCongraTxt, 60);
        Assert.assertTrue(saveCongraTxt.isDisplayed());
    }
}
