package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class N_GetElementsUpToTest {

    N_GetElementsUpTo test = new N_GetElementsUpTo();

    @Test
    @DisplayName("차례대로 [4, 5, 6, 7, 8, 9], 3을(를) 입력받은 경우, [4, 5, 6]을(를) 리턴해야 합니다")
    void getElementsUpTo() {
        int[] input = test.getElementsUpTo(new int[]{4, 5, 6, 7, 8, 9}, 3);
        int[] arr = new int[]{4, 5, 6};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("차례대로 [4], 1을(를) 입력받은 경우, 빈 배열을 리턴해야 합니다")
    void getElementsUpT2o() {
        int[] input = test.getElementsUpTo(new int[]{4}, 1);
        int[] arr = new int[]{};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("빈 배열을 입력받은 경우, 빈 배열을 리턴해야 합니다")
    void getElementsUpTo3() {
        int[] input = test.getElementsUpTo(new int[]{}, 2);
        int[] arr = new int[]{};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("차례대로 [4], 11을(를) 입력받은 경우, 빈 배열을 리턴해야 합니다")
    void getElementsUpTo4() {
        int[] input = test.getElementsUpTo(new int[]{4}, 11);
        int[] arr = new int[]{};
        assertArrayEquals(input, arr);
    }
}