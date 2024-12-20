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
    }

    public String getFormula() {
        return this.formula;
    }
}
