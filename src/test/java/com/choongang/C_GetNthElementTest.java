package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class C_GetNthElementTest {

    C_GetNthElement test = new C_GetNthElement();

    @Test
    @DisplayName("차례대로 [1, 3, 5, 7], 2을(를) 입력받은 경우, '5'을(를) 리턴해야 합니다")
    void getNthElement() {
        int[] arr = new int[]{1, 3, 5, 7};
        assertThat(test.getNthElement(arr, 2)).isEqualTo(5);
    }

    @Test
    @DisplayName("차례대로 [1, 3, 5, 7], 4을(를) 입력받은 경우, '-2'을(를) 리턴해야 합니다")
    void getNthElement2() {
        int[] arr = new int[]{1, 3, 5, 7};
        assertThat(test.getNthElement(arr, 4)).isEqualTo(-2);
    }

    @Test
    @DisplayName("차례대로 [1, 3, 5], 1을(를) 입력받은 경우, 3을(를) 리턴해야 합니다")
    void getNthElement3() {
        int[] arr = new int[]{1, 3, 5};
        assertThat(test.getNthElement(arr, 1)).isEqualTo(3);
    }

    @Test
    @DisplayName("빈 배열을 입력받은 경우 -1을(를) 리턴해야 합니다")
    void getNthElement4() {
        int[] arr = new int[]{};
        assertThat(test.getNthElement(arr, 0)).isEqualTo(-1);
    }
}