package org.example;

public class ResultPrinter {
    private final Integer result;

    public ResultPrinter(Integer result) {
        this.result = result;
    }

    public void printResult() {
        System.out.println("result: " + this.result);
    }
}
