package com.vivekjava.recursion;

public class FindLastOccurence {

    public static int fn(int[] arr, int key, int i) {

        if (i ==arr.length){
            return -1;
        }

        int isFound = fn(arr, key, i + 1);
        if (isFound !=-1){
            return isFound;
        }

        if (arr[i] == key){
            return i;
        }
        return i;

    }

    public static void main(String[] args) {
        int[] arr = {8, 10, 5, 23, 4, 5, 8, 9};
        System.out.println(fn(arr, 5, 0));
    }

}
