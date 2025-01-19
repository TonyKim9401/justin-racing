package org.step2;

import java.util.Scanner;
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
        Scanner scanner = new Scanner(System.in);
        Input carInput = new CarInput(scanner);
        Input tryInput = new TryInput(scanner);

        // 레이싱 게임 진행
        int tryCount = tryInput.getInputValue();
        int carCount = carInput.getInputValue();

        RacingCars cars = new RacingCars(carCount, new RandomCondition());
        new RacingExecution(cars, tryCount).executeRacingGame();

        // 결과 출력
        new CarOutput(cars, tryCount).printValue();
    }
}
