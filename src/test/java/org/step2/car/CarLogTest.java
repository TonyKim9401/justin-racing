package org.step2.car;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarLogTest {

    /**
     * 0 과 -1 을 사용한 로그 기록 경계값 테스트
     */
    @DisplayName("로그 기록 성공")
    @Test
    void testRecordLogSuccess() {
        // given
        int moveCount = 0;

        // when
        CarLog carLog = new CarLog(moveCount);

        // then
        String moveExpression = carLog.getMoveExpression();
        String expectedMovement = moveExpression.repeat(moveCount);

        assertThat(carLog.getLog()).isEqualTo(expectedMovement);
    }

    @DisplayName("잘못도닌 이동 횟수로 인한 로그 기록 실패")
    @Test
    void testRecordLogFailWithInvalidMoveCount() {
        // given
        int moveCount = -1;

        // when // then
        assertThatThrownBy(() -> new CarLog(moveCount))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이동 횟수는 0 이상만 입력 가능합니다.");
    }
}