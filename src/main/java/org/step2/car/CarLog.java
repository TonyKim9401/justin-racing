package org.step2.car;

public class CarLog {

    /**
     * CarOutput 에서 위치 이동을 나타낼 문자를 final 로 처리
     */
    private final String MOVE_EXPRESSION = "-";

    private String movement;

    public CarLog(Integer moveCount) {
        validateMoveCount(moveCount);
        recordLog(moveCount);
    }

    private void recordLog(Integer moveCount) {
        this.movement = MOVE_EXPRESSION.repeat(moveCount);
    }

    private void validateMoveCount(Integer moveCount) {
        if (moveCount < 0) {
            throw new IllegalArgumentException("이동 횟수는 0 이상만 입력 가능합니다.");
        }
    }

    public String getLog() {
        return this.movement;
    }

    public String getMoveExpression() {
        return this.MOVE_EXPRESSION;
    }
}
