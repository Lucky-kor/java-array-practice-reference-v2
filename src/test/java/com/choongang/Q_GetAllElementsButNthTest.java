package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Q_GetAllElementsButNthTest {

    Q_GetAllElementsButNth test = new Q_GetAllElementsButNth();

    @Test
    @DisplayName("차례대로 [3, 2, 1], 1을(를) 입력받은 경우, [3, 1]을(를) 리턴해야 합니다")
    void getAllElementsButNth() {
        int[] input = test.getAllElementsButNth(new int[]{3, 2, 1}, 1);
        int[] arr = new int[]{3, 1};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("차례대로 [4], 10을(를) 입력받은 경우, [4]을(를) 리턴해야 합니다")
    void getAllElementsButNth2() {
        int[] input = test.getAllElementsButNth(new int[]{4}, 10);
        int[] arr = new int[]{4};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("차례대로 [4], 0을(를) 입력받은 경우, 빈 배열을 리턴해야 합니다")
    void getAllElementsButNth3() {
        int[] input = test.getAllElementsButNth(new int[]{4}, 0);
        int[] arr = new int[]{};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("빈 배열을 입력받은 경우, 빈 배열을 리턴해야 합니다")
    void getAllElementsButNth4() {
        int[] input = test.getAllElementsButNth(new int[]{}, 3);
        int[] arr = new int[]{};
        assertArrayEquals(input, arr);
    }
}