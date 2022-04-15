package lib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class CoreTestCase {

    protected AppiumDriver driver;
    private static String AppiumURL = "http://127.0.0.1:4723/wd/hub";

    @Before
    public void setUp() throws Exception {
        System.out.println("setUp test driver");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "AndroidTestDevicee");
        capabilities.setCapability("platformVersion", "12.0");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "zegoal.com.zegoal.debug");
        capabilities.setCapability("appActivity", "zegoal.com.zegoal.presentation.ui.auth.LoginActivity");
        capabilities.setCapability("app", "/Users/arturarutsiunian/Documents/ZegoalMobile/apks/ZegoaldevDevelopmentDebug_v2.61.0_v104.apk");
        driver = new AndroidDriver(new URL(AppiumURL), capabilities);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    protected void rotateScreenPortrait() {
        driver.rotate(ScreenOrientation.PORTRAIT);
    }

    protected void rotateScreenLandscape() {
        driver.rotate(ScreenOrientation.LANDSCAPE);
    }

    protected void backgroundApp(int seconds) {
    }
}
