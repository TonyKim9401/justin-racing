package org.step2.output;

import org.step2.input.Input;

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
