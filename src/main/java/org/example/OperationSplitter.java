package org.example;

import java.util.ArrayList;
import java.util.List;

public class OperationSplitter {

    private final List<Operator> operations = new ArrayList<>();
    private final String[] splitFormula;

    public OperationSplitter(String formula, String splitter) {
        this.splitFormula = formula.split(splitter);
    }

    public Operators getOperators() {
        return new Operators(convertToOperatorList(this.splitFormula));
    }

    private List<Operator> convertToOperatorList(String[] splitFormula) {
        for (int i = 1; i < splitFormula.length; i += 2) {
            operations.add(new Operator(splitFormula[i]));
        }
        return this.operations;
    }
}
