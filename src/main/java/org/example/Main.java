package org.example;

import java.util.Scanner;
import org.step1.calculator.Calculator;
import org.step1.calculator.FourBaseArithmeticCalculator;
import org.step1.convertor.Convertor;
import org.step1.convertor.ConvertorImpl;
import org.step1.spliter.Spliter;
import org.step1.spliter.SpliterImpl;
import org.step1.validator.Validator;
import org.step1.validator.ValidatorImpl;

public class Main {

    public static void main(String[] args) {

        Spliter spliter = new SpliterImpl();
        Calculator calculator = new FourBaseArithmeticCalculator();
        Convertor convertor = new ConvertorImpl();
        Validator validator = new ValidatorImpl();
        Scanner scannerValue;

        while (true) {
            scannerValue = new Scanner(System.in);
            String inputValue = scannerValue.nextLine();

            if (breakChecker(inputValue)) break;

            String[] stringArray = spliter.splitInsertValue(inputValue);

            String targetA = stringArray[0];
            for (int i = 1; i < stringArray.length; i += 2) {
                String operator = stringArray[i];
                validator.validateOperator(operator);

                String targetB = stringArray[i + 1];
                int intA = convertor.convertStringToInteger(targetA);
                int intB = convertor.convertStringToInteger(targetB);

                switch (operator) {
                    case "+" -> intA = calculator.add(intA, intB);
                    case "-" -> intA = calculator.subtract(intA, intB);
                    case "*" -> intA = calculator.multiple(intA, intB);
                    case "/" -> intA = calculator.divide(intA, intB);
                }

                targetA = convertor.convertIntegerToString(intA);
            }
            System.out.println("result: " + targetA);
        }
    }

    private static boolean breakChecker(String inputValue) {
        return inputValue.equals("break");
    }
}
