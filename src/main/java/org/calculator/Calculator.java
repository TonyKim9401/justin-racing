package org.calculator;

public interface Calculator {

    String[] inputSplit(String input);

    void operatorValidation(String operator);

    int stringToIntConvertor(String stringValue);

    int addition(int a, int b);

    int deduction(int a, int b);

    int multiplication(int a, int b);

    int division(int a, int b);

    String getResult(String operator, String a, String b);
}
