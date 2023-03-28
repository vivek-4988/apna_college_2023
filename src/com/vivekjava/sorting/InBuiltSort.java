package com.vivekjava.sorting;

import java.util.Arrays;
import java.util.Collections;

public class InBuiltSort {

    public static void main(String[] args) {
        Integer[] nums = {5, 4, 1, 3, 2, 23, 556, 89, 13, 67, 12, 45};
//        Arrays.sort(nums, 3, 8);
        //Arrays.sort(nums);
        Arrays.sort(nums, Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }


}
