package org.example;

import java.util.ArrayList;
import java.util.List;

public class OperatorSplitterBySpace implements OperatorSplitter{

    private String[] formulaValues;
    private List<String> operatorValues = new ArrayList<>();

    public OperatorSplitterBySpace(String formula, String splitter) {
        this.formulaValues = formula.split(splitter);
    }

    @Override
    public List<String> getOperatorValues() {
        for (int i = 1; i < formulaValues.length; i += 2) {
            // 연산자 검증 등을 위한 새로운 클래스 필요
            operatorValues.add(formulaValues[i]);
        }
        return operatorValues;
    }
}
