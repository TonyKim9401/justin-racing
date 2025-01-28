package org.step2.car;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.step2.condition.Condition;
import org.step2.condition.RandomCondition;
import org.step2.execution.RacingExecution;

class RacingCarsTest {


    @DisplayName("레이싱카 리스트가 생성 된다")
    @Test
    void testRacingCarsConstructor() {
        // given
        Integer carCount = 2;
        Condition condition = new RandomCondition();

        // when
        RacingCars racingCars = new RacingCars(carCount, condition);

        // then
        assertThat(racingCars.getCars()).hasSize(carCount);
    }

    @DisplayName("RacingCars 각 요소의 CarLog 를 가져온다")
    @Test
    void testGetCarLogsByTryCount() {
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
                        .map(car -> () -> assertThat(car.getCarLogs()).hasSize(tryCount))
        );
    }
}