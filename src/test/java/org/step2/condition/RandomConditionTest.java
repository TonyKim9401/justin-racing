package org.step2.condition;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Random;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomConditionTest {

    Random mockRandom;

    @BeforeEach
    void setUp() {
        mockRandom = mock(Random.class);
    }

    /**
     *  경계값 테스트를 위해 3, 4 를 인자로 사용함
     *  Mockito 3.X.X 버전 사용시 Random mocking 불가 -> final 객체
     *  -> 5.1.1 버전으로 올려 해결
     */
    @DisplayName("랜덤 컨디션 True 반환 성공한다")
    @Test
    void testRandomConditionValueReturnTrue() {
        // given // when
        when(mockRandom.nextInt(10)).thenReturn(4);
        RandomCondition randomCondition = new RandomCondition(mockRandom);

        // then
        assertThat(randomCondition.getConditionValue()).isTrue();
    }

    @DisplayName("랜덤 컨디션 True 반환 실패한다")
    @Test
    void testRandomConditionValueReturnFalse() {
        // given // when
        when(mockRandom.nextInt(10)).thenReturn(3);
        RandomCondition randomCondition = new RandomCondition(mockRandom);

        // then
        assertThat(randomCondition.getConditionValue()).isFalse();
    }
}