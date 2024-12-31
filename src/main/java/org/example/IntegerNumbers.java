package org.example;

import java.util.List;

public class IntegerNumbers implements Numbers{

    private List<IntegerNumber> integerNumbers;
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
     * 메서드의 목적은 리스트의 0번째를 반환하는 것이기 때문에 remove 도
     * 그대로 INDEX 를 사용하여 삭제 함
     */
    @Override
    public Number getTheFirstNumber() {
        Number theFirstNumber = integerNumbers.get(INDEX);
        this.integerNumbers.remove(INDEX);
        return theFirstNumber;
    }
}
