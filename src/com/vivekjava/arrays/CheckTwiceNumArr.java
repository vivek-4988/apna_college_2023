package com.vivekjava.arrays;

import java.util.HashSet;

public class CheckTwiceNumArr {

    public static boolean checkTwiceNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int curValue = num[i];
            for (int j = 0; j < num.length; j++) {
                if (curValue == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // O(n)
    public static boolean checkTwiceNum2(int[] num) {
        HashSet<Integer> maps = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            if(maps.contains(num[i])){
                return true;
            }else{
                maps.add(num[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //sorted array
        int[] num = {1, 2, 3, 1};
        //o(n^2)
        System.out.println(checkTwiceNum(num));

        //o(n)
        System.out.println(checkTwiceNum2(num));

    }
}
