package org.step1.validator;

public class ValidatorImpl implements Validator{

    private static final String OPERATORS = "+-*/";

    public void validateOperator(String operator) {
        if (!OPERATORS.contains(operator))
            throw new IllegalArgumentException("Invalid operator");
    }
}
