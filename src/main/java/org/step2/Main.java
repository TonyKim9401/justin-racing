package org.step2;

import org.step2.car.RacingCars;
import org.step2.condition.RandomCondition;
import org.step2.execution.RacingExecution;
import org.step2.input.CarInput;
import org.step2.input.Input;
import org.step2.input.TryInput;
import org.step2.output.CarOutput;

public class Main {
    public static void main(String[] args) {

        // 입력 받고
        Input carInput = new CarInput();
        Input tryInput = new TryInput();

        // 레이싱 게임 진행
        RacingCars cars = new RacingCars(carInput.getInputValue(), new RandomCondition());
        new RacingExecution(cars).executeRacingGame(tryInput.getInputValue());

        // 결과 출력
        new CarOutput(cars).printValue();
    }
}
