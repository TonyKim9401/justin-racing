package org.example;

import java.util.*;

public class NumberSplitterBySpace implements NumberSplitter{

    private final String[] formulaValues;
    private final List<Integer> integerValues = new ArrayList<>();

    public NumberSplitterBySpace(String formula, String splitter) {
        this.formulaValues = formula.split(splitter);
    }

    @Override
    public List<Integer> getNumberValues() {
        for (int i = 0; i < formulaValues.length; i += 2) {
            // Integer 검증 등을 위한 새로운 클래스 필요
            integerValues.add(Integer.parseInt(formulaValues[i]));
        }
        return integerValues;
    }
}
