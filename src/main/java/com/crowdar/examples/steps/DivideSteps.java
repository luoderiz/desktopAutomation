package com.crowdar.examples.steps;

import com.crowdar.examples.services.CalculatorService;
import io.cucumber.java.en.And;

public class DivideSteps {
    @And("I press divide button")
    public void divide() {
        CalculatorService.divide();
    }

}
