package org.step2;

import java.util.Scanner;

public class TryInput implements Input{

    private int tryInputValue;

    public TryInput() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        inputTryCountFromUser();
    }

    private void inputTryCountFromUser() {
        Scanner scanner = new Scanner(System.in);
        this.tryInputValue = scanner.nextInt();
//        scanner.close();
    }

    @Override
    public int getInputValue() {
        return this.tryInputValue;
    }
}
