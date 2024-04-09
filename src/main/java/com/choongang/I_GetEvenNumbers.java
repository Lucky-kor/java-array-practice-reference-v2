package com.choongang;

import java.util.Arrays;

import static java.util.Arrays.*;

public class I_GetEvenNumbers {
    public int[] getEvenNumbers(int[] arr) {
        // TODO:
        int[] evenArray;

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                count++;
            }
        }

        evenArray = new int[count];

        count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenArray[count] = arr[i];
                count++;
            }
        }

        return evenArray;
    }
}
