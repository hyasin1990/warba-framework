package steps.jameya;

import elements.hassala.CreateElements;
import elements.jameya.CreateJameyaElements;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import steps.Hooks;
import util.Util;

import java.io.IOException;

import static elements.hassala.CreateElements.screenBack;
import static elements.hassala.CreateElements.screenDone;
import static elements.hassala.TopUpElements.successTxt;
import static elements.hassala.TopUpElements.successTxtAndroid;
import static elements.jameya.CreateJameyaElements.*;
import static elements.login.LoginElements.*;
import static util.GeneralUtil.get;
import static util.Util.hold;

public class JoinJameyaSteps {
    AppiumDriver driver = Hooks.driver;
    Util util = new Util(driver);
    CreateJameyaElements createJameyaElements = new CreateJameyaElements(driver);
    CreateElements createElements = new CreateElements(driver);


    @And("user scrolls down to the available jameya")
    public void user_scrolls_down_to_the_available_jameya() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.swipeUntilElementIsDisplayed(joinJameya, 310, 500, 310, 300, 2);
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            util.swipeByCoordinates(780, 1500, 780, 1000, 2);
            util.swipeByCoordinates(780, 1500, 780, 740, 2);
        }
    }

    @When("user clicks on join button to join jameya")
    public void user_clicks_on_join_button_to_join_jameya() throws InterruptedException {
        util.waitForElementToBeClickable(joinJameya, 60);
        joinJameya.click();
    }

    @And("user clicks on keep going button")
    public void user_clicks_on_keep_going_button() {
        util.clickOnElementIfDisplayed(keepGoingBtn);
        //keepGoingBtn.click();
    }

    @And("user clicks on the purpose list to invoke it")
    public void user_clicks_on_the_purpose_list_to_invoke_it() throws InterruptedException {
        purposeList.click();
    }


    @And("user clicks on start jameya button")
    public void user_clicks_on_start_jameya_button() {
        startJameyaBtn.click();
    }

    @And("user confirms both participants details")
    public void user_confirms_both_participants_details() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            confParticipants.get(0).click();
            util.waitForElementToBeClickable(confParticipants.get(1), 20);
            confParticipants.get(1).click();
        } else {
            confParticipants.get(0).click();
            confParticipants.get(0).click();
        }
    }

    @Then("user clicks on the OTP field to start typing it")
    public void user_clicks_on_the_otp_field_to_start_typing_it() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            otpField.click();
        }
    }

    @And("^user enters OTP as \"(.*)\"$")
    public void user_enters_OTP_as(String OTP) throws IOException {
        util.enterAmountBaseOnGivenStringAmount(OTP);
        if (get("TESTING_PLATFORM").equals("IOS")) {
            keyDone.click();
        } else {
            driver.hideKeyboard();
        }
    }

    @And("user clicks on jameya dots menu")
    public void user_clicks_on_jameya_dots_menu() {
        jameyaDotsMenu.click();
    }

    @Then("user clicks on delete jameya tab")
    public void user_clicks_on_delete_jameya_tab() {
        deleteJameya.click();
    }

    @And("user clicks on continue button to delete jameya")
    public void user_clicks_on_continue_button_to_delete_jameya() {
        continueDelete.click();
    }

    @And("user confirms pay out day for joining")
    public void user_Confirms_PayOut_Day() throws InterruptedException, IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.nextScroll(payoutPicker, 0);
            keyDone.click();
            hold(30);
        } else {
            andrDone.click();
        }
    }

    @When("user clicks on join button to join jameya by participant")
    public void user_clicks_on_join_button_to_join_jameya_by_participant() throws InterruptedException, IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.waitForElementToBeClickable(joinJameya, 60);
            joinJameya.click();
        } else {
            screenNext.click();
        }
    }

    @Then("user gets redirected to success screen upon joining")
    public void user_Gets_Redirected_To_success_Screen_upon_joining() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.waitForElementToBeVisible(successTxt, 100);
            Assert.assertTrue(successTxt.isDisplayed());
        } else {
            util.waitForElementToBeClickable(successTxtAndroid, 100);
            successTxtAndroid.click();
        }
    }

    @When("user clicks on done button under success")
    public void user_Clicks_On_Done() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.waitForElementToBeClickable(screenDone, 40);
            screenDone.click();
        } else {
            andrDone.click();
        }
    }

    @And("user clicks on back to navigate back to home screen after joining")
    public void user_Clicks_On_Back_To_Navigate_Back_To_Home_Screen() throws IOException {

        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.waitForElementToBeClickable(screenBack, 40);
            screenBack.click();
        }
    }

    @And("android delay")
    public void android_delay() throws IOException {
        if (get("TESTING_PLATFORM").equals("Android")) {
            System.out.println(driver.findElementsByClassName("android.widget.TextView"));
        }
    }

    @And("user clicks on back to navigate back to home screen after deleting jameya")
    public void user_Clicks_On_Back_To_Navigate_Back_To_Home_Screen_after_deleting_jameya() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS"))
        {
            util.waitForElementToBeClickable(screenBack, 40);
            screenBack.click();
        }
    }


}
