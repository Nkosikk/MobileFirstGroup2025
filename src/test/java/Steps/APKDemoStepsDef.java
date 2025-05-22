package Steps;

import Screens.APKDemoScreen;
import Screens.calculatorScreen;
import Utils.AppiumDriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.*;

import java.net.MalformedURLException;

public class APKDemoStepsDef {

    private AndroidDriver driver;
    APKDemoScreen aPKDemoScreen;

    @Given("I have an APKDemo app")
    public void i_have_an_apk_demo_app() throws MalformedURLException {
        String appPath = System.getProperty("user.dir") + "/src/main/Apps/ApiDemos-debug.apk";
        AppiumDriverFactory.getInstanceOfAppiumDriverFactory(appPath);
        this.aPKDemoScreen = new APKDemoScreen(AppiumDriverFactory.getDriver());
    }
    /*@And("I click on the Marquee text")
    public void i_click_on_the_TextView_text() {
        aPKDemoScreen.ClickText();
    }*/
    @When("I click on the Marquee text")
    public void i_click_on_the_marquee_text() {
        aPKDemoScreen.ClickMarquee();
    }
    @Then("the result should be {string}")
    public void the_result_should_be(String string) {
    }

    @And("I click on the TextView text")
    public void iClickOnTheTextViewText() {
        aPKDemoScreen.ClickText();
    }

    @And("I click on the Views text")
    public void iClickOnTheTextViewsText() throws InterruptedException {
        Thread.sleep(5000);
        aPKDemoScreen.ClickViews();
        Thread.sleep(5000);
        aPKDemoScreen.scrollDown(AppiumDriverFactory.getDriver());

    }
}