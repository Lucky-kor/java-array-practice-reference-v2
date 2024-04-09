package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class K_AddToBackTest {

    K_AddToBack test = new K_AddToBack();

    @Test
    @DisplayName("차례대로 [1, 2], 3을(를) 입력받은 경우, [1, 2, 3]을(를) 리턴해야 합니다")
    void addToBack() {
        int[] input = test.addToBack(new int[]{1, 2}, 3);
        int[] arr = new int[]{1, 2, 3};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("차례대로 [9, 8, 1, 2], -2을(를) 입력받은 경우, [9, 8, 1, 2, -2]을(를) 리턴해야 합니다")
    void addToBack2() {
        int[] input = test.addToBack(new int[]{9, 8, 1, 2}, -2);
        int[] arr = new int[]{9, 8, 1, 2, -2};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("차례대로 [], 3을(를) 입력받은 경우, [3]을(를) 리턴해야 합니다")
    void addToBack3() {
        int[] input = test.addToBack(new int[]{}, 3);
        int[] arr = new int[]{3};
        assertArrayEquals(input, arr);
    }
}