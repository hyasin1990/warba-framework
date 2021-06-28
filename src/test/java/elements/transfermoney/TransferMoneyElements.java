package elements.transfermoney;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TransferMoneyElements {

    private AppiumDriver driver;

    public TransferMoneyElements(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(accessibility = "plus white")
    public static WebElement plusFloating;

    @iOSXCUITFindBy(accessibility = "Transfer Money")
    public static WebElement transferMoney;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Transfer']")
    public static WebElement standardTransferButton;

    @iOSXCUITFindBy(accessibility = "Myself")
    public static WebElement mySelfBeneficiary;

    @iOSXCUITFindBy(accessibility = "Warba/Platform/icon-knet")
    public static WebElement KnetCard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Input a transfer amount ≥ 10 KWD']")
    public static WebElement amountToTransfer;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='This is for your reference (optional)']")
    public static WebElement optionalDescriptionField;

    @iOSXCUITFindBy(accessibility = "action_transfer")
    public static WebElement transferButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@value='Select Your Bank']")
    public static WebElement banksList;

    @iOSXCUITFindBy(accessibility = "Should be in number. Length should be 10")
    public static WebElement cardNoField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@value='MM']")
    public static WebElement expirationMonthsList;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@value='YYYY']")
    public static WebElement expirationYearList;

    @iOSXCUITFindBy(accessibility = "Should be in number. Length should be 4")
    public static WebElement pinField;

    @iOSXCUITFindBy(accessibility = "Submit")
    public static WebElement knetSubmit;

    @iOSXCUITFindBy(accessibility = "Confirm")
    public static WebElement knetConfirm;

    @iOSXCUITFindBy(accessibility = "Transfer Was Successfully Done!")
    public static WebElement transferSucessfulScreen;

    @iOSXCUITFindBy(accessibility = "close black")
    public static WebElement xIcon;

}


