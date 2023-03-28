package com.vivekjava.sorting;

public class SelectionSort {

    public static int[] selectionSort(int[] nums){
        for (int i = 0; i < nums.length-1 ; i++) {
            int min = i;
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[min]>nums[j]){
                    min = j;
                }
                //swap
                int temp= nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
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
