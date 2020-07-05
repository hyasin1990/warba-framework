package steps.jameya;

import elements.hassala.CreateElements;
import elements.jameya.CreateJameyaElements;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.Hooks;
import util.Util;

import java.io.IOException;

import static elements.jameya.CreateJameyaElements.*;
import static elements.login.LoginElements.*;
import static util.GeneralUtil.get;
import static util.Util.hold;

public class JoinJameyaSteps {
    AppiumDriver driver = Hooks.driver;
    Util util = new Util(driver);
    CreateJameyaElements createJameyaElements = new CreateJameyaElements(driver);
    CreateElements createElements= new CreateElements(driver);


    @And("user scrolls down to the available jameya")
    public void user_scrolls_down_to_the_available_jameya()
    {
        util.swipeUntilElementIsDisplayed(joinJameya,310,500,310,300,2);
    }

    @When("user clicks on join button to join jameya")
    public void user_clicks_on_join_button_to_join_jameya() throws InterruptedException {
        util.waitForElementToBeClickable(joinJameya,60);
       // hold(30);
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
    public void user_confirms_both_participants_details()
    {
        confParticipants.get(0).click();
        util.waitForElementToBeClickable(confParticipants.get(1),20);
        confParticipants.get(1).click();
//        confirmBtn.click();
//        util.waitForElementToBeClickable(confirmBtn,20);
//        confirmBtn.click();
    }
    @Then("user clicks on the OTP field to start typing it")
    public void user_clicks_on_the_otp_field_to_start_typing_it()
    {
        otpField.click();
    }

    @And("^user enters OTP as \"(.*)\"$")
    public void user_enters_OTP_as(String OTP) throws IOException {
        util.enterAmountBaseOnGivenStringAmount(OTP);
        if (get("TESTING_PLATFORM").equals("IOS")) {
            keyDone.click();
        }
    }

    @And("user clicks on jameya dots menu")
    public void user_clicks_on_jameya_dots_menu()
    {
        jameyaDotsMenu.click();
    }

    @Then("user clicks on delete jameya tab")
    public void user_clicks_on_delete_jameya_tab()
    {
        deleteJameya.click();
    }

    @And("user clicks on continue button to delete jameya")
    public void user_clicks_on_continue_button_to_delete_jameya()
    {
    continueDelete.click();
    }


}
