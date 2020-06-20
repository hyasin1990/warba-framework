package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static elements.hassala.BreakElements.hssalatSection;
import static elements.hassala.CreateElements.*;
import static elements.hassala.CreateElements.nineKey;
import static util.GeneralUtil.get;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class Util {

    private static AppiumDriver driver;

    public Util(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // * * * Below are common utils * * * //

/*
    To execute switch statement on amount string and enter number from keyboard accordingly
*/
    public void enterAmountBaseOnGivenStringAmount(String amount) throws IOException {
        for (int i = 0; i < amount.length(); i++) {
            int j = Character.digit(amount.charAt(i), 10);
            if (get("TESTING_PLATFORM").equals("IOS")) {
                switch (j) {
                    case 0:
                        zeroKey.click();
                        break;
                    case 1:
                        oneKey.click();
                        break;
                    case 2:
                        twoKey.click();
                        break;
                    case 3:
                        threeKey.click();
                        break;
                    case 4:
                        fourKey.click();
                        break;
                    case 5:
                        fiveKey.click();
                        break;
                    case 6:
                        sixKey.click();
                        break;
                    case 7:
                        sevenKey.click();
                        break;
                    case 8:
                        eightKey.click();
                        break;
                    case 9:
                        nineKey.click();
                        break;
                }
            } else if (get("TESTING_PLATFORM").equals("Android")) {
                switch (j) {
                    case 0:
                        ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_0));
                        break;
                    case 1:
                        ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_1));
                        break;
                    case 2:
                        ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_2));
                        break;
                    case 3:
                        ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_3));
                        break;
                    case 4:
                        ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_4));
                        break;
                    case 5:
                        ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_5));
                        break;
                    case 6:
                        ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_6));
                        break;
                    case 7:
                        ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_7));
                        break;
                    case 8:
                        ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_8));
                        break;
                    case 9:
                        ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_9));
                        break;
                }
            }
        }
    }

    /* To swipe horizontally or vertically until given element is displayed */
    public void swipeUntilElementIsDisplayed(WebElement element, int x_start, int y_start, int x_stop, int y_stop, int duration) {
        while (!element.isDisplayed()) {
            swipeByCoordinates(x_start, y_start, x_stop, y_stop, duration);
        }
    }

    /* To swipe horizontally or vertically */
    public void swipeByCoordinates(int x_start, int y_start, int x_stop, int y_stop, int duration) {

        new TouchAction(driver).press(PointOption.point(x_start, y_start))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(duration)))
                .moveTo(PointOption.point(x_stop, y_stop)).release().perform();
    }

    /* For sleeping the thread */
    public static void hold(int sec) throws InterruptedException {
        Thread.sleep(sec);
    }


    /* To extract double digits from a combination of digits and characters */
    public double digitsExtractor(String stringElement) {
        double doubleAmount = 0.0;
        Pattern p = Pattern.compile("\\d+(?:\\.\\d+)?");
        Matcher m = p.matcher(stringElement);
        while (m.find()) {
            doubleAmount = doubleAmount + Double.parseDouble(m.group());
        }
        return doubleAmount;
    }

    /* To wait until given element is clickable */
    public void waitForElementToBeClickable(WebElement element, long TimeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, TimeOutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /* To wait until given element is visible */
    public void waitForElementToBeVisible(WebElement element, long TimeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, TimeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /* To click on element in case it displays and ignore the exception in case it doesnt */
    public void clickOnElementIfDisplayed(WebElement element) {
        try {
            //element.isDisplayed();
            element.click();
        } catch (NoSuchElementException ignored) {

        }
    }

    /* For clicking on any element by coordinates */
    public void tabByCoordinates(int x, int y) {
        new TouchAction(driver).tap(PointOption.point(x, y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(10))).perform();
    }


    // * * * Below are IOS utils * * * //

    /* To swipe up, down, left or right on the given element */
    public void swipeOnElement(WebElement element, String direction) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<>();
        params.put("direction", direction);
        params.put("element", (element));
        js.executeScript("mobile: swipe", params);
    }

    /* For selecting birth date under login screen ...selectBirthDateBasedOnUserSelection*/
    public void selectDateBasedOnUserSelection(String day, String userMonth, List<WebElement> picker) throws InterruptedException {

        String sDay = picker.get(0).getAttribute("value");
        int intStandDay = Integer.parseInt(sDay);
        int userDay = Integer.parseInt(day);
        while (intStandDay != userDay) {
            if (intStandDay > userDay) {
                previousScroll(picker, 0);
                intStandDay -= 1;
                hold(200);
            } else if (intStandDay < userDay) {
                nextScroll(picker, 0);
                intStandDay += 1;
                hold(200);
            }
        }
        // String userMonth = month;
        String standMonth = picker.get(1).getAttribute("value");
        int intUserMonth = 0;
        int intStandMonth = 0;
        switch (standMonth) {
            case "Jan":
                intStandMonth = 1;
                break;

            case "Feb":
                intStandMonth = 2;
                break;

            case "Mar":
                intStandMonth = 3;
                break;

            case "Apr":
                intStandMonth = 4;
                break;

            case "May":
                intStandMonth = 5;
                break;

            case "Jun":
                intStandMonth = 6;
                break;

            case "Jul":
                intStandMonth = 7;
                break;

            case "Aug":
                intStandMonth = 8;
                break;

            case "Sep":
                intStandMonth = 9;
                break;

            case "Oct":
                intStandMonth = 10;
                break;

            case "Nov":
                intStandMonth = 11;
                break;

            case "Dec":
                intStandMonth = 12;
                break;
        }

        switch (userMonth) {
            case "Jan":
                intUserMonth = 1;
                break;

            case "Feb":
                intUserMonth = 2;
                break;

            case "Mar":
                intUserMonth = 3;
                break;

            case "Apr":
                intUserMonth = 4;
                break;

            case "May":
                intUserMonth = 5;
                break;

            case "Jun":
                intUserMonth = 6;
                break;

            case "Jul":
                intUserMonth = 7;
                break;

            case "Aug":
                intUserMonth = 8;
                break;

            case "Sep":
                intUserMonth = 9;
                break;

            case "Oct":
                intUserMonth = 10;
                break;

            case "Nov":
                intUserMonth = 11;
                break;

            case "Dec":
                intUserMonth = 12;
                break;
        }
        while (intStandMonth != intUserMonth) {
            if (intStandMonth > intUserMonth) {
                previousScroll(picker, 1);
                intStandMonth -= 1;
                hold(200);
            } else if (intStandMonth < intUserMonth) {
                nextScroll(picker, 1);
                intStandMonth += 1;
                hold(200);
            }
        }
    }

    /* For selecting hassala goal date under create screen */
    public void selectDateBasedOnUserSelection(String day, String userMonth, String year, List<WebElement> picker) throws InterruptedException {

        String standMonth = picker.get(0).getAttribute("value");
        System.out.println(standMonth);
        int intUserMonth = 0;
        int intStandMonth = 0;
        switch (standMonth) {
            case "January":
                intStandMonth = 1;
                break;
            case "February":
                intStandMonth = 2;
                break;
            case "March":
                intStandMonth = 3;
                break;
            case "April":
                intStandMonth = 4;
                break;
            case "May":
                intStandMonth = 5;
                break;
            case "June":
                intStandMonth = 6;
                break;
            case "July":
                intStandMonth = 7;
                break;
            case "August":
                intStandMonth = 8;
                break;
            case "September":
                intStandMonth = 9;
                break;
            case "October":
                intStandMonth = 10;
                break;
            case "November":
                intStandMonth = 11;
                break;
            case "December":
                intStandMonth = 12;
                break;
        }
        System.out.println("Stand month is " + intStandMonth);
        switch (userMonth) {
            case "Jan":
                intUserMonth = 1;
                break;

            case "Feb":
                intUserMonth = 2;
                break;

            case "Mar":
                intUserMonth = 3;
                break;

            case "Apr":
                intUserMonth = 4;
                break;

            case "May":
                intUserMonth = 5;
                break;

            case "Jun":
                intUserMonth = 6;
                break;

            case "Jul":
                intUserMonth = 7;
                break;

            case "Aug":
                intUserMonth = 8;
                break;

            case "Sep":
                intUserMonth = 9;
                break;

            case "Oct":
                intUserMonth = 10;
                break;

            case "Nov":
                intUserMonth = 11;
                break;

            case "Dec":
                intUserMonth = 12;
                break;
        }
        System.out.println("user month is " + intUserMonth);

        while (intStandMonth != intUserMonth) {
            if (intStandMonth > intUserMonth) {
                previousScroll(picker, 0);
                intStandMonth -= 1;
                hold(200);
            } else if (intStandMonth < intUserMonth) {
                nextScroll(picker, 0);
                intStandMonth += 1;
                hold(200);
            }
        }

        String sDay = picker.get(1).getAttribute("value");
        int intStandDay = Integer.parseInt(sDay);
        int userDay = Integer.parseInt(day);
        while (intStandDay != userDay) {
            if (intStandDay > userDay) {
                previousScroll(picker, 1);
                intStandDay -= 1;
                hold(200);
            } else if (intStandDay < userDay) {
                nextScroll(picker, 1);
                intStandDay += 1;
                hold(200);
            }
        }

        String sYear = picker.get(2).getAttribute("value");
        int intStandYear = Integer.parseInt(sYear);
        int userYear = Integer.parseInt(year);
        while (intStandYear != userYear) {
            if (intStandYear > userYear) {
                previousScroll(picker, 2);
                intStandYear -= 1;
                hold(200);
            } else if (intStandYear < userYear) {
                nextScroll(picker, 2);
                intStandYear += 1;
                hold(200);
            }
        }
    }

    /* To perform a previous scroll in given date picker */
    public void previousScroll(List<WebElement> picker, int index) {

        HashMap<String, Object> params = new HashMap<>();
        params.put("order", "previous");
        params.put("offset", 0.15);
        params.put("element", ((RemoteWebElement) picker.get(index)).getId());
        driver.executeScript("mobile: selectPickerWheelValue", params);
    }

    /* To perform a next scroll in given date picker */
    public void nextScroll(List<WebElement> picker, int index) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("order", "next");
        params.put("offset", 0.15);
        params.put("element", ((RemoteWebElement) picker.get(index)).getId());
        driver.executeScript("mobile: selectPickerWheelValue", params);
    }

    /* For Clicking on view all screen depending in its location e.g. in case of user having cards or not */
    public void clickingOnViewAllDependingLocation(List<WebElement> element) {
        if (element.size() == 2) {
            element.get(1).click();
        } else if (element.size() == 1) {
            element.get(0).click();
        }
    }

    /* For tapping on any given element */
    public void tabByElement(WebElement element) {

        new TouchAction(driver).tap(new TapOptions().withElement(ElementOption.element(element)))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(250))).perform();
    }

    /* Exclusive method for selecting 0 amount hassala */
    public void selectZeroHassala(WebElement anyHassala, WebElement zeroHassala, List<WebElement> hssalaValues) throws IOException {
        double hssalaValue = (digitsExtractor(anyHassala.getAttribute("name")));
        while (hssalaValue != 0.0) {
            try {
                zeroHassala.isDisplayed();
                zeroHassala.click();
                hssalaValue = digitsExtractor(hssalaValues.get(5).getText());
            } catch (NoSuchElementException ignored) {
                if (get("TESTING_PLATFORM").equals("IOS")) {
                    swipeByCoordinates(240, 460, 5, 460, 2);
                    hssalaValue = (digitsExtractor(anyHassala.getAttribute("name")));
                    // enable the below in order to get value if hassala screen opened due to hassala location
                    // hssalaValue=digitsExtractor(hssalaValues.get(5).getText());
                } else if (get("TESTING_PLATFORM").equals("Android")) {
                    // swipeByCoordinates(700, generateY(hssalatSection), 0, generateY(hssalatSection), 2);
                    swipeByCoordinates(generateX(hssalatSection) + 600, generateY(hssalatSection), generateX(hssalatSection), generateY(hssalatSection), 2);
                    hssalaValue = (digitsExtractor(anyHassala.getAttribute("name")));
                }
            }
        }

    }

    /* Exclusive method for selecting transfer frequency */
    public void selectFrequency(String frequency, WebElement weeklyElement, WebElement monthlyelement) {
        if (frequency.equals("Weekly")) {
            weeklyElement.click();
        } else if (frequency.equals("Monthly")){
            monthlyelement.click();
        }
    }


    // * * * Below are Android utils * * * //

    /* To perform a next scroll under login datePicker */
    public void andrNextScroll(String picker) {
        if (picker.equals("day")) {
            swipeByCoordinates(402, 855, 402, 696, 1);
        } else if (picker.equals("month")) {
            swipeByCoordinates(624, 858, 624, 703, 1);
        } else if (picker.equals("hssalaDay")) {
            swipeByCoordinates(200, 1700, 200, 1268, 1);

        } else if (picker.equals("hssalaMonth")) {
            swipeByCoordinates(462, 1700, 462, 1608, 1);


        } else if (picker.equals("hssalaYear")) {
            swipeByCoordinates(880, 1700, 880, 1560, 1);
        }

    }

    /* To perform a previous scroll under login datePicker */
    public void andrPreviousScroll(String picker) {
        if (picker.equals("day")) {
            swipeByCoordinates(402, 855, 402, 1012, 1);

        } else if (picker.equals("month")) {
            swipeByCoordinates(624, 858, 624, 1017, 1);
        } else if (picker.equals("hssalaDay")) {
            swipeByCoordinates(202, 1712, 202, 1779, 1);
        } else if (picker.equals("hssalaMonth")) {
            swipeByCoordinates(459, 1700, 459, 1787, 1);
        }

    }

    /* To select date of birth for login */
    public void andrSelectBirthDate(String userDay, String userMonth, List<WebElement> datePickerElement) {
        int intStandDay = Integer.parseInt(datePickerElement.get(0).getAttribute("text"));
        int intUserDay = Integer.parseInt(userDay);
        String standMonth = datePickerElement.get(1).getAttribute("text");
        int intStandMonth = 0;
        int intUserMonth = 0;

        while (intUserDay != intStandDay) {
            if (intStandDay > intUserDay) {
                andrPreviousScroll("day");
                intStandDay -= 1;
            } else if (intStandDay < intUserDay) {
                andrNextScroll("day");
                intStandDay += 1;
            }
        }
        switch (standMonth) {
            case "Jan":
                intStandMonth = 1;
                break;

            case "Feb":
                intStandMonth = 2;
                break;

            case "Mar":
                intStandMonth = 3;
                break;

            case "Apr":
                intStandMonth = 4;
                break;

            case "May":
                intStandMonth = 5;
                break;

            case "Jun":
                intStandMonth = 6;
                break;

            case "Jul":
                intStandMonth = 7;
                break;

            case "Aug":
                intStandMonth = 8;
                break;

            case "Sep":
                intStandMonth = 9;
                break;

            case "Oct":
                intStandMonth = 10;
                break;

            case "Nov":
                intStandMonth = 11;
                break;

            case "Dec":
                intStandMonth = 12;
                break;
        }

        switch (userMonth) {
            case "Jan":
                intUserMonth = 1;
                break;

            case "Feb":
                intUserMonth = 2;
                break;

            case "Mar":
                intUserMonth = 3;
                break;

            case "Apr":
                intUserMonth = 4;
                break;

            case "May":
                intUserMonth = 5;
                break;

            case "Jun":
                intUserMonth = 6;
                break;

            case "Jul":
                intUserMonth = 7;
                break;

            case "Aug":
                intUserMonth = 8;
                break;

            case "Sep":
                intUserMonth = 9;
                break;

            case "Oct":
                intUserMonth = 10;
                break;

            case "Nov":
                intUserMonth = 11;
                break;

            case "Dec":
                intUserMonth = 12;
                break;
        }

        while (intStandMonth != intUserMonth) {
            if (intStandMonth > intUserMonth) {
                andrPreviousScroll("month");
                intStandMonth -= 1;
            } else if (intStandMonth < intUserMonth) {
                andrNextScroll("month");
                intStandMonth += 1;
            }
        }
    }

    /* To perform scrolling until given text is displayed */
    public void andrScrollUntilTextIsDisplayed(String scrollableText) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable("
                + "new UiSelector().scrollable(true)).scrollIntoView("
                + "new UiSelector().textContains(\"" + scrollableText + "\"));"));
    }

    /* To perform ENTER click on Android keyboard */
    public void andrClickEnter() {
        ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));

    }

    /* To select goal date while creating hassala */
    public void andrSelectGoalDate(String userDay, String userMonth, String userYear, List<WebElement> picker) {
        int intStandDay = Integer.parseInt(picker.get(0).getAttribute("text"));
        int intUserDay = Integer.parseInt(userDay);
        String standMonth = picker.get(1).getAttribute("text");
        int intStandMonth = 0;
        int intUserMonth = 0;

        while (intUserDay != intStandDay) {
            if (intStandDay > intUserDay) {
                andrPreviousScroll("hssalaDay");
                intStandDay -= 1;
            } else if (intStandDay < intUserDay) {
                andrNextScroll("hssalaDay");
                intStandDay += 1;
            }
        }
        switch (standMonth) {
            case "Jan":
                intStandMonth = 1;
                break;

            case "Feb":
                intStandMonth = 2;
                break;

            case "Mar":
                intStandMonth = 3;
                break;

            case "Apr":
                intStandMonth = 4;
                break;

            case "May":
                intStandMonth = 5;
                break;

            case "Jun":
                intStandMonth = 6;
                break;

            case "Jul":
                intStandMonth = 7;
                break;

            case "Aug":
                intStandMonth = 8;
                break;

            case "Sep":
                intStandMonth = 9;
                break;

            case "Oct":
                intStandMonth = 10;
                break;

            case "Nov":
                intStandMonth = 11;
                break;

            case "Dec":
                intStandMonth = 12;
                break;
        }

        switch (userMonth) {
            case "Jan":
                intUserMonth = 1;
                break;

            case "Feb":
                intUserMonth = 2;
                break;

            case "Mar":
                intUserMonth = 3;
                break;

            case "Apr":
                intUserMonth = 4;
                break;

            case "May":
                intUserMonth = 5;
                break;

            case "Jun":
                intUserMonth = 6;
                break;

            case "Jul":
                intUserMonth = 7;
                break;

            case "Aug":
                intUserMonth = 8;
                break;

            case "Sep":
                intUserMonth = 9;
                break;

            case "Oct":
                intUserMonth = 10;
                break;

            case "Nov":
                intUserMonth = 11;
                break;

            case "Dec":
                intUserMonth = 12;
                break;
        }

        while (intStandMonth != intUserMonth) {
            if (intStandMonth > intUserMonth) {
                andrPreviousScroll("hssalaMonth");
                intStandMonth -= 1;
            } else if (intStandMonth < intUserMonth) {
                andrNextScroll("hssalaMonth");
                intStandMonth += 1;
            }
        }
        int intStandYear = Integer.parseInt(picker.get(2).getAttribute("text"));
        int intUserYear = Integer.parseInt(userYear);
        while (intUserYear != intStandYear) {
            andrNextScroll("hssalaYear");
            intStandYear += 1;
        }

    }

    /* To get the Y axis of any given element */
    public int generateY(WebElement element) {
        Point point = element.getLocation();
        int y = point.getY();
        return y;
    }

    /* To get X axis of any given element */
    public int generateX(WebElement element) {
        Point point = element.getLocation();
        int x = point.getX();
        return x;
    }

}






