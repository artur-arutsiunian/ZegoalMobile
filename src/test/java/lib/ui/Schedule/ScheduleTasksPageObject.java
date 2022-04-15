package lib.ui.Schedule;

import io.appium.java_client.AppiumDriver;
import lib.ui.MainPageObject;
import org.openqa.selenium.By;

public class ScheduleTasksPageObject extends MainPageObject {

    public ScheduleTasksPageObject(AppiumDriver driver) {
        super(driver);
    }

    private static final String
    TASKS_TAB = "//android.widget.LinearLayout[@content-desc='Tasks']",
    TASK = "//*[contains(@text,'news')]",
    PLAY_BUTTON = "//*[contains(@text,'00:00:00')]",
    CHOOSE_MULTICHOICE = "//*[contains(@text,'Мультивыбор')]",
    CHOOSE_CHECKBOX = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.CheckBox",
    SAVE_BUTTON = "//*[contains(@text,'Save')]",
    CONFIRM_CHECKS = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView[2]",
    TASKS_TAB_AFTER_COMPLETE_TASK = "//android.widget.LinearLayout[@content-desc='Tasks']";


 public void moveToTask() throws InterruptedException{

        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(TASKS_TAB),
                "Can't find tasks tab",
                5
        );

     Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(TASK),
                "can't click on task",
                5
        );

     Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(PLAY_BUTTON),
                "can't find play button",
                5
        );

     Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_MULTICHOICE),
                "can't find multichoice button",
                5
        );

     Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CHOOSE_CHECKBOX),
                "can't find checkbox",
                5
        );

     Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(SAVE_BUTTON),
                "can't find save button",
                5
        );

     Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CONFIRM_CHECKS),
                "can't find confirm checks",
                5
        );

     Thread.sleep(2000);
        this.waitForElementPresent(
                By.xpath(TASKS_TAB_AFTER_COMPLETE_TASK),
                "can't find tasks tab",
                10
        );
    }
}