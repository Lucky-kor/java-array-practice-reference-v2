package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class I_GetEvenNumbersTest {

    I_GetEvenNumbers test = new I_GetEvenNumbers();
    @Test
    @DisplayName("[3, 2, 10, 5, 8]을(를) 입력받은 경우, [2, 10, 8]을(를) 리턴해야 합니다")
    void getEvenNumbers() {
        int[] input = test.getEvenNumbers(new int[]{3, 2, 10, 5, 8});
        int[] arr = new int[]{2, 10, 8};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("[27, 8, 23, 24, 98, 7]을(를) 입력받은 경우, [8, 24, 98]을(를) 리턴해야 합니다")
    void getEvenNumbers2() {
        int[] input = test.getEvenNumbers(new int[]{27, 8, 23, 24, 98, 7});
        int[] arr = new int[]{8, 24, 98};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("빈 배열을 입력받은 경우, 빈 배열을 리턴해야 합니다.")
    void getEvenNumbers3() {
        int[] input = test.getEvenNumbers(new int[]{});
        int[] arr = new int[]{};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("[27, 1, 11, 23, 7]을(를) 입력받은 경우, 빈 배열을 리턴해야 합니다")
    void getEvenNumbers4() {
        int[] input = test.getEvenNumbers(new int[]{27, 1, 11, 23, 7});
        int[] arr = new int[]{};
        assertArrayEquals(input, arr);
    }
}