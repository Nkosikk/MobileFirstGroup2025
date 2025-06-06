package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features/Calculator.feature",
        glue = {"Steps"},
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        tags = "@calculator"
)
public class CalculatorRunner extends AbstractTestNGCucumberTests {
}
