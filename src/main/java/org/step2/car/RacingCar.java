package org.step2.car;

import org.step2.condition.Condition;
import org.step2.output.Output;

/**
 * Car 의 기본 기능을 구현한 핵심 클래스인 RacingCar 클래스
 */
public class RacingCar implements Car {

    private int moveCount;
    private final Condition condition;
    private final Output output;

    /**
     * 생성시 condition 과 output 을 인자로 받고
     * 이동 값인 moveCount 를 0으로 초기화 한다
     */
    public RacingCar(Condition condition, Output output) {
        this.condition = condition;
        this.output = output;
        this.moveCount = 0;
    }

    /**
     * condition 에 따라 이동/미이동이 결정 됨
     */
    @Override
    public void moveForward() {
        if (this.condition.getConditionValue()) {
            this.moveCount += 1;
        }
    }

    /**
     * output 에 이동 거리를 보내어 출력하는 메소드
     */
    @Override
    public void showCurrentLocation() {
        this.output.printValue(this.moveCount);
    }
}
