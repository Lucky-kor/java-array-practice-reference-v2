package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class G_GetLargestElementTest {

    G_GetLargestElement test = new G_GetLargestElement();

    @Test
    @DisplayName("[2, 5, 4, 9, 8]을(를) 입력받은 경우, 9을(를) 리턴해야 합니다")
    void getLargestElement() {
        int[] arr = new int[]{2, 5, 4, 9, };
        assertThat(test.getLargestElement(arr)).isEqualTo(9);
    }

    @Test
    @DisplayName("[-1, 2, -5]을(를) 입력받은 경우, 2을(를) 리턴해야 합니다")
    void getLargestElement2() {
        int[] arr = new int[]{-1, 2, -5};
        assertThat(test.getLargestElement(arr)).isEqualTo(2);
    }

    @Test
    @DisplayName("[1, 2, 3, 4]을(를) 입력받은 경우, 4을(를) 리턴해야 합니다")
    void getLargestElement3() {
        int[] arr = new int[]{1, 2, 3, 4};
        assertThat(test.getLargestElement(arr)).isEqualTo(4);
    }

    @Test
    @DisplayName("[-7, -2, -9, -1]을(를) 입력받은 경우, -1을(를) 리턴해야 합니다")
    void getLargestElement4() {
        int[] arr = new int[]{-7, -2, -9, -1};
        assertThat(test.getLargestElement(arr)).isEqualTo(-1);
    }
}