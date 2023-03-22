package com.vivekjava.arrays;

public class LargestNumberArr {
    public static void main(String[] args) {
        int[] num = {1,2,6,10,5,6,8};
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(num[i]>largest){
                largest = num[i];
            }
        }
        System.out.println(largest);
    }
}
