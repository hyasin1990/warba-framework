package steps.hassala;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import elements.hassala.*;
import elements.login.LoginElements;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import steps.Hooks;
import util.Util;

import java.io.IOException;

import static elements.hassala.ManageElements.*;
import static elements.login.LoginElements.keyDone;
import static util.GeneralUtil.get;

public class AddAutomatedSteps {

    AppiumDriver driver = Hooks.driver;
    CreateElements createElements = new CreateElements(driver);
    TopUpElements topupElements = new TopUpElements(driver);
    WithdrawElements withdrawElements = new WithdrawElements(driver);
    BreakElements breakElements = new BreakElements(driver);
    ManageElements manageElements = new ManageElements(driver);
    Util util = new Util(driver);

    @Given("user clicks on add method link for automated transfer funding method")
    public void user_clicks_on_add_method_link_for_automated_transfer_funding_method() {
        addMethods.get(1).click();
    }


    @And("^user selects transfer frequency as \"(.*)\"$")
    public void userSelectsTransferFrequencyAs(String frequency) {
        util.selectFrequency(frequency, weeklyTransfer, monthlyTransfer);
    }

    @And("user clears the suggested amount")
    public void user_Clears_TheSuggested_Amount() throws IOException, InterruptedException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            //transferAmount.clear();

        } else if (get("TESTING_PLATFORM").equals("Android")) {
            pickerArrow.click();
            doneBtn.click();
            transferAmount.clear();
        }
    }
}
