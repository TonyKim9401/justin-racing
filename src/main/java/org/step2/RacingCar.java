package org.step2;

public class RacingCar implements Car {

    private int moveCount;
    private final Condition condition;
    private final Output output;

    public RacingCar(Condition condition, Output output) {
        this.condition = condition;
        this.output = output;
        this.moveCount = 0;
    }

    @Override
    public void moveForward() {
        if (this.condition.getConditionValue()) {
            this.moveCount += 1;
        }
    }

    @Override
    public void showCurrentLocation() {
        this.output.printValue(this.moveCount);
    }
}
