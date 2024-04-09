package com.choongang;

import java.util.Arrays;

public class N_GetElementsUpTo {
    public int[] getElementsUpTo(int[] arr, int n) {
        // TODO:
        int[] result;
        if(arr.length == 0) {
            result = new int[]{};
        } else if(arr.length <= n) {
            result = new int[]{};
        } else {
            result = new int[n];

            for(int i = 0; i < n; i++) {
                result[i] = arr[i];
            }
        }
        return result;
    }
}
