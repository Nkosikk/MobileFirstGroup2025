package Utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriverFactory {

    private static AndroidDriver driver;
    public static AppiumDriverFactory instanceOfAppiumDriverFactory;

    public AppiumDriverFactory(String appPath) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", appPath);
        capabilities.setCapability("noReset", true);

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(15, java.util.concurrent.TimeUnit.SECONDS);

    }

    public static AppiumDriverFactory getInstanceOfAppiumDriverFactory(String appPath) throws MalformedURLException {
        if (instanceOfAppiumDriverFactory == null) {
            instanceOfAppiumDriverFactory = new AppiumDriverFactory(appPath);
        }
        return instanceOfAppiumDriverFactory;
    }

    public static AndroidDriver getDriver() {
        return driver;
    }


}
