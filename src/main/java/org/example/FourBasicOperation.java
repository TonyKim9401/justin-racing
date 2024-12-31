package org.example;

public class FourBasicOperation implements Operation{

    private final String FOUR_BASIC_OPERATION = "+-*/";
    private String fourBasicOperation;

    public FourBasicOperation(String operation) {
        validateOperation(operation);
        this.fourBasicOperation = operation;
    }

    private void validateOperation(String operation) {
        if (!FOUR_BASIC_OPERATION.contains(operation)) {
            throw new IllegalFourBasicOperationException(operation + " is not a valid four basic operation");
        }
    }

    @Override
    public String getOperation() {
        return this.fourBasicOperation;
    }
}
