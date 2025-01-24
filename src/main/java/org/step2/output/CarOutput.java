package org.step2.output;

import java.util.List;
import org.step2.car.CarLog;
import org.step2.car.RacingCars;

/**
 * Car 와 관련한 Output 을 담당하는 클래스
 */
public class CarOutput implements Output {

    private final RacingCars racingCars;
    private final Integer tryCount;

    /**
     * CarOutput 을 사용 하려면 필수 2가지 파라미터
     * RacingCars 와 tryCount 가 있어야 한다고 생각하여
     * 생성자에서 받도록 수정
     * -> tryCount 는 결국 CarLogs 의 사이즈와 같다고 생각되는데 외부 주입을 받아야 할까?
     * tryCount 를 명시적으로 하기 위해 외부에서 받는 방향으로 수정해 보았다.
     */
    public CarOutput(RacingCars racingCars, Integer tryCount) {
        this.racingCars = racingCars;
        this.tryCount = tryCount;
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

        for (int i = 0; i < this.tryCount; i++) {
            List<CarLog> carLogs = this.racingCars.getCarLogsByTryCount(i);
            carLogs.forEach(carLog -> System.out.println(carLog.getLog()));
            System.out.println();
        }
    }
}
