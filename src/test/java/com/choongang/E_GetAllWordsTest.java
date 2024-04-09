package com.choongang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class E_GetAllWordsTest {

    E_GetAllWords test = new E_GetAllWords();

    @Test
    @DisplayName("\"Something like this here\"을(를) 입력받은 경우, [\"Something\", \"like\", \"this\", \"here\"]을(를) 리턴해야 합니다")
    void getAllWords() {
        String str = "Something like this here";
        String[] input = test.getAllWords(str);
        String[] arr = new String[]{"Something", "like", "this", "here"};

        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("\"code spring java\"을(를) 입력받은 경우, [\"code\", \"spring\", \"java\"]을(를) 리턴해야 합니다")
    void getAllWords2() {
        String str = "code spring java";
        String[] input = test.getAllWords(str);
        String[] arr = new String[]{"code", "spring", "java"};

        assertArrayEquals(input, arr);
    }

    @Test
    @DisplayName("빈 문자열을 입력받은 경우, 빈 배열을 리턴해야 합니다")
    void getAllWords3() {
        String str = "";
        String[] input = test.getAllWords(str);
        String[] arr = new String[]{};

        assertArrayEquals(input, arr);
    }
}