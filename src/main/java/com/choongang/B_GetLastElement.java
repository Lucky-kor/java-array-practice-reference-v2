package com.choongang;

public class B_GetLastElement {
    public int getLastElement(int[] arr) {
        // TODO:
        int result = -1;

        if(arr.length != 0) {
            result = arr[arr.length - 1];
        }

        return result;
    }
}
