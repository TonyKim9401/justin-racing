package org.example;

public class FourBasicOperation implements Operation{

    // 연산자중 사칙연산자만 관리
    private final String FOUR_BASIC_OPERATION = "+-*/";
    private final String fourBasicOperation;

    public FourBasicOperation(String operation) {
        validateOperation(operation);
        this.fourBasicOperation = operation;
    }

    // validateOperation 의 경우 모든 연산자 클래스에 공통으로 있어야 할 것 같아
    // interface 에 추가하고 싶은데, 캡슐화를 하려면 private 로 설정 해 줘야 하는데 어떻게 처리하면 될까?
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
