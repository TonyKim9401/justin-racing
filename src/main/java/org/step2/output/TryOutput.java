package org.step2.output;

public class TryOutput implements Output {


    public TryOutput() {
    }

    @Override
    public void printValue(Integer value) {
        System.out.println(value);
    }
}
