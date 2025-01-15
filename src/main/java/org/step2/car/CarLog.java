package org.step2.car;

public class CarLog {

    /**
     * CarOutput 에서 위치 이동을 나타낼 문자를 final 로 처리
     */
    private final String MOVE_EXPRESSION = "-";

    private String movement;

    public CarLog(Integer moveCount) {
        recordLog(moveCount);
    }

    private void recordLog(Integer moveCount) {
        this.movement = MOVE_EXPRESSION.repeat(moveCount);
    }

    public String getLog() {
        return this.movement;
    }
}
