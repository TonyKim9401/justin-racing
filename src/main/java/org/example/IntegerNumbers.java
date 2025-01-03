package org.example;

import java.util.ArrayList;
import java.util.List;

public class IntegerNumbers implements Numbers{

    private final List<IntegerNumber> integerNumbers = new ArrayList<>();
    private final Integer INDEX = 0;

    public IntegerNumbers(String[] splitFormulaResult) {
        convertToIntegerNumbers(splitFormulaResult);
    }

    private void convertToIntegerNumbers(String[] splitFormulaResult) {
        for (int i = 0; i < splitFormulaResult.length; i+=2) {
            this.integerNumbers.add(new IntegerNumber(splitFormulaResult[i]));
        }
    }

    /**
     * 메서드의 목적은 리스트의 0번째를 반환
     */
    @Override
    public Number getTheFirstNumber() {
        Number theFirstNumber = integerNumbers.get(INDEX);
        this.integerNumbers.remove(theFirstNumber);
        return theFirstNumber;
    }
}
