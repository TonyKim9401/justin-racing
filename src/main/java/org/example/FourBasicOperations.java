package org.example;

import java.util.List;

public class FourBasicOperations implements Operations{

    private List<Operation> fourBasicOperations;
    private final Integer INDEX = 0;

    public FourBasicOperations(String[] splitFormulaResult) {
        convertToFourBasicOperations(splitFormulaResult);
    }

    private void convertToFourBasicOperations(String[] splitFormulaResult) {
        for (int i = 1; i < splitFormulaResult.length; i+=2) {
            this.fourBasicOperations.add(new FourBasicOperation(splitFormulaResult[i]));
        }
    }

    @Override
    public Operation getTheFirstOperation() {
        Operation fourBasicOperation = fourBasicOperations.get(INDEX);
        this.fourBasicOperations.remove(INDEX);
        return fourBasicOperation;
    }

    @Override
    public boolean checkOperationsIsEmpty() {
        return !fourBasicOperations.isEmpty();
    }
}
