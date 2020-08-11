package elements.jameya;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateJameyaElements {

    private AppiumDriver driver;
    public CreateJameyaElements(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(accessibility = "My Social Circle")
    @iOSXCUITFindBy(accessibility = "My Social Circle")
    public static WebElement socialCircleTab;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Show\"])[3]")
    public static WebElement showLink;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Create a Jam3eya']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Create a Jam3eya\"]")
    public static WebElement createJameyaLink;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/btn_primary")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Continue']")
    public static WebElement continueDiscBtn;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/buttonAccept")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Accept']")
    public static WebElement acceptBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Step 1 of 3 - Build your Jam3eya']")
    @iOSXCUITFindBy(accessibility = "Step 1 of 3 - Build Your Jam3eya")
    public static WebElement step1Title;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Name']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Name']")
    public static WebElement jameyaNameTxt;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
    public static List<WebElement> purposePicker;

    @iOSXCUITFindBy(accessibility = "Upload A Photo (Optional)")
    public static WebElement uploadPhotoLink;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/buttonNext")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Next']")
    public static WebElement screenNext;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Step 2 of 3 - Invite your friends']")
    @iOSXCUITFindBy(accessibility = "Step 2 of 3 - Invite Participants")
    public static WebElement step2Title;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add Participants']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Add Participants']")
    public static WebElement addParticiLink;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Jamuser11']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Jamuser11')]")
    public static WebElement firstContact;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Jamuser31']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Jamuser31')]")
    public static WebElement secondContact;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/tvActionText")
    public static WebElement contactsDone;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/amountSeekbar")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSlider")
    public static WebElement monthlyAmountSlider;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='25th of the month']")
    public static WebElement distributionMonth;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/tvSelect")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Choose Dates']")
    public static WebElement chooseDatesLink;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText")
    public static List<WebElement> particiMonthSelector;


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText")
     public static List<WebElement> particiImage;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/footerButton")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Cancel']")
    public static WebElement cancelLink;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/join")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Join')]")
    public static WebElement joinJameya;

    @iOSXCUITFindBy(accessibility = "Keep Going")
    public static WebElement keepGoingBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Savings']")
    public static WebElement purposeList;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Cancel']")
    public static WebElement cancelJameya;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Yes, cancel']")
    public static WebElement confirmCancellationBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Total Jam3eya']")
    public static WebElement anyJameya;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Start Jam3eya']")
    public static WebElement startJameyaBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Confirm\"]")
    public static List<WebElement> confParticipants;

    @iOSXCUITFindBy(accessibility = "textField_answer")
    public static WebElement otpField;

    @iOSXCUITFindBy(accessibility = "jameya.appbar")
    public static WebElement jameyaDotsMenu;

    @iOSXCUITFindBy(accessibility = "Delete Jameya")
    public static WebElement deleteJameya;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Continue']")
    public static WebElement continueDelete;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
    public static List<WebElement> payoutPicker;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='26th of the month']")
    public static WebElement payDayList;

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/pickerArrow")
    public static WebElement andrPayoutPicker;





}
