package org.step1.calculator;

import org.step1.operation.Operation;

public class FourBaseArithmeticCalculator implements Calculator {

    private static final int INVALID_DIVISOR = 0;

    @Override
    public int add(int a, int b) {
        return Operation.ADD.apply(a, b);
    }

    @Override
    public int subtract(int a, int b) {
        return Operation.SUBTRACT.apply(a, b);
    }

    @Override
    public int multiple(int a, int b) {
        return Operation.MULTIPLY.apply(a, b);
    }

    @Override
    public int divide(int a, int b) {
        validateDivisor(b);
        return Operation.DIVIDE.apply(a, b);

    }

    private void validateDivisor(int divisor) {
        if (divisor <= INVALID_DIVISOR) {
            throw new IllegalArgumentException("Invalid divisor");
        }
    }
}
