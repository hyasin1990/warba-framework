package elements.hassala;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WithdrawElements {

    private AppiumDriver driver;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Withdraw']")
    @iOSXCUITFindBy(accessibility = "Withdraw")
    public static WebElement withdrawIcon;

    @AndroidFindBy(className = "android.widget.CheckBox")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='I have a personal emergency']")
    public static WebElement withdrawReason;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/btnConfirm")
    public static WebElement continueBtn;



    public WithdrawElements(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
