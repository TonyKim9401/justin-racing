package org.step2;

/**
 * RacingGame 실행 클래스
 */
public class RacingExecution implements Execution {

    private final Output output;
    private final RacingCars cars;


    /**
     * 게임에 사용할 RacingCars 와 출력용 output 을 인자로 받고 게임을 시작함
     */
    public RacingExecution(RacingCars cars, Output output) {
        this.cars = cars;
        this.output = output;
        getExecutionResult();
    }

    /**
     * "실행 결과" 메세지는 print 되지만 고유한 영역이라 판단하여 여기에 남김
     * 1. 실행 횟수 만큼 for loop 실행
     * 2. 각 실행 마다 RacingCars 의 움직임 및 위치를 표시함
     */
    @Override
    public void getExecutionResult() {
        System.out.println("실행 결과");
        for (int i = 0; i < this.output.getInputValue(); i++) {
            this.cars.getCars().forEach(Car::moveForward);
            this.cars.getCars().forEach(Car::showCurrentLocation);
            System.out.println();
        }
    }
}
