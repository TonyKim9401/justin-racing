package org.example;

import java.util.List;
import java.util.function.BiFunction;

enum Calculator {

    ADD((a, b) -> a + b),
    SUBTRACT((a, b) -> a - b),
    MULTIPLY((a, b) -> a * b),
    DIVIDE((a, b) -> {
        if (b == 0) {
            throw new ArithmeticException("0으로는 나눌 수 없습니다.");
        }
        return a / b;
    });

    public final BiFunction<Double, Double, Double> operation;

    Calculator(BiFunction<Double, Double, Double> operation) {
        this.operation = operation;
    }

    public static Double returnResultValue(String[] inputValue) {
        return calculateFormula(inputValue);
    }

    private static Double calculateFormula(String[] inputValue) {

    }

}
