package lib.ui.CRM;

import io.appium.java_client.AppiumDriver;
import lib.ui.MainPageObject;
import org.openqa.selenium.By;

public class CompanyFilterPageObject extends MainPageObject {

    public CompanyFilterPageObject(AppiumDriver driver) {super(driver);}

    private final static String
    CRM_TAB = "//android.widget.FrameLayout[@content-desc=\"CRM\"]",
    FILTER_COMPANY = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView[1]",
    DROP_FILTER_MENU = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView[2]",
    LIST = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.CheckBox",
    ACCEPT_CHANGES = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[2]",
    AGAIN_ACCEPT_CHANGES = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[3]",
    COMPANY_TAB_IS_SELECTED = "//android.widget.LinearLayout[@content-desc=\"Company\"]";

    public void moveToCompanyInCrm() throws InterruptedException{

        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(CRM_TAB),
                "Can't find CRM tab",
                5
        );

        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(FILTER_COMPANY),
                "Can't find company filter",
                5
        );

        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(DROP_FILTER_MENU),
                "Cant' open drop menu",
                5
        );

        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(LIST),
                "Can'f open list drop down menu",
                5
        );

        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(ACCEPT_CHANGES),
                "Can't find find 'accept' button",
                5
        );

        Thread.sleep(2000);
        this.waitForElementAndClick(
                By.xpath(AGAIN_ACCEPT_CHANGES),
                "Can't find 'accept' button on the second step",
                5
        );

        Thread.sleep(2000);
        this.waitForElementPresentAndConsistAttribute(
                By.xpath(COMPANY_TAB_IS_SELECTED),
                "Can't confirm that Company tab is selected",
                5
        );
    }
}
