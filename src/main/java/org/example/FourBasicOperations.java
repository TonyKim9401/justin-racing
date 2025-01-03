package org.example;

import java.util.ArrayList;
import java.util.List;

public class FourBasicOperations implements Operations{

    private final List<Operation> fourBasicOperations = new ArrayList<>();
    private final Integer INDEX = 0;

    public FourBasicOperations(String[] splitFormulaResult) {
        convertToFourBasicOperations(splitFormulaResult);
    }

    // 수식을 각 숫자, 연산자를 구분하는 더 좋은 방법이 있을까?
    private void convertToFourBasicOperations(String[] splitFormulaResult) {
        for (int i = 1; i < splitFormulaResult.length; i+=2) {
            this.fourBasicOperations.add(new FourBasicOperation(splitFormulaResult[i]));
        }
    }

    @Override
    public Operation getTheFirstOperation() {
        Operation fourBasicOperation = this.fourBasicOperations.get(INDEX);
        this.fourBasicOperations.remove(fourBasicOperation);
        return fourBasicOperation;
    }

    @Override
    public boolean checkOperationsIsEmpty() {
        return !fourBasicOperations.isEmpty();
    }
}
