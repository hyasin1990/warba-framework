package steps.wu;

import elements.hassala.ManageElements;
import elements.login.LoginElements;
import elements.standingorder.CreateSelfElements;
import elements.wu.AddBeneficiaryElements;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import steps.Hooks;
import util.Util;

import java.io.IOException;
import java.util.List;

import static elements.login.LoginElements.keyDone;
import static elements.login.LoginElements.nextBtn;
import static elements.standingorder.CreateSelfElements.*;
import static elements.wu.AddBeneficiaryElements.*;
import static util.Util.hold;

public class AddBeneficiarySteps {

    AppiumDriver driver = Hooks.driver;
    LoginElements loginElements = new LoginElements(driver);
    Util util = new Util(driver);
    CreateSelfElements createSelfElements = new CreateSelfElements(driver);
    AddBeneficiaryElements addBeneficiaryElements = new AddBeneficiaryElements(driver);
    ManageElements manageElements = new ManageElements(driver);


    @And("user scrolls down to wu icon")
    public void user_Scrolls_Down_To_transfer_money_Icon() {
        util.swipeUntilElementIsDisplayed(wuIcon, 20, 550, 20, 350, 2);
    }

    @And("user clicks on wu icon")
    public void user_Clicks_On_Transfer_Money_Icon() {
        util.waitForElementToBeClickable(wuIcon, 30);
        wuIcon.click();
    }

    @And("user clicks on beneficiaries tab")
    public void user_clicks_on_beneficiaries_tab() {

        util.waitForElementToBeClickable(BeneficiariesTab, 40);
        BeneficiariesTab.click();
    }


    @When("user clicks on add new beneficiary button")
    public void user_Clicks_On_AddNewBeneficiary_Button() {
        //util.waitForElementToBeClickable(addNewBeneficiaryButton, 40);

        for (int i=0;i<10;i++)
        {
            try {
                if (addNewBeneficiaryButton.isDisplayed())
                {
                    System.out.println("it is displayed");
                    addNewBeneficiaryButton.click();
                    i =10;
                    System.out.println("Getting out the loop");
                }
                System.out.println("I value is "+ i);
            } catch (StaleElementReferenceException ignored)
            {
                System.out.println("Add Beneficiary Exception Is Caught");
                System.out.println("Iterating");
            }
        }
       // addNewBeneficiaryButton.click();
    }

    @And("^user fills in first name as \"(.*)\"$")
    public void user_Fills_In_First_Name_As(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    @And("^user fills in middle name as \"(.*)\"$")
    public void user_Fills_In_Middle_Name_As(String middleName) {
        middleNameField.sendKeys(middleName);
    }

    @And("^user fills in last name as \"(.*)\"$")
    public void user_Fills_In_Last_Name_As(String lastName) {
        lastNameField.sendKeys(lastName);
        keyDone.click();
    }

    @Then("user clicks on next button to proceed with conversation")
    public void user_clicks_on_next_button_to_proceed_with_conversation() {
        util.waitForElementToBeClickable(convNext, 30);
        convNext.click();
    }

    @Given("user clicks on select country link")
    public void user_Clicks_On_Select_Country_Link() {
        util.waitForElementToBeClickable(selectCountryLink, 5);
        selectCountryLink.click();
    }

    @And("user clicks in search field to search for country")
    public void When_user_clicks_in_search_field_to_search_for_country() {
        searchField.click();
    }

    @And("^user searches country as \"(.*)\"$")
    public void user_Searches_Country_As(String country) {
        searchField.sendKeys(country);
        keyDone.click();
    }

    @And("user selects the searched country")
    public void user_selects_the_searched_country() {

        searchedCountry.get(3).click();
    }

    @And("user clicks on select nationality link")
    public void user_Clicks_On_Select_Nationality_Link() {
        util.waitForElementToBeClickable(selectNationalityLink, 40);
        selectNationalityLink.click();
    }

    @Then("^user searches for nationality as \"(.*)\"$")
    public void user_Searches_Nationality_As(String nationality) {
        searchField.sendKeys(nationality);
        keyDone.click();
    }

    @And("^user clicks in description field and fills description as \"(.*)\"$")
    public void user_Clicks_In_Desciption_Field_And_Fills_Description_As(String description) {
        util.waitForElementToBeClickable(descriptionField, 30);
        descriptionField.click();
        descriptionField.sendKeys(description);
        keyDone.click();
    }

    @Then("user clicks on review button of add WU beneficiary")
    public void user_clicks_on_review_button_of_add_WU_beneficiary() {
        reviewWuAddBeneficiary.click();
    }


    @And("user clicks on add beneficiary button")
    public void user_Clicks_On_Add_Beneficiary_Button() throws InterruptedException {
        util.swipeByCoordinates(142,757,143,758,1);
       hold(300);
    }

    @Then("user gets redirected to otp screen")
    public void user_Gets_Redirected_To_Otp_Screen() {


    }

    @And("user clicks on the OTP field")
    public void user_clicks_on_the_OTP_field() {
//        x 105
//        y 296
        otpField.click();
        otpField.click();
}
    @And("^user fills in beneficiary OTP as \"(.*)\"$")
    public void user_fills_in_beneficiary_OTP(String OTP) throws IOException {
        util.enterAmountBaseOnGivenStringAmount(OTP);
    }

    @Then("user clicks on activate button")
    public void user_Clicks_On_Activate_Button() {
        util.waitForElementToBeClickable(activateButton, 30);
        activateButton.click();
    }
}
