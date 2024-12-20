package org.example;

public class Main {
    public static void main(String[] args) {

//        Formula formula = new Formula();
//        String inputFormula = formula.getFormula();

        String inputFormula = "1 + 2 * 3 / 4";
        Splitter splitter = new Splitter(" ");
        String standardSplitter = splitter.getSplitter();

        ResultPrinter resultPrinter = new ResultPrinter(Calculator.calculateFormula(
                new NumberSplitterBySpace(inputFormula, standardSplitter),
                new OperatorSplitterBySpace(inputFormula, standardSplitter)
        ));
        resultPrinter.printResult();
    }
}

