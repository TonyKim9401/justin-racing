package org.step2.output;

import java.util.List;
import org.step2.car.RacingCar;
import org.step2.car.RacingCars;

/**
 * Car 와 관련한 Output 을 담당하는 클래스
 */
public class CarOutput implements Output {

    private final RacingCars racingCars;

    public CarOutput(RacingCars racingCars) {
        this.racingCars = racingCars;
    }

    @Override
    public void printValue() {
        System.out.println("실행 결과");
        List<RacingCar> cars = this.racingCars.getCars();

        System.out.println();
    }
}
