package org.step2.execution;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.step2.car.RacingCar;
import org.step2.car.RacingCars;
import org.step2.condition.RandomCondition;

class RacingExecutionTest {

    @DisplayName("레이싱 게임 실행에 성공한다")
    @Test
    void testExecuteRacingGameSuccess() {
        // given
        RandomCondition mockRandomCondition = mock(RandomCondition.class);
        when(mockRandomCondition.getConditionValue()).thenReturn(Boolean.TRUE);

        Integer carCount = 2;
        RacingCars racingCars = new RacingCars(carCount, mockRandomCondition);

        Integer tryCount = 3;
        RacingExecution racingExecution = new RacingExecution(racingCars, tryCount);

        // when
        racingExecution.executeRacingGame();

        // then
        List<RacingCar> cars = racingCars.getCars();

        assertAll(
                cars.stream()
                        .map(car -> ()
                                -> {
                            assertThat(car.getCarLogs()).hasSize(tryCount);
                            assertThat(car.getPosition()).isEqualTo(tryCount);
//                            assertThat(car.getCarLogByTryCount(tryCount-1).getLog()).isEqualTo("---");
                        })
        );
    }
}