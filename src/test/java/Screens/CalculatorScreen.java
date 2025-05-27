package Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorScreen {


    private AndroidDriver driver;

@FindBy(xpath = "//android.widget.ImageButton[@content-desc='5']")
 WebElement button5;

@FindBy(xpath = "//android.widget.ImageButton[@content-desc='3']")
WebElement button3;
}


//
//
//        @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Text\"]")
//        WebElement textView;
//
//        @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Marquee\"]")
//        WebElement marqueeTextView;
//        @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
//        WebElement viewsTextView;
//
//
//        public void ClickText() {
//            textView.click();}
//
//        public void ClickMarquee() {
//            marqueeTextView.click();
//        }
//        public void ClickViews() {
//            viewsTextView.click();
//        }
//        public static void scrollDown(AndroidDriver driver) {
//            Dimension dimension = driver.manage().window().getSize();
//            int startX = dimension.width / 2;
//            int startY = (int) (dimension.height * 0.8);
//            int endY = (int) (dimension.height * 0.2);
//
//            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//            Sequence swipe = new Sequence(finger, 0);
//
//            // Press at the start point
//            swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
//            swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//
//            // Move to the end point
//            swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), startX, endY));
//            swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//
//            driver.perform(Arrays.asList(swipe));
//            driver.perform(Arrays.asList(swipe));
//            driver.perform(Arrays.asList(swipe));
//        }
//        public static void scrollUp(AndroidDriver driver) {
//            Dimension dimension = driver.manage().window().getSize();
//            int startX = dimension.width / 2;
//            int startY = (int) (dimension.height * 0.2);
//            int endY = (int) (dimension.height * 0.8);
//
//            TouchAction action = new TouchAction(driver);
//            action.press(PointOption.point(startX, startY))
//                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//                    .moveTo(PointOption.point(startX, endY))
//                    .release()
//                    .perform();















