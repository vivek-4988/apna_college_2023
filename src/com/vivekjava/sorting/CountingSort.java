package com.vivekjava.sorting;

public class CountingSort {

    public static int[] countingSort(int[] nums) {
        //finding largesgt
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(nums[i],largest);
        }

        //setting frequency count
        int[] count = new int[largest+1];
        for (int i = 0; i < nums.length ; i++) {
            count[nums[i]]++;
        }

            //sorting
        int j = 0 ;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0){
                 nums[j] = i;
                 j++;
                 count[i]--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 1, 3, 2, 4, 3, 7};
        nums = countingSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }


}
