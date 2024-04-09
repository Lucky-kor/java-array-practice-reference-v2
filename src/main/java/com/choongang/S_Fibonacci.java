package com.choongang;

public class S_Fibonacci {
    public int[] fibonacci(int num) {
        // TODO:
        int[] fibo;
        if(num == 0) {
            fibo = new int[]{0};
//            fibo = new int[1];
//            fibo[0] = 0;
        } else {
            fibo = new int[num + 1];
            fibo[0] = 0;
            fibo[1] = 1;
            for(int i = 2; i <= num; i++) {
                fibo[i] = fibo[i - 2] + fibo[i - 1];
            }
        }
        return fibo;
    }
}
