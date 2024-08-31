package org.calculator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FourBaseArithmeticCalculatorTest {

    Calculator fourBaseArithmeticCalculator = new FourBaseArithmeticCalculator();

    @DisplayName("addition test")
    @Test
    void additionTest() {
        // given
        int numberA = 4;
        int numberB = 2;

        // when
        int addition = fourBaseArithmeticCalculator.addition(numberA, numberB);

        // then
        assertThat(addition).isEqualTo(numberA + numberB);
    }

    @DisplayName("deduction test")
    @Test
    void deductionTest() {
        // given
        int numberA = 4;
        int numberB = 2;

        // when
        int deduction = fourBaseArithmeticCalculator.deduction(numberA, numberB);

        // then
        assertThat(deduction).isEqualTo(numberA - numberB);
    }

    @DisplayName("multiplication test")
    @Test
    void multiplicationTest() {
        // given
        int numberA = 4;
        int numberB = 2;

        // when
        int multiplication = fourBaseArithmeticCalculator.multiplication(numberA, numberB);

        // then
        assertThat(multiplication).isEqualTo(numberA * numberB);
    }

    @DisplayName("division test")
    @Test
    void divisionTest() {
        // given
        int numberA = 4;
        int numberB = 2;

        // when
        int division = fourBaseArithmeticCalculator.division(numberA, numberB);

        // then
        assertThat(division).isEqualTo(numberA / numberB);
    }

    @DisplayName("input split test")
    @Test
    void inputSplitTest() {
        // given
        String inputValue = "4 + 2 - 5";

        // when
        String[] splitResult = fourBaseArithmeticCalculator.inputSplit(inputValue);

        // then
        assertThat(splitResult.length).isEqualTo(5);
    }

    @DisplayName("operator validation test fail")
    @Test
    void operatorValidationTestFail() {
        // given
        String operator = "!";

        // when then
        assertThatThrownBy(() -> fourBaseArithmeticCalculator.operatorValidation(operator))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid operator");
    }
}