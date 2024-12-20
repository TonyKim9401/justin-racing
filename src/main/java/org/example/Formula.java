package org.example;

import java.util.Scanner;

public class Formula {

    private String formula;
    private Scanner sc;

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
