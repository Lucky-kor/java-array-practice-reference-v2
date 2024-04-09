package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class J_AddToFrontTest {

    J_AddToFront test = new J_AddToFront();
    @Test
    @DisplayName("차례대로 [1, 2], 3을(를) 입력받은 경우, [3, 1, 2]을(를) 리턴해야 합니다")
    void addToFront() {
        int[] input = test.addToFront(new int[]{1, 2}, 3);
        int[] arr = new int[]{3, 1, 2};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("차례대로 [9, 8, 1, 2], -2을(를) 입력받은 경우, [-2, 9, 8, 1, 2]을(를) 리턴해야 합니다")
    void addToFront2() {
        int[] input = test.addToFront(new int[]{9, 8, 1, 2}, -2);
        int[] arr = new int[]{-2, 9, 8, 1, 2};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("차례대로 [], 3을(를) 입력받은 경우, [3]을(를) 리턴해야 합니다")
    void addToFront3() {
        int[] input = test.addToFront(new int[]{}, 3);
        int[] arr = new int[]{3};
        assertArrayEquals(input, arr);
    }
}