package com.vivekjava.arrays;

public class PairArr {

    public static void pairArr(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int cur = num[i];
            for (int j = i+1; j < num.length ; j++) {
                System.out.print("("+cur+","+num[j]+") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //sorted array
        int[] num = {1, 2, 6, 10, 15};
        pairArr(num);

    }
}
