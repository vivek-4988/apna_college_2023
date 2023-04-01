package com.vivekjava.recursion;

public class CheckArrayIsSortedRecursion {

    public static boolean fn(int[] n, int i) {
        if(i == n.length-1){
            return true;
        }

        if (n[i] > n[i + 1]) {
            return false;
        }
        return fn(n,i+1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(fn(arr, 0));
    }

}
