package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageObject extends MainPageObject {

    public LoginPageObject(AppiumDriver driver) {
        super(driver);
    }

    private static final String
    CLICK_ORGANIZATION_NAME = "//*[@resource-id='zegoal.com.zegoal.debug:id/inputDomainName']",
    INPUT_NAME = "//*[@resource-id='zegoal.com.zegoal.debug:id/inputDomainName']",
    SEND_BUTTON = "//*[contains(@text,'Send')]",
    LOGIN_BUTTON = "//*[contains(@text,'Login')]",
    OK_BUTTON = "//*[contains(@text,'OK')]",
    WHILE_USING_THE_APP_BUTTON = "//*[contains(@text,'While using the app')]",
    ALLOW_ACTIVITY = "//*[@resource-id='com.android.permissioncontroller:id/permission_allow_button']",
    CONFIRM_ACTIVITY = "//*[contains(@text,'Allow all the time')]",
    BACK_BUTTON = "//android.widget.ImageButton[@content-desc=\"Back\"]",
    NOTE_TASK = "//*[contains(@text,'Tasks')]";


    public void RepeatCyclesForFirstStep() throws InterruptedException {
        int number_of_tapping_numbers=0;
        while(number_of_tapping_numbers<1){
        this.waitForElementAndClick(By.xpath(WHILE_USING_THE_APP_BUTTON),"Cannot find allow button",5);
        ++number_of_tapping_numbers;}
    }

    public void RepeatCyclesForSecondStep() throws InterruptedException {
        int number_of_tapping_numbers=0;
        while(number_of_tapping_numbers<1){
            this.waitForElementAndClick(By.xpath(ALLOW_ACTIVITY),"Cannot find allow button",5);
            ++number_of_tapping_numbers;}
    }

    public void processLoginOrganizationAndUser() throws InterruptedException {

        this.waitForElementAndClick(
                By.xpath(CLICK_ORGANIZATION_NAME),
                "Cannot find company name",
                5
        );

        this.waitForElementAndSendKeys(
                    By.xpath(INPUT_NAME),
                    "testing7",
                    "Can't find string'",
                    5
            );

        driver.navigate().back();

        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(SEND_BUTTON),
                    "Cannot find Send button",
                    5
            );

        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(LOGIN_BUTTON),
                "Cannot find Login button",
                5
        );

        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(OK_BUTTON),
                "Cannot find OK button",
                5
        );

        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(WHILE_USING_THE_APP_BUTTON),
                "Can't find while... button",
                5
        );

        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(ALLOW_ACTIVITY),
                "Can't find physical... button",
                5
        );

        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CONFIRM_ACTIVITY),
                "Can't find confirm physical... button",
                5
        );

        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(BACK_BUTTON),
                "Can't find back button",
                5
        );

        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(WHILE_USING_THE_APP_BUTTON),
                "Can't find while... button",
                5
        );

        Thread.sleep(2000);
        this.RepeatCyclesForFirstStep();

        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(ALLOW_ACTIVITY),
                "Can't find ... button",
                5
        );

        Thread.sleep(2000);
        this.RepeatCyclesForSecondStep();

        Thread.sleep(2000);
        this.assertElementPresent(
                By.xpath(NOTE_TASK),
                "can't see note tasks ",
                5
        );
    }
}