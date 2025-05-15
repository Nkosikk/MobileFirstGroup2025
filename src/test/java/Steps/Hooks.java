package Steps;

import Utils.AppiumDriverFactory;
import io.appium.java_client.android.AndroidDriver;

public class Hooks {
    protected static AndroidDriver driver;

    public Hooks() {
        this.driver = AppiumDriverFactory.getDriver();
    }
}
