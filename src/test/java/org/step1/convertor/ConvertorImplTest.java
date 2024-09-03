package org.step1.convertor;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConvertorImplTest {

    Convertor convertor = new ConvertorImpl();

    @DisplayName("string to int convertor test")
    @Test
    void stringToIntConvertorTest() {
        // given
        String stringValue = "4";
        int actual = Integer.parseInt(stringValue);

        // when
        int expected = convertor.convertStringToInteger(stringValue);

        // then
        assertThat(expected).isEqualTo(actual);
    }

    @DisplayName("int to string convertor test")
    @Test
    void intToStringConvertorTest() {
        // given
        int intValue = 4;
        String actual = String.valueOf(intValue);

        // when
        String expected = convertor.convertIntegerToString(intValue);

        // then
        assertThat(expected).isEqualTo(actual);
    }
}
