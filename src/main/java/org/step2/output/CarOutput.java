package org.step2.output;

import java.util.List;
import org.step2.car.CarLog;
import org.step2.car.RacingCars;

/**
 * Car 와 관련한 Output 을 담당하는 클래스
 */
public class CarOutput implements Output {

    private final RacingCars racingCars;

    /**
     * 코드 리뷰 내용을 반영하여
     * 이미 완성된 객체인 RacingCars 객체만을 사용 하여 결과를 출력 하도록 수정
     */
    public CarOutput(RacingCars racingCars) {
        this.racingCars = racingCars;
    }

    /**
     * CarOutput 자체가 RacingCars 에 의존하고 있고,
     * RacingCars -> RacingCar -> CarLogs -> CarLog
     * 순으로 이어지지만 간접? 의존 관계라고 생각 되는데
     * 어떻게 접근하면 좋을까?
     */
    @Override
    public void printValue() {
        System.out.println("실행 결과");

        for (int i = 0; i < this.racingCars.getCarsCount(); i++) {
            List<CarLog> carLogs = this.racingCars.getCarLogsByTryCount(i);
            carLogs.forEach(carLog -> System.out.println(carLog.getLog()));
            System.out.println();
        }
    }
}
