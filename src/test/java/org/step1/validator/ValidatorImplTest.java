package org.step1.validator;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidatorImplTest {

    Validator validator = new ValidatorImpl();

    @DisplayName("validate operation test")
    @Test
    void validateOperationTest() {
        // given
        String operator = "+";
        String actual = operator;

        // when then
        validator.validateOperator(actual);
    }

    @DisplayName("validate operation test fail")
    @Test
    void validateOperationTestFail() {
        // given
        String operator = "!";
        String actual = operator;

        // when then
        Class<IllegalArgumentException> expectedError = IllegalArgumentException.class;
        String expectedMessage = "Invalid operator";

        assertThatThrownBy(() -> validator.validateOperator(actual))
                .isInstanceOf(expectedError)
                .hasMessage(expectedMessage);
    }
}
