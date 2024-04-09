package com.choongang;

public class L_MergeArrays {
    public int[] mergeArrays(int[] arr1, int[] arr2) {
        // TODO:
        int[] result = new int[arr1.length + arr2.length];

        // arr1의 값을 result에 할당

        for(int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        // arr2의 값을 result에 할당
            // 시작점이 다르므로, 이 경우 result의 시작점은(할당 될 위치) arr1.length;
        for(int i = 0; i < arr2.length;i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }
}
