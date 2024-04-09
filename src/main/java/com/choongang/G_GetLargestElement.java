package com.choongang;

public class G_GetLargestElement {
    public int getLargestElement(int[] arr) {
        // TODO:

//        int maxNumber = Integer.MIN_VALUE;
        int maxNumber = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(maxNumber < arr[i]) {
                maxNumber = arr[i];
            }
        }

        return maxNumber;
    }
}
