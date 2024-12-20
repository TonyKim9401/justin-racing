package org.example;

public class ResultPrinter {
    private final Double result;

    public ResultPrinter(Double result) {
        this.result = result;
    }

    public void printResult() {
        System.out.println("result: " + this.result);
    }
}
