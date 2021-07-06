package elements.hassala;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LinkElements {
    private AppiumDriver driver;


    @iOSXCUITFindBy(accessibility = "Link with Hassala Kids")
    public static WebElement linkHassalaTab;

    @iOSXCUITFindBy(accessibility = "Unlink from Hassala kids")
    public static WebElement unlinkTab;

    @iOSXCUITFindBy(accessibility = "Yes, Unlink")
    public static WebElement yesUnlink;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Yes, Link now']")
    public static WebElement linkNow;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Accept']")
    public static WebElement acceptTerms;


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Enter Civil-ID']")
    public static WebElement CIDField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Next']")
    public static WebElement linkingNext;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Enter Kid’s Name']")
    public static WebElement kidNameField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Select Gender']")
    public static WebElement kidGenderList;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Select Relationship']")
    public static WebElement relationList;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Enter PIN Code']")
    public static WebElement pinCodeField;



    public LinkElements(AppiumDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
}
