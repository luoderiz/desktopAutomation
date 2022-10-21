package com.crowdar.examples.steps;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CalculatorConstants;
import com.crowdar.examples.services.CalculatorService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlusSteps {

    @When("I input (.*)")
    public void inputNumber(String number) {
        CalculatorService.inputNumber(number);
    }

    @And("I press plus button")
    public void plus() {
        CalculatorService.plus();
    }

    @Then("I get (.*)")
    public void result(String expectedResult) {
        ActionManager.click(CalculatorConstants.EQUAL);
        CalculatorService.result(expectedResult);
    }

}
