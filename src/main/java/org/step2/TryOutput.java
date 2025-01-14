package org.step2;

public class TryOutput implements Output {

    private final Input input;

    public TryOutput(Input input) {
        this.input = input;
    }

    @Override
    public void printValue(Integer value) {

    }

    @Override
    public Integer getInputValue() {
        return this.input.getInputValue();
    }
}
