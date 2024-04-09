package com.choongang;

public class D_ComputeSumOfAllElements {
    public int computeSumOfAllElements(int[] arr) {
        // TODO:
        int result = 0;

        for(int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }

        return result;
    }
}
