package steps.standingorder;

import elements.login.LoginElements;
import elements.standingorder.CreateSelfElements;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import netscape.javascript.JSUtil;
import org.openqa.selenium.WebElement;
import steps.Hooks;
import util.Util;


import static elements.login.LoginElements.datePicker;
import static elements.login.LoginElements.keyDone;
import static elements.standingorder.CreateSelfElements.*;

public class CreateStandingSteps {

    AppiumDriver driver = Hooks.driver;
    LoginElements loginElements = new LoginElements(driver);
    Util util = new Util(driver);
    CreateSelfElements createSelfElements = new CreateSelfElements(driver);


    @When("user clicks on services tab")
    public void When_user_clicks_on_services_() {
        util.waitForElementToBeClickable(servicesIcon, 30);
        servicesIcon.click();
    }

    @And("user scrolls down to Standing order icon")
    public void user_Scrolls_Down_To_Standing_Order_Icon() {
        util.swipeUntilElementIsDisplayed(standingIcon, 20, 550, 20, 350, 2);
    }

    @And("user clicks on standing order icon")
    public void user_Clicks_On_StandingOrder_Icon() {
        standingIcon.click();
    }

    @Then("user clicks on create transfer standing order tab")
    public void user_Clicks_On_Create_Transfer_StandingOrder_Tab() {
        createStandingTab.click();
    }

    @And("user selects my self")
    public void user_Selects_MySelf() {
        mySelfIcon.click();
    }

    @And("user clicks in how much you want to send field")
    public void user_Clicks_In_How_Much_You_Want_To_Send_Field() {
        standingAmount.click();
    }

    @And("^user selects standing order frequency as \"(.*)\"$")
    public void user_Selects_StandingOrder_Frequency_As(String frequency) {
        switch (frequency) {
            case "Daily":
                dailyStanding.click();
                break;
            case "Monthly":
                monthlyStanding.click();
                break;
            case "Yearly":
                yearlyStanding.click();
                break;
        }
    }

    @And("user clicks on start date selector")
    public void user_Clicks_On_Start_Date_Selector() {
        standingStartDate.click();
    }

    @And("^user selects date as \"(.*)\", \"(.*)\", \"(.*)\" and submits it$")
    public void user_Selects_Start_Date_As_And_Submits_It(int day, String month, int year) {
        util.selectStandingOrderDate(day,month,year);
    }

    @And("user clicks in number of transfers field")
    public void user_clicks_in_number_of_transfers_field() {
        util.waitForElementToBeClickable(numberOfTransfers, 60);
        numberOfTransfers.click();
    }

    @And("^user enters number of transfers as \"(.*)\"$")
    public void user_enters_number_of_transfers_as(int transfersNo) {

    }

    @And("user clicks on description field")
    public void user_Clicks_On_Description_Field() {
        standingDescription.click();
    }

    @And("^user enters description as \"(.*)\" and submits it$")
    public void user_Enters_Description_As_And_Submits_It(String description) {
        standingDescription.sendKeys(description);
        keyDone.click();
    }

    @Then("user hits create button")
    public void user_Hits_Create_Button() {
        createStandingButton.click();
    }
}
