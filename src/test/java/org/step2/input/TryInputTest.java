package org.step2.input;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.ByteArrayInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TryInputTest {

    /**
     * carInput 과 같은 고민
     */
    @DisplayName("유저의 시도 카운트 입력 성공")
    @Test
    void testInputTruCountFromUserSuccess() {
        //given
        Integer inputTryValueFromUser = 3;
        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(String.valueOf(inputTryValueFromUser).getBytes());
        Scanner mockScanner = new Scanner(inputStream);

        //when
        TryInput tryInput = new TryInput(mockScanner);

        //then
        assertThat(inputTryValueFromUser).isEqualTo(tryInput.getInputValue());
    }

    @DisplayName("유저의 시도 카운트 입력 실패")
    @Test
    void testInputTryCountFromUserFailWithString() {
        //given
        String inputTryValueFromUser = "a";
        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(inputTryValueFromUser.getBytes());
        Scanner mockScanner = new Scanner(inputStream);

        //when // then
        assertThatThrownBy(() -> new TryInput(mockScanner))
                .isInstanceOf(InputMismatchException.class);
    }
}