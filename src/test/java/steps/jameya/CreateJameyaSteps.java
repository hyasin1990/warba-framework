package steps.jameya;

import elements.jameya.CreateJameyaElements;
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

import static elements.jameya.CreateJameyaElements.*;
import static elements.login.LoginElements.*;

public class CreateJameyaSteps {
    AppiumDriver driver = Hooks.driver;
    Util util = new Util(driver);
    CreateJameyaElements createJameyaElements = new CreateJameyaElements(driver);

    //jamuser29 and jamuser31
    @Given("user clicks on my social circle tab")
    public void user_clicks_on_my_social_circle_tab() {
        socialCircleTab.click();
    }


    @When("user clicks on show link")
    public void user_Clicks_On_Show_Link() {
        util.waitForElementToBeClickable(showLink,60);
        showLink.click();
    }


    @And("user clicks on create a jameya link")
    public void user_Clicks_On_Create_Jameya_Link() {
        createJameyaLink.click();
    }

    @Then("user clicks on continue under disclaimer if displayed")
    public void user_Clicks_On_Continue_Under_Disclaimer_If_Displayed() {
        util.clickOnElementIfDisplayed(continueDiscBtn);
    }


    @When("user scrolls under terms and conditions screen")
    public void user_Scrolls_Under_Terms_And_Conditions_Screen() {
        util.swipeUntilElementIsDisplayed(acceptBtn, 366, 720, 366, 350, 2);
    }

    @And("user accepts terms and conditions")
    public void user_Accepts_Terms_And_Conditions() {
        acceptBtn.click();
    }

    @Then("create jameya screen displays")
    public void create_Jameya_Screen_Displays() {
        Assert.assertTrue(step1Title.isDisplayed());
    }

    @When("^user enters a name for jameya as \"(.*)\"$")
    public void user_Enters_A_Name_For_jameya_As(String JameyaName) {
        jameyaNameTxt.sendKeys(JameyaName);
        keyDone.click();
    }

    @And("^user selects a purpose of the jameya as \"(.*)\"$")
    public void user_Selects_A_Purpose_Of_The_Jameya_As(String purpose) {
        util.selectPurpose(purpose);
        keyDone.click();
    }

    @And("user clicks on upload a photo link")
    public void user_Clicks_On_Upload_A_Photo_Link() {
        util.waitForElementToBeClickable(uploadPhotoLink,20);
        uploadPhotoLink.click();
    }


    @And("user clicks on next button of jameya screen")
    public void user_Clicks_On_Next_Button_Of_Jameya_Screen() {
        screenNext.click();
    }

    @Then("user gets redirected to step two of creating Jameya")
    public void user_Gets_Redirected_To_Step_two_Of_Creating_Jameya() {
        Assert.assertTrue(step2Title.isDisplayed());
    }

    @When("user clicks on add participants link")
    public void user_Clicks_On_Add_Participants_Link() {
        addParticiLink.click();
    }

    @Then("user selects two contacts")
    public void user_Selects_Two_Contacts() {
        util.swipeUntilElementIsDisplayed(firstContact, 340, 725, 340, 350, 2);
        util.waitForElementToBeClickable(firstContact,20);
        firstContact.click();

        util.swipeUntilElementIsDisplayed(secondContact, 340, 725, 340, 350, 2);
        util.waitForElementToBeClickable(secondContact,30);
        secondContact.click();
    }

    @When("user clicks on done to submit selected contacts")
    public void user_Clicks_On_Done_To_Submit_Selected_Contacts() {
        keyDone.click();
    }

    @And("user clicks on continue to confirm invitations")
    public void user_Clicks_On_Continue_To_Confirm_Invitations() {
        continueDiscBtn.click();
    }


    @And("user selects monthly amount")
    public void user_Selects_Monthly_Amount() {
        monthlyAmountSlider.sendKeys("0.2");
        //monthlyAmountSlider.sendKeys("0.0");

    }

    @And("user clicks on day selector and confirm the first value")
    public void user_Clicks_On_Day_Selector_And_Confirm_The_First_Value() {
        distributionMonth.click();
        keyDone.click();
    }

    @When("user clicks on Choose dates link")
    public void user_Clicks_On_Choose_Dates_Link() {
        chooseDatesLink.click();
    }

    @And("user clicks on each available month to select participants")
    public void user_Clicks_On_Each_Available_Month_To_Select_Participant() {
            util.selectParticipants();

    }

    @And("user confirms pay out day")
    public void user_Confirms_PayOut_Day() {
        keyDone.click();
    }

    @When("user clicks on cancel to cancel jameya")
    public void user_clicks_on_cancel_to_cancel_jameya()
    {
        util.waitForElementToBeClickable(cancelJameya,30);
        cancelJameya.click();
    }

    @And("user confirms the cancellation")
    public void user_confirms_the_cancellation()
    {
        confirmCancellationBtn.click();
    }

    @And("user selects the created jameya")
    public void user_selects_the_created_jameya()
    {
        anyJameya.click();
    }





}
