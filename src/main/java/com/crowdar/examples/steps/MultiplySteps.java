package com.crowdar.examples.steps;

import com.crowdar.examples.services.CalculatorService;
import io.cucumber.java.en.And;

public class MultiplySteps {
    @And("I press multiply button")
    public void multiply() {
        CalculatorService.multiply();
    }

}
