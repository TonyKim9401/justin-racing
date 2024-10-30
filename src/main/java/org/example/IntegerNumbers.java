package org.example;

import java.util.List;

public class IntegerNumbers {

    private final List<IntegerNumber> integerNumbers;

    public IntegerNumbers(List<IntegerNumber> integerNumbers) {
        this.integerNumbers = integerNumbers;
    }

    public List<IntegerNumber> getIntegerNumbers() {
        return this.integerNumbers;
    }
}
