package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class A_getFirstElementTest {

    A_getFirstElement test = new A_getFirstElement();
    @Test
    @DisplayName("[5, 4, 1, 2, 6]을(를) 입력받은 경우, 5을(를) 리턴해야 합니다")
    void getFirstElement() {
        assertThat(test.getFirstElement(new int[]{5, 4, 1, 2, 6})).isEqualTo(5);
    }

    @Test
    @DisplayName("빈 배열을 입력받은 경우, -1을(를) 리턴해야 합니다")
    void getFirstElement2() {
        assertThat(test.getFirstElement(new int[]{})).isEqualTo(-1);
    }

    @Test
    @DisplayName("[1, 3, 5]을(를) 입력받은 경우, 1을(를) 리턴해야 합니다")
    void getFirstElement3() {
        assertThat(test.getFirstElement(new int[]{1, 3, 5})).isEqualTo(1);
    }
}