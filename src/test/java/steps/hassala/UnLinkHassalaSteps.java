package steps.hassala;

import elements.hassala.*;
import elements.jameya.CreateJameyaElements;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.Hooks;
import util.Util;

import java.io.IOException;

import static elements.hassala.LinkElements.*;
import static elements.jameya.CreateJameyaElements.itemPicker;
import static elements.login.LoginElements.keyDone;
import static util.GeneralUtil.get;
import static util.Util.hold;

public class UnLinkHassalaSteps {

    AppiumDriver driver = Hooks.driver;
    CreateElements createElements = new CreateElements(driver);
    TopUpElements topupElements = new TopUpElements(driver);
    WithdrawElements withdrawElements = new WithdrawElements(driver);
    BreakElements breakElements = new BreakElements(driver);
    LinkElements linkElements = new LinkElements(driver);
    CreateJameyaElements createJameyaElements = new CreateJameyaElements(driver);

    Util util = new Util(driver);


    @Given("user clicks on unlink with hassala kids tab")
    public void user_clicks_on_Unlink_with_hassala_kids_tab() {
        util.waitForElementToBeClickable(unlinkTab, 20);
        unlinkTab.click();
    }


    @When("user clicks on yes unlink button")
    public void userclicksonyesunlinkbutton() {
        yesUnlink.click();
    }




}
