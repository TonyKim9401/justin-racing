package org.step2.output;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.step2.car.RacingCars;
import org.step2.condition.RandomCondition;
import org.step2.execution.RacingExecution;

class CarOutputTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @DisplayName("값 출력에 성공한다")
    @Test
    void testPrintValueSuccess() {
        // given
        System.setOut(new PrintStream(outputStream));

        RandomCondition mockRandomCondition = mock(RandomCondition.class);
        when(mockRandomCondition.getConditionValue()).thenReturn(Boolean.TRUE);

        Integer carCount = 2;
        RacingCars racingCars = new RacingCars(carCount, mockRandomCondition);

        Integer tryCount = 3;
        RacingExecution racingExecution = new RacingExecution(racingCars, tryCount);
        racingExecution.executeRacingGame();

        CarOutput carOutput = new CarOutput(racingCars);

        // when
        carOutput.printValue();

        // then
        String resultOutput = """
                                실행 결과
                                -
                                -
                                
                                --
                                --
                                
                                """;
        assertThat(outputStream.toString()).isEqualTo(resultOutput);

        System.setOut(originalOut);
    }
}