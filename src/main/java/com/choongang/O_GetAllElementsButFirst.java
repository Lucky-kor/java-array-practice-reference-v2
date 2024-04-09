package com.choongang;

import java.util.Arrays;

public class O_GetAllElementsButFirst {
    public int[] getAllElementsButFirst(int[] arr) {
        // TODO:
        // 항상 arr의 맨 앞 요소만 지운 배열을 만들어야 함
        // arr=[1, 2, 3, 4] -> result = [2, 3, 4]


        // 결과를 담을 배열의 크기는 arr.length - 1;
        int[] result;

        if(arr.length == 0) {
            result = new int[]{};
        } else {
            result = new int[arr.length - 1];
            // arr를 순회하며 첫 요소를 제외한 값을 result에 할당
            // arr[1, 2, 3, 4] 에서 1번 인덱스부터 순회
            // 이 값을 result에 할당

            // result[0] = arr[1]
            // result[1] = arr[2]
            // result[i - 1] = arr[i] -> 조건문의 실행식
            for(int i = 1; i < arr.length; i++) {
                result[i - 1] = arr[i];
            }
        }


        return result;
    }
}
