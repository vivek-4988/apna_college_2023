package com.vivekjava.arrays;

public class MaxSubArraySum {

    public static int subArrSum(int[] num) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int curSum = 0;
            for (int j = i; j < num.length; j++) {
                curSum += num[j];
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
