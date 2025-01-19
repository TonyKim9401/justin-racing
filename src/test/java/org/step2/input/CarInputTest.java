package org.step2.input;

import static org.assertj.core.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarInputTest {

    /**
     * 이렇게 하면 생성자, getInputValue() 둘을 동시에 테스트 하게 되는것 같은데..
     * 어떻게 분리해야 하나..
      */
    @DisplayName("유저의 차 카운트 입력 성공")
    @Test
    void testInputCarCountFromUserSuccess() {
        //given
        Integer inputCarValueFromUser = 3;
        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(String.valueOf(inputCarValueFromUser).getBytes());
        Scanner mockScanner = new Scanner(inputStream);

        //when
        CarInput carInput = new CarInput(mockScanner);

        //then
        assertThat(inputCarValueFromUser).isEqualTo(carInput.getInputValue());
    }

    /**
     * DisplayName 을 String 이랑 관련 있게 하고 싶은데..
     */
    @DisplayName("유저의 차 카운트 입력 실패")
    @Test
    void testInputCarCountFromUserFailWithString() {
        //given
        String inputCarValueFromUser = "a";
        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(inputCarValueFromUser.getBytes());
        Scanner mockScanner = new Scanner(inputStream);

        //when // then
        assertThatThrownBy(() -> new CarInput(mockScanner))
                .isInstanceOf(InputMismatchException.class);
    }
}