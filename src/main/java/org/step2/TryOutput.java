package org.step2;

public class TryOutput implements Output{

    private final Input input;

    public TryOutput(Input input) {
        this.input = input;
    }

    @Override
    public void printMessage() {
        System.out.println("시도할 회수는 몇 회 인가요?");
    }

    @Override
    public void printValue() {
        System.out.println(this.input.getInputValue());
    }

    @Override
    public void printValue(Integer value) {

    }

    @Override
    public Integer getInputValue() {
        return this.input.getInputValue();
    }
}
