package com.vivekjava.sorting;

public class BubbleSort {

    public static int[] bubbleSort(int[] nums){
        for (int i = 0; i < nums.length-1 ; i++) {
            for (int j = 0; j < nums.length-1-i ; j++) {
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,1,3,2};
           nums = bubbleSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }



}
