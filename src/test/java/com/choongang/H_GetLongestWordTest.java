package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class H_GetLongestWordTest {

    H_GetLongestWord test = new H_GetLongestWord();

    @Test
    @DisplayName("\"abcd defg 1 B9P RI hijk jB lmno\"을(를) 입력받은 경우, \"abcd\"을(를) 리턴해야 합니다")
    void getLongestWord() {
        String input = test.getLongestWord("abcd defg 1 B9P RI hijk jB lmno");
        assertThat(input).isEqualTo("abcd");
    }

    @Test
    @DisplayName("\"LVLbDCuk 7GOIYvQTyghtBtnk NfG 3mwj eQBZlol x0ycm\"을(를) 입력받은 경우, \"7GOIYvQTyghtBtnk\"을(를) 리턴해야 합니다")
    void getLongestWord2() {
        String input = test.getLongestWord("LVLbDCuk 7GOIYvQTyghtBtnk NfG 3mwj eQBZlol x0ycm");
        assertThat(input).isEqualTo("7GOIYvQTyghtBtnk");
    }

    @Test
    @DisplayName("\"TJ\"을(를) 입력받은 경우, \"TJ\"을(를) 리턴해야 합니다")
    void getLongestWord3() {
        String input = test.getLongestWord("TJ");
        assertThat(input).isEqualTo("TJ");
    }

    @Test
    @DisplayName("\"3 J26V S8oOAvS 2 xlYR KgeTZcrX6XBSOS7 BV KgeTZcrX6XBSOS8\"을(를) 입력받은 경우, \"KgeTZcrX6XBSOS7\"을(를) 리턴해야 합니다")
    void getLongestWord4() {
        String input = test.getLongestWord("3 J26V S8oOAvS 2 xlYR KgeTZcrX6XBSOS7 BV KgeTZcrX6XBSOS8");
        assertThat(input).isEqualTo("KgeTZcrX6XBSOS7");
    }
}