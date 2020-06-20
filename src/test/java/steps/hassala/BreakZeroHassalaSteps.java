package steps.hassala;

import elements.hassala.BreakElements;
import elements.hassala.CreateElements;
import elements.hassala.TopUpElements;
import elements.hassala.WithdrawElements;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import steps.Hooks;
import util.Util;

import java.io.IOException;
import java.util.List;

import static elements.hassala.BreakElements.*;
import static elements.hassala.TopUpElements.*;
import static util.GeneralUtil.get;

public class BreakZeroHassalaSteps {

    AppiumDriver driver = Hooks.driver;
    CreateElements createElements = new CreateElements(driver);
    TopUpElements topupElements = new TopUpElements(driver);
    WithdrawElements withdrawElements = new WithdrawElements(driver);
    BreakElements breakElements = new BreakElements(driver);
    Util util = new Util(driver);

    @When("user selects any created hassala with zero amount")
    public void user_selects_any_created_hassala_with_zero_amount() throws IOException {
//        util.swipeByCoordinates(700,util.generateY(sec),0,util.generateY(sec),2);
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.selectZeroHassala(anyHassala, zeroHassala, hssalaValues);
            // Note: In case this TC fails just add the below click inside try to click if displayed
            util.clickOnElementIfDisplayed(zeroHassala);
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            util.selectZeroHassala(anyHassala, zeroHassala, hssalaValues);
            util.clickOnElementIfDisplayed(zeroHassala);
        }

    }

    @And("user confirms close hassala action")
    public void user_Confirms_Close_Hassala_Action() {
        util.waitForElementToBeClickable(closeHssala, 40);
        closeHssala.click();
    }
}
