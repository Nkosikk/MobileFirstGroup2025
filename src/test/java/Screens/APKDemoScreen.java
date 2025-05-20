package Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class APKDemoScreen {
    private AndroidDriver driver;
    public APKDemoScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Text\"]")
    WebElement textView;

    public void ClickText() {
        textView.click();}

}
