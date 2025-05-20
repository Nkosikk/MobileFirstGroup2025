package Steps;

import Screens.APKDemoScreen;
import Screens.calculatorScreen;
import Utils.AppiumDriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.*;

import java.net.MalformedURLException;

public class APKDemoStepsDef {

    private AndroidDriver driver;
    Screens.APKDemoScreen APKDemoScreen;

    @Given("I have an APKDemo app")
    public void i_have_an_apk_demo_app() {
    }
    @And("I click on the Marquee text")
    public void i_click_on_the_marquee_text() {
    }
    @When("I confirm the text on Marquee")
    public void i_confirm_the_text_on_marquee() {
    }
    @Then("the result should be {string}")
    public void the_result_should_be(String string) {
    }


}