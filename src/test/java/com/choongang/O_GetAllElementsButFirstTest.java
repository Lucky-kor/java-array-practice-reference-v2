package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class O_GetAllElementsButFirstTest {

    O_GetAllElementsButFirst test = new O_GetAllElementsButFirst();

    @Test
    @DisplayName("[4, 5, 6]을(를) 입력받은 경우, [5, 6]을(를) 리턴해야 합니다")
    void getAllElementsButFirst() {
        int[] input = test.getAllElementsButFirst(new int[]{4, 5, 6});
        int[] arr = new int[]{5, 6};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("[4]을(를) 입력받은 경우, 빈 배열을 리턴해야 합니다")
    void getAllElementsButFirst2() {
        int[] input = test.getAllElementsButFirst(new int[]{4});
        int[] arr = new int[]{};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("빈 배열을 입력받은 경우, 빈 배열을 리턴해야 합니다")
    void getAllElementsButFirst3() {
        int[] input = test.getAllElementsButFirst(new int[]{});
        int[] arr = new int[]{};
        assertArrayEquals(input, arr);
    }
}