package steps.hassala;

import elements.hassala.*;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import steps.Hooks;
import util.Util;


import java.io.IOException;

import static elements.hassala.CreateElements.*;
import static elements.hassala.ManageElements.*;
import static elements.login.LoginElements.*;
import static util.GeneralUtil.get;

public class ManageSteps {

    AppiumDriver driver = Hooks.driver;
    CreateElements createElements = new CreateElements(driver);
    TopUpElements topupElements = new TopUpElements(driver);
    WithdrawElements withdrawElements = new WithdrawElements(driver);
    BreakElements breakElements = new BreakElements(driver);
    ManageElements manageElements = new ManageElements(driver);
    Util util = new Util(driver);


    @When("user clicks on manage icon")
    public void user_clicks_on_manage_icon() {
        manageIcon.click();
    }

    @Given("user clicks on edit link")
    public void user_Clicks_On_Edit_Link() {
        editLink.click();
    }

    @When("user clears hassala name text field")
    public void user_Clears_Hassala_Name_Text_Field() {
        hssalaEditNameTxt.clear();
    }

    @Then("^user enters new hassala name as \"(.*)\"$")
    public void user_Enters_New_Hassala_Name(String name) throws IOException {
        hssalaEditNameTxt.sendKeys(name);
        if (get("TESTING_PLATFORM").equals("IOS"))
        {
            keyDone.click();

        }
    }

    @When("user clicks on goal category icon")
    public void user_Clicks_On_Goal_Category_Icon() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS"))
        {
            util.tabByCoordinates(30, 340);
        } else if (get("TESTING_PLATFORM").equals("Android"))
        {
            goalIcon.click();
        }
    }

    @When("user clicks on hassala image to change it")
    public void user_Clicks_On_Hassala_image() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS"))
        {
            System.out.println("WILL TAP");
            util.tabByCoordinates(186, 189);
            System.out.println("TAPPED");
        }
    }

    @And("user clicks on choose from camera roll to upload Hassala photo")
    public void user_Clicks_On_Choose_From_CameraRoll() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            chooseFromCamera.click();
        }
    }

    @And("user saves his changes")
    public void user_Saves_His_Changes() throws IOException {
        saveLink.click();
        if (get("TESTING_PLATFORM").equals("IOS"))
        {
            Assert.assertEquals(hssalaEditNameTxt.getText(),"Automated Edit");
        }else if (get("TESTING_PLATFORM").equals("Android"))
        {
            Assert.assertEquals(hssalaNameSaved.getText(),"Automated Edit");
        }

    }


    @When("user clicks on close button to close manage screen")
    public void user_Clicks_On_Close_Button_To_Close_Manage_Screen() throws IOException {
       if (get("TESTING_PLATFORM").equals("IOS")) {
            util.waitForElementToBeClickable(screenClose,30);
            screenClose.click();
        }

    }


}
