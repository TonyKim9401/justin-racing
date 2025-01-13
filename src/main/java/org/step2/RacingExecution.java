package org.step2;

public class RacingExecution implements Execution {

    private final Output output;
    private final RacingCars cars;

    public RacingExecution(RacingCars cars, Output output) {
        this.cars = cars;
        this.output = output;
        getExecutionResult();
    }

    @Override
    public void getExecutionResult() {
        System.out.println("실행 결과");
        for (int i = 0; i < this.output.getInputValue(); i++) {
//            System.out.println(i + 1 + "회차 결과");
//            System.out.println("##############################################");
            this.cars.getCars().forEach(Car::moveForward);
            this.cars.getCars().forEach(Car::showCurrentLocation);
//            System.out.println("##############################################");
            System.out.println();
        }
    }
}
