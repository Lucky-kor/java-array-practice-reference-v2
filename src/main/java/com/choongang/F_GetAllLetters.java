package com.choongang;

public class F_GetAllLetters {
    public char[] getAllLetters(String str) {
        // TODO:

        char[] chars = new char[str.length()];

        for(int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }

        return chars;


//        chars = str.toCharArray();
//
//        return chars;
    }
}
