package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class L_MergeArraysTest {

    L_MergeArrays test = new L_MergeArrays();
    @Test
    @DisplayName("차례대로 [1, 2], [3, 4]을(를) 입력받은 경우, [1, 2, 3, 4]을(를) 리턴해야 합니다")
    void mergeArrays() {
        int[] input = test.mergeArrays(new int[]{1, 2}, new int[]{3, 4});
        int[] arr = new int[]{1, 2, 3, 4};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("차례대로 [1, 2], []을(를) 입력받은 경우, [1, 2]을(를) 리턴해야 합니다")
    void mergeArrays2() {
        int[] input = test.mergeArrays(new int[]{1, 2}, new int[]{});
        int[] arr = new int[]{1, 2};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("차례대로 [], [3]을(를) 입력받은 경우, [3]을(를) 리턴해야 합니다")
    void mergeArrays3() {
        int[] input = test.mergeArrays(new int[]{}, new int[]{3});
        int[] arr = new int[]{3};
        assertArrayEquals(input, arr);
    }

}