package org.step2.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.step2.condition.Condition;

/**
 * Car 의 기본 기능을 구현한 핵심 클래스인 RacingCar 클래스
 */
public class RacingCar {

    private Integer carRanking;
    private final Condition condition;
    private final List<CarLog> carLogs = new ArrayList<>();

    private Integer position;


    public RacingCar(Integer carRanking, Condition condition) {
        this.carRanking = carRanking;
        this.condition = condition;
        this.position = 0;
    }

    public Integer checkCarRanking() {
        return this.carRanking;
    }

    public List<CarLog> getCarLogs() {
        return Collections.unmodifiableList(this.carLogs);
    }

    /**
     * condition 에 따라 이동 / 미이동이 결정 됨
     */
    public void moveForward() {
        /**
         * 테스트 코드 작성시
         * 1. if 문에 따른 this.position 의 값 변화 비교
         * 2. 메소드 실행시 카운트와 this.carLogs 의 사이즈 비교
         * 로 진행하면 되지 않을까?
         */
        if (this.condition.getConditionValue()) {
            this.position += 1;
        }
        this.carLogs.add(new CarLog(this.position));
    }
}
