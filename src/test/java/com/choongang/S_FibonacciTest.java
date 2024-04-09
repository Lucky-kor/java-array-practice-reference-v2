package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class S_FibonacciTest {

    S_Fibonacci test = new S_Fibonacci();

    @Test
    @DisplayName("1을(를) 입력받은 경우, [0, 1]을(를) 리턴해야 합니다")
    void fibonacci() {
        int[] input = test.fibonacci(1);
        int[] arr = new int[]{0, 1};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("8을(를) 입력받은 경우, [0, 1, 1, 2, 3, 5, 8, 13, 21]을(를) 리턴해야 합니다")
    void fibonacci2() {
        int[] input = test.fibonacci(8);
        int[] arr = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("0을(를) 입력받은 경우, [0]을(를) 리턴해야 합니다")
    void fibonacci3() {
        int[] input = test.fibonacci(0);
        int[] arr = new int[]{0};
        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("12을(를) 입력받은 경우, [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144]을(를) 리턴해야 합니다")
    void fibonacci4() {
        int[] input = test.fibonacci(12);
        int[] arr = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        assertArrayEquals(input, arr);
    }
}