package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static util.GeneralUtil.get;

public class Capabilities {
    private static AppiumDriver driver;
    private static DesiredCapabilities capabilities = new DesiredCapabilities();

    public static void getIOSCapabilities() throws IOException {
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, get("IOS_DEVICE_NAME"));
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, get("IOS_PLATFORM_NAME"));
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, get("IOS_AUTOMATION_NAME"));
        capabilities.setCapability(MobileCapabilityType.APP, get("IOS_APP_PATH"));
        capabilities.setCapability(MobileCapabilityType.NO_RESET, get("NO_RESET"));
    }

    public static AppiumDriver getIOSDriver() throws IOException {
        driver = new IOSDriver<>(new URL(get("IOS_URL")), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public static void getAndroidCapabilities() throws IOException {
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, get("ANDROID_DEVICE_NAME"));
        capabilities.setCapability("avd",get("ANDROID_EMULATOR_TYPE"));
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, get("ANDROID_AUTOMATION_NAME"));
        capabilities.setCapability(MobileCapabilityType.APP, get("ANDROID_APP_PATH"));
        capabilities.setCapability(MobileCapabilityType.NO_RESET,get("NO_RESET"));
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,get("ANDROID_PLATFORM_NAME"));
    }

    public static AppiumDriver getAndroidDriver() throws IOException {
        driver = new AndroidDriver(new URL(get("ANDROID_URL")), capabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }


}
