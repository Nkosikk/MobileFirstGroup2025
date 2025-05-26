package Steps;

import io.cucumber.java.en.*;


public class APKDemoStepDef {

    @Given("I have a calculator")
    public void i_have_a_calculator() {

    }
    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        System.out.println("Adding " + int1 + " and "  + int2);
    }
    @Then("the result should be {int}")
    public void the_result_should_be(Integer rr) {
        System.out.println("int1");

    }


}
