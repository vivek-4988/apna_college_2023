package com.vivekjava.recursion;

public class FactorialRecursion {

    public static int fn(int n){
        if(n==0)
            return 1;
        int myfu = fn(n-1);
        return n * myfu;

    }

    public static void main(String[] args) {
        System.out.println(fn(5));
    }

}
