package org.step2.execution;

import org.step2.car.Car;
import org.step2.car.RacingCars;
import org.step2.input.Input;
import org.step2.output.Output;

/**
 * RacingGame 실행 클래스
 */
public class RacingExecution implements Execution {

    private final RacingCars cars;


    /**
     * 게임에 사용할 RacingCars 와 출력용 output 을 인자로 받고 게임을 시작함
     */
    public RacingExecution(RacingCars cars) {
        this.cars = cars;
    }

    /**
     * "실행 결과" 메세지는 print 되지만 고유한 영역이라 판단하여 여기에 남김
     * 1. 실행 횟수 만큼 for loop 실행
     * 2. 파라미터를 Input 그대로 받기 vs Integer value 만 받기
     */
    @Override
    public void getExecutionResult(Input input) {
        System.out.println("실행 결과");
        for (int i = 0; i < input.getInputValue(); i++) {
            this.cars.getCars().forEach(Car::moveForward);
            System.out.println();
        }
    }
}
