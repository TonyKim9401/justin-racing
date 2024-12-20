package org.example;

import java.util.List;
import java.util.function.BiFunction;

enum Calculator {

    ADD("+", (a, b) -> a + b),
    SUBTRACT("-", (a, b) -> a - b),
    MULTIPLY("*", (a, b) -> a * b),
    DIVIDE("/", (a, b) -> {
        if (b == 0) throw new ArithmeticException("0으로는 나눌 수 없습니다.");
        return a / b;
    });

    private final String operator;
    private final BiFunction<Integer, Integer, Integer> operation;

    Calculator(String operator, BiFunction<Integer, Integer, Integer> operation) {
        this.operator = operator;
        this.operation = operation;
    }

    private static Calculator getOperator(String operator) {
        return List.of(values())
                .stream()
                .filter(op -> op.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("유효하지 않은 연산자입니다."));
    }

    public static Integer calculateFormula(NumberSplitter inputSplitter, OperatorSplitter operatorSplitter) {
        List<Integer> numberValues = inputSplitter.getNumberValues();
        List<String> operatorValues = operatorSplitter.getOperatorValues();

        Integer calculateResult = numberValues.get(0);

        for (int i = 0; i < operatorValues.size(); i++) {
            String operator = operatorValues.get(i);
            Integer nextNumber = numberValues.get(i+1);

            Calculator calculation = getOperator(operator);
            calculateResult = calculation.operation.apply(calculateResult, nextNumber);
        }

        return calculateResult;
    }
}
