package com.vivekjava.arrays;

public class MaxSubArraySumKadane {

    //KADANE's
    public static int subArrSum(int[] num) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for (int i = 0; i < num.length; i++) {
            curSum += num[i];
            if (curSum < 0) {
                curSum = 0;
            }
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] num = {1, -2, 6, -1, 3};
//        int[] num = {2,4,6,8,10};
        System.out.println(subArrSum(num));

    }
}
