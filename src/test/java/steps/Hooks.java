package steps;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.testng.annotations.BeforeTest;
import util.Capabilities;
import util.GeneralUtil;

import java.io.IOException;
import java.util.List;

import static util.GeneralUtil.*;

public class Hooks {
    public static AppiumDriver driver;

public static String scenarioName;
    public static String updatedScenarioName;
    GeneralUtil generalutil = new GeneralUtil();
   // Hooks hooks = new Hooks();
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
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed())
        {
            generalutil.getScreenshot(scenarioName);
            updatedScenarioName=scenarioName;
        }
        //driver.closeApp();
        //driver.quit();
       Service.stop();
    }
    @BeforeStep
        public void getScenarioName(io.cucumber.java.Scenario scenario){
       scenarioName=scenario.getName();
    }
}
