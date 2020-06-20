package steps.hassala;

import elements.hassala.*;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import steps.Hooks;
import util.Util;

import java.io.IOException;

import static elements.hassala.TransactionsElements.pullupSheet;
import static util.GeneralUtil.get;

public class TransactionsSteps {

    AppiumDriver driver = Hooks.driver;
    CreateElements createElements = new CreateElements(driver);
    TopUpElements topupElements = new TopUpElements(driver);
    WithdrawElements withdrawElements = new WithdrawElements(driver);
    BreakElements breakElements = new BreakElements(driver);
    ManageElements manageElements = new ManageElements(driver);
    TransactionsElements transactionsElements=new TransactionsElements(driver);
    Util util = new Util(driver);


    @And("user pulls up the transactions sheet")
    public void user_pulls_up_the_transactions_sheet() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            pullupSheet.click();
        } else if (get("TESTING_PLATFORM").equals("Android")) {
            util.swipeByCoordinates(util.generateX(pullupSheet),util.generateY(pullupSheet),util.generateX(pullupSheet),util.generateY(pullupSheet)-900,2);
        }
    }


    @Then("hassala transactions should display properly")
    public void hassala_Transactions_Should_Display_Properly() {

    }
}
