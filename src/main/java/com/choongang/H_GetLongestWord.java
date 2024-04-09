package com.choongang;

public class H_GetLongestWord {
    public String getLongestWord(String str) {
        // TODO:
        String maxLengthString = "";

        //str -> 순회하기 위해서 문자열 배열로 변환
        String[] strings = str.split(" ");

        for(int i = 0; i < strings.length; i++) {
            if(maxLengthString.length() < strings[i].length()) {
                maxLengthString = strings[i];
            }
        }

        return maxLengthString;


    }
}
