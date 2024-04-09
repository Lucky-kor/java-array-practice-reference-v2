package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
class D_ComputeSumOfAllElementsTest {

    D_ComputeSumOfAllElements test = new D_ComputeSumOfAllElements();

    @Test
    @DisplayName("[1020, 3040, 6272]을(를) 입력받은 경우, 10332을(를) 리턴해야 합니다")
    void computeSumOfAllElements2() {
        int[] arr = new int[]{1020, 3040, 6272};
        assertThat(test.computeSumOfAllElements(arr)).isEqualTo(10332);
    }

    @Test
    @DisplayName("[0, -1, -2, -3]을(를) 입력받은 경우, -6을(를) 리턴해야 합니다")
    void computeSumOfAllElements3() {
        int[] arr = new int[]{0, -1, -2, -3};
        assertThat(test.computeSumOfAllElements(arr)).isEqualTo(-6);
    }

    @Test
    @DisplayName("[1, 2, 4]을(를) 입력받은 경우, 7을(를) 리턴해야 합니다")
    void computeSumOfAllElements4() {
        int[] arr = new int[]{1, 2, 4};
        assertThat(test.computeSumOfAllElements(arr)).isEqualTo(7);
    }

    @Test
    @DisplayName("[0, 0, 0, 0, 0, 0, 0]을(를) 입력받은 경우, 0을(를) 리턴해야 합니다")
    void computeSumOfAllElements5() {
        int[] arr = new int[]{0, 0, 0, 0, 0, 0, 0};
        assertThat(test.computeSumOfAllElements(arr)).isEqualTo(0);
    }

    @Test
    @DisplayName("빈 배열을 입력받은 경우, 0을(를) 리턴해야 합니다")
    void computeSumOfAllElements() {
        int[] arr = new int[]{};
        assertThat(test.computeSumOfAllElements(arr)).isEqualTo(0);
    }
}