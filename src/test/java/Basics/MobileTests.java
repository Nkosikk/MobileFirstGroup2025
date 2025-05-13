package Basics;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileTests {

    private AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("platformVersion", "12.0"); // Replace with your Android version
//        capabilities.setCapability("deviceName", "emulator-5554"); // Replace with your device/emulator name
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", "/Users/nkosicele/Downloads/ApiDemos-debug.apk"); // Replace with the path to your APK file

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
    }

    @Test
    public void testAppLaunch() {
        System.out.println("App launched successfully!");
        // Add your test logic here
    }

//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

}
