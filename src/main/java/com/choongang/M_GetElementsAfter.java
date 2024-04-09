package com.choongang;

import java.util.Arrays;

public class M_GetElementsAfter {
    public int[] getElementsAfter(int[] arr, int n) {
        // TODO:
        // 결과를 담을 배열 선언
            // 크기는 n부터 잘라야 하므로,
            // arr.length - n;
        int[] result;

        // arr = 빈 배열일 경우
            // result = 빈 배열
        if(arr.length == 0) {
            result = new int[0];

        }
        // arr.length <= n
        // result = 빈 배열
        else if(arr.length <= n) {
            result = new int[0];
        } else {
            result = new int[arr.length - n];
            // 순회하며 값을 할당해야 합니다.
            // result에 arr의 값을 할당
            // arr의 n번 인덱스의 값이 result의 0부터 들어와야 합니다.
            // arr = [1, 2, 3, 4, 5], n = 2;
            // result[0] = arr[2];
            // result[1] = arr[3];
            // result[2] = arr[4];
            // 여기서 유추할 수 있는건,
            // result의 인덱스는 항상 arr의 인덱스 - n;
            // result[i - n] = arr[i]; -> i가 2부터 시작할테니
            // 위에서의 i는 for loop 카운트 변수
            for(int i = n; i < arr.length; i++) {
                result[i - n] = arr[i];
            }
        }

        return result;
    }
}
