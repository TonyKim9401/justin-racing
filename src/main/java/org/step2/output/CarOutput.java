package org.step2.output;

import org.step2.input.Input;

/**
 * Car 와 관련한 Output 을 담당하는 클래스
 */
public class CarOutput implements Output {

    /**
     * CarOutput 에서 위치 이동을 나타낼 문자를 final 로 처리
     */
    private final String MOVE_EXPRESSION = "-";

    /**
     * Car 의 위치값 표시를 각각 생성하기 위한 StringBuilder
     */
    private StringBuilder sb;
    private Input input;

    public CarOutput(Input input) {
        this.input = input;
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

    /**
     * CarOutput 은 한번만 생성되기 때문에 StringBuilder 는
     * 위치 확인이 필요한 경우에만 초기화 하여 사용
     */
    private void findCurrentLocation(Integer count) {
        this.sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(MOVE_EXPRESSION);
        }
    }
}
