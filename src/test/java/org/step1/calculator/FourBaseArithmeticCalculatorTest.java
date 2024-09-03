package org.step1.calculator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.step1.calculator.Calculator;
import org.step1.calculator.FourBaseArithmeticCalculator;

class FourBaseArithmeticCalculatorTest {

    Calculator calculator = new FourBaseArithmeticCalculator();

    @DisplayName("add test")
    @Test
    void addTest() {
        // given
        int numberA = 4;
        int numberB = 2;

        int actual = numberA + numberB;

        // when
        int expected = calculator.add(numberA, numberB);

        // then
        assertThat(expected).isEqualTo(actual);
    }

    @DisplayName("subtract test")
    @Test
    void subtractTest() {
        // given
        int numberA = 4;
        int numberB = 2;

        int actual = numberA - numberB;

        // when
        int expected = calculator.subtract(numberA, numberB);

        // then
        assertThat(expected).isEqualTo(actual);
    }

    @DisplayName("multiple test")
    @Test
    void multipleTest() {
        // given
        int numberA = 4;
        int numberB = 2;

        int actual = numberA * numberB;

        // when
        int expected = calculator.multiple(numberA, numberB);

        // then
        assertThat(expected).isEqualTo(actual);
    }

    @DisplayName("divide test")
    @Test
    void divideTest() {
        // given
        int numberA = 4;
        int numberB = 2;

        int actual = numberA / numberB;

        // when
        int expected = calculator.divide(numberA, numberB);

        // then
        assertThat(expected).isEqualTo(actual);
    }
}
