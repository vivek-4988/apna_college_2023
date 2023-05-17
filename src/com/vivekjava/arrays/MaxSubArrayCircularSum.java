package com.vivekjava.arrays;

public class MaxSubArrayCircularSum {

    public static void subArrSum(int[] num) {
        int totalSum = 0;
        int maxEndAt = 0;
        int minEndAt = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int x = num[i];
            totalSum+=x;

            maxEndAt = Math.max(maxEndAt+x,x);
            maxSum = Math.max(maxEndAt,maxSum);

            minEndAt = Math.min(minEndAt+x,x);
            minSum = Math.min(minEndAt,minSum);
        }

        if (maxSum>0){
            int val = Math.max(totalSum-minSum,maxSum);
            System.out.println(val);
        }else{
            System.out.println(maxSum);
        }
    }

    public static void main(String[] args) {
          int[] num = {1,2,-3,-2,6};//9
//        int[] num = {1,2,3,-2,-3};//6
        subArrSum(num);

    }
}
