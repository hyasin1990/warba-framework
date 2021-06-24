package steps.standingorder;

import elements.login.LoginElements;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.login.LoginScreen;
import steps.Hooks;
import util.Util;

public class createSteps {

    AppiumDriver driver = Hooks.driver;
    LoginElements loginElements = new LoginElements(driver);
    Util util = new Util(driver);
    LoginScreen loginScreen = new LoginScreen();

    @When("user clicks on services tab")
    public void When_user_clicks_on_services_()
    {

    }

    @And("user scrolls down to Standing order icon")
    public void user_Scrolls_Down_To_Standing_Order_Icon() {
    }

    @And("user clicks on standing order icon")
    public void user_Clicks_On_StandingOrder_Icon() {
    }

    @Then("user clicks on create transfer standing order tab")
    public void user_Clicks_On_Create_Transfer_StandingOrder_Tab() {
    }

    @And("user selects my self")
    public void user_Selects_MySelf() {
    }

    @And("user clicks in how much you want to send field")
    public void user_Clicks_In_How_Much_You_Want_To_Send_Field() {
    }

    @And("^user selects standing order frequency as \"(.*)\"$")
    public void userSelectsStandingOrderFrequencyAs(String arg0) {
    }

    @And("user clicks on start date selector")
    public void userClicksOnStartDateSelector() {
    }

    @And("user selects date as {string}, {string}, {string} and submits it")
    public void userSelectsDateAsAndSubmitsIt(String arg0, String arg1, String arg2) {
    }

    @And("user clicks on end date selector")
    public void userClicksOnEndDateSelector() {
    }

    @And("user clicks on description field")
    public void userClicksOnDescriptionField() {
    }

    @And("user enters description as {string} and submits it")
    public void userEntersDescriptionAsAndSubmitsIt(String arg0) {
    }

    @Then("user hits create button")
    public void userHitsCreateButton() {
    }
}
