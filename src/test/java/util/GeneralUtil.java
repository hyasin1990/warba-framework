package util;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import static steps.Hooks.driver;

public class GeneralUtil {
    public static AppiumDriverLocalService Service;

    public static String get(String propertyName) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/AppProperties.properties");
        Properties prop = new Properties();
        prop.load(fileInputStream);
        return (prop.getProperty(propertyName));
    }

    public void getScreenshot(String s) throws IOException {

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM HH:mm ");
        Date date = new Date();
        File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrfile, new File(System.getProperty("user.dir") + "/src/test/ScreenShots/" + s+ " " + formatter.format(date)+ ".jpg"));
    }

    public static void appiumService()
    {
        Service = AppiumDriverLocalService.buildService(
                new AppiumServiceBuilder().usingDriverExecutable(new File("/usr/local/bin/node"))
                        .withAppiumJS(new File("/Applications/Appium.app/Contents/Resources/app/node_modules/appium/build/lib/main.js"))
                        .withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
                        .withLogFile(new File(System.getProperty("user.dir") + "/src/test/Logs/AppiumLogs.txt")));
    }

}


