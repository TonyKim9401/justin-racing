package org.example;

import java.util.Scanner;
import org.calculator.Calculator;
import org.calculator.FourBaseArithmeticCalculator;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new FourBaseArithmeticCalculator();
        while (true) {
            String inputValue = userInput();

            if (stopCheck(inputValue)) break;

            String[] inputList = calculator.inputSplit(inputValue);

            String resultValue = inputList[0];

            for (int i = 1; i < inputList.length; i++) {
                resultValue = calculator.getResult(inputList[i++], resultValue, inputList[i]);
            }
            System.out.println(inputValue + " = " + resultValue);
        }
    }

    public static String userInput() {
        return new Scanner(System.in).nextLine();
    }

    public static boolean stopCheck(String inputValue) {
        return inputValue.equals("stop");
    }
}
