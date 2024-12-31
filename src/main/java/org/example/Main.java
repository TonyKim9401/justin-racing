package org.example;

public class Main {
    public static void main(String[] args) {

//        Formula formula = new Formula();
//        String inputFormula = formula.getFormula();
//        Input 이라는 추상화를 통해 Formula Input 으로 구체화 해도 괜찮을듯

        String inputFormula = "1 + 2 * 3 / 4";

        String[] splitFormulaResult = new SpaceSplitter(inputFormula).getSplitResult();

        Number number = Calculator.calculateFormula(
                new IntegerNumbers(splitFormulaResult),
                new FourBasicOperations(splitFormulaResult)
        );
        ResultPrinter resultPrinter = new ResultPrinter(number);

        resultPrinter.printResult();
    }
}
