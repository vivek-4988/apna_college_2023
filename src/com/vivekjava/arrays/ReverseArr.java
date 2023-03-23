package com.vivekjava.arrays;

public class ReverseArr {

    public static int[] reverseArr(int[] num) {
        int start = 0;
        int end = num.length - 1;
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;
        }
        return num;
    }

    public static void main(String[] args) {
        //sorted array
        int[] num = {1, 2, 6, 10, 15, 20, 25, 30};

        num = reverseArr(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ",");
        }
    }
}
