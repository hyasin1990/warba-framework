package elements.hassala;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TransactionsElements {

    private AppiumDriver driver;

    public TransactionsElements(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.safat.warbaib.uat:id/tvBottomSheetTitle")
    @iOSXCUITFindBy(accessibility = "Pull up to view transactions")
    public static WebElement pullupSheet;














}
