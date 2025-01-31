package org.step2.car;

import java.util.List;
import org.step2.condition.Condition;

/**
 * Car 의 기본 기능을 구현한 핵심 클래스인 RacingCar 클래스
 */
public class RacingCar {

    private final Condition condition;

    private Integer carSequence;
    private Integer position;
    private Integer racingExecuteSequence;
    private CarLogs carLogs;


    public RacingCar(Integer carSequence, Condition condition) {
        this.carSequence = carSequence;
        this.condition = condition;
        this.position = 0;
        this.racingExecuteSequence = 0;
        this.carLogs = new CarLogs();
    }

    /**
     * condition 에 따라 이동 / 미이동이 결정 됨
     */
    public void moveForward() {
        checkMoveCondition();
        recordCarLog();
        increaseRacingExecuteSequence();
    }

    private void checkMoveCondition() {
        if (this.condition.getConditionValue()) this.position += 1;
    }

    private void recordCarLog() {
        this.carLogs.addNewCarLog(new CarLog(this.racingExecuteSequence, this.position));
    }

    private void increaseRacingExecuteSequence() {
        this.racingExecuteSequence += 1;
    }


    public Integer checkCarSequence() {
        return this.carSequence;
    }

    public CarLog getCarLogByTryCount(Integer tryCount) {
        return this.carLogs.getLogByTryCount(tryCount);
    }

    public List<CarLog> getCarLogs() {
        return this.carLogs.getCarLogs();
    }

    public Integer getPosition() {
        return this.position;
    }

    public Integer getRacingExecuteSequence() {
        return this.racingExecuteSequence;
    }
}