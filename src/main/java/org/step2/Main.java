package org.step2;

public class Main {

    public static void main(String[] args) {

        new RacingExecution(new RacingCars(new CarOutput(new CarInput()),
                new RandomCondition()),
                new TryOutput(new TryInput())
        );

    }
}
