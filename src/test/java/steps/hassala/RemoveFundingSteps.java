package steps.hassala;

import elements.hassala.*;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import steps.Hooks;
import util.Util;

import java.io.IOException;

import static elements.hassala.ManageElements.*;
import static util.GeneralUtil.get;

public class RemoveFundingSteps {

    AppiumDriver driver = Hooks.driver;
    CreateElements createElements = new CreateElements(driver);
    TopUpElements topupElements = new TopUpElements(driver);
    WithdrawElements withdrawElements = new WithdrawElements(driver);
    BreakElements breakElements = new BreakElements(driver);
    ManageElements manageElements = new ManageElements(driver);
    Util util = new Util(driver);

    @Given("user swipes on Sweep funding method to delete it")
    public void user_swipes_on_Sweep_funding_method_to_delete_it() throws IOException {

        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.swipeOnElement(sweepRmv, "left");
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            util.swipeByCoordinates(util.generateX(sweepRmv) + 300, util.generateY(sweepRmv), util.generateX(sweepRmv), util.generateY(sweepRmv), 2);
        }
    }

    @When("user clicks on delete icon")
    public void user_clicks_on_delete_icon() {
        deleteIcon.click();
    }

    @When("user confirms the deletion")
    public void user_Confirms_The_Deletion() {
        confDelete.click();
    }

    @Then("user checks if Sweep funding method got deleted")
    public void user_checks_Sweep_Deletion() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.waitForElementToBeVisible(secSweep, 20);
            Assert.assertTrue(secSweep.getAttribute("name").equals("Sweep"));
        }


    }

    @Given("user swipes on Automated funding method to delete it")
    public void user_swipes_on_Automated_funding_method_to_delete_it() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.swipeOnElement(autoRmv, "left");
        } else if (get("TESTING_PLATFORM").equals("Android"))
        {
            util.swipeByCoordinates(util.generateX(autoRmv)+300,util.generateY(autoRmv),util.generateX(autoRmv),util.generateY(autoRmv),2);
        }
    }

    @Then("user checks if Automated funding method got deleted")
    public void user_Checks_If_Automated_Funding_Method_Got_Deleted() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.waitForElementToBeVisible(secAutomated, 20);
            Assert.assertTrue(secAutomated.getAttribute("name").equals("Automated Transfer"));
        }

    }

    @Given("user swipes on Save as you spend funding method to delete it")
    public void user_Swipes_On_Save_As_You_Spend_Funding_Method_To_Delete_It() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.swipeOnElement(SaveAsRmv, "left");
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            util.swipeByCoordinates(util.generateX(SaveAsRmv) + 150, util.generateY(SaveAsRmv), util.generateX(SaveAsRmv), util.generateY(SaveAsRmv), 1);
        }
    }

    @Then("user checks if Save as you spend funding method got deleted")
    public void user_Checks_If_Save_As_You_Spend_Funding_Method_Got_Deleted() {
        util.swipeUntilElementIsDisplayed(secKharda, 62, 568, 62, 252, 2);
        util.waitForElementToBeVisible(secSaveAs, 20);
        Assert.assertTrue(secSaveAs.getAttribute("name").equals("Save As You Spend"));
    }

    @Given("user swipes on Kharda funding method to delete it")
    public void user_Swipes_On_Kharda_Funding_MethodvTovDelete_It() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.swipeOnElement(saveKhaRmv, "left");
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            util.swipeByCoordinates(util.generateX(saveKhaRmv) + 300, util.generateY(saveKhaRmv), util.generateX(saveKhaRmv), util.generateY(saveKhaRmv), 2);
        }


    }

    @Then("user checks if Kharda funding method got deleted")
    public void user_Checks_If_Kharda_Funding_Method_Got_Deleted() throws IOException {

        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.swipeUntilElementIsDisplayed(secKharda, 62, 668, 62, 252, 2);
            util.waitForElementToBeVisible(secKharda, 20);
            Assert.assertTrue(secKharda.getAttribute("name").equals("Kharda"));
        }

    }
}
