package com.choongang;

import java.util.Arrays;

public class P_GetAllElementsButLast {
    public int[] getAllElementsButLast(int[] arr) {
        // TODO:

        int[] result;

        if(arr.length == 0) {
            result = new int[]{};
        } else {
            result = new int[arr.length - 1];

            for(int i = 0; i < arr.length - 1; i++) {
                result[i] = arr[i];
            }
        }
        return result;
    }
}
