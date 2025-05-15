package Steps;

import Screens.calculatorScreen;
import Utils.AppiumDriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.*;

import java.net.MalformedURLException;

public class stepsDef {

    private AndroidDriver driver;
    calculatorScreen calculatorScreen;

    @Given("I have a calculator")
    public void i_have_a_calculator() throws MalformedURLException {

        String appPath = System.getProperty("user.dir") + "/src/main/Apps/Calculator.apk";
        AppiumDriverFactory.getInstanceOfAppiumDriverFactory(appPath);
        this.calculatorScreen = new calculatorScreen(AppiumDriverFactory.getDriver());


    }

    @Given("i click on the number {int}")
    public void i_click_on_the_number(Integer int1) {
        calculatorScreen.pressDigits(int1);
    }

    @And("i clik the PLUS {string} button")
    public void iClikThePLUSButton(String operator) {
        calculatorScreen.pressOperators(operator);
    }
    @And("i click the send number {int}")
    public void iClickTheSendNumber(Integer int1) {
        calculatorScreen.pressDigits(int1);
    }


    @Then("the result should be {int}")
    public void the_result_should_be(Integer int1) {
        calculatorScreen.verifyResults(int1);
    }


    @When("i click on the EQUALS {string} button")
    public void iClickOnTheEQUALSButton(String operator) {
        calculatorScreen.pressOperators(operator);
    }
}
