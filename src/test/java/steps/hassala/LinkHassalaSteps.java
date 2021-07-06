package steps.hassala;

import elements.hassala.*;
import elements.jameya.CreateJameyaElements;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.codec.language.bm.Rule;
import org.openqa.selenium.WebElement;
import steps.Hooks;
import util.Util;

import java.io.IOException;

import static elements.hassala.LinkElements.*;
import static elements.hassala.ManageElements.secSaveAs;
import static elements.jameya.CreateJameyaElements.*;
import static elements.login.LoginElements.*;
import static util.GeneralUtil.get;
import static util.Util.hold;

public class LinkHassalaSteps {

    AppiumDriver driver = Hooks.driver;
    CreateElements createElements = new CreateElements(driver);
    TopUpElements topupElements = new TopUpElements(driver);
    WithdrawElements withdrawElements = new WithdrawElements(driver);
    BreakElements breakElements = new BreakElements(driver);
    LinkElements linkElements = new LinkElements(driver);
    CreateJameyaElements createJameyaElements = new CreateJameyaElements(driver);

    Util util = new Util(driver);


    @Given("user clicks on link with hassala kids tab")
    public void user_clicks_on_link_with_hassala_kids_tab() {
        util.waitForElementToBeClickable(linkHassalaTab, 20);
        linkHassalaTab.click();
    }


    @When("user clicks yes link now button")
    public void userClicksYesLinkNowButton() {
        linkNow.click();
    }

    @And("user scrolls down to accept terms and conditions")
    public void userScrollsDownToAcceptTermsAndConditions() {
        util.swipeUntilElementIsDisplayed(acceptTerms, 62, 500, 62, 162, 2);
        util.swipeUntilElementIsDisplayed(acceptTerms, 62, 700, 62, 362, 2);
        util.waitForElementToBeClickable(acceptTerms, 20);
        acceptTerms.click();

    }

    @Then("^user fills in new CID as \"(.*)\"$")
    public void userFillsInNewCIDAs(String cid) {
        CIDField.sendKeys(cid);


    }

    @And("^user clicks on next button to proceed with linking")
    public void userClicksOnNextButtonToProceedWithLinking() {
        util.waitForElementToBeClickable(linkingNext, 20);
        linkingNext.click();
    }


    @Then("^user fills in kid name as \"(.*)\"$")
    public void userFillsInKidNameAs(String kidName) {
        kidNameField.sendKeys(kidName);
    }

    @And("^user selects gender as \"(.*)\"$")
    public void userSelectsGenderAs(String gender) throws InterruptedException {
        kidGenderList.click();
        hold(400);
        util.selectItem(gender);
        System.out.println(itemPicker.get(0).getAttribute("value"));
        System.out.println(itemPicker.get(0).getAttribute("value"));


    }

    @And("^user selects a relationship as \"(.*)\"$")
    public void userSelectsARelationshipAs(String relation) {
        relationList.click();
        util.selectItem(relation);
    }

    @And("^user fills in pin code as \"(.*)\"$")
    public void userFillsInPinCodeAs(String pin) throws IOException {
        pinCodeField.click();
        util.enterAmountBaseOnGivenStringAmount(pin);
        if (get("TESTING_PLATFORM").equals("IOS")) {
            keyDone.click();
        }
    }
}
