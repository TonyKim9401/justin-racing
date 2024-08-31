package org.calculator;

public class FourBaseArithmeticCalculator implements Calculator {

    private static final int INVALID_DIVISOR = 0;
    private static final String SPLIT_STANDARD = " ";
    private static final String OPERATORS = "+-*/";

    @Override
    public String[] inputSplit(String input) {
        String[] output = input.split(SPLIT_STANDARD);
        return output;
    }

    @Override
    public void operatorValidation(String operator) {
        if (!OPERATORS.contains(operator))
            throw new IllegalArgumentException("Invalid operator");
    }

    @Override
    public int addition(int a, int b) {
        int output = a + b;
        return output;
    }

    @Override
    public int deduction(int a, int b) {
        int output = a - b;
        return output;
    }

    @Override
    public int multiplication(int a, int b) {
        int output = a * b;
        return output;
    }

    @Override
    public int division(int a, int b) {
        divisorValidation(b);
        int output = a > b ? a / b : 0;
        return output;
    }

    @Override
    public int stringToIntConvertor(String stringValue) {
        int output;
        try {
            output = Integer.parseInt(stringValue);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid int value");
        }
        return output;
    }

    private void divisorValidation(int divisor) {
        if (divisor <= INVALID_DIVISOR) {
            throw new IllegalArgumentException("Invalid divisor");
        }
    }

    public String getResult(String operator, String numberA, String numberB) {
        operatorValidation(operator);
        int a = stringToIntConvertor(numberA);
        int b = stringToIntConvertor(numberB);

        int result = 0;
        switch (operator) {
            case "+" -> result = addition(a, b);
            case "-" ->  result = deduction(a, b);
            case "*" ->  result = multiplication(a, b);
            case "/" ->  result = division(a, b);
        }
        return String.valueOf(result);
    }
}
