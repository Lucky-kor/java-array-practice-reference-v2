package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class F_GetAllLettersTest {

    F_GetAllLetters test = new F_GetAllLetters();

    @Test
    @DisplayName("\"JavaSpring\"을(를) 입력받은 경우, ['J','a','v','a','S','p','r','i','n','g']을(를) 리턴해야 합니다")
    void getAllLetters() {
        String str = "JavaSpring";
        char[] input = test.getAllLetters(str);
        char[] arr = new char[]{'J','a','v','a','S','p','r','i','n','g'};

        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("\"true\"을(를) 입력받은 경우, ['t', 'r', 'u', 'e']을(를) 리턴해야 합니다")
    void getAllLetters2() {
        String str = "true";
        char[] input = test.getAllLetters(str);
        char[] arr = new char[]{'t', 'r', 'u', 'e'};

        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("\"Eowin\"을(를) 입력받은 경우, ['E', 'o', 'w', 'i', 'n']을(를) 리턴해야 합니다")
    void getAllLetters3() {
        String str = "Eowin";
        char[] input = test.getAllLetters(str);
        char[] arr = new char[]{'E', 'o', 'w', 'i', 'n'};

        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("빈 문자열이 주어졌을 때 빈 배열을 리턴해야 합니다")
    void getAllLetters4() {
        String str = "";
        char[] input = test.getAllLetters(str);
        char[] arr = new char[]{};

        assertArrayEquals(input, arr);
    }
}