package org.step1.convertor;

public class ConvertorImpl implements Convertor{

    @Override
    public int convertStringToInteger(String stringValue) {
        int output;
        try {
            output = Integer.parseInt(stringValue);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid int value");
        }
        return output;
    }

    @Override
    public String convertIntegerToString(int IntegerValue) {
        return String.valueOf(IntegerValue);
    }
}
