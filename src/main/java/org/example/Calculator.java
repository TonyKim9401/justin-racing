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

    public static Number calculateFormula(Numbers integerNumbers, Operations fourBasicOperations) {
        Number calculateResult = integerNumbers.getTheFirstNumber();

        while (fourBasicOperations.checkOperationsIsEmpty()) {
            Operation theFirstOperation = fourBasicOperations.getTheFirstOperation();
            calculateResult = new IntegerNumber(applyOperation(
                                                    // 해당 연산자를 찾는 더 좋은 방법이 있을까?
                                                    getOperator(theFirstOperation.getOperation()),
                                                    calculateResult,
                                                    integerNumbers.getTheFirstNumber()
                                                ));
        }

        return calculateResult;
    }

    // 1. calculateResult? prevNumber?
    // 2. calculation.operation.apply 에 파라미터로 int? Number?
    // -> BiFunction 의 제네릭 자체를 추상화 할 수 있는걸까?
    private static Integer applyOperation(Calculator calculation, Number calculateResult, Number nextNumber) {
        return calculation.operation.apply(calculateResult.getNumber(), nextNumber.getNumber());
    }
}
