package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class R_CreatePhoneNumberTest {

    R_CreatePhoneNumber test= new R_CreatePhoneNumber();

    @Test
    @DisplayName("\"[2, 4, 3, 1, 8, 7, 6, 5]\"을(를) 입력받은 경우, \"(010)2431-8765\"을(를) 리턴해야 합니다")
    void createPhoneNumber() {
        String input = test.createPhoneNumber(new int[]{2, 4, 3, 1, 8, 7, 6, 5});
        String str = "(010)2431-8765";
        assertThat(input).isEqualTo(str);
    }

    @Test
    @DisplayName("\"[0, 7, 0, 9, 8, 7, 6, 3, 2, 1, 4]\"을(를) 입력받은 경우, \"(070)9876-3214\"을(를) 리턴해야 합니다")
    void createPhoneNumber2() {
        String input = test.createPhoneNumber(new int[]{0, 7, 0, 9, 8, 7, 6, 3, 2, 1, 4});
        String str = "(070)9876-3214";
        assertThat(input).isEqualTo(str);
    }

    @Test
    @DisplayName("\"[0, 1, 0, 1, 2, 3, 4, 8, 7, 6, 5]\"을(를) 입력받은 경우, \"(010)1234-8765\"을(를) 리턴해야 합니다")
    void createPhoneNumber3() {
        String input = test.createPhoneNumber(new int[]{0, 1, 0, 1, 2, 3, 4, 8, 7, 6, 5});
        String str = "(010)1234-8765";
        assertThat(input).isEqualTo(str);
    }
}