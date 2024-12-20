package org.example;

public class Main {
    public static void main(String[] args) {

        String formula = "1 + 2 * 3 / 4";

        NumberSplitter numberSplitter = new NumberSplitter(formula);
        OperationSplitter operationSplitter = new OperationSplitter(formula);



        ResultPrinter resultPrinter = new ResultPrinter(0.0D);
        resultPrinter.printResult();
    }
}

