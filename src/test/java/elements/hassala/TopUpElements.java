package elements.hassala;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.List;

public class TopUpElements {
    private AppiumDriver driver;

    public TopUpElements(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public static String savedAmount;
    public static double doubleInitAmount = 0.0;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/tvSunbulaChances")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='0x chances!']")
    public static WebElement chancHassala;

    @AndroidFindBy(xpath = "//android.widget.TextView")
    @iOSXCUITFindBy(className = "XCUIElementTypeStaticText")
    public static List<WebElement> hssalaValues;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Top Up']")
    @iOSXCUITFindBy(accessibility = "Top Up")
    public static WebElement topupIcon;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/accountCurrency")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='KWD']")
    public static WebElement kwdAccount;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter transfer amount']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Enter transfer amount']")
    public static WebElement topupAmountTxt;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Private description (optional)']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Private description (optional)']")
    public static WebElement descTxt;


    @AndroidFindBy(id = "com.safat.warbaib.uat:id/tvTitle")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Success']")
    public static WebElement successTxt;




}
