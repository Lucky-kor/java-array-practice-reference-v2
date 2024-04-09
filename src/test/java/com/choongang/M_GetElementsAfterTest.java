package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class M_GetElementsAfterTest {

    M_GetElementsAfter test = new M_GetElementsAfter();

    @Test
    @DisplayName("차례대로 [4, 5, 6, 7, 8, 9], 3을(를) 입력받은 경우, [7, 8, 9]을(를) 리턴해야 합니다")
    void getElementsAfter() {
        int[] input = test.getElementsAfter(new int[]{4, 5, 6, 7, 8, 9}, 3);
        int[] arr = new int[]{7, 8, 9};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("차례대로 [4], 0을(를) 입력받은 경우, [4]을(를) 리턴해야 합니다")
    void getElementsAfter2() {
        int[] input = test.getElementsAfter(new int[]{4}, 0);
        int[] arr = new int[]{4};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("빈 배열을 입력받은 경우, 빈 배열을 리턴해야 합니다")
    void getElementsAfter3() {
        int[] input = test.getElementsAfter(new int[]{}, 1);
        int[] arr = new int[]{};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("차례대로 [4], 11을(를) 입력받은 경우, 빈 배열을 리턴해야 합니다")
    void getElementsAfter4() {
        int[] input = test.getElementsAfter(new int[]{4},11 );
        int[] arr = new int[]{};
        assertArrayEquals(input, arr);
    }
}