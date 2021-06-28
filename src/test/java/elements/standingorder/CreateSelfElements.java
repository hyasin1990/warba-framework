package elements.standingorder;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CreateSelfElements {

    private AppiumDriver driver;
    public CreateSelfElements(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(accessibility = "Services")
    public static WebElement servicesIcon;

    @iOSXCUITFindBy(accessibility = "Standing Orders")
    public static WebElement standingIcon;



    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Create transfer Standing Orders']")
    public static WebElement createStandingTab;

    @iOSXCUITFindBy(accessibility = "Myself")
    public static WebElement mySelfIcon;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Input a transfer amount']")
    public static WebElement standingAmount;

    @iOSXCUITFindBy(accessibility = "Daily")
    public static WebElement dailyStanding;

    @iOSXCUITFindBy(accessibility = "Monthly")
    public static WebElement monthlyStanding;

    @iOSXCUITFindBy(accessibility = "Yearly")
    public static WebElement yearlyStanding;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Please specify start date']")
    public static WebElement standingStartDate;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Number of transfers']")
    public static WebElement numberOfTransfers;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='This is for your reference']")
    public static WebElement standingDescription;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Create']")
    public static WebElement createStandingButton;


}
