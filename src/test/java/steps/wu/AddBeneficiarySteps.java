package steps.standingorder;

import elements.login.LoginElements;
import elements.standingorder.CreateSelfElements;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.login.LoginScreen;
import steps.Hooks;
import util.Util;

import static elements.login.LoginElements.keyDone;
import static elements.standingorder.CreateSelfElements.*;

public class AddBeneficiarySteps {

    AppiumDriver driver = Hooks.driver;
    LoginElements loginElements = new LoginElements(driver);
    Util util = new Util(driver);
    LoginScreen loginScreen = new LoginScreen();
    CreateSelfElements createSelfElements = new CreateSelfElements(driver);


    @And("user scrolls down to wu icon")
    public void user_Scrolls_Down_To_transfer_money_Icon() {
        util.swipeUntilElementIsDisplayed(wuIcon, 20, 550, 20, 350, 2);
    }

    @And("user clicks on wu icon")
    public void user_Clicks_On_Transfer_Money_Icon() {
        wuIcon.click();
    }



}
