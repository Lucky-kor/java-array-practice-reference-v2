package com.choongang;

import java.util.Arrays;

public class R_CreatePhoneNumber {
    public String createPhoneNumber(int[] arr) {
        // TODO:
        /**
         * arr.length = 8
         * result는 자동으로 앞에 "(010)"이 추가되어야 함
         * arr = [1, 2, 3, 4, 5, 6, 7, 8] -> "1234-5678"
         * arr를 순회하면서 각 인덱스의 값을 result에 더해줍니다.
         * 이 경우 자동으로 문자열로 형 변환 될것
         * BUT 중간에 -가 추가되어야 하는데, 항상 i가 3일때 숫자에 뒤에 해당합니다.
         * 이 부분만 조건문으로 잘 작성한다면 해결할 수 있을것
         * else -> 자동으로 arr.length = 11
         * arr = [0, 1, 1, 8, 7, 6, 5, 4, 3, 2, 1]
         * result = 문자열이나, 앞의 (011)도 실제로 arr에서 가져와야 합니다.
         * result의 초기값은 빈 문자열이로 넣어야 형변환이 쉬워짐.
         * arr를 순회하면서 각 숫자를 result와 더해줍니다.
         * 특정한 경우가 총 3가지
         *  1. i = 0일떄는 숫자 앞에 (가 들어와야 합니다.
         *  2. i = 2일때는 숫자 뒤에 )가 들어와야 합니다.
         *  3. i = 6일때는 숫자 뒤에 -이 들어와야 합니다.
         */

        String result = "";
        if(arr.length == 8) {
            result = "(010)";

            for(int i = 0; i < arr.length; i++) {
                // arr = [1, 2, 3, 4(여기가 i = 3), 5, 6, 7, 8]
                if(i == 3) {
                    result = result + arr[i] + "-";
                } else {
                    result = result + arr[i];
                }
            }
        } else { // arr.length == 11일 경우

            for(int i = 0; i < arr.length; i++) {
                // arr = [0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9]
                // i = 0일때 앞에 ( 추가
                // i = 2일때 뒤에 ) 추가
                // i = 6일때 뒤에 - 추가
                // else 그냥 i만 추가
                if(i == 0) {
                    result = "(" + result + arr[i];
                } else if(i == 2) {
                    result = result + arr[i] + ")";
                } else if(i == 6) {
                    result = result + arr[i] + "-";
                }else {
                    result = result + arr[i];
                }
            }
        }

        return result;
    }
//public String createPhoneNumber(int[] arr) {
//    String head = "010";
//    int len = arr.length;
//    String bodyArr = Arrays.toString(Arrays.copyOfRange(arr, len - 8, len - 4));
//    String body = bodyArr
//            .replaceAll(" ", "")
//            .replaceAll(",", "")
//            .replace("[", "")
//            .replace("]", "");
//    String tailArr = Arrays.toString(Arrays.copyOfRange(arr, len - 4, len));
//    String tail = tailArr
//            .replaceAll(" ", "")
//            .replaceAll(",", "")
//            .replace("[", "")
//            .replace("]", "");
//
//    if (len == 11) {
//        String headArr = Arrays.toString(Arrays.copyOfRange(arr, 0, 3));
//        head = headArrpublic String createPhoneNumber(int[] arr) {
//            String head = "010";
//            int len = arr.length;
//            String bodyArr = Arrays.toString(Arrays.copyOfRange(arr, len - 8, len - 4));
//            String body = bodyArr
//                    .replaceAll(" ", "")
//                    .replaceAll(",", "")
//                    .replace("[", "")
//                    .replace("]", "");
//            String tailArr = Arrays.toString(Arrays.copyOfRange(arr, len - 4, len));
//            String tail = tailArr
//                    .replaceAll(" ", "")
//                    .replaceAll(",", "")
//                    .replace("[", "")
//                    .replace("]", "");
//
//            if (len == 11) {
//                String headArr = Arrays.toString(Arrays.copyOfRange(arr, 0, 3));
//                head = headArr
//                        .replaceAll(" ", "")
//                        .replaceAll(",", "")
//                        .replace("[", "")
//                        .replace("]", "");
//            }
//            return String.format("(%s)%s-%s", head, body, tail);
//        }
//                .replaceAll(" ", "")
//                .replaceAll(",", "")
//                .replace("[", "")
//                .replace("]", "");
//    }
//    return String.format("(%s)%s-%s", head, body, tail);
//}
}
