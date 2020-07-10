package steps;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.testng.annotations.BeforeTest;
import util.Capabilities;

import java.io.IOException;
import java.util.List;

import static util.GeneralUtil.*;

public class Hooks {
    public static AppiumDriver driver;

public static String scenarioName;
    @Before
    public void setup(io.cucumber.java.Scenario scenario) throws IOException {
        //scenarioName=scenario.getName();
        appiumService();
        Service.start();

            if (get("TESTING_PLATFORM").equals("IOS"))
            {
                Capabilities.getIOSCapabilities();
                driver = Capabilities.getIOSDriver();
            } else if (get("TESTING_PLATFORM").equals("Android"))
            {
                Capabilities.getAndroidCapabilities();
                driver=Capabilities.getAndroidDriver();
            }

    }
    @After
    public void tearDown() {

        //driver.closeApp();
        //driver.quit();
       Service.stop();
    }
    @BeforeStep
        public void getScenarioName(io.cucumber.java.Scenario scenario){
       scenarioName=scenario.getName();
    }
}
