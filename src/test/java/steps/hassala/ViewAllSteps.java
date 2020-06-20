package steps.hassala;

import elements.hassala.*;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import steps.Hooks;
import util.Util;

import static elements.hassala.ViewAllElements.*;

public class ViewAllSteps {

    AppiumDriver driver = Hooks.driver;
    CreateElements createElements = new CreateElements(driver);
    TopUpElements topupElements = new TopUpElements(driver);
    WithdrawElements withdrawElements = new WithdrawElements(driver);
    BreakElements breakElements = new BreakElements(driver);
    ManageElements manageElements = new ManageElements(driver);
    ViewAllElements viewAllElements= new ViewAllElements(driver);

    Util util = new Util(driver);

    @Then("user clicks on broken tab")
    public void user_clicks_on_broken_tab()
    {
        brokenTab.click();
    }

    @And("user clicks on achieved tab")
    public void user_Clicks_On_Achieved_Tab() {
        achievedTab.click();

    }


    @And("user clicks on inactive tab")
    public void user_Clicks_On_Inactive_Tab() {
        inactiveTab.click();
    }

    @And("user clicks on active tab once again")
    public void user_Clicks_On_Active_Tab_Once_Again() {
        activeTab.click();
    }
}
