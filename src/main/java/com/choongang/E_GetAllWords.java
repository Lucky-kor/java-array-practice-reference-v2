package com.choongang;

import java.util.Arrays;

public class E_GetAllWords {
    public String[] getAllWords(String str) {
        // TODO:
        String[] strArray;

//        if(str.length() == 0) {
//        if(str.isEmpty()) {
        if(str.equals("")) {
            strArray = new String[]{};
            strArray = new String[0];
        } else {
            //아래 값은 문자열이 비어있지 않을 경우
            strArray = str.split(" ");
        }

        return strArray;
    }
}
