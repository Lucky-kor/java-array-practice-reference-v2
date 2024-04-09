package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class B_GetLastElementTest {

    B_GetLastElement test = new B_GetLastElement();

    @Test
    @DisplayName("[5, 4, 1, 2, 6]을(를) 입력받은 경우, 6을(를) 리턴해야 합니다")
    void getLastElement() {
        int[] arr = new int[]{5, 4, 1, 2, 6};
        assertThat(test.getLastElement(arr)).isEqualTo(6);
    }

    @Test
    @DisplayName("빈 배열을 입력받은 경우, -1을(를) 리턴해야 합니다")
    void getLastElement2() {
        int[] arr = new int[]{};
        assertThat(test.getLastElement(arr)).isEqualTo(-1);
    }

    @Test
    @DisplayName("[1, 3, 5]을(를) 입력받은 경우, 5을(를) 리턴해야 합니다")
    void getLastElement3() {
        int[] arr = new int[]{1, 3, 5};
        assertThat(test.getLastElement(arr)).isEqualTo(5);
    }
}