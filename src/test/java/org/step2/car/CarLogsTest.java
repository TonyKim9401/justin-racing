package org.step2.car;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarLogsTest {

    @DisplayName("로그 기록을 모두 가져오는데 성공한다")
    @Test
    void testGetCarLogsSuccess() {
        // given
        List<CarLog> carLogs = new ArrayList<>();
        Integer tryCount = 3;

        for (int i = 0; i < tryCount; i++) {
            CarLog carLog = new CarLog(i, i);
            carLogs.add(i, carLog);
        }

        // when // then
        assertThat(carLogs).hasSize(tryCount);
    }

    /**
     * 공통 부분을 BeforaAll 로 처리할 수 있다고 생각했으나
     * privat static carLogs 객체 생성 후 새로운 로그 기록 추가 검증시
     * 예상치 못한 객체가 하나 늘어나기 때문에 각각 따로 처리
     */
    @DisplayName("새로운 로그 기록을 추가하는데 성공한다")
    @Test
    void testAddNewCarLogSuccess() {
        // given
        List<CarLog> carLogs = new ArrayList<>();
        Integer tryCount = 3;

        for (int i = 0; i < tryCount; i++) {
            CarLog carLog = new CarLog(i, i);
            carLogs.add(i, carLog);
        }

        // when
        int newLogCount = tryCount;
        CarLog carLog = new CarLog(newLogCount, newLogCount);
        carLogs.add(newLogCount, carLog);

        // then
        assertThat(carLogs).hasSize(tryCount + 1);
    }

    @DisplayName("시도 횟수에 따른 로그 기록을 가져오는데 성공한다")
    @Test
    void testGetCarLogByTryCountSuccess() {
        // given
        List<CarLog> carLogs = new ArrayList<>();
        Integer tryCount = 3;
        Integer trySequence = tryCount - 1;

        for (int i = 0; i < tryCount; i++) {
            CarLog carLog = new CarLog(i, i);
            carLogs.add(i, carLog);
        }

        // when
        CarLog carLog = carLogs.get(trySequence);

        // then
        assertThat(carLog.getLogSequence()).isEqualTo(trySequence);
    }
}