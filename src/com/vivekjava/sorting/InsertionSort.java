package com.vivekjava.sorting;

public class InsertionSort {

    public static int[] selectionSort(int[] nums){
        for (int i = 1; i < nums.length ; i++) {
           int cur = nums[i];
           int prev = i-1;
           //finding insert point
           while (prev >=0 && nums[prev] > cur){
               nums[prev+1] = nums[prev];
               prev--;
           }
           //insertion
            nums[prev+1] = cur;

        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,1,3,2};
           nums = selectionSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }



}
