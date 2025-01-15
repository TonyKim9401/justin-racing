package org.step2.execution;

import org.step2.car.RacingCar;
import org.step2.car.RacingCars;

/**
 * RacingGame 실행 클래스
 */
public class RacingExecution {

    private final RacingCars cars;

    public RacingExecution(RacingCars cars) {
        this.cars = cars;
    }

    /**
     * 1. 실행 횟수 만큼 for loop 실행
     * 2. 파라미터를 Input 그대로 받기 vs Integer value 만 받기
     *
     * Input 을 파라미터로 받는데, Integer 값만 받는게 나을까?
     */
    public void executeRacingGame(Integer tryCount) {
        for (int i = 0; i < tryCount; i++) {
            this.cars.getCars().forEach(RacingCar::moveForward);
        }
    }
}
