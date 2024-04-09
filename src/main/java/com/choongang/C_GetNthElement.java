package com.choongang;

public class C_GetNthElement {
    public int getNthElement(int[] arr, int index) {
        // TODO:
        /***
         *
         * 1. 빈 배열일 경우 -1 반환
         * 2. index가 배열의 크기를 벗어날 경우에는 -2 반환
         * 3. 이외의 경우에는 arr[index] 반환
         */

        int result;

        if(arr.length == 0) {
            result = -1;
        } else if(arr.length - 1 < index) {
            result = -2;
        } else {
            result = arr[index];
        }

        return result;
    }
}
