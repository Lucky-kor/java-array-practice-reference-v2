package com.choongang;

public class J_AddToFront {
    public int[] addToFront(int[] arr, int el) {
        // TODO:
        // arr = [1, 2], el = 3
        // [3, 1, 2]를 반환해야 함

        // 결과를 담을 배열을 만들어야 함
        int[] result;
            // 이 배열은 arr.length보다 1 요소를 더 담아야 함
            // 즉 result.length + 1 == arr.length;
            // result의 크기는 arr.length + 1;
        result = new int[arr.length + 1];

        // result에 요소를 넣어야 함
            // 1. el은 맨 앞에 들어와야 함
            // result[0] = el;
        result[0] = el;

            // 2. 남은 위치에 arr의 요소를 담아야 합니다.
            // arr[0] -> result[1]로 들어와야 합니다.
            // arr[1] -> result[2]로 들어와야 합니다.
            // 즉, arr[i]가 result[i + 1]에 할당해야 합니다.
            // 반복문으로 arr를 순회하면서 result[i+1]의 위치에 arr[i]를 할당
//        for(int i = 0; i < arr.length; i++) {
//            result[i + 1] = arr[i];
//        }
        System.arraycopy(arr, 0, result, 1, arr.length);

        // result 반환
        return result;

    }
}
