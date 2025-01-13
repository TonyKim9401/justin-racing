package org.step2;

import java.util.Scanner;

public class CarInput implements Input {

    private int carCountInput;

    public CarInput() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        inputCarCountFromUser();
    }

    private void inputCarCountFromUser() {
        Scanner scanner = new Scanner(System.in);
        this.carCountInput = scanner.nextInt();
//        scanner.close();
    }

    @Override
    public int getInputValue() {
        return this.carCountInput;
    }
}
