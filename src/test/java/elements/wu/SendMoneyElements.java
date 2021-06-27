package elements.wu;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.FixMethodOrder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SendMoneyElements {

    private AppiumDriver driver;
    public SendMoneyElements(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @iOSXCUITFindBy(className = "XCUIElementTypeTextField")
    public static WebElement searchBeneficiary;

    @iOSXCUITFindBy(accessibility = "dots")
    public static WebElement dotsMenu;


    @iOSXCUITFindBy(accessibility = "Send Money")
    public static WebElement sendMoneyTab;

    @iOSXCUITFindBy(accessibility = "Protect Yourself From Fraud")
    public static WebElement fraudScreen;

    @iOSXCUITFindBy(accessibility = "Accept And Continue")
    public static WebElement acceptFraud;


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Transferred Amount']")
    public static WebElement transferredField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Calculate']")
    public static WebElement calculateButton;

    @iOSXCUITFindBy(accessibility = "Send Money")
    public static WebElement sendMoneyButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Type your password']")
    public static WebElement sendPassword;

    @iOSXCUITFindBy(accessibility = "Verify")
    public static WebElement verifyButton;

    @iOSXCUITFindBy(accessibility = "Privacy Statement")
    public static WebElement privacy;








}
