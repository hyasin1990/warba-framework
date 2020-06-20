package steps.hassala;

import elements.hassala.BreakElements;
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

import static elements.hassala.BreakElements.*;
import static elements.login.LoginElements.termTitleTxt;

public class BreakSteps {

    AppiumDriver driver = Hooks.driver;
    CreateElements createElements = new CreateElements(driver);
    TopUpElements topupElements = new TopUpElements(driver);
    WithdrawElements withdrawElements = new WithdrawElements(driver);
    BreakElements breakElements = new BreakElements(driver);
    Util util = new Util(driver);


    @When("user clicks on Break Hassala tab")
    public void user_clicks_on_Break_Hassala_tab() {
        breakTab.click();
    }


    @And("user confirms break hassala action")
    public void user_Confirms_Break_Hassala_Action() {
        withdrawBtn.click();
    }

    @Then("user gets redirected to home screen")
    public void user_Gets_Redirected_To_Home_Screen() {
        util.waitForElementToBeVisible(termTitleTxt,30);
        Assert.assertTrue(termTitleTxt.isDisplayed());
    }


}
