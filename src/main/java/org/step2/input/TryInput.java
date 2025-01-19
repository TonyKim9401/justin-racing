package org.step2.input;

import java.util.Scanner;

public class TryInput implements Input {

    private int tryInputValue;
    private final Scanner scanner;

    public TryInput(Scanner scanner) {
        this.scanner = scanner;
        initializingInputMessage();
        inputTryCountFromUser();
    }

    private void initializingInputMessage() {
        System.out.println("시도할 회수는 몇 회 인가요?");
    }

    private void inputTryCountFromUser() {
        this.tryInputValue = scanner.nextInt();
    }

    @Override
    public int getInputValue() {
        return this.tryInputValue;
    }
}
