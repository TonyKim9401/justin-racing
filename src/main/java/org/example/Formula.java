package org.example;

import java.util.Scanner;

public class Formula {

    private String formula;
    private Scanner sc;

    // formula 는 수식의 저장 및 호출 용도로 사용
    // new Scanner 를 사용한 입력 기능은 추상화하여 따로 만드는게 나을듯 함 -> 책임 분리
    public Formula() {
        inputFormulaFromUser();
    }

    private void inputFormulaFromUser() {
        this.sc = new Scanner(System.in);
        this.formula = sc.nextLine();
        this.sc.close();
        validateNullOrEmpty();
    }

    public String getFormula() {
        return this.formula;
    }

    private void validateNullOrEmpty() {
        if (this.formula.isEmpty()) {
            throw new IllegalArgumentException("공백이나 빈 값은 입력할 수 없습니다.");
        }
    }
}
