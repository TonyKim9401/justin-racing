package org.example;

import java.util.ArrayList;
import java.util.List;

public class DoubleNumberSplitter implements InputNumberSplitter{

    private final List<DoubleNumber> doubleNumbers = new ArrayList<>();
    private final String[] numbers;
    private final String SPLITTER = " ";

    public DoubleNumberSplitter(String formula) {
        this.numbers = formula.split(SPLITTER);
    }

    public DoubleNumbers getDoubleNumbers() {
        return new DoubleNumbers(convertToDoubleList(this.numbers));
    }

    private List<DoubleNumber> convertToDoubleList(String[] numbers) {
        for (int i = 0; i < this.numbers.length; i += 2) {
            this.doubleNumbers.add(new DoubleNumber(numbers[i]));
        }
        return this.doubleNumbers;
    }
}
