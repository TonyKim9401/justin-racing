package org.step2.car;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarLogTest {

    /**
     * 0 과 -1 을 사용한 로그 기록 경계값 테스트
     */
    @DisplayName("로그 기록 성공에 성공한다")
    @Test
    void testRecordLogSuccess() {
        // given
        Integer moveCount = 0;
        Integer logSequence = 0;

        // when
        CarLog carLog = new CarLog(logSequence, moveCount);

        // then
        String moveExpression = carLog.getMoveExpression();
        String expectedMovement = moveExpression.repeat(moveCount);

        assertThat(carLog.getLog()).isEqualTo(expectedMovement);
    }

    @DisplayName("잘못된 이동 횟수로 인한 로그 기록 실패한다")
    @Test
    void testRecordLogFailWithInvalidMoveCount() {
        // given
        Integer moveCount = -1;
        Integer logSequence = 0;

        // when // then
        assertThatThrownBy(() -> new CarLog(logSequence, moveCount))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이동 횟수는 0 이상만 입력 가능합니다.");
    }
}