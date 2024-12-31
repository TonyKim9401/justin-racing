package org.example;

public class IntegerNumber implements Number{

    private Integer integerNumber;

    public IntegerNumber(String stringNumber) {
        validateNumber(stringNumber);
        convertToNumber(stringNumber);
    }

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
