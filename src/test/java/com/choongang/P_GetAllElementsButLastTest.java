package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class P_GetAllElementsButLastTest {

    P_GetAllElementsButLast test = new P_GetAllElementsButLast();

    @Test
    @DisplayName("[4, 5, 6]을(를) 입력받은 경우, [4, 5]을(를) 리턴해야 합니다")
    void getAllElementsButLast() {
        int[] input = test.getAllElementsButLast(new int[]{4, 5, 6});
        int[] arr = new int[]{4, 5};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("[4]을(를) 입력받은 경우, 빈 배열을 리턴해야 합니다")
    void getAllElementsButLast2() {
        int[] input = test.getAllElementsButLast(new int[]{4});
        int[] arr = new int[]{};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("빈 배열을 입력받은 경우, 빈 배열을 리턴해야 합니다")
    void getAllElementsButLast3() {
        int[] input = test.getAllElementsButLast(new int[]{});
        int[] arr = new int[]{};
        assertArrayEquals(input, arr);
    }
}