package com.vivekjava.recursion;

public class FindIndexOfkey {

    public static void fn(int key, int[] arr, int idx) {
        if (idx == 0) {
            return;
        }

        fn(key, arr, idx - 1);
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        fn(key, arr, arr.length - 1);
    }

}
