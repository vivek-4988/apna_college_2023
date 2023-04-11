package com.vivekjava.divideconquer;

public class MergeSortRecursion {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;//si+(ei-si)/2
        mergeSort(arr, si, mid);//left
        mergeSort(arr, mid + 1, ei);//right
        merge(arr, si, mid, ei);
    }

    private static void merge(int[] arr, int si, int mid, int ei) {
        int[] tempArr = new int[ei - si + 1];
        //iterator for left
        int i = si;
        //iterator for j
        int j = mid + 1;
        //iterator for temp arr
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                tempArr[k] = arr[i];
                i++;
                k++;
            } else {
                tempArr[k] = arr[j];
                j++;
                k++;
            }
        }

        //left part
        while (i <= mid) {
            tempArr[k++] = arr[i++];
        }

        //right part
        while (j <= ei) {
            tempArr[k++] = arr[j++];
        }

        //copy temp to orignal arr
        for (k = 0, i = si; k < tempArr.length; k++, i++) {
            arr[i] = tempArr[k];
        }

    }


    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
