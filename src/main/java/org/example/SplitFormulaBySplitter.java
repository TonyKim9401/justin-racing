package org.example;

import java.util.ArrayList;
import java.util.List;

class SplitFormulaBySplitter implements SplitFormula {

    private String inputValue;
    private String splitter;
    private String[] splitValues;

    public SplitFormulaBySplitter(String inputValue, String splitter) {
        this.inputValue = inputValue;
        this.splitter = splitter;
    }

    private void splitInputValue() {
        this.splitValues = this.inputValue.split(this.splitter);
    }

    @Override
    public List<IntegerNumber> getNumbers() {
        List<IntegerNumber> integerNumbers = new ArrayList<>();
        for (int i = 0; i < splitValues.length; i += 2) {
            integerNumbers.add(new IntegerNumber(splitValues[i]));
        }
        return integerNumbers;
    }

    @Override
    public List<Operator> getOperators() {
        List<Operator> operators = new ArrayList<>();
        for (int i = 1; i < splitValues.length; i += 2) {
            operators.add(new Operator(splitValues[i]));
        }
        return operators;
    }
}
