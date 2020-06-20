package screens.login;

import elements.login.LoginElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import steps.Hooks;
import util.Util;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import static util.GeneralUtil.get;

import static elements.login.LoginElements.*;

public class LoginScreen {

    AppiumDriver driver = Hooks.driver;
    LoginElements loginElements = new LoginElements(driver);
    Util util = new Util(driver);


    public void user_Swipes_Under_GetStarted_Screen() throws IOException {
        if (get("TESTING_PLATFORM").equals("IOS")) {
            util.swipeOnElement(getStartedTut1, "left");
            util.swipeOnElement(getStartedTut2, "left");

        } else if(get("TESTING_PLATFORM").equals("Android"))  {
            util.swipeByCoordinates(900, util.generateY(getStartedTut1), 0, util.generateY(getStartedTut1), 1);
            util.swipeByCoordinates(900, util.generateY(getStartedTut1), 0, util.generateY(getStartedTut1), 1);
        }
        getStartedBtn.click();
    }


}
