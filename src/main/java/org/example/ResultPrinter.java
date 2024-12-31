package org.example;

public class ResultPrinter {
    private final Number number;

    public ResultPrinter(Number number) {
        this.number = number;
    }

    public void printResult() {
        System.out.println("result: " + this.number.getNumber());
    }
}
