package elements.hassala;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
    import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateElements {
    private AppiumDriver driver;


    // Create Hassala

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/createHasalaButton")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Create New Hassala']")
    public static WebElement createHssala;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/tvSkip")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Skip']")
    public static WebElement hssalaTutSkip;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Get Started']")
    public static WebElement hssalaGetStarted;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/tvSelect")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Select Option']")
    public static WebElement savingOptionLink;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='House']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='House']")
    public static WebElement goalCategoryHouse;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='My kids']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='My kids']")
    public static WebElement goalCategoryKids;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Car']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Car']")
    public static WebElement goalCategoryCar;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Travel']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Travel']")
    public static WebElement goalCategoryTravel;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Charity']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Charity']")
    public static WebElement goalCategoryCharity;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Health']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Health']")
    public static WebElement goalCategoryHealth;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Shopping']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Shopping']")
    public static WebElement goalCategoryShopping;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Gift']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Gift']")
    public static WebElement goalCategoryGift;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Entertainment']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Entertainment']")
    public static WebElement goalCategoryEntertainment;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Education']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Education']")
    public static WebElement goalCategoryEducation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Jewellery']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Jewellery']")
    public static WebElement goalCategoryJewellery;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Other']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Other']")
    public static WebElement goalCategoryOther;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Name your Hassala']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Name your Hassala']")
    public static WebElement hssalaNameTxt;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Choose from camera roll']")
    public static WebElement chooseFromCamera;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/skip")
    public static WebElement andrSkipPhoto;

    @iOSXCUITFindBy(accessibility = "OK")
    public static WebElement allowPhAccess;

    @iOSXCUITFindBy(accessibility = "All Photos")
    public static WebElement allPhotos;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[contains(@name,'March')]")
    public static WebElement createPhoto;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[contains(@name,'August')]")
    public static WebElement editPhoto;

    @iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"Choose\"]")
    public static WebElement confPhoto;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/textView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Target Amount']")
    public static WebElement amountTxt;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeKey[@name=\"0\"]")
    public static WebElement zeroKey;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeKey[@name=\"1\"]")
    public static WebElement oneKey;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeKey[@name=\"2\"]")
    public static WebElement twoKey;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeKey[@name=\"3\"]")
    public static WebElement threeKey;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeKey[@name=\"4\"]")
    public static WebElement fourKey;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeKey[@name=\"5\"]")
    public static WebElement fiveKey;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeKey[@name=\"6\"]")
    public static WebElement sixKey;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeKey[@name=\"7\"]")
    public static WebElement sevenKey;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeKey[@name=\"8\"]")
    public static WebElement eightKey;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeKey[@name=\"9\"]")
    public static WebElement nineKey;

    @AndroidFindBy(className = "android.view.View")
    public static List<WebElement> hssalaAndrDatePicker;


    @AndroidFindBy(id = "com.safat.warbaib.uat:id/tvTitle")
    @iOSXCUITFindBy(accessibility = "Congratulations")
    public static WebElement congraTxt;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/btnDone")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Done']")
    public static WebElement screenDone;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/tvActionText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Close']")
    public static WebElement screenClose;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/ivBack")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Back']")
    public static WebElement screenBack;


    public CreateElements(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

}
