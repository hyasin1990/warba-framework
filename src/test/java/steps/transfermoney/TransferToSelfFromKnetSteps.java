package steps.transfermoney;

import elements.hassala.ManageElements;
import elements.login.LoginElements;
import elements.standingorder.CreateSelfElements;
import elements.transfermoney.TransferMoneyElements;
import elements.wu.AddBeneficiaryElements;
import elements.wu.SendMoneyElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import steps.Hooks;
import util.Util;

import java.io.IOException;

import static elements.login.LoginElements.keyDone;
import static elements.transfermoney.TransferMoneyElements.*;
import static elements.wu.SendMoneyElements.*;

public class TransferToSelfFromKnetSteps {

    AppiumDriver driver = Hooks.driver;
    LoginElements loginElements = new LoginElements(driver);
    Util util = new Util(driver);
    CreateSelfElements createSelfElements = new CreateSelfElements(driver);
    AddBeneficiaryElements addBeneficiaryElements = new AddBeneficiaryElements(driver);
    ManageElements manageElements = new ManageElements(driver);
    SendMoneyElements sendMoneyElements = new SendMoneyElements(driver);
    TransferMoneyElements transferMoneyElements = new TransferMoneyElements(driver);



    @When("user clicks on transfer money Icon")
    public void userClicksOnTransferMoneyIcon() {

       transferMoney.click();
    }



    @Then("user selects my self beneficiary")
    public void userSelectsMySelfBeneficiary() {
        mySelfBeneficiary.click();
    }

    @And("user selects knet as an account from")
    public void userSelectsKnetAsAnAccountFrom() {
        KnetCard.click();
    }

    @When("^user fills in an amount to transfer as \"(.*)\"$")
    public void userFillsInAnAmountToTransfer(String amount) throws IOException {
        util.enterAmountBaseOnGivenStringAmount(amount);
        keyDone.click();

    }

    @And("^user fills in optional description as \"(.*)\"$")
    public void userFillsInOptionalDescriptionAs(String description) {
        optionalDescriptionField.sendKeys(description);
        keyDone.click();
    }

    @Then("user clicks transfer button")
    public void userClicksTransferButton() {
        util.waitForElementToBeClickable(transferButton,20);
        transferButton.click();
    }

    @When("user invokes banks list")
    public void userInvokesBanksList() {
        banksList.click();
    }


    @And("^user fills in card number as \"(.*)\"$")
    public void userFillsInCardNumberAs(String cardNo) {
        cardNoField.sendKeys(cardNo);
    }

    @And("user invokes expiration month list")
    public void userInvokesExpirationMonthList() {
        expirationMonthsList.click();
    }

    @And("user invokes expiration year list")
    public void userInvokesExpirationYearList() {
        expirationYearList.click();
    }

    @And("^user fills in pin as \"(.*)\"$")
    public void userFillsInPinAs(String pin) {
     pinField.sendKeys(pin);
    }

    @Then("user clicks on submit button")
    public void userClicksOnSubmitButton() {
        knetSubmit.click();
    }

    @And("user clicks on confirm button of knet")
    public void userClicksOnConfirmButtonOfKnet() {
        knetConfirm.click();
    }

    @Then("user gets redirected to transfer successful screen")
    public void userGetsRedirectedToTransferSuccessfulScreen() {
     Assert.assertTrue(transferSucessfulScreen.isDisplayed());
    }

    @And("user clicks on X icon")
    public void userClicksOnXIcon() {
        xIcon.click();
    }
}
