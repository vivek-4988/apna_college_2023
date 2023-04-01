package com.vivekjava.recursion;

public class FibonacciRecursion {

    public static int fn(int n) {
        if (n == 0 || n == 1)
            return n;
        int fnm1 = fn(n - 1);
        int fnm2 = fn(n - 2);
        int sumUp = fnm1 + fnm2;
        return sumUp;
    }

    public static void main(String[] args) {
        System.out.println(fn(6));
    }

}
