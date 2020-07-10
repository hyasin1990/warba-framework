package steps.hassala;

import elements.hassala.BreakElements;
import elements.hassala.CreateElements;
import elements.hassala.TopUpElements;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import steps.Hooks;
import util.Util;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static elements.hassala.CreateElements.*;
import static elements.login.LoginElements.*;
import static util.GeneralUtil.get;
import static util.Util.hold;

public class CreateSteps {
    AppiumDriver driver = Hooks.driver;
    CreateElements createElements = new CreateElements(driver);
    TopUpElements topElements = new TopUpElements(driver);
    BreakElements breakElements = new BreakElements(driver);
    Util util = new Util(driver);

    @Given("user scrolls down to Hassalaty section")
    public void user_Scrolls_Down_To_Hassalaty_Section() throws IOException {

        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.swipeUntilElementIsDisplayed(termTitleTxt, 20, 550, 20, 340, 2); // changed to 340 previously was 350
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            util.andrScrollUntilTextIsDisplayed("My Term Deposits");
        }


    }

    @When("user clicks on view all link")
    public void user_Clicks_On_Viewall_Link() {
        util.clickingOnViewAllDependingLocation(viewAll);
    }

    @And("user clicks on create button to create hassala")
    public void user_Clicks_On_Create_Button() {
        util.waitForElementToBeClickable(createHssala, 40);
        createHssala.click();
    }

    @And("user skips the tutorial if it displays")
    public void userSkipsTheTutorialIfItDisplays() throws IOException {
        if (get("NO_RESET").equals("false") && get("TESTING_PLATFORM").equals("IOS")) {
            hssalaTutSkip.click();
            hssalaGetStarted.click();
        }
        if (get("NO_RESET").equals("false") && get("TESTING_PLATFORM").equals("Android")) {
            hssalaTutSkip.click();

        }
    }

    @And("user clicks on saving option link")
    public void user_clicks_on_saving_option_link() {
        savingOptionLink.click();
    }

    @And("^user selects goal category as \"(.*)\"$")
    public void userSelectsGoalCategory(String category) {
        switch (category) {
            case "House":
                goalCategoryHouse.click();
                break;
            case "My kids":
                goalCategoryKids.click();
                break;
            case "Car":
                goalCategoryCar.click();
                break;
            case "Travel":
                goalCategoryTravel.click();
                break;
            case "Charity":
                goalCategoryCharity.click();
                break;
            case "Health":
                goalCategoryHealth.click();
                break;
            case "Shopping":
                goalCategoryShopping.click();
                break;
            case "Gift":
                goalCategoryGift.click();
                break;
            case "Entertainment":
                goalCategoryEntertainment.click();
                break;
            case "Education":
                goalCategoryEducation.click();
                break;
            case "Jewellery":
                goalCategoryJewellery.click();
                break;
            case "Other":
                goalCategoryOther.click();
                break;
        }

    }

    @And("^user enters hassala name as \"(.*)\"$")
    public void userEntersHassalaNameAs(String hassalaName) throws IOException {
        hssalaNameTxt.sendKeys(hassalaName);
        if (get("TESTING_PLATFORM").equals("Android")) {
            util.andrClickEnter();
        } else if (get("TESTING_PLATFORM").equals("IOS")) {
            keyDone.click();
        }
    }

    @And("user clicks on choose from camera roll")
    public void user_Clicks_On_Choose_From_CameraRoll() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            chooseFromCamera.click();
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            andrSkipPhoto.click();
        }
    }

    @And("user allows access permission if displayed")
    public void user_Allows_Access_Permission() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")&&get("NO_RESET").equals("false")) {
            allowPhAccess.click();
        } else
        {
            util.clickOnElementIfDisplayed(allowPhAccess);

        }
    }

    @And("user clicks on all photos tab from photos gallery")
    public void user_Clicks_On_All_Photos_Tab_From_Photos_Gallery() throws IOException, InterruptedException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            hold(30);
            allPhotos.click();
        }
    }

    @And("user selects any photo to replace the current")
    public void user_Selects_Any_Photo_To_Replace_The_Current() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            editPhoto.click();
        }
    }

    @And("user selects any photo")
    public void user_Selects_Any_Photo() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            createPhoto.click();
        }

    }

    @Then("clicks on choose to confirm it")
    public void clicks_On_Choose_To_Confirm_It() throws IOException, InterruptedException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            confPhoto.click();
            hold(30);
        }
    }

    @When("user clicks on the amount field to start typing")
    public void user_Clicks_On_The_Amount_Field_To_Start_Typing() {
        amountTxt.click();
    }

    @And("^user enters the amount as \"(.*)\"$")
    public void user_Enters_The_Amount(String amount) throws InterruptedException, IOException {
       util.enterAmountBaseOnGivenStringAmount(amount);
        if (get("TESTING_PLATFORM").equals("IOS")) {
            keyDone.click();
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            util.andrClickEnter();
        }
        hold(1);
    }

    @And("^User selects goal end date as \"(.*)\" of \"(.*)\" , \"(.*)\"$")
    public void user_Selects_Goal_End_Date_As(String day, String month, String year) throws InterruptedException, IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.selectDateBasedOnUserSelection(day, month, year, datePicker);
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            driver.hideKeyboard();
            andrPickerArrow.click();

            // Below are temporary and will be removed and function activated once developer let the picker return values
          //  util.swipeByCoordinates(200, 1700, 200, 1268,1);
         //   util.swipeByCoordinates(462, 1700, 462, 1608,1);
         //   util.swipeByCoordinates(880, 1700, 880, 1560,1);

            //util.andrSelectGoalDate(day,month,year,hssalaAndrDatePicker);
        }
        keyDone.click();

    }

    @And("user clicks on confirm button")
    public void user_Clicks_On_Confirm_button() {
        confirmBtn.click();
    }

    @Then("user gets redirected to terms and conditions")
    public void user_Gets_Redirected_To_Terms_And_Conditions() {
        System.out.println("Terms screen is shown");
    }

    @Given("user scrolls down until accept button displays")
    public void user_scrolls_down_until_accept_button_displays() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            util.swipeUntilElementIsDisplayed(acceptTermsBtn, 19, 650, 18, 100, 2);
            //util.swipeByCoordinates(19, 650, 18, 100, 2);


        }
    }


    @When("user accepts the terms")
    public void user_Accepts_The_Terms() {
        acceptTermsBtn.click();
    }

    @Then("user gets redirected to congratulations screen")
    public void user_Gets_Redirected_To_Congratulations_Screen() {
        util.waitForElementToBeVisible(screenDone, 40);
        Assert.assertEquals(congraTxt.getText(), "Congratulations");
    }

    @When("user clicks on done")
    public void user_Clicks_On_Done() {
        util.waitForElementToBeClickable(screenDone, 40);
        screenDone.click();
    }

    @Then("user clicks on close to get redirected to all hassala screen")
    public void user_Gets_Redirected_To_All_Hassala_Screen() {
        screenClose.click();
    }

    @And("user clicks on back to navigate back to home screen")
    public void user_Clicks_On_Back_To_Navigate_Back_To_Home_Screen() throws IOException {
        util.waitForElementToBeClickable(screenBack, 40);
        screenBack.click();
        if (get("TESTING_PLATFORM").equals("Android"))
        {
            util.waitForElementToBeClickable(screenBack,20);
            screenBack.click();
        }
    }

}
