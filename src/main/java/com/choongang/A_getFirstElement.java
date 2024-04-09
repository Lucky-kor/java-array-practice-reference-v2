package com.choongang;

public class A_getFirstElement {
    public int getFirstElement(int[] arr) {
        // TODO:

        int result = 0;

        if(arr.length == 0) {
            result = -1;
        } else {
            result = arr[0];
        }

        return result;
//        System.out.println(arr[0]);
//        arr[0];
    }
}
