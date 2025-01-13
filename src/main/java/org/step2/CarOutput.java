package org.step2;

public class CarOutput implements Output {

    private final String MOVE_EXPRESSION = "-";
    private StringBuilder sb;
    private final Input input;

    public CarOutput(Input input) {
        this.input = input;
//        this.printMessage();
    }

    @Override
    public void printMessage() {
        System.out.println("자동차 대수는 몇 대 인가요?");
    }

    @Override
    public void printValue() {
    }

    @Override
    public void printValue(Integer value) {
        this.findCurrentLocation(value);
        System.out.println(this.sb.toString());
    }

    @Override
    public Integer getInputValue() {
        return this.input.getInputValue();
    }

    private void findCurrentLocation(Integer count) {
        this.sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(MOVE_EXPRESSION);
        }
    }
}
