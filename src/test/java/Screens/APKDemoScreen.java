package Screens;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class APKDemoScreen {
    private AndroidDriver driver;
    public APKDemoScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Text\"]")
    WebElement textView;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Marquee\"]")
    WebElement marqueeTextView;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
    WebElement viewsTextView;


    public void ClickText() {
        textView.click();}

    public void ClickMarquee() {
        marqueeTextView.click();
    }
    public void ClickViews() {
        viewsTextView.click();
    }
    public static void scrollDown(AndroidDriver driver) {
        Dimension dimension = driver.manage().window().getSize();
        int startX = dimension.width / 2;
        int startY = (int) (dimension.height * 0.8);
        int endY = (int) (dimension.height * 0.2);

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }
    public static void scrollUp(AndroidDriver driver) {
        Dimension dimension = driver.manage().window().getSize();
        int startX = dimension.width / 2;
        int startY = (int) (dimension.height * 0.2);
        int endY = (int) (dimension.height * 0.8);

        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

}
