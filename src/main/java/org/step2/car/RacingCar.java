package org.step2.car;

import java.util.ArrayList;
import java.util.List;
import org.step2.condition.Condition;

/**
 * Car 의 기본 기능을 구현한 핵심 클래스인 RacingCar 클래스
 */
public class RacingCar implements Car {

    private final Condition condition;
    private final List<Log> carLogs = new ArrayList<>();

    private int moveCount;


    public RacingCar(Condition condition) {
        this.condition = condition;
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
        this.carLogs.add(new CarLog(this.moveCount));
    }
}
