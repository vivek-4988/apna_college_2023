package com.vivekjava.arrays;

public class BinarySearchAr {

    public static int binarySearch(int[] num, int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == num[mid]) {
                return mid;
            } else if (num[mid] < key) {
                //right
                start = mid + 1;
            } else if (num[mid] > key) {
                //left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //sorted array
        int[] num = {1, 2, 6, 10, 15, 20, 25, 30};
        int key = 50;

        int getVal = binarySearch(num, key);
        if (getVal != -1) {
            System.out.println("Key at " + binarySearch(num, key));
        } else {
            System.out.println("Key not found");
        }
    }
}
