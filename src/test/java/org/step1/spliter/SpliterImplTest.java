package org.step1.spliter;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SpliterImplTest {

    Spliter spliter = new SpliterImpl();

    @DisplayName("split input test")
    @Test
    void splitInputTest() {
        // given
        String inputValue = "4 + 2 - 5";
        String[] actual = inputValue.split(" ");

        // when
        String[] expected = spliter.splitInsertValue(inputValue);

        // then
        assertThat(expected).isEqualTo(actual);
    }
}
