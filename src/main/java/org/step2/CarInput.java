package org.step2;

import java.util.Scanner;

/**
 * Car 와 관련한 모든 외부에서의 Input 만을 담당하는 클래스
 */
public class CarInput implements Input {

    private int carCountInput;

    public CarInput() {
        initializingInputMessage();
        inputCarCountFromUser();
    }

    /**
     * 초기화 메세지의 경우 CarOutput 에 두고 싶었으나
     * 1. 의존 관계가 꼬임
     * 2. Input 클래스 초기화에 필요한 고유한 작업
     * 이라고 생각하여 input 에 위치시킴
     */
    private void initializingInputMessage() {
        System.out.println("자동차 대수는 몇 대 인가요?");
    }

    /**
     * Scanner 가 Input 을 구현하는 모든 클래스에서 사용 될텐데
     * static 으로 하나만 만들어서 사용 하려면 어떻게 사용하면 좋을지?
     */
    private void inputCarCountFromUser() {
        Scanner scanner = new Scanner(System.in);
        this.carCountInput = scanner.nextInt();
    }

    @Override
    public int getInputValue() {
        return this.carCountInput;
    }
}
