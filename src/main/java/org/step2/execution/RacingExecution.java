package org.step2.execution;

import org.step2.car.RacingCar;
import org.step2.car.RacingCars;

/**
 * RacingGame 실행 클래스
 */
public class RacingExecution {

    private final RacingCars cars;
    private final Integer tryCount;

    public RacingExecution(RacingCars cars, Integer tryCount) {
        this.cars = cars;
        this.tryCount = tryCount;
    }

    /**
     * 1. 실행 횟수 만큼 for loop 실행
     * 2. 파라미터를 Input 그대로 받기 vs Integer value 만 받기
     *
     */
    public void executeRacingGame() {
        for (int i = 0; i < this.tryCount; i++) {
            this.cars.getCars().forEach(RacingCar::moveForward);
        }
    }
}
