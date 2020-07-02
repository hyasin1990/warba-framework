package elements.login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginElements {

    private AppiumDriver driver;
    public LoginElements(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    // Get Started Screen elements

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Allow']")
    public static WebElement allowBtn;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/txtTutorial")
    @iOSXCUITFindBy(accessibility = "Stay on top of your finances with a smart dashboard and get great insights about your spending at all times!")
    public static WebElement getStartedTut1;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/txtTutorial")
    @iOSXCUITFindBy(accessibility = "Explore a friendlier and personalized way of banking that allows you to add pictures to your accounts and beneficiaries!")
    public static WebElement getStartedTut2;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/btnGetStarted")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Get Started\"]")
    public static WebElement getStartedBtn;

    // Login Elements

    @AndroidFindBy(accessibility = "button_login")
    @iOSXCUITFindBy(accessibility = "button_login")
    public static WebElement loginBtn;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/etUsername")
    @iOSXCUITFindBy(accessibility = "textField_username")
    public static WebElement usernameField;

    @AndroidFindBy(className = "android.widget.EditText")
    @iOSXCUITFindBy(className = "XCUIElementTypePickerWheel")
    public static List<WebElement> datePicker;



    @AndroidFindBy(id = "com.safat.warbaib.uat:id/pickerArrow")
    public static WebElement andrPickerArrow;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/pickerArrow")
    @iOSXCUITFindBy(accessibility = "textField_dateOfBirth")
    public static WebElement dobField;

    // Security question
    @AndroidFindBy(id = "com.safat.warbaib.uat:id/textViewHeaderTitle")
    @iOSXCUITFindBy(accessibility = "Warba_Online.SecurityQuestionView")
    public static WebElement secTitle;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/etAnswer")
    @iOSXCUITFindBy(accessibility = "textField_answer")
    public static WebElement answerTxt;

    @AndroidFindBy(id = "android:id/button1")
    public static WebElement okBtn;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/btn_confirm")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Done\"]")
    public static WebElement keyDone;

    @AndroidFindBy(accessibility = "button_next")
    @iOSXCUITFindBy(accessibility = "button_next")
    public static WebElement nextBtn;

    // Password screen
    //@AndroidFindBy(id = "com.safat.warbaib.uat:id/textViewHeaderSubTitle")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Enter password']")
    @iOSXCUITFindBy(accessibility = "Warba_Online.PasswordValidationView")
    public static WebElement passTitle;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/etPassword")
    @iOSXCUITFindBy(accessibility = "textField_password")
    public static WebElement passTxt;

    // App Home Screen

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/exit")
    @iOSXCUITFindBy(accessibility = "logout")
    public static WebElement logoutIcon;

    @AndroidFindBy(accessibility = "My Portfolio")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"My Portfolio\"]")
    public static WebElement portfolioBtn;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/txtSkip")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
    public static WebElement tutSkip;

    //xpath = "//XCUIElementTypeStaticText[contains(@value,'Saved')]")

   // @AndroidFindBy(xpath = "//android.widget.TextView(contains[@text,\"Hassalaty\"])")
   @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Hassalaty')]")
    @iOSXCUITFindBy(accessibility = "My Term Deposits")
    public static WebElement termTitleTxt;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/tvGoalShow")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='View All']")
    public static List<WebElement> viewAll;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/buttonNext")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Confirm\"]")
    public static WebElement confirmBtn;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/btnDoneButton")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Accept']")
    public static WebElement acceptTermsBtn;


}
