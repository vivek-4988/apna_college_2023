package com.vivekjava.arrays;


//Given the array nums after the possible rotation and an integer target,
//return the index oftarget if it is in nums, or -1   if it is not in nums
public class IndexFromRotatedArr {
    //Search in Rotated Sorted Array
    public static int getIndexFromRotatedArr(int[] nums, int target) {
        int minValueIndex = minValueIndex(nums);
        if (nums[minValueIndex] <= target && target <= nums[nums.length - 1]) {
            return search(nums, minValueIndex, nums.length - 1, target);
        } //find in sorted right else{ return search(nums,0,min,target); }
//
        return -1;
    }

    //binary search
    public static int search(int[] nums, int left, int right, int target) {
        int l = left;
        int r = right;
        // System.out.println(left+" "+right);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static int minValueIndex(int[] nums) {
        int L = 0;
        int R = nums.length - 1;
        while (L < R) {
            int mid = L + (R - L) / 2;
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid;
            } else if (nums[L] <= nums[mid] && nums[mid] > nums[R]) {
                L += mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return L;
    }


    public static void main(String[] args) {
        //roated sorted array
        int[] num = {4, 5, 6, 7, 0, 1, 2};
        int tgt = 2;//4

        System.out.println(getIndexFromRotatedArr(num, tgt));

    }
}
