package org.example;

import java.util.List;

public class DoubleNumbers {

    private final List<DoubleNumber> doubleNumbers;

    public DoubleNumbers(List<DoubleNumber> doubleNumbers) {
        this.doubleNumbers = doubleNumbers;
    }

    public DoubleNumber getDoubleNumber() { // IntegerPlusOne 이라는 객체를 만들듯, Justin
        if (doubleNumbers.isEmpty()) {
            throw new NullPointerException("No more double number exist");
        }
        DoubleNumber doubleNumber = doubleNumbers.get(0);
        doubleNumbers.remove(0);
        return doubleNumber;
    }
}
