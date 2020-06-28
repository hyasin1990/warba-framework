package elements.jameya;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateJameyaElements {

    private AppiumDriver driver;
    public CreateJameyaElements(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @iOSXCUITFindBy(accessibility = "My Social Circle")
    public static WebElement socialCircleTab;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Show\"])[3]")
    public static WebElement showLink;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Create a Jam3eya\"]")
    public static WebElement createJameyaLink;

    @iOSXCUITFindBy(xpath = "XCUIElementTypeButton[@label='Continue']")
    public static WebElement continueDiscBtn;

    @iOSXCUITFindBy(xpath = "XCUIElementTypeButton[@name='Accept']")
    public static WebElement acceptBtn;

    @iOSXCUITFindBy(accessibility = "Step 1 of 3 - Build Your Jam3eya")
    public static WebElement step1Title;

    @iOSXCUITFindBy(xpath = "XCUIElementTypeTextField[@value='Name']")
    public static WebElement jameyaNameTxt;

    @iOSXCUITFindBy(xpath = "XCUIElementTypePickerWheel")
    public static List<WebElement> purposePicker;

    @iOSXCUITFindBy(accessibility = "Upload A Photo (Optional)")
    public static WebElement uploadPhotoLink;

    @iOSXCUITFindBy(xpath = "XCUIElementTypeButton[@name='Next']")
    public static WebElement screenNext;

    @iOSXCUITFindBy(accessibility = "Step 2 of 3 - Invite Participants")
    public static WebElement step2Title;

    @iOSXCUITFindBy(xpath = "XCUIElementTypeStaticText[@name='Add Participants']")
    public static WebElement addParticiLink;

    @iOSXCUITFindBy(accessibility = "Jamuser20 (Mobile)")
    public static WebElement firstContact;

    @iOSXCUITFindBy(accessibility = "Jamuser21 (Mobile)")
    public static WebElement secondContact;

    @iOSXCUITFindBy(xpath = "XCUIElementTypeSlider")
    public static WebElement monthlyAmountSlider;





}
