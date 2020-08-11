package steps.jameya;

import elements.hassala.CreateElements;
import elements.jameya.CreateJameyaElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bson.io.BsonOutput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import steps.Hooks;
import util.Util;

import static elements.hassala.ManageElements.continueBtn;
import static util.GeneralUtil.get;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static elements.hassala.CreateElements.screenBack;
import static elements.jameya.CreateJameyaElements.*;
import static elements.login.LoginElements.*;
import static util.Util.hold;

public class CreateJameyaSteps {
    AppiumDriver driver = Hooks.driver;
    Util util = new Util(driver);
    CreateJameyaElements createJameyaElements = new CreateJameyaElements(driver);
    CreateElements createElements = new CreateElements(driver);

    //jamuser29 and jamuser31
    @Given("user clicks on my social circle tab")
    public void user_clicks_on_my_social_circle_tab() {
        util.waitForElementToBeClickable(socialCircleTab, 60);
        socialCircleTab.click();
    }


    @When("user clicks on show link")
    public void user_Clicks_On_Show_Link() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.waitForElementToBeClickable(showLink, 60);
            showLink.click();
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            util.swipeByCoordinates(780, 1500, 780, 1000, 2);
            util.swipeByCoordinates(780, 1500, 780, 740, 2);
        }
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
    public void user_Scrolls_Under_Terms_And_Conditions_Screen() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.swipeUntilElementIsDisplayed(acceptBtn, 366, 720, 366, 350, 2);
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            for (int i = 0; i < 10; i++) {
                util.swipeByCoordinates(900, 1270, 900, 30, 2);
            }
        }

    }

    @And("user accepts terms and conditions")
    public void user_Accepts_Terms_And_Conditions() throws IOException {
        acceptBtn.click();
    }

    @Then("create jameya screen displays")
    public void create_Jameya_Screen_Displays() {
        Assert.assertTrue(step1Title.isDisplayed());
    }

    @When("^user enters a name for jameya as \"(.*)\"$")
    public void user_Enters_A_Name_For_jameya_As(String JameyaName) throws IOException {
        jameyaNameTxt.sendKeys(JameyaName);
        if (get("TESTING_PLATFORM").equals("IOS")) {
            keyDone.click();
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            util.andrClickEnter();
        }

    }

    @And("^user selects a purpose of the jameya as \"(.*)\"$")
    public void user_Selects_A_Purpose_Of_The_Jameya_As(String purpose) throws InterruptedException, IOException {
//         List<WebElement> elements = driver.findElements(By.xpath("//XCUIElementTypeTextField"));
//         for (int i=0;i<elements.size();i++)
//         {
//             System.out.println(elements.get(i).getAttribute("name"));
//         }

        // *** TRY TO INVOKE THE PREVIOUS LIST ONCE AGAIN AND CONFIRM IT THEN REOPEN THIS LIST
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.clickOnElementIfDisplayed(purposeList);
            util.selectPurpose(purpose);
            keyDone.click();
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            andrDone.click();
        }

    }

    @And("user clicks on upload a photo link")
    public void user_Clicks_On_Upload_A_Photo_Link() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.waitForElementToBeClickable(uploadPhotoLink, 10);
            uploadPhotoLink.click();
        }
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
    public void user_Selects_Two_Contacts() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.swipeUntilElementIsDisplayed(firstContact, 340, 725, 340, 350, 2);
            util.waitForElementToBeClickable(firstContact, 20);
            firstContact.click();
            util.waitForElementToBeClickable(screenBack, 10);
            util.swipeUntilElementIsDisplayed(secondContact, 340, 725, 340, 350, 2);
            util.waitForElementToBeClickable(secondContact, 30);
            secondContact.click();
        }
        if (get("TESTING_PLATFORM").equals("Android")) {
            firstContact.click();
            secondContact.click();
        }


    }

    @When("user clicks on done to submit selected contacts")
    public void user_Clicks_On_Done_To_Submit_Selected_Contacts() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            keyDone.click();
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            contactsDone.click();
        }
    }

    @And("user clicks on continue to confirm invitations")
    public void user_Clicks_On_Continue_To_Confirm_Invitations() {
        continueDiscBtn.click();
    }


    @And("user selects monthly amount")
    public void user_Selects_Monthly_Amount() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            monthlyAmountSlider.sendKeys("0.2");
        } else {
            WebElement slider = driver.findElement(By.id("com.safat.warbaib.uat:id/amountSeekbar"));
            int start = slider.getLocation().getX();
            int end = slider.getSize().getWidth();
            int y = slider.getLocation().getY();
            TouchAction action = new TouchAction(driver);
            //act.press(ElementOption.element(slider)).moveTo(ElementOption.element(slider,10,10)).release().perform();
            action.longPress(ElementOption.element(slider)).moveTo(ElementOption.element(slider, 1, 1)).release().perform();
        }
        //monthlyAmountSlider.sendKeys("0.0");

    }

    @Then("user clicks on continue button under jameya")
    public void user_Clicks_On_Continue_Button_under_jameya() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            continueBtn.click();
        } else {
            screenNext.click();
        }
    }

    @And("user clicks on day selector and confirm the first value")
    public void user_Clicks_On_Day_Selector_And_Confirm_The_First_Value() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            distributionMonth.click();
            keyDone.click();
        } else {
            andrDone.click();
        }
    }

    @When("user clicks on Choose dates link")
    public void user_Clicks_On_Choose_Dates_Link() {
        chooseDatesLink.click();
    }

    @And("user clicks on each available month to select participants")
    public void user_Clicks_On_Each_Available_Month_To_Select_Participant() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.selectParticipants();
        } else {
            util.andrSelectParticipants();
        }
    }

    @And("user confirms pay out day")
    public void user_Confirms_PayOut_Day() throws InterruptedException, IOException {
        if (get("TESTING_PLATFORM").equals("IOS"))
        {
            util.nextScroll(payoutPicker, 0);
            keyDone.click();
            hold(30);
        } else
        {
            andrPayoutPicker.click();
            andrDone.click();
        }
    }

    @When("user clicks on cancel to cancel jameya")
    public void user_clicks_on_cancel_to_cancel_jameya() {
        util.waitForElementToBeClickable(cancelJameya, 30);
        cancelJameya.click();
    }

    @And("user confirms the cancellation")
    public void user_confirms_the_cancellation() {
        confirmCancellationBtn.click();
    }

    @And("user selects the created jameya")
    public void user_selects_the_created_jameya() {
        util.waitForElementToBeClickable(anyJameya, 10);
        anyJameya.click();
    }


}
