package elements.hassala;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BreakElements {
    private AppiumDriver driver;


    public static double savedInH;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Saved')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@value,'Saved')]")
    public static WebElement anyHassala;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Saved 0.000']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Saved 0.000']")
    public static WebElement zeroHassala;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/ivBreakhasala")
    @iOSXCUITFindBy(accessibility = "Break Hassala")
    public static WebElement breakTab;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(accessibility = "Withdraw")
    public static WebElement withdrawBtn;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Close\"]")
    public static WebElement closeHssala;

   @AndroidFindBy( id="com.safat.warbaib.uat:id/ivCoverImage")
   public static WebElement hssalatSection;



    public BreakElements(AppiumDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
}
