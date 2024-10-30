package org.example;

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

    private static final String SPLITTER = " ";

    Calculator(BiFunction<Double, Double, Double> operation) {
        this.operation = operation;
    }

    public static void printResultValue(String formula) {
        System.out.println(calculateFormula(formula));
    }

    private static Double calculateFormula(String formula) {
        SplitFormula splitFormula = new SplitFormulaBySplitter(formula, SPLITTER);
        IntegerNumbers integerNumbers = getIntegerNumbers(splitFormula);
        Operators operators = getOperators(splitFormula);

        return 0D;
    }

    private static IntegerNumbers getIntegerNumbers(SplitFormula splitFormula) {
        return new IntegerNumbers(splitFormula.getNumbers());
    }

    private static Operators getOperators(SplitFormula splitFormula) {
        return new Operators(splitFormula.getOperators());
    }
}
