package org.example;

import java.util.function.BiFunction;

enum Calculator {

    ADD("+", (a, b) -> a + b),
    SUBTRACT("-", (a, b) -> a - b),
    MULTIPLY("*", (a, b) -> a * b),
    DIVIDE("/", (a, b) -> {
        if (b == 0) throw new ArithmeticException("0으로는 나눌 수 없습니다.");
        return a / b;
    });

    public final String operator;
    public final BiFunction<Double, Double, Double> operation;

    Calculator(String operator, BiFunction<Double, Double, Double> operation) {
        this.operator = operator;
        this.operation = operation;
    }

    public static Calculator fromOperator(String operator) {
        for (Calculator cal : values()) {
            if (cal.operator.equals(operator)) return cal;
        }
        throw new IllegalArgumentException("잘못된 연산자 입니다.");
    }

    public Double apply(Double a, Double b) {
        return operation.apply(a, b);
    }
}
