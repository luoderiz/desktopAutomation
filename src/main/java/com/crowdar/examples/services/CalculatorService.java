package com.crowdar.examples.services;

import org.testng.Assert;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CalculatorConstants;

public class CalculatorService {

	private CalculatorService() {}

	public static void plus() {
    	ActionManager.click(CalculatorConstants.PLUS);
    }

    public static void minus() {
        ActionManager.click(CalculatorConstants.MINUS);
    }

    public static void multiply() {
        ActionManager.click(CalculatorConstants.MULTIPLY);
    }

    public static void divide() {
        ActionManager.click(CalculatorConstants.DIVIDE);
    }

    public static void inputNumber(String number) {
        for (int i = 0; i < number.length(); i++) {
            String digit;
            digit = String.format(CalculatorConstants.NUMBER, number.charAt(i));
            ActionManager.click(digit);
        }
    }

    public static void result(String expectedResult) {
        Assert.assertEquals(getResult(), expectedResult);
    }
    
    public static String getResult() {
		return ActionManager.getText(CalculatorConstants.RESULT).replaceAll("\\D+", "").trim();
    }
}
