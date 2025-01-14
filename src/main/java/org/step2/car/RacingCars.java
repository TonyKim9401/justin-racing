package org.step2.car;

import java.util.ArrayList;
import java.util.List;
import org.step2.condition.Condition;
import org.step2.output.Output;

/**
 * RacingCar 를 사용하는 일급클래스
 */
public class RacingCars {

    private final Output output;
    private final Condition condition;
    private final List<Car> cars = new ArrayList<>();

    /**
     * RacingCar 생성에 사용할 output 과 condition 을 인자로 받고
     * initializeRacingCar 메소드를 사용해
     * output 에서 input 값을 확인하여 car 를 초기화 한다.
     * -> 의존성이 너무 복잡하게 되는것 같은 생각이 든다.
     */
    public RacingCars(Output output, Condition condition) {
        this.output = output;
        this.condition = condition;
        initializeRacingCar();
    }

    private void initializeRacingCar() {
        for (int i = 0; i < this.output.getInputValue(); i++) {
            this.cars.add(new RacingCar(this.condition, this.output));
        }
    }

    public List<Car> getCars() {
        return this.cars;
    }
}
