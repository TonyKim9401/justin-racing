package org.example;

public class Operator {
    private final String VALID_OPERATOR = "+-/*";
    private final String operator;

    public Operator(String operator) {
        validateOperator(operator);
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    private void validateOperator(String operator) {
        if (!VALID_OPERATOR.contains(operator)) {
           throw new IllegalArgumentException("Not a valid operator");
        }
    }
}
