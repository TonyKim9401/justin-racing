package org.step2;

import org.step2.car.RacingCars;
import org.step2.condition.RandomCondition;
import org.step2.execution.RacingExecution;
import org.step2.input.CarInput;
import org.step2.input.TryInput;
import org.step2.output.CarOutput;
import org.step2.output.TryOutput;

public class Main {
    public static void main(String[] args) {

        new RacingExecution(new RacingCars(new CarOutput(new CarInput()),
                new RandomCondition()),
                new TryOutput(new TryInput())
        );

    }
}
