package elements.hassala;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ViewAllElements {

    private AppiumDriver driver;
    public ViewAllElements(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Active')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Active\")]")
    public static WebElement activeTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Broken')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Broken\")]")
    public static WebElement brokenTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Achieved')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Achieved\")]")
    public static WebElement achievedTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Inactive')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Inactive\")]")
    public static WebElement inactiveTab;

}
