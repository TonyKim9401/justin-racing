package org.example;

public class IntegerNumber implements Number{

    // 필드도 추상화 하면 안될까? wrapping 하려면 어떻게 해야할까?
    private Integer integerNumber;

    // 입력 수식의 숫자 생성용
    public IntegerNumber(String stringNumber) {
        validateNumber(stringNumber);
        convertToNumber(stringNumber);
    }

    // 계산중 다음 숫자 생성용을 오버로딩 없이 구현하는더 좋은 방법은 뭘까
    public IntegerNumber(Integer integerNumber) {
        this.integerNumber = integerNumber;
    }

    private void convertToNumber(String stringNumber) {
        this.integerNumber = Integer.parseInt(stringNumber);
    }

    private void validateNumber(String stringNumber) {
        try {
            Integer.parseInt(stringNumber);
        } catch (NumberFormatException e) {
            System.out.println(stringNumber + " is not a valid number");
        }
    }

    @Override
    public Integer getNumber() {
        return this.integerNumber;
    }
}
