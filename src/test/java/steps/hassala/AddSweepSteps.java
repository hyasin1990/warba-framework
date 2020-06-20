package steps.hassala;

import elements.hassala.*;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import steps.Hooks;
import util.Util;

import java.io.IOException;

import static elements.hassala.ManageElements.*;
import static elements.login.LoginElements.*;
import static util.GeneralUtil.get;

public class AddSweepSteps {

    AppiumDriver driver = Hooks.driver;
    CreateElements createElements = new CreateElements(driver);
    TopUpElements topupElements = new TopUpElements(driver);
    WithdrawElements withdrawElements = new WithdrawElements(driver);
    BreakElements breakElements = new BreakElements(driver);
    ManageElements manageElements = new ManageElements(driver);
    Util util = new Util(driver);


    @Then("user start swiping to funding methods section")
    public void user_start_swiping_to_funding_methods_section() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS"))
        {
            util.swipeUntilElementIsDisplayed(secKharda,62,568,62,352,2);
        } else if (get("TESTING_PLATFORM").equals("Android"))
        {
            util.andrScrollUntilTextIsDisplayed("Kharda");
        }
    }

    @Given("user clicks on add method link for sweep funding method")
    public void user_Clicks_On_Add_Method_Link_For_Sweep_Funding_Method() {
        addMethods.get(0).click();
    }

    @And("user confirms the selection of any monthly transfer day")
    public void user_Confirms_The_Selection_Of_Any_Monthly_TransferDay() throws InterruptedException, IOException {
        if (get("TESTING_PLATFORM").equals("IOS"))
        {
            util.hold(50);
            keyDone.click();
        } else if (get("TESTING_PLATFORM").equals("Android"))
        {
            pickerArrow.click();
            doneBtn.click();
        }
    }

    @Then("user gets redirected to well done screen")
    public void user_Gets_Redirected_To_Well_Done_Screen() {
        util.waitForElementToBeVisible(wellDoneTxt,30);
        Assert.assertTrue(wellDoneTxt.isDisplayed());
    }
}
