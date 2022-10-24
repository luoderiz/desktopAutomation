package com.crowdar.examples.steps;

import com.crowdar.examples.services.CalculatorService;
import io.cucumber.java.en.And;

public class MinusSteps {
    @And("I press minus button")
    public void minus() {
        CalculatorService.minus();
    }
}
