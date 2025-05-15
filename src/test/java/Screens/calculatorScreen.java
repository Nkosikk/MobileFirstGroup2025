package Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class calculatorScreen {
    private AndroidDriver driver;

    @FindBy(xpath = "com.google.android.calculator:id/op_add")
    WebElement plus;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    WebElement finalResults;

    public calculatorScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void pressDigits(int digit) {
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + digit)).click();
    }

    public void pressOperators(String operator) {
        driver.findElement(By.id("com.google.android.calculator:id/" + operator)).click();
    }

    public void verifyResults(Integer ExpectedResults) {

        int ActualResults = Integer.parseInt(finalResults.getText());

        if (ExpectedResults == ActualResults) {
            assert true;
        } else {
            assert false;
        }
    }
}
