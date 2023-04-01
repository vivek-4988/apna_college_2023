package com.vivekjava.recursion;

public class FindFirstOccurence {

    public static int fn(int[] arr, int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return fn(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {8, 10, 5, 23, 4, 5, 8, 9};
        System.out.println(fn(arr, 5, 0));
    }

}
