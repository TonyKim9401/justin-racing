package org.step2.car;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.IntStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.step2.condition.Condition;
import org.step2.condition.RandomCondition;
import org.step2.execution.RacingExecution;

class RacingCarTest {

    @DisplayName("레이싱카 생성자 테스트에 성공한다")
    @Test
    void testRacingCarConstructorSuccess() {
        // given
        Integer carSequence = 1;
        Integer racingExecuteSequence = 0;
        Condition condition = new RandomCondition();

        // when
        RacingCar racingCar = new RacingCar(carSequence, condition);

        // then
        assertThat(racingCar.checkCarSequence()).isEqualTo(carSequence);
        assertThat(racingCar.getPosition()).isEqualTo(0);
        assertThat(racingCar.getCarLogs()).hasSize(0);
        assertThat(racingCar.getRacingExecuteSequence()).isEqualTo(racingExecuteSequence);
    }

    @DisplayName("로그 기록을 시행 횟수에 따라 순서대로 생성 확인에 성공한다")
    @Test
    void getCarLogByTryCountSuccess() {
        // given
        Integer carCount = 2;
        Condition condition = new RandomCondition();
        RacingCars racingCars = new RacingCars(carCount, condition);

        Integer tryCount = 3;
        RacingExecution racingExecution = new RacingExecution(racingCars, tryCount);

        // when
        racingExecution.executeRacingGame();

        // then
        List<RacingCar> cars = racingCars.getCars();

        IntStream.range(0, cars.size()).forEach(i -> {
            RacingCar racingCar = cars.get(i);
            CarLog carLog = racingCar.getCarLogByTryCount(i);
            assertThat(carLog.getLogSequence()).isEqualTo(i);
        });
    }

    @DisplayName("레이싱카 이동시 조건이 TRUE 라면 위치가 1 증가한다")
    @Test
    void testMoveForwardByConditionIsTrueThenPositionPlus1() {
        // given
        Integer carSequence = 1;
        RandomCondition mockRandomCondition = mock(RandomCondition.class);
        when(mockRandomCondition.getConditionValue()).thenReturn(Boolean.TRUE);
        RacingCar racingCar = new RacingCar(carSequence, mockRandomCondition);

        // when
        racingCar.moveForward();

        // then
        assertThat(racingCar.getPosition()).isEqualTo(1);
    }

    @DisplayName("레이싱카 이동시 조건이 TRUE 라면 로그 기록이 1 증가한다")
    @Test
    void testMoveForwardByConditionIsTrueThenCarLogPlus1() {
        // given
        Integer carSequence = 1;
        RandomCondition mockRandomCondition = mock(RandomCondition.class);
        when(mockRandomCondition.getConditionValue()).thenReturn(Boolean.TRUE);
        RacingCar racingCar = new RacingCar(carSequence, mockRandomCondition);

        // when
        racingCar.moveForward();

        // then
        assertThat(racingCar.getCarLogs()).hasSize(1);
    }

    @DisplayName("레이싱카 이동시 조건이 TRUE 라면 시행 순서가 1 증가한다")
    @Test
    void testMoveForwardByConditionIsTrueThenExecuteSequencePlus1() {
        // given
        Integer carSequence = 1;
        Integer racingExecuteSequence = 1;
        RandomCondition mockRandomCondition = mock(RandomCondition.class);
        when(mockRandomCondition.getConditionValue()).thenReturn(Boolean.TRUE);
        RacingCar racingCar = new RacingCar(carSequence, mockRandomCondition);

        // when
        racingCar.moveForward();

        // then
        assertThat(racingCar.getRacingExecuteSequence()).isEqualTo(racingExecuteSequence);
    }

    @DisplayName("레이싱카 이동시 조건이 FALSE 라면 위치가 그대로다")
    @Test
    void testMoveForwardByConditionIsFalseThenPositionIsSame() {
        // given
        Integer carSequence = 1;
        RandomCondition mockRandomCondition = mock(RandomCondition.class);
        when(mockRandomCondition.getConditionValue()).thenReturn(Boolean.FALSE);
        RacingCar racingCar = new RacingCar(carSequence, mockRandomCondition);

        // when
        racingCar.moveForward();

        // then
        assertThat(racingCar.getPosition()).isEqualTo(0);
    }

    @DisplayName("레이싱카 이동시 조건이 FALSE 라면 로그 기록이 1 증가한다")
    @Test
    void testMoveForwardByConditionIsFalseThenCarLogPlus1() {
        // given
        Integer carSequence = 1;
        RandomCondition mockRandomCondition = mock(RandomCondition.class);
        when(mockRandomCondition.getConditionValue()).thenReturn(Boolean.FALSE);
        RacingCar racingCar = new RacingCar(carSequence, mockRandomCondition);

        // when
        racingCar.moveForward();

        // then
        assertThat(racingCar.getCarLogs()).hasSize(1);
    }

    @DisplayName("레이싱카 이동시 조건이 FALSE 라면 시행 순서가 1 증가한다")
    @Test
    void testMoveForwardByConditionIsFalseThenExecuteSequencePlus1() {
        // given
        Integer carSequence = 1;
        Integer racingExecuteSequence = 1;
        RandomCondition mockRandomCondition = mock(RandomCondition.class);
        when(mockRandomCondition.getConditionValue()).thenReturn(Boolean.FALSE);
        RacingCar racingCar = new RacingCar(carSequence, mockRandomCondition);

        // when
        racingCar.moveForward();

        // then
        assertThat(racingCar.getRacingExecuteSequence()).isEqualTo(racingExecuteSequence);
    }
}