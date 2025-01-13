package org.step2;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {

    private final Output output;
    private final Condition condition;
    private final List<Car> cars = new ArrayList<>();

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
