package org.step2;

import java.util.Scanner;

public class TryInput implements Input {

    private int tryInputValue;

    public TryInput() {
        initializingInputMessage();
        inputTryCountFromUser();
    }

    private void initializingInputMessage() {
        System.out.println("시도할 회수는 몇 회 인가요?");
    }

    private void inputTryCountFromUser() {
        Scanner scanner = new Scanner(System.in);
        this.tryInputValue = scanner.nextInt();
    }

    @Override
    public int getInputValue() {
        return this.tryInputValue;
    }
}
