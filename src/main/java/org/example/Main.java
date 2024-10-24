package org.example;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

        // 문자 입력
        // 계산기 돌림
        // 결과 반환
        String input = "2 + 3 * 4 / 2";
        Double resultValue = Calculator.returnResultValue(new SplitFormulaBySplitter(input, " ").splitInputValue());

        System.out.println(resultValue);
    }
}

