package elements.wu;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddBeneficiaryElements {

    private AppiumDriver driver;
    public AddBeneficiaryElements(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Beneficiaries']")
    public static WebElement BeneficiariesTab;

   // @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Add a new beneficiary']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@value,'Add')]")
    public static WebElement addNewBeneficiaryButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='First Name']")
    public static WebElement firstNameField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Middle Name']")
    public static WebElement middleNameField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Last Name']")
    public static WebElement lastNameField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Next']")
    public static WebElement convNext;

    @iOSXCUITFindBy(accessibility = "Select Country")
    public static WebElement selectCountryLink;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Search']")
    public static WebElement searchField;

    @iOSXCUITFindBy(className = "XCUIElementTypeStaticText")
    public static List<WebElement> searchedCountry;

    @iOSXCUITFindBy(accessibility = "Select Nationality")
    public static WebElement selectNationalityLink;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Enter description']")
    public static WebElement descriptionField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Review']")
    public static WebElement reviewWuAddBeneficiary;



    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Add Beneficiary']")
    public static WebElement addBeneficiaryButton;


    @iOSXCUITFindBy(className = "XCUIElementTypeTextField")
    public static WebElement otpField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Activate']")
    public static WebElement activateButton;



















}
