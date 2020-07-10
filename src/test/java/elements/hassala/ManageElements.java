package elements.hassala;

import com.sun.accessibility.internal.resources.accessibility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en_lol.WEN;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ManageElements {

    private AppiumDriver driver;

    public ManageElements(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/tvFunds")
    @iOSXCUITFindBy(accessibility = "Manage")
    public static WebElement manageIcon;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/tvEditGoal")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Edit\"]")
    public static WebElement editLink;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/editTextGoalName")
    @iOSXCUITFindBy(className = "XCUIElementTypeTextField")
    public static WebElement hssalaEditNameTxt;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/tvGoalName")
    public static WebElement hssalaNameSaved;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/ivEditGoalIcon")
    public static WebElement goalIcon;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/tvEditGoal")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Save\"]")
    public static WebElement saveLink;

    // Funding methods

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='1']")
    public static WebElement monthlyTransferList;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add Method']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value='Add Method']")
    public static List<WebElement> addMethods;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Well done')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@value,'Well done')]")
    public static WebElement wellDoneTxt;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Congratulations')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@value,'Congratulations')]")
    public static WebElement saveCongraTxt;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/tvOption2")
    @iOSXCUITFindBy(accessibility = "Monthly")
    public static WebElement monthlyTransfer;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/tvOption2")
    @iOSXCUITFindBy(accessibility = "Weekly")
    public static WebElement weeklyTransfer;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextField)[3]")
    public static WebElement transferAmount;


    @AndroidFindBy(id = "com.safat.warbaib.uat:id/button_accept")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Accept\"]")
    public static WebElement acceptBtn;


    @iOSXCUITFindBy(className = "XCUIElementTypePickerWheel")
    public static WebElement saveAsPicker;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Account']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Select Account\"]")
    public static WebElement selectAccountLink;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Review']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Review\"]")
    public static WebElement reviewBtn;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/btn_primary")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
    public static WebElement continueBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Occurs on the 1st of each month']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Occurs on\")]")
    public static WebElement autoRmv;


    @AndroidFindBy(id = "com.safat.warbaib.uat:id/tvThresholdLbl")
    @iOSXCUITFindBy(accessibility = "Threshold balance")
    public static WebElement sweepRmv;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'****')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Occurs daily\"]")
    public static WebElement saveKhaRmv;

    // Or //android.widget.TextView[!@text='3.000 KWD']
    @AndroidFindBy(id = "com.safat.warbaib.uat:id/tvThreshold")
    @iOSXCUITFindBy(accessibility = "3.000 KWD")
    public static WebElement SaveAsRmv;

    @iOSXCUITFindBy(accessibility = "Automated Transfer")
    public static WebElement secAutomated;

    @iOSXCUITFindBy(accessibility = "Sweep")
    public static WebElement secSweep;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sweep']")
    @iOSXCUITFindBy(accessibility = "Save As You Spend")
    public static WebElement secSaveAs;

    @iOSXCUITFindBy(accessibility = "Kharda")
    public static WebElement secKharda;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/llDelete")
    @iOSXCUITFindBy(accessibility = "trailing0")
    public static WebElement deleteIcon;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(accessibility = "Delete")
    public static WebElement confDelete;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/ivBack")
    public static WebElement hssalaBack;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/pickerArrow")
    public static WebElement pickerArrow;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/button_done")
    public static WebElement doneBtn;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/button_continue")
    public static WebElement methodContinueBtn;
}
