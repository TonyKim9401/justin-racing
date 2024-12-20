package org.example;

public class DoubleNumber {

    private final Double number;

    public DoubleNumber(String inputValue) {
        validateInputIsDouble(inputValue);
        double doubleValue = Double.parseDouble(inputValue);
        validateDoubleIsPositive(doubleValue);
        this.number = doubleValue;
    }

    public Double getNumber() {
        return this.number;
    }

    private void validateDoubleIsPositive(double doubleValue) {
        if (doubleValue < 0) throw new ArithmeticException("Value should be bigger or equals to 0");
    }

    private void validateInputIsDouble(String inputValue) {
        try {
            Double.parseDouble(inputValue);
        } catch (NumberFormatException e ) {
            throw new NumberFormatException("Not a double value");
        }
    }
}
