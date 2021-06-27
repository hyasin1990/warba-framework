package steps.wu;

import elements.hassala.ManageElements;
import elements.login.LoginElements;
import elements.standingorder.CreateSelfElements;
import elements.wu.AddBeneficiaryElements;
import elements.wu.SendMoneyElements;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import steps.Hooks;
import util.Util;

import java.util.List;
import java.util.WeakHashMap;

import static elements.login.LoginElements.keyDone;
import static elements.wu.SendMoneyElements.*;

public class SendMoneySteps {

    AppiumDriver driver = Hooks.driver;
    LoginElements loginElements = new LoginElements(driver);
    Util util = new Util(driver);
    CreateSelfElements createSelfElements = new CreateSelfElements(driver);
    AddBeneficiaryElements addBeneficiaryElements = new AddBeneficiaryElements(driver);
    ManageElements manageElements = new ManageElements(driver);
    SendMoneyElements sendMoneyElements = new SendMoneyElements(driver);

    @And("^user searches for beneficiary \"(.*)\" to start sending money$")
    public void user_searches_for_beneficiary_to_start_sending_money(String beneficiaryName)
    {
        searchBeneficiary.sendKeys(beneficiaryName);

    }

    @Then("user invokes menu")
    public void userInvokesMenu() {
        dotsMenu.click();
    }

    @And("user clicks on send money tab")
    public void userClicksOnSendMoneyTab() {
        sendMoneyTab.click();
    }

    @When("fraud screen displays")
    public void fraudScreenDisplays() {
        util.waitForElementToBeVisible(fraudScreen,10);
        Assert.assertTrue(fraudScreen.isDisplayed());
    }

    @Then("user accepts the fraud disclaimer")
    public void userAcceptsTheFraudDisclaimer() {
        acceptFraud.click();
    }

    @Then("user clicks in transferred amount field")
    public void userClicksInTransferredAmountField() {
        transferredField.click();
    }

    @And("user clicks on calculate button")
    public void userClicksOnCalculateButton() {
      calculateButton.click();
    }

    @Then("user checks the terms and conditions")
    public void userChecksTheTermsAndConditions() {
        util.waitForElementToBeClickable(privacy,20);
//        List<WebElement> list = driver.findElementsByClassName("XCUIElementTypeOther");
//        for (int i=0;i<list.size();i++)
//        {
//            System.out.println(list.get(i).getAttribute("value"));
//        }
        util.swipeByCoordinates(29,294,29,294,1);

    }

    @And("user clicks on send money button")
    public void userClicksOnSendMoneyButton() {
        util.waitForElementToBeClickable(sendMoneyButton,10);
        sendMoneyButton.click();
    }

    @And("^user enters his password to send money as \"(.*)\"$")
    public void user_enters_his_password_to_send_money_as(String password)
    {
        sendPassword.sendKeys(password);
        keyDone.click();
    }


    @Then("user clicks on verify button")
    public void userClicksOnVerifyButton() {
        util.waitForElementToBeClickable(verifyButton,10);
        verifyButton.click();
    }
}
